package com.company;

import java.util.Scanner;

public class VideoAdapter {
    String name;
    int TF;

    VideoAdapter()
    {
        this.TF=0;
        this.name="";

    }
    VideoAdapter(int TF,String name)
    {

        this.TF=TF;
        this.name=name;

    }

    void EnterVideoAdapter()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите данные видеокарты:");
        System.out.print("Введите название:");
        name = in.nextLine();
        System.out.print("Введите кол-во ТерраФлопс:");
        TF = in.nextInt();
    }

    public   void  PrintVideoAdapter()
    {
        System.out.print("Название:");
        System.out.println(name);
        System.out.print("Террафлопсы:");
        System.out.println(TF);


    }

}
