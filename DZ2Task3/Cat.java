package DZ2Task3;

public class Cat extends Animal implements Moving, Food {
    private String sound;

    public Cat(String name, String sound) {
        super(name);
        this.sound = sound;
    }

    @Override
    public void moving() {
        System.out.println("кот " + name + " подошел и сказал " + sound);
        
    }

    @Override
    public void eat() {
        System.out.println("кот " + name + " поел");
        
    }



}
