
package ѧ���ɼ�������;
import java.util.Scanner;
 
/**
 * @author yuck
 *
 */

public class Student {
    private String name; //����
    private Double ave;  //ƽ���ɼ�
    private String level; //�ȼ�
    private Double grade[]; //�ɼ�
    
    /**
     * @param n
     * @param d
     * @param nu
     * ���� 
     */
    Student(String n,Double d[],Integer nu){
        name=n;
        double sum=0; //�ܳɼ�
        grade=new Double[nu];
        for(Integer i=0;i<d.length;i++){
            grade[i]=d[i];
            sum+=d[i];
        }
        ave=sum/d.length; //��ƽ����
        //�жϵȼ�
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
     *���ѧ���ɼ������Ϣ
     */
    public void get_info(){
        System.out.print(this.name+"�ɼ�Ϊ:");
        for(int i=0;i<grade.length;i++)
            System.out.print(grade[i]+"    ");
        System.out.print("ƽ����Ϊ��"+this.ave+"�ȼ�Ϊ��  "+this.level);
    }
    
    /**
     * @param args
     */
    public static void main(String []args){
        System.out.println("Please enter a student information and number of grades");
        Scanner in= new Scanner(System.in);
        String sn=in.next();      //��������
        Integer num=in.nextInt(); //�γ���
        Integer i=0;
        Double gr[]=new Double[num];
        Double grade;
        //���ݿγ�����ȡ���Ƴɼ�
        while(i<num){
            grade=in.nextDouble();
            gr[i]=grade;
            i++;
        }
        Student s=new Student(sn,gr,num);
        s.get_info();       //���÷������ѧ���ɼ���Ϣ
    }
 
 
}
 
