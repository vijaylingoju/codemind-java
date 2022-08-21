import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        float a,b,c;
        float k,l,s;
        Scanner sc = new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        s=(float)(a+b+c)/2;
        k=s*(s-a)*(s-b)*(s-c);
        l=(float)Math.sqrt(k);
        System.out.println(String.format("%1.2f",l));
    }
}