import java.util.Scanner;
class circle
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        float n = sc.nextFloat();
        float m = sc.nextFloat();
        System.out.println(String.format("%1.2f",(float)(n*m)));
    }
}