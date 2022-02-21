// To caluculate sale income of a person.
import java.util.Scanner;
class Income
{
public static void main(String args[])
{
int a,s,n;
System.out.println("Enter Total sales of a person:\n ");
Scanner obj=new Scanner(System.in);
a=obj.nextInt();
if(a>50000)
{
n=16%a;
s=375+n;
System.out.println("Total Monthly sale income of a person is "+s);
}
else
if(a<50000&&a>40000)
{
n=14%a;
s=370+n;
System.out.println("Total Monthly sale income of a person is" +s);
}
else
if(a<40000&&a>30000)
{
n=12%a;
s=325+n;
System.out.println("Total Monthly sale income of a person is " +s);
}
else
if(a<30000&&a>20000)
{
n=9%a;
s=300+n;
System.out.println("Total Monthly sale income of a person is " +s);
}
else
if(a<20000&&a>10000)
{
n=5%a;
s=250+n;
System.out.println("Total Monthly sale income of the person is"+s);
}
}
}