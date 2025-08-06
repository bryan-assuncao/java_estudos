package assuncao.bryan.maratonajava.javacore.tipoprimitivo.domain;

public class Car {
    private String name;
    public static final int LIMIT_SPEED = 110;
    public final Buyer BUYER = new Buyer();

    public void printCar(){
        System.out.println(this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
