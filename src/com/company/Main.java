package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choose,f;
        do {

            PrintMenu();
            int massive;
            Scanner in = new Scanner(System.in);
            choose = in.nextInt();
            if (choose == 1) {
                Smartphone SMARTPHONE = new Smartphone();
                SMARTPHONE.EnterSmartphone();
                SMARTPHONE.P.EnterProcessor();
                Smartphone.EnterCost();
                System.out.print("Введите кол-во гаджетов");
                massive = in.nextInt();


                Smartphone[] S = new Smartphone[massive];
                for (int i = 0; i < massive; i++) {
                    S[i] = new Smartphone(SMARTPHONE);
                    S[i].P = new Processor(SMARTPHONE.P);
                }
                S[massive - 1].PrintSmartphone();
                S[massive - 1].P.PrintProcessor();
                System.out.println("Хотите редактировать данные смартфона?\n1.Да\n2.Нет");
                do {
                    f = in.nextInt();
                } while (f != 1 && f != 2);
                if (f == 1){
                    Smartphone.counter = 0;
                SMARTPHONE.EnterSmartphone();
                SMARTPHONE.P.EnterProcessor();
                for (int i = 0; i < massive; i++) {
                    S[i] = new Smartphone(SMARTPHONE);
                    S[i].P = new Processor(SMARTPHONE.P);
                }
            }
                S[massive-1].PrintSmartphone();
                S[massive-1].P.PrintProcessor();

            } else if (choose == 2) {

                Headphone HEADPHONE = new Headphone();
                HEADPHONE.EnterHeadphone();
                Headphone.EnterCost();
                System.out.print("Введите кол-во гаджетов");
                massive = in.nextInt();
                Headphone[] H = new Headphone[massive];
        for(int i=0;i<massive;i++)
        {H[i] = new Headphone(HEADPHONE);
                Headphone.Counter();
        }
                H[massive-1].PrintHeadphone();
                System.out.println("Редактировать данные наушников?\n1.Да\n2.Нет");
                do {
                    f = in.nextInt();
                }while (f!=1&&f!=2);
                if(f==1) {

                    HEADPHONE.EnterHeadphone();
                    for (int i = 0; i < massive; i++) {
                        H[i] = new Headphone(HEADPHONE);
                        Headphone.Counter();
                    }
                    H[massive - 1].PrintHeadphone();
                }
            }
else if(choose==3)
            {
                Notebook NOTEBOOK= new Notebook();
                NOTEBOOK.EnterNotebook();
                NOTEBOOK.Video.EnterVideoAdapter();
                Notebook.EnterCost();
                System.out.print("Введите кол-во гаджетов");
                massive = in.nextInt();
                Notebook[] N = new Notebook[massive];
                for(int i=0;i<massive;i++ ) {
                    N[i] = new Notebook( NOTEBOOK);
                    N[i].Video =new VideoAdapter(NOTEBOOK.Video);
                }
                N[massive-1].PrintNotebook();
                N[massive-1].Video.PrintVideoAdapter();
                System.out.println("Хотите редактировать данные ноутбука?\n1.Да\n2.Нет");
                do {
                    f = in.nextInt();
                }while (f!=1&&f!=2);
                if(f==1) {

                    NOTEBOOK.EnterNotebook();
                    NOTEBOOK.Video.EnterVideoAdapter();
                    for (int i = 0; i < massive; i++) {
                        N[i] = new Notebook(NOTEBOOK);
                        N[i].Video = new VideoAdapter(NOTEBOOK.Video);
                    }
                }
                N[massive-1].PrintNotebook();
                N[massive-1].Video.PrintVideoAdapter();




            }

        }while(choose>=1&&choose<=3);
    }
    private static void PrintMenu() {
        System.out.println("1.Смартфоны\n2.Наушники\n3.Ноутбуки\n4.Выход");
    }

}


