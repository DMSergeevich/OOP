
package DZ1Task1;

public class Main {
        public static void main(String[] args) {
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

               
                System.out.println("Дети Карины");
                System.out.println(new Reserch(gt).spend(karina, Relationship.parents));
                
                System.out.println("Дети Ашота");
                System.out.println(new Reserch(gt).spend(ashot, Relationship.parents));

                 
                System.out.println("Муж Карины");
                System.out.println(new Reserch(gt).spend(karina, Relationship.wife));

                
                System.out.println(new Reserch(gt).searchAge());
        }

}