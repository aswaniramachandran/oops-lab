import java.util.Scanner;
class person{
    Scanner sc=new Scanner(System.in);
    String gend,addres,name;
    int age;
    person()
    {
        System.out.println("Person Details:");
        System.out.println("Name:");
        name=sc.next();
        System.out.println("Address:");
        addres=sc.next();
        System.out.println("Gender:");
        gend=sc.next();
        System.out.println("Age:");
        age= sc.nextInt();
    }
}

class emplye extends person{
    int emplid,salry;
    String cmpny_name,qualification;
    Scanner sc=new Scanner(System.in);
    emplye()
    {
        System.out.println("Empolyee Details");
        System.out.println("Company Name:");
        cmpny_name=sc.next();
        System.out.println("Employee ID:");
        emplid=sc.nextInt();
        System.out.println("Qualification:");
        qualification=sc.next();
        System.out.println("Salary:");
        salry=sc.nextInt();
    }
}
class tcher extends emplye{
    Scanner sc=new Scanner(System.in);
    String dept,subj;
    int tcherID;
    tcher()
	{
        System.out.println("Teacher Details:");
        System.out.println("Department name:");
        dept=sc.next();
        System.out.println("Subject:");
        subj= sc.next();
        System.out.println("Teahcer ID:");
        tcherID= sc.nextInt();
    }
    void disp()
    {
        System.out.println("Details are:");
        System.out.println("name:"+name);
        System.out.println("gend:"+gend);
        System.out.println("age:"+age);
        System.out.println("cmpny_name:"+cmpny_name);
        System.out.println("emplid:"+emplid);
        System.out.println("qualification:"+qualification);
        System.out.println("tcherID:"+tcherID);
        System.out.println("addres:"+addres);
        System.out.println("subj:"+subj);
        System.out.println("dept:"+dept);
        System.out.println("salry:"+salry);
    }
}
public class persn {
    public static void main(String ...a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int n=sc.nextInt();
        tcher tr[]=new tcher[n];
        for (int i=0;i<n;i++)
        {
            tr[i]=new tcher();
            tr[i].disp();
        }
    }
}