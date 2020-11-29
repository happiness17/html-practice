
package 学生成绩管理器;
import java.util.Scanner;
 
/**
 * @author yuck
 *
 */

public class Student {
    private String name; //姓名
    private Double ave;  //平均成绩
    private String level; //等级
    private Double grade[]; //成绩
    
    /**
     * @param n
     * @param d
     * @param nu
     * 姓名 
     */
    Student(String n,Double d[],Integer nu){
        name=n;
        double sum=0; //总成绩
        grade=new Double[nu];
        for(Integer i=0;i<d.length;i++){
            grade[i]=d[i];
            sum+=d[i];
        }
        ave=sum/d.length; //求平均分
        //判断等级
        if(ave<60)
            level="E";
        else if(ave<70)
            level="D";
        else if(ave<80)
            level="C";
        else if(ave<90)
            level="B";
        else if(ave<=100)
            level="A";
    }
 
    /**
     *输出学生成绩相关信息
     */
    public void get_info(){
        System.out.print(this.name+"成绩为:");
        for(int i=0;i<grade.length;i++)
            System.out.print(grade[i]+"    ");
        System.out.print("平均分为："+this.ave+"等级为：  "+this.level);
    }
    
    /**
     * @param args
     */
    public static void main(String []args){
        System.out.println("Please enter a student information and number of grades");
        Scanner in= new Scanner(System.in);
        String sn=in.next();      //输入姓名
        Integer num=in.nextInt(); //课程数
        Integer i=0;
        Double gr[]=new Double[num];
        Double grade;
        //根据课程数获取各科成绩
        while(i<num){
            grade=in.nextDouble();
            gr[i]=grade;
            i++;
        }
        Student s=new Student(sn,gr,num);
        s.get_info();       //调用方法输出学生成绩信息
    }
 
 
}
 
