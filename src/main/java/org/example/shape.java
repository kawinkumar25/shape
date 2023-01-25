package org.example;

import java.util.Scanner;

public class shape {


    int height;
    int base;

    int length;
    int breadth;

    int radius;

    Scanner dep =new Scanner(System.in);
    shape()
    {
        System.out.println(" 1 Triangle \n 2 Rectangle \n 3 circle ");
        int choice =dep.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Enter height:");
                height = dep.nextInt();
                System.out.println("Enter base:");
                base = dep.nextInt();
                perimeter(choice);
                area(choice);
            }
            case 2 -> {
                System.out.println("Enter length:");
                length = dep.nextInt();
                System.out.println("Enter breadth:");
                breadth = dep.nextInt();
                perimeter(choice);
                area(choice);
            }


            case 3 -> {
                System.out.println("Enter radius:");
                radius = dep.nextInt();
                perimeter(choice);
                area(choice);
            }

            default ->
                System.out.println("Enter valid number");

        }

    }
    void perimeter(int choice)
    {
        double peri;
        if(choice==1)
        {
            System.out.println("enter side 1");
            int s1=dep.nextInt();
            System.out.println("enter side 2");
            int s2=dep.nextInt();
            peri=s1+s2+base;
            System.out.println("perimeter of Triangle is "+peri);
        }
        else if (choice==2)
        {
            peri=(2*length)+(2*breadth);
            System.out.println("perimeter of Rectangle is "+peri);
        }
        else if(choice==3)
        {
            peri=2*3.14*radius;
            System.out.println("perimeter of Circle is "+peri);
        }
    }

    void area(int choice)
    {
        double area;
        if(choice==1)
        {
            area= (height * base) >> 1;
            System.out.println("Area of Triangle is "+area);
        }
        else if (choice==2)
        {
            area=length*breadth;
            System.out.println("Area of Rectangle is "+area);
        }
        else if(choice==3)
        {
            area=3.14*radius*radius;
            System.out.println("Area of Circle is "+area);
        }

    }
    public static void main (String[] args)
    {
        shape b = new shape();
    }


}
