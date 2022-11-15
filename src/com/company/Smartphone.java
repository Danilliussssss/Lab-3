package com.company;

import java.util.Scanner;

 class Smartphone {
     private int mAh;
     private String name;
     protected Processor P;
    static int counter=0;
    static int Cost;
    Smartphone()
    {

        this.mAh=0;
        this.name="";
         P = new Processor();

    }
    Smartphone(Smartphone S)
    {
        P = new Processor();
        this.mAh=S.mAh;
        this.name=S.name;
        counter++;
    }
     static void EnterCost()
     {
         System.out.println("Введите цену смартфона:");
         Scanner in=new Scanner(System.in);
         Cost=in.nextInt();

     }
    void EnterSmartphone()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите данные смартфона:");
        System.out.print("Введите имя:");
        name = in.nextLine();

    }
int EnterMAh()
{
    Scanner in=new Scanner(System.in);
    System.out.print("Введите объём батареи:");
    mAh = in.nextInt();
    return mAh;
}
    public   void  PrintSmartphone()
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
