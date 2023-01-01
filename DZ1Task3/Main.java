
package DZ1Task3;

public class Main {
    public static void main(String[] args) {

        Action person = new Action("Ашот", "hear");

        Action nohear = new Action("Ашот", "nohear");
        Cat cat = new Cat("Абубакар");
        person.call(person.getStatus(), cat);

        System.out.print("\n");
        nohear.call(nohear.getStatus(), cat);

    }

}
