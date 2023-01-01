
package DZ1Task2;

public class Main {
    public static void main(String[] args) {

        Person ashot = new Person("Ashot", "No");
        Cupboard cupboard = new Cupboard("Close");

        

        
        System.out.println("Начальное состояние");
        System.out.println(ashot);
        System.out.println(cupboard);

        if ((ashot.getKey() == "Yes" || ashot.getKey() == "No") && cupboard.getStatus() == "Open") {
            System.out.println("Шкаф уже открыт");
        } else if (ashot.getKey() == "Yes" && cupboard.getStatus() == "Close") {
           
            Cupboard.openCupboard(ashot, cupboard);
            System.out.println(ashot);
            System.out.println(cupboard);
        } else if (ashot.getKey() == "No" && cupboard.getStatus() == "Close") {
  
            Person.poisk(ashot, cupboard);
            
            System.out.println(ashot);
            System.out.println(cupboard);

            Cupboard.openCupboard(ashot, cupboard);
            System.out.println(cupboard);

        }
    }
}