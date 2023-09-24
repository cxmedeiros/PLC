package quarta;

public  abstract class Coffee {
    private String name;
    private double waterRequired;
    private double milkRequired;
    private double coffeeRequired;

    public Coffee(String name, double waterRequired, double milkRequired, double coffeeRequired) {
        this.name = name;
        this.waterRequired = waterRequired;
        this.milkRequired = milkRequired;
        this.coffeeRequired = coffeeRequired;
    }

    public abstract void prepare();

    public String getName() {
        return name;
    }

    public double getWaterRequired() {
        return waterRequired;
    }

    public double getMilkRequired() {
        return milkRequired;
    }

    public double getCoffeeRequired() {
        return coffeeRequired;
    }

}
