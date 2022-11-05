package com.company;

import java.util.Scanner;

 class Notebook {
    private    int mAh;
    private String name;
     VideoAdapter Video;
    private static int counter=0;
     private static int Cost;
    Notebook()
    {
        this.mAh=0;
        this.name="";
Video = new VideoAdapter();
    }
    Notebook(Notebook N)
    {
        Video = new VideoAdapter();
        this.mAh=N.mAh;
        this.name=N.name;
        counter++;
    }
     static void EnterCost()
     {
         System.out.println("Введите цену ноутбука:");
         Scanner in=new Scanner(System.in);
         Cost=in.nextInt();

     }
    void EnterNotebook()
    {
        counter=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Введите данные ноутбука:");
        System.out.print("Введите название:");
        name = in.nextLine();
        System.out.print("Введите объём батареи:");
        mAh = in.nextInt();
    }

    public   void  PrintNotebook()
    {
        System.out.print("Название:");
        System.out.println(name);
        System.out.print("Объём батареи:");
        System.out.println(mAh);
        System.out.print("Цена:");
        System.out.println(Cost);
        System.out.print("Количество:");
        System.out.println(counter);
    }

}
