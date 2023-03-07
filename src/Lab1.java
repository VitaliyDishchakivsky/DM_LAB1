import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import java.io.*;
import javax.swing.*;
import java.util.Scanner;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Lab1 {
    public static void main(String[] args) throws IOException {
    	//Реалізація інтерфейсу
        ButtonFrame frame = new ButtonFrame();
        //Задання розмірів вікна
        frame.setSize(220, 650);
        //Встановлення можливості закриття вікна
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Видимість інтерфейсу
        frame.setVisible(true);
        //Заборона на розширення вікна користувацького інтерфейсу
        frame.setResizable(false);
        //Колір фону
        frame.getContentPane().setBackground(new Color(153, 102, 153));

    }
}
class ButtonFrame extends JFrame {
	//Додавання кнопки виконання програми
    JButton button = new JButton("Алгоритм Прима");

    //Додавання текстових полів
    JTextArea area1 = new JTextArea(1, 2);
    JTextArea area2 = new JTextArea(1, 2);
    JTextArea area3 = new JTextArea(1, 2);
    JTextArea area4 = new JTextArea(1, 2);
    JTextArea area5 = new JTextArea(1, 2);
    JTextArea area6 = new JTextArea(1, 2);
    JTextArea area7 = new JTextArea(1, 2);
    JTextArea area8 = new JTextArea(1, 2);

    JTextArea area9 = new JTextArea(1, 2);
    JTextArea area10 = new JTextArea(1, 2);
    JTextArea area11 = new JTextArea(1, 2);
    JTextArea area12 = new JTextArea(1, 2);
    JTextArea area13 = new JTextArea(1, 2);
    JTextArea area14 = new JTextArea(1, 2);
    JTextArea area15 = new JTextArea(1, 2);
    JTextArea area16 = new JTextArea(1, 2);

    JTextArea area17 = new JTextArea(1, 2);
    JTextArea area18 = new JTextArea(1, 2);
    JTextArea area19 = new JTextArea(1, 2);
    JTextArea area20 = new JTextArea(1, 2);
    JTextArea area21 = new JTextArea(1, 2);
    JTextArea area22 = new JTextArea(1, 2);
    JTextArea area23 = new JTextArea(1, 2);
    JTextArea area24 = new JTextArea(1, 2);

    JTextArea area25 = new JTextArea(1, 2);
    JTextArea area26 = new JTextArea(1, 2);
    JTextArea area27 = new JTextArea(1, 2);
    JTextArea area28 = new JTextArea(1, 2);
    JTextArea area29 = new JTextArea(1, 2);
    JTextArea area30 = new JTextArea(1, 2);
    JTextArea area31 = new JTextArea(1, 2);
    JTextArea area32 = new JTextArea(1, 2);

    JTextArea area33 = new JTextArea(1, 2);
    JTextArea area34 = new JTextArea(1, 2);
    JTextArea area35 = new JTextArea(1, 2);
    JTextArea area36 = new JTextArea(1, 2);
    JTextArea area37 = new JTextArea(1, 2);
    JTextArea area38 = new JTextArea(1, 2);
    JTextArea area39 = new JTextArea(1, 2);
    JTextArea area40 = new JTextArea(1, 2);

    JTextArea area41 = new JTextArea(1, 2);
    JTextArea area42 = new JTextArea(1, 2);
    JTextArea area43 = new JTextArea(1, 2);
    JTextArea area44 = new JTextArea(1, 2);
    JTextArea area45 = new JTextArea(1, 2);
    JTextArea area46 = new JTextArea(1, 2);
    JTextArea area47 = new JTextArea(1, 2);
    JTextArea area48 = new JTextArea(1, 2);

    JTextArea area49 = new JTextArea(1, 2);
    JTextArea area50 = new JTextArea(1, 2);
    JTextArea area51 = new JTextArea(1, 2);
    JTextArea area52 = new JTextArea(1, 2);
    JTextArea area53 = new JTextArea(1, 2);
    JTextArea area54 = new JTextArea(1, 2);
    JTextArea area55 = new JTextArea(1, 2);
    JTextArea area56 = new JTextArea(1, 2);

    JTextArea area57 = new JTextArea(1, 2);
    JTextArea area58 = new JTextArea(1, 2);
    JTextArea area59 = new JTextArea(1, 2);
    JTextArea area60 = new JTextArea(1, 2);
    JTextArea area61 = new JTextArea(1, 2);
    JTextArea area62 = new JTextArea(1, 2);
    JTextArea area63 = new JTextArea(1, 2);
    JTextArea area64 = new JTextArea(1, 2);

    JTextArea area65 = new JTextArea(25, 20);
    
    //Визначення ключових змінних
    double[] vertices = new double[7];
    int[] weight = {-1,-1,-1,-1,-1,-1,-1,-1};
    int x;
    int y;
    double min = Integer.MAX_VALUE;
    int count = 0;
    String array;
    double sum;

    ButtonFrame() throws IOException {
    	
    	//n - розмірність читаємої матриці
        int n;
        //Оголошення матриці
        double mtr[][];
        //Читання матриці з файлу
        File f = new File("c:\\matrix.txt");
        Scanner sc = new Scanner(f);
        n = sc.nextInt();
        mtr = new double[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mtr[i][j] = sc.nextDouble();
        //Закриття фалу
        sc.close();

        //Функція, що спрацьовує при натисканні на відповідну кнопку інтерфейсу
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
            	//Визначення ребра з найменшою вагою  
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (min > mtr[i][j] && mtr[i][j] != 0) {
                            min = mtr[i][j];
                        }
                    }
                }
                //Визначення індексації цієї ваги в матриці
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (min == mtr[i][j]) {
                            x = i;
                            y = j;
                        }
                    }
                }
                //Перевизначення змінних
                sum = vertices[0] = min;
                weight[0] = x;
                weight[1] = y;
                array = "Вершини    : Вага\n" + (x+1) + "--" + (y+1) + "             : " + vertices[0];
                //Повернення допоміжних змінних до базового значення
                min = Integer.MAX_VALUE;
                count = 0;
                
                //Основний цикл алгоритму знаходження мінімального остового дерева
                for (int u = 1; u < n - 1; u++) {
                	//Перевірка кількості пройдених ребер
                    for (int u1 = 0; u1 < weight.length; u1++) {
                        if (weight[u1] == -1) {
                            count++;
                        }
                    }
                    //Відповідно до пройдених вершин, шукаються мінімальні ваги ребр, що з них виходять
                    for (int i = 0; i < n - count; i++) {
                        for (int j = 0; j < n; j++) {
                            if (min > mtr[weight[i]][j] && mtr[weight[i]][j] != 0 && j != weight[0] && j != weight[1] && j != weight[2] && j != weight[3] && j != weight[4] && j != weight[5] && j != weight[6] && j != weight[7]) {
                                min = mtr[weight[i]][j];
                            }
                        }
                    }
                  //Індексація мінімальних ваг в матриці
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            if (min == mtr[i][j]) {
                                x = i;
                                y = j;
                            }
                        }
                    }

                    int xtrue = 0;
                    int ytrue = 0;
                    
                    //Перевірка, чи перша вершина ребра з мінімальною вагою пройдена
                    for (int m = 0; m < weight.length; m++) {
                        if (weight[m] == x) {
                            xtrue = 1;

                        }
                    }

                    //Внесення першої вершини ребра з мінімальною вагою до переліку пройдених
                    if (xtrue == 0) {
                        for (int m1 = 0; m1 < weight.length; m1++) {
                            if (weight[m1] == -1) {
                                weight[m1] = x;
                                break;
                            }
                        }
                    }
                    
                    //Перевірка, чи друга вершина ребра з мінімальною вагою пройдена
                    for (int m = 0; m < weight.length; m++) {
                        if (weight[m] == y) {
                            ytrue = 1;

                        }
                    }

                    //Внесення другої вершини ребра з мінімальною вагою до переліку пройдених
                    if (ytrue == 0) {
                        for (int m1 = 0; m1 < weight.length; m1++) {
                            if (weight[m1] == -1) {
                                weight[m1] = y;
                                break;
                            }
                        }
                    }
                    
                    //Перевизначення змінних
                    vertices[u] = min;
                    sum = sum + vertices[u];
                    array = array + "\n" + ((x+1) + "--" + (y+1) + "             : " + (vertices[u]));
                    //Повернення допоміжних змінних до базового значення
                    min = Integer.MAX_VALUE;
                    count = 0;
                }
                
                //Заповнення текстових полів інтерфейсу
                area65.setText(String.valueOf(array) + "\n-------------------------------------------------\nСума:\n" + sum);
                area1.setText(String.valueOf((int) mtr[0][0]));
                area2.setText(String.valueOf((int) mtr[0][1]));
                area3.setText(String.valueOf((int) mtr[0][2]));
                area4.setText(String.valueOf((int) mtr[0][3]));
                area5.setText(String.valueOf((int) mtr[0][4]));
                area6.setText(String.valueOf((int) mtr[0][5]));
                area7.setText(String.valueOf((int) mtr[0][6]));
                area8.setText(String.valueOf((int) mtr[0][7]));

                area9.setText(String.valueOf((int) mtr[1][0]));
                area10.setText(String.valueOf((int) mtr[1][1]));
                area11.setText(String.valueOf((int) mtr[1][2]));
                area12.setText(String.valueOf((int) mtr[1][3]));
                area13.setText(String.valueOf((int) mtr[1][4]));
                area14.setText(String.valueOf((int) mtr[1][5]));
                area15.setText(String.valueOf((int) mtr[1][6]));
                area16.setText(String.valueOf((int) mtr[1][7]));

                area17.setText(String.valueOf((int) mtr[2][0]));
                area18.setText(String.valueOf((int) mtr[2][1]));
                area19.setText(String.valueOf((int) mtr[2][2]));
                area20.setText(String.valueOf((int) mtr[2][3]));
                area21.setText(String.valueOf((int) mtr[2][4]));
                area22.setText(String.valueOf((int) mtr[2][5]));
                area23.setText(String.valueOf((int) mtr[2][6]));
                area24.setText(String.valueOf((int) mtr[2][7]));

                area25.setText(String.valueOf((int) mtr[3][0]));
                area26.setText(String.valueOf((int) mtr[3][1]));
                area27.setText(String.valueOf((int) mtr[3][2]));
                area28.setText(String.valueOf((int) mtr[3][3]));
                area29.setText(String.valueOf((int) mtr[3][4]));
                area30.setText(String.valueOf((int) mtr[3][5]));
                area31.setText(String.valueOf((int) mtr[3][6]));
                area32.setText(String.valueOf((int) mtr[3][7]));

                area33.setText(String.valueOf((int) mtr[4][0]));
                area34.setText(String.valueOf((int) mtr[4][1]));
                area35.setText(String.valueOf((int) mtr[4][2]));
                area36.setText(String.valueOf((int) mtr[4][3]));
                area37.setText(String.valueOf((int) mtr[4][4]));
                area38.setText(String.valueOf((int) mtr[4][5]));
                area39.setText(String.valueOf((int) mtr[4][6]));
                area40.setText(String.valueOf((int) mtr[4][7]));

                area41.setText(String.valueOf((int) mtr[5][0]));
                area42.setText(String.valueOf((int) mtr[5][1]));
                area43.setText(String.valueOf((int) mtr[5][2]));
                area44.setText(String.valueOf((int) mtr[5][3]));
                area45.setText(String.valueOf((int) mtr[5][4]));
                area46.setText(String.valueOf((int) mtr[5][5]));
                area47.setText(String.valueOf((int) mtr[5][6]));
                area48.setText(String.valueOf((int) mtr[5][7]));

                area49.setText(String.valueOf((int) mtr[6][0]));
                area50.setText(String.valueOf((int) mtr[6][1]));
                area51.setText(String.valueOf((int) mtr[6][2]));
                area52.setText(String.valueOf((int) mtr[6][3]));
                area53.setText(String.valueOf((int) mtr[6][4]));
                area54.setText(String.valueOf((int) mtr[6][5]));
                area55.setText(String.valueOf((int) mtr[6][6]));
                area56.setText(String.valueOf((int) mtr[6][7]));

                area57.setText(String.valueOf((int) mtr[3][0]));
                area58.setText(String.valueOf((int) mtr[3][1]));
                area59.setText(String.valueOf((int) mtr[3][2]));
                area60.setText(String.valueOf((int) mtr[3][3]));
                area61.setText(String.valueOf((int) mtr[3][4]));
                area62.setText(String.valueOf((int) mtr[3][5]));
                area63.setText(String.valueOf((int) mtr[3][6]));
                area64.setText(String.valueOf((int) mtr[3][7]));
            }
        });

        setLayout(new FlowLayout());
        
        //Порядок виводу елементів користувацького інтерфейсу
        add(area1);
        add(area2);
        add(area3);
        add(area4);
        add(area5);
        add(area6);
        add(area7);
        add(area8);
        add(area9);
        add(area10);
        add(area11);
        add(area12);
        add(area13);
        add(area14);
        add(area15);
        add(area16);
        add(area17);
        add(area18);
        add(area19);
        add(area20);
        add(area21);
        add(area22);
        add(area23);
        add(area24);
        add(area25);
        add(area26);
        add(area27);
        add(area28);
        add(area29);
        add(area30);
        add(area31);
        add(area32);
        add(area33);
        add(area34);
        add(area35);
        add(area36);
        add(area37);
        add(area38);
        add(area39);
        add(area40);
        add(area41);
        add(area42);
        add(area43);
        add(area44);
        add(area45);
        add(area46);
        add(area47);
        add(area48);
        add(area49);
        add(area50);
        add(area51);
        add(area52);
        add(area53);
        add(area54);
        add(area55);
        add(area56);
        add(area57);
        add(area58);
        add(area59);
        add(area60);
        add(area61);
        add(area62);
        add(area63);
        add(area64);
        add(button);
        add(area65);

    }
}