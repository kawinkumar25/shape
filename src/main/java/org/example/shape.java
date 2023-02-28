package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Shape {

    public static void main (String[] args)
    {

        Scanner inputobj =new Scanner(System.in);
        Logger l = Logger.getLogger("kawin");
        l.info(" 1 Triangle \n 2 Rectangle \n 3 circle ");
        int choice =inputobj.nextInt();
        Shapemethods shapeobj = new Shapemethods(choice);
        shapeobj.perimeter(choice);
        shapeobj.area(choice);
    }


}
