import java.util.Scanner;

public class CouponNumbers {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int dist=1,count=0;
        System.out.println("Enter total number of coupons");
        int n=sc.nextInt();
        int[] iscollected=new int[n];
        while(dist<=n)
        {
            int val=(int) (Math.random()*n);
            count++;
            System.out.println("Generated value " +(val+1));
            if (iscollected[val]!=val+1)
            {
                dist++;
                iscollected[val]=val+1;
            }
            }
        System.out.println("total no of trails to get "+n+" different coupon numbers are " +count);
        System.out.println(" ");
        System.out.println("Array ");
        System.out.println(" ");
        for(int i=0;i<n;i++)
        System.out.println(i+" Element in the array is "+iscollected[i]);
        }
    }
