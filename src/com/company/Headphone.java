package com.company;

import java.util.Scanner;

class Headphone {
    int mAh;
    String name;
    Headphone()
    {
        int mAh=0;
        String name="";
    }
    void EnterHeadphone()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите данные наушников:");
        System.out.print("Введите имя:");
        name = in.nextLine();
        System.out.print("Введите объём батареи:");
        mAh = in.nextInt();
    }
    public void ChangeHeadphone()
    {

        Scanner in=new Scanner(System.in);
        System.out.print("Введите данные наушников:");
        name = in.nextLine();
        System.out.print("Введите данные наушников:");
        mAh = in.nextInt();
    }
    public   void  PrintHeadphone()
    {
        System.out.print("Имя:");
        System.out.println(name);
        System.out.print("Объём батареи:");
        System.out.println(mAh);
    }
}

