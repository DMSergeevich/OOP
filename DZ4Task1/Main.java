
package DZ4Task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

 
        PrintPlaner printPlaner = new PrintPlaner();
        ArrayList<String> planer = printPlaner.planerArrayList();
        ArrayList<String[]> planerSplite = printPlaner.planerSplite(planer);

      
        PrintTaskInPlaner printTaskInPlaner = new PrintTaskInPlaner(planerSplite);

    
        AddTask addTask = new AddTask();

     
        Talking ask = new Talking();

        Scanner in = new Scanner(System.in);

       
        ask.firstQuestion();

       
        int chois = in.nextInt();
        if (chois == 1) { 
            printPlaner.printPlaner(planerSplite);
        } else if (chois == 2) { 

            
            ask.choisTask();
            int choisTask = in.nextInt();
            printTaskInPlaner.printTask(choisTask);

        } else if (chois == 3) { 
            addTask.writeInPlaner();

        } else
            System.out.println("Некорректный выбор");
    }
}