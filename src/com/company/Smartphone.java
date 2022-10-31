package com.company;

import java.util.Scanner;

 class Smartphone {
    int mAh;
    String name;
    Processor P;
    static int counter=0;
    Smartphone()
    {

        this.mAh=0;
        this.name="";
         P = new Processor();

    }
    Smartphone(String name,int mAh)
    {
        P = new Processor();
        this.mAh=mAh;
        this.name=name;
        counter++;
    }
    void EnterSmartphone()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите данные смартфона:");
        System.out.print("Введите имя:");
        name = in.nextLine();
        System.out.print("Введите объём батареи:");
        mAh = in.nextInt();
    }

    public   void  PrintSmartphone()
    {
        System.out.print("Имя:");
        System.out.println(name);
        System.out.print("Объём батареи:");
        System.out.println(mAh);
        System.out.print("Количество:");
        System.out.println(counter);
    }

}
