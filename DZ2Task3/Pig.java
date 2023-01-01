package DZ2Task3;

public class Pig extends Animal implements Moving, Food {

    private String sound;

    public Pig(String name, String sound) {
        super(name);
        this.sound = sound;

    }

    @Override
    public void moving() {
        System.out.println(  name + " подошел и сказал " + sound);

    }

    @Override
    public void eat() {
        System.out.println( name + " поел");

    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    

}
