import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        float s,k,l;
        Scanner sc= new Scanner(System.in);
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        s = (float)(a+b+c)/2;
        k = s*(s-a)*(s-b)*(s-c);
        l = (float)Math.sqrt(k);
        System.out.println(String.format("%.2f",l));
    }
}