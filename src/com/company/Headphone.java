package com.company;
import java.util.Map;
import java.util.Scanner;
class Headphone {
    private int mAh;
    private String name;
    private static int counter=0;
    private static int Cost;
    Headphone()
    {
        this.mAh=0;
        this.name="";

    }
    Headphone(Headphone H)
    {

        this.mAh=H.mAh;
        this.name=H.name;

    }
 static void Counter()
 {
     counter++;
 }
    static void EnterCost()
    {
        System.out.println("Введите цену наушников:");
        Scanner in=new Scanner(System.in);
        Cost=in.nextInt();

    }
    void EnterHeadphone()
    {   counter=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Введите данные наушников:");
        System.out.print("Введите название:");
        name = in.nextLine();
        System.out.print("Введите объём батареи:");
        mAh = in.nextInt();


    }

     void  PrintHeadphone()
    {
        System.out.print("Имя:");
        System.out.println(name);
        System.out.print("Объём батареи:");
        System.out.println(mAh);
        System.out.print("Цена:");
        System.out.println(Cost);
        System.out.print("Количество:");
        System.out.println(counter);
    }


}

