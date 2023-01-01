package com.company;

import java.awt.*;
import java.util.Scanner;

 class Notebook extends Gadget {
    private    int Inch;
    private String ColorKeyBoard;
     VideoAdapter Video = new VideoAdapter();

    Notebook()
    {
 counter++;
    }
     void InitNotebook(Notebook N)
    {

        Inch=N.Inch;
        ColorKeyBoard=N.ColorKeyBoard;

    }

    void EnterNotebook()
    {

        Scanner in=new Scanner(System.in);
        System.out.println("Введите данные ноутбука:");
        EnterGadget();
        System.out.print("Введите цвет клавиатуры:");
        ColorKeyBoard = in.nextLine();
        System.out.print("Введите кол-во дюймов:");
        Inch = in.nextInt();
    }

    public   void  PrintNotebook()
    {
        System.out.print("Цвет клавиатуры:");
        System.out.println(ColorKeyBoard);
        System.out.print("Кол-во дюймов:");
        System.out.println(Inch);
        System.out.print("Цена:");
        System.out.println(Cost);

    }

}
