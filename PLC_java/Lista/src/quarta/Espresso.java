package quarta;

public class Espresso extends Coffee{

    public Espresso() {
        super("Espresso", 30.0, 0.0, 9.0);
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
