package DZ1Task2;

public class Cupboard {
    private String status;

    public Cupboard(String status) {
        this.status = status;
    }

    // открытия шкафа
    public static Cupboard openCupboard(Person p, Cupboard c) {
        if (p.getKey() == "Yes" && c.getStatus() == "Close") {
            c.setStatus("Open");
            System.out.println("шкаф открыт");
        }
        return c;

    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Cupboard [status = " + status + "]";
    }

}