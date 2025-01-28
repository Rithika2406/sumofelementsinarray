import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=S.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}