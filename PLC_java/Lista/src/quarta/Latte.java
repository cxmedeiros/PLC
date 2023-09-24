package quarta;

public class Latte extends Coffee{
    public Latte() {
        super("Latte", 0.0, 150.0, 9.0);
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
