package HomeWork_250205.ex;

public abstract class Cafe {
    private String name;
    private String menu;

    public Cafe(){}
    public Cafe(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public abstract void eat();

}
