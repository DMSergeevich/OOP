
package DZ1Task1;

import java.io.IOException;
import java.util.ArrayList;



public class Main {
        public static void main(String[] args) throws IOException {
                Person karina = new Person("Карина", 58);
                Person ashot = new Person("Ашот", 64);
                Person armen = new Person("Армен", 32);
                Person guzel = new Person("Гузель", 27);
                Person aigul = new Person("Айгуль", 11);
                Person azat = new Person("Азат", 9);
                GeoTree gt = new GeoTree();
                gt.appendPerentChild(karina, armen); // Карина родитель Армена
                gt.appendPerentChild(karina, guzel); // Карина родитель Гузель
                gt.appendPerentChild(armen, aigul); // Армен родитель Айгуль
                gt.appendPerentChild(armen, azat); // Армен родитель Азата
                gt.appendWifeHusbend(karina, ashot); // Карина жена Ашота
                gt.appendPerentChild(ashot, armen); // Ашот родитель Армена
                gt.appendPerentChild(ashot, guzel); // Ашот родитель Гузель

                Reserch newReserch = new Reserch(gt);

                

                System.out.println("Дети Карины");
                ArrayList<String> result = new Reserch(gt).spend(karina, Relationship.parents);
                System.out.println(result);
                System.out.println("Записать результат в файл? (Yes or No)");
                newReserch.writeInFile(result);
                
                

                System.out.println("Дети Ашота");
                ArrayList<String> result1 = new Reserch(gt).spend(ashot, Relationship.parents);
                System.out.println(result1);
                System.out.println("Записать результат в файл? (Yes or No)");
                newReserch.writeInFile(result1);

                 
                

                System.out.println("Муж Карины");
                ArrayList<String> result2 = new Reserch(gt).spend(karina, Relationship.wife);
                System.out.println(result2);
                System.out.println("Записать результат в файл? (Yes or No)");
                newReserch.writeInFile(result2);

                
                ArrayList<String> result3 = new Reserch(gt).searchAge();
                System.out.println(result3);
                System.out.println("Записать результат в файл? (Yes or No)");
                newReserch.writeInFile(result3);

        }

}