import java.util.*;

public class Main{

public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
        int n=sc. nextInt();
        for (int i=2;i<=n;i++)
        {
            while(n%i==0)
            {
                System.out.print(i+" ");
                n=n/i;
            }
        }
        

  // write your code here  
 }
}
