// 1  *2  *3  *10 *11 *12 
// ----4  *5  *8  *9  
// --------6  *7  




import java.util.*;
public class Main
{
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int mid=n*n+1;
        int x=1;
        for (int i=n;i>0;i--)
        {
            for(int j=n;j>i;j--)
            System.out.print("----");
            for(int j=1;j<=i;j++)
            {System.out.print(x);
             if(x<10)
                    System.out.print("  *"); 
              else if(x<100)
                    System.out.print(" *");
             else 
                    System.out.print("*");
             x++;
                
            }
            for(int j=1;j<=i;j++)
            {System.out.print(mid);
             if (j < i) 
             {     if(mid<10)
                    System.out.print("  *"); 
              else if(mid<100)
                    System.out.print(" *");
              else
                  System.out.print("*");
             }
             
             mid++;
                
            }
            mid=mid- (i - 1) * 2 - 1;
            System.out.println();
        }
	}
}
