import java.util.Scanner;
class convert
{
    public static void main(String args[])
    {
        float f;
        Scanner sc= new Scanner(System.in);
        float c=sc.nextFloat();
        f=(float)(32+(c*1.8));
        System.out.println(String.format("%.2f",f));
    }
}