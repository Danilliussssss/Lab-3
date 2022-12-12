package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choose,f=1;Headphone [][] H = new Headphone[5][];

        do {

            PrintMenu();
            int massive; Scanner in = new Scanner(System.in);
            choose = in.nextInt();
try {

    if (choose < 1 || choose > 4)
        throw new Exception("Вы ввели некорректное число:");

                if (choose == 1) {
                    int n;
                    Smartphone SMARTPHONE = new Smartphone();
                    SMARTPHONE.EnterSmartphone();
                    n = SMARTPHONE.EnterMAh();
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
                } else if (choose == 2) {

                    Headphone HEADPHONE = new Headphone();
                    HEADPHONE.EnterHeadphone();
                    Headphone.EnterCost();
                    System.out.print("Введите кол-во гаджетов");
                    massive = in.nextInt();
                    Headphone.Counter();
                    //System.out.print("Введите кол-во партий:");
                    //int n = in.nextInt();
                    H[f - 1] = new Headphone[massive];
                    for (int j = 0; j < massive; j++)
                        H[f - 1][j] = new Headphone();
                    for (int j = 0; j < massive; j++)
                        H[f - 1][j].InitHeadphone(HEADPHONE);
                    for (int i = 0; i < f; i++)
                            H[i][0].PrintHeadphone();
                    f++;
                } else if (choose == 3) {
                    Notebook NOTEBOOK = new Notebook();
                    NOTEBOOK.EnterNotebook();
                    NOTEBOOK.Video.EnterVideoAdapter();
                    Notebook.EnterCost();
                    System.out.print("Введите кол-во гаджетов");
                    massive = in.nextInt();
                    Notebook[] N = new Notebook[massive];
                    for (int i = 0; i < massive; i++) {
                        N[i] = new Notebook(NOTEBOOK);
                        N[i].Video = new VideoAdapter(NOTEBOOK.Video);
                    }
                    N[massive - 1].PrintNotebook();
                    N[massive - 1].Video.PrintVideoAdapter();
                }
        }
    catch (Exception a){
        System.out.print(a.getMessage());
        System.out.println(choose);
        }

        }while(choose!=4);
    }
    private static void PrintMenu() {
        System.out.println("1.Смартфоны\n2.Наушники\n3.Ноутбуки\n4.Выход");
    }

}


