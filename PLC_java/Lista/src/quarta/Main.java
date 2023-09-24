package quarta;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(1000,1000,1000);

        Coffee espresso = new Espresso();
        Coffee cappuccino = new Cappuccino();
        Coffee latte = new Latte();

        coffeeMachine.makeCoffee(espresso);
        coffeeMachine.makeCoffee(cappuccino);
        coffeeMachine.makeCoffee(latte);
    }
}
