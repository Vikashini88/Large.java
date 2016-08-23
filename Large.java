import java.util.Scanner ;
class Large
{
public static void main(String[] args)
{ 
int l;
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
if(a>b)
{
if(a>c)
l=a;
else
l=c;
}
else
{
if(b>c)
l=b;
else
l=c;
}
System.out.println("The largest number is "+l);
}}