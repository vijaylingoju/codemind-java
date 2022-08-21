import java.util.Scanner;
class circle
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        float n = sc.nextFloat();
        float m = sc.nextFloat();
        float k = sc.nextFloat();
        System.out.println((int)(n*m*k*2*512));
    }
}