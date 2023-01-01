
package DZ2Task3;

public class Fish extends Animal implements Moving, Food {

    public Fish(String name) {
        super(name);
    }

    @Override
    public void moving() {
        System.out.println("рыбка " + name + " плавает по аквариуму собирая корм");

    }

    @Override
    public void eat() {
        System.out.println("рыбка " + name + " поел");

    }

}
