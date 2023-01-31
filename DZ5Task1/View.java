
package DZ5Task1;

import java.util.Scanner;

public class View {

    Scanner in = new Scanner(System.in);

    
    public int firstAsK() {
        System.out.print("С какими числами будете работать: " +
                "\n1 - рациональные " +
                "\n2 - комплексные" +
                "\nВведите число: ");
        return in.nextInt();
    }

   
    public String askInputNum(String title) {
        System.out.print(title);

        return in.nextLine();
    }

   
    public int askOperation() {
        System.out.print("Что необходимо сделать: " +
                "\n1 - сложить " +
                "\n2 - вычесть " +
                "\n3 - умножить " +
                "\n4 - разделить" +
                "\nВведите число: ");
        return in.nextInt();
    }

}
