import java.util.*;

public class Student
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int sub1,sub2,sub3,sub4,sub5;
        String name;
        System.out.println("Enter Student Name : ");
        name = sc.next();
        System.out.println("Enter marks in Subject 1 : ");
        sub1 = sc.nextInt();
        System.out.println("Enter marks in Subject 2 : ");
        sub2 = sc.nextInt();
        System.out.println("Enter marks in Subject 3 : ");
        sub3 = sc.nextInt();
        System.out.println("Enter marks in Subject 4 : ");
        sub4 = sc.nextInt();
        System.out.println("Enter marks in Subject 5 : ");
        sub5 = sc.nextInt();
        int total = sub1+sub2+sub3+sub4+sub5;
        double percent = ((double)total/500)*100;
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage of "+name+" = "+percent+"%");
        if(percent>=0 && percent<=50)
        {
            System.out.println("Grade received = F");
        }
        else if(percent>50 && percent<=60)
        {
            System.out.println("Grade received = E");
        }
        else if(percent>60 && percent<=70)
        {
            System.out.println("Grade received = D");
        }
        else if(percent>70 && percent<=80)
        {
            System.out.println("Grade received = C");
        }
        else if(percent>80 && percent<=90)
        {
            System.out.println("Grade received = B");
        }
        else if(percent>90 && percent<=95)
        {
            System.out.println("Grade received = A");
        }
        else if(percent>95 && percent<=100)
        {
            System.out.println("Grade received = A+ (Outstanding)");
        }
    }
}
