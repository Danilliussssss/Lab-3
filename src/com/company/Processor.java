package com.company;

import java.util.Scanner;

 class Processor {
     protected float GHz;
     protected String name;
     Processor()
    {
       this. GHz=0;
       this. name="";
    }

    Processor(float GHz,String name)
    {
        this.GHz=GHz;
        this.name=name;
    }
    void EnterProcessor()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Введите данные процессора:");
        System.out.print("Введите название:");
        name = in.nextLine();
        System.out.print("Введите частоту ядра:");
        GHz = in.nextInt();
    }
void PrintProcessor()
{
    System.out.print("Название:");
    System.out.println(name);
    System.out.print("Частота ядра:");
    System.out.println(GHz);
}
}
