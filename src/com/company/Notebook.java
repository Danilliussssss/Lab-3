package com.company;

import java.util.Scanner;

 class Notebook {
    protected    int mAh;
    protected String name;
    protected VideoAdapter Video;
    static int counter=0;
    Notebook()
    {
        this.mAh=0;
        this.name="";
Video = new VideoAdapter();
    }
    Notebook(int mAh,String name)
    {
        Video = new VideoAdapter();
        this.mAh=mAh;
        this.name=name;
        counter++;
    }

    void EnterNotebook()
    {
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
        System.out.print("Количество:");
        System.out.println(counter);
    }

}
