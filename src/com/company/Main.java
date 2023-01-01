package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choose,Smart=1, Head= 1,Note=1;
        Headphone[][] H = new Headphone[5][];Smartphone[][] S = new Smartphone[5][];Notebook[][] N = new Notebook[5][];

        do {

            PrintMenu();
            int massive;
            Scanner in = new Scanner(System.in);
            choose = in.nextInt();
            try {

                if (choose < 1 || choose > 4)
                    throw new Exception("Вы ввели некорректное число:");

                if (choose == 1) {

                    Smartphone SMARTPHONE = new Smartphone();
                    SMARTPHONE.EnterSmartphone();

                    SMARTPHONE.P.EnterProcessor();

                    System.out.print("Введите кол-во гаджетов:");
                    massive = in.nextInt();
                    S[Smart-1] = new Smartphone[massive];
                    for (int i = 0; i < massive; i++) {
                        S[Smart-1][i] = new Smartphone();
                        S[Smart-1][i].InitSmartphone(SMARTPHONE);
                        S[Smart-1][i].P.InitProcessor(SMARTPHONE.P);
                    }
                    S[Smart - 1][0].PrintSmartphone();
                    S[Smart- 1][0].P.PrintProcessor();
                    Smart++;
                } else if (choose == 2) {

                    Headphone HEADPHONE = new Headphone();
                    HEADPHONE.EnterHeadphone();

                    System.out.print("Введите кол-во гаджетов");
                    massive = in.nextInt();
                    Headphone.Counter();
                    H[ Head- 1] = new Headphone[massive];
                    for (int i = 0; i < massive; i++)
                    {  H[Head - 1][i] = new Headphone();
                        H[Head - 1][i].InitHeadphone(HEADPHONE);
                    }
                        H[Head-1][0].PrintHeadphone();
                    Head++;
                } else if (choose == 3) {
                    Notebook NOTEBOOK = new Notebook();
                    NOTEBOOK.EnterNotebook();
                    NOTEBOOK.Video.EnterVideoAdapter();
                    System.out.print("Введите кол-во гаджетов");
                    massive = in.nextInt();
                    N[Note-1] = new Notebook[massive];
                    for (int i = 0; i < massive; i++) {
                        N[Note-1][i] = new Notebook();
                        N[Note-1][i].InitNotebook(NOTEBOOK);
                        N[Note-1][i].Video.InitVideoAdapter(NOTEBOOK.Video);
                    }
                    N[Note - 1][0].PrintNotebook();
                    N[Note - 1][0].Video.PrintVideoAdapter();
                }
            } catch (Exception a) {
                System.out.print(a.getMessage());
                System.out.println(choose);
            }

        } while (choose != 4);
    }
    private static void PrintMenu() {
        System.out.println("1.Смартфоны\n2.Наушники\n3.Ноутбуки\n4.Выход");
    }

}


