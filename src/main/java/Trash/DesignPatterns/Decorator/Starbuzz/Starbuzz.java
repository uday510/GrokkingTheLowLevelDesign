package Trash.DesignPatterns.Decorator.Starbuzz;

public class Starbuzz {
    public static void main(String[] args) {
       //1. Create a simple Espresso
         System.out.println("Creating a simple Espresso");
         Beverage espresso = new Espresso();
         System.out.println("Cost of Espresso: $" + espresso.cost());

         // Decorate it with Milk
        Beverage milkEspresso = new Milk(espresso);
        System.out.println("Cost of Milk Espresso: $" + milkEspresso.cost());

         // Decorate it with Mocha
        Beverage mochaMilkEspresso = new Mocha(milkEspresso);
        System.out.println("Cost of Mocha Milk Espresso: $" + mochaMilkEspresso.cost());

        // 2. Create a Cappuccino
        System.out.println("---------- \n Creating a simple Cappuccino");
        Beverage cappuccino = new Cappuccino();
        System.out.println("Cost of Cappuccino: $" + cappuccino.cost());

        // Decorate it with Sugar
        Beverage sugarCappuccino = new Sugar(cappuccino);
        System.out.println("Cost of Sugar Cappuccino: $" + sugarCappuccino.cost());


        // Decorate it with Milk
        Beverage milkSugarCappuccino = new Milk(sugarCappuccino);
        System.out.println("Cost of Milk Sugar Cappuccino: $" + milkSugarCappuccino.cost());


        // 3. Create a simple IcedTea
        System.out.println("---------- \n Creating a simple IcedTea");

        Beverage icedTea = new IcedTea();
        System.out.println("Cost of IcedTea: $" + icedTea.cost());


        // Decorate it with Sugar
        Beverage sugarLemonIcedTea = new Sugar(icedTea);
        System.out.println("Cost of Sugar IcedTea: $" + sugarLemonIcedTea.cost());

    }
}
