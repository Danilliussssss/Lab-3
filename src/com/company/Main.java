package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choose;
        do {

            PrintMenu();

            Scanner in = new Scanner(System.in);
            choose = in.nextInt();
            if (choose == 1) {
                Smartphone Apple = new Smartphone();
                Apple.EnterSmartphone();
                Apple.PrintSmartphone();
                Apple.ChangeSmartphone();
                Apple.PrintSmartphone();

            } else if (choose == 2) {
                Headphone Apple = new Headphone();
                Apple.EnterHeadphone();
                Apple.PrintHeadphone();
                Apple.ChangeHeadphone();
                Apple.PrintHeadphone();
            }


        }while(choose==1||choose==2);
    }
    private static void PrintMenu() {
        System.out.println("1.Смартфоны\n2.Наушники\n3.Ноутбуки\n4.Выход");
    }
}


