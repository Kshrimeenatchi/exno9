
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class exp {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        try
        {
        if (a<=0 || b<=0)
        {
            throw new ArithmeticException ("Error the integers should be positive");
        }
        else if (b<=a)
        {
           throw new ArithmeticException ("Second integer should be greater than first integer"); 
        }
        else
        {
            int f;
            for (int i=a;i<=b;i++)
            {
                if (i==1 || i==0)
                {
                    continue;
                }
                f=1;
                for (int j=2;j<=i/2;j++)
                {
                    if (i%j==0)
                    {
                        f=0;
                        break;
                    }
                }
                if (f==1)
                {
                    System.out.println(i);
                }
            }
        }
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}
    

