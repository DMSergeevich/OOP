package DZ4Task1;

public class Talking {

    public void firstQuestion() {
        System.out.println("Что вы хотите сделать?\n"
                + "1. Вывести в консоль планировщик\n"
                + "2. Вывести в консоль задачи по уровням приоритета\n"
                + "3. Добавить задачу в планировщик дел");

    }

    public void choisTask() {
        System.out.println("Выберите, задачу какого приоритера вы хотите вывести на экран:\n"
                + "1 - срочная; 2 - средняя; 3 - не срочная");
    }

}