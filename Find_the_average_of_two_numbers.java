import java.util.Scanner;
class circle
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(String.format("%1.4f",(float)((n+m)/2.0)));
    }
}