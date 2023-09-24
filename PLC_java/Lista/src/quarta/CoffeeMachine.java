package quarta;

public class CoffeeMachine {
    private double availableWater;
    private double availableMilk;
    private double availableCoffee;

    public CoffeeMachine(double availableWater, double availableMilk, double availableCoffee) {
        this.availableWater = availableWater;
        this.availableMilk = availableMilk;
        this.availableCoffee = availableCoffee;
    }

    public void makeCoffee(Coffee coffee) {
        if (availableWater >= coffee.getWaterRequired() && availableMilk >= coffee.getMilkRequired() && availableCoffee >= coffee.getCoffeeRequired()) {
            System.out.println("Iniciando a preparação de " + coffee.getName() + "...");
            coffee.prepare();
            availableWater -= coffee.getWaterRequired();
            availableMilk -= coffee.getMilkRequired();
            availableCoffee -= coffee.getCoffeeRequired();
        } else {
            System.out.println("Ingredientes insuficientes para fazer " + coffee.getName() + ".");
        }
    }
}
