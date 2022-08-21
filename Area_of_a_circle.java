import java.util.Scanner;
class circle
{
    public static void main(String args[])
    {
        float a;
        Scanner sc= new Scanner(System.in);
        float r=sc.nextFloat();
        a=(float)(3.14*r*r);
        System.out.println(String.format("%.2f",a));
    }
}