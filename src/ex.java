/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class ex {
    public static void main(String[] artg){
        try
        {
            int x=10/0;
        }
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        try 
        {
            int x[]=new int[10];
            x[10]=100;
            System.out.println(x[10]);
        }
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        try
        {
            String s="oops";
            int ch=Integer.valueOf(s);
        }
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
        try
        {
            String s="oops class";
            System.out.println(s.charAt(99));
        }
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
  