package com.company;

import java.util.Scanner;

class Headphone {
    int mAh;
    String name;
    static int counter=0;
    Headphone()
    {
        this.mAh=0;
        this.name="";

    }
    Headphone(int mAh,String name)
    {

        this.mAh=mAh;
        this.name=name;
        counter++;
    }

    void EnterHeadphone()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите данные наушников:");
        System.out.print("Введите название:");
        name = in.nextLine();
        System.out.print("Введите объём батареи:");
        mAh = in.nextInt();
    }

    public   void  PrintHeadphone()
    {
        System.out.print("Имя:");
        System.out.println(name);
        System.out.print("Объём батареи:");
        System.out.println(mAh);
        System.out.print("Количество:");
        System.out.println(counter);
    }


}

