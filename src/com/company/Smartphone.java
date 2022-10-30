package com.company;

import java.util.Scanner;

public class Smartphone {
    int mAh;
    String name;
    void EnterSmartphone()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите данные смартфона:");
        System.out.print("Введите имя:");
        name = in.nextLine();
        System.out.print("Введите объём батареи:");
        mAh = in.nextInt();
    }
    public void ChangeSmartphone()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите имя:");
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
    }

}
