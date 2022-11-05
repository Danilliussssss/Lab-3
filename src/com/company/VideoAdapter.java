package com.company;

import java.util.Scanner;

 class VideoAdapter{
     private String name;
     private int TF;

    VideoAdapter()
    {
        this.TF=0;
        this.name="";

    }
    VideoAdapter(VideoAdapter V)
    {

        this.TF=V.TF;
        this.name=V.name;

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
