package DZ2Task3;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Олег"); // создали человека
        Pig pig = new Pig("Пяточёк", "хрю-хрю"); 
        Cat cat = new Cat("Матроскин", "мяу-мяу"); 
        Fish fish = new Fish("Клаус"); 

        person.choice(); // запросили, что хочет сделать Человек
        
        // сохранили сделанный выбор и позвали питомца
        int personChoise = person.call(pig, cat); 
        // кормим питомцев
        if (personChoise == 1) {  
            pig.moving(); 
            person.getFeed(); 
            pig.eat();
        } else if (personChoise == 2) {  
            cat.moving();  
            person.getFeed(); 
            cat.eat(); 
        } else if (personChoise == 3) {  
            person.getFeed(); 
            fish.moving();  
            fish.eat(); 
        }

    }

}
