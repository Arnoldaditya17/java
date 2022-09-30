import java.util.*;

public class matrixaddition {
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int s[][] = new int[3][3];
        int i, j;
        System.out.println("Enter  the first matrix:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
                
            }
            System.out.println(" ");
        }
        System.out.println("Enter the second matrix:");
        for(i=0;i<3;i++)
        {
            for(j=1;j<3;j++)
            {
                b[i][j]=sc.nextInt();
            }
            System.out.println(" ");
        }
        System.out.println("The sum of matrices are:");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                s[i][j]=a[i][j]+b[i][j];
                System.out.print(s[i][j]+" ");
            }
            System.out.println(" ");
        }


    }
    
}
