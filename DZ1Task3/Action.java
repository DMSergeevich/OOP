
package DZ1Task3;

public class Action {
    private String name;
    private String status;

    public Action(String name, String status) {
        this.name = name;
        this.status = status;

    }

    // метод когда хозяин зовет кота
    public void calls(String name, Cat cat) {
        System.out.println(name + " зовет кошку: " + cat.getName() + " кис-кис-кис");
    }

    // хозяин зовет кота
    public void call(String status, Cat cat) {
        if (status == "hear") {
            // если кот услышал
            calls(name, cat);
            cat.catComeIn(cat.getName()); // кот приходит
        } else {
            // если кот не услышал
            calls(name, cat);
            cat.catComeOut(cat.getName()); // кот не приходит
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
