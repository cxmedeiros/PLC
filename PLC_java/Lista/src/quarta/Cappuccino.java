package quarta;

public class Cappuccino extends Coffee{
    public Cappuccino() {
        super("Cappuccino", 0.0, 30.0, 9.0);
    }

    @Override
    public void prepare() {
        System.out.println("Preparando...");
        System.out.println("Água necessária: " + getWaterRequired() + " ml");
        System.out.println("Leite necessário: " + getMilkRequired() + " ml");
        System.out.println("Café necessário: " + getCoffeeRequired() + " g");
        System.out.println("O " +getName()+" está pronto!");
    }

}
