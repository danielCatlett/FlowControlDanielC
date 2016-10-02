package com.example;
import java.util.Scanner;

public class MyClass
{
    public static void main (String[] args)
    {
        Scanner in=new Scanner (System.in);
        boolean isCold=false;
        boolean barefoot=false;
        boolean cleanWhite=false;
        boolean cleanBlack=false;
        boolean coolShirt=false;

        System.out.println("Welcome to the clothing decider.\nAnswer all questions with y or n.\n\nIs it cold out? ");
        if(in.next().equals("y"))
            isCold=true;
        else
        {
            System.out.println("Do you need to wear gym shoes today?");
            if (in.next().equals("n"))
                barefoot=true;
        }

        if(!barefoot)
        {
            System.out.println("Are there clean, white socks?");
            if(in.next().equals("y"))
                cleanWhite=true;
            else
            {
                System.out.println("Are there clean, black socks?");
                if(in.next().equals("y"))
                    cleanBlack=true;
            }
        }

        System.out.println("Is there a cool shirt available?");
        if(in.next().equals("y"))
            coolShirt=true;

        String sweatshirt;
        String shirt;
        String pants;
        String socks;

        if(coolShirt)
            shirt="cool shirt";
        else
            shirt="lame shirt";

        if(isCold)
            sweatshirt=" with a sweatshirt over it,";
        else
            sweatshirt=",";

        if(isCold)
            pants=" jeans, ";
        else
            pants=" shorts, ";

        if(barefoot)
            socks="and no socks.";
        else if(cleanWhite)
            socks="and clean white socks.";
        else if(cleanBlack)
            socks="and clean black socks.";
        else
            socks="and dirty white socks.";



        System.out.println("You have to wear a "+shirt+sweatshirt+pants+socks);
    }
}
