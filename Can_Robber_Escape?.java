import java.util.Scanner;
class circle
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int c=0;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                c++;
            }
        }
        if(c<=2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        
    }
}