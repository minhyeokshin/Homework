package HomeWork_250203.Test1_Version2;

public abstract class Shape {
    protected double area;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shape(){}
    public Shape(String name){this.name = name;}

    public abstract void calculationArea();

    public void print(){
        if(name.equals("원")){
            System.out.printf("%s의 면적은 %f%n",name,area);
        }
        else if(name.equals("직사각형")){
            System.out.printf("%s의 면적은 %.1f%n",name,area);
        }
        else System.out.println("도형의 이름을 올바르게 입력하세요.");

    }
}
