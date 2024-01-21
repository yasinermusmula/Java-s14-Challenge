import HamburgerCompany.DeluxeBurger;
import HamburgerCompany.Hamburger;
import HamburgerCompany.HealthyBurger;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic",3.5,"Wrap");

        hamburger.addHamburgerAddition1("Tomato", 0.27);

        hamburger.addHamburgerAddition2("Lettuce", 0.75);

        hamburger.addHamburgerAddition3("Cheese", 1.13);

        hamburger.itemizeHamburger();

        DeluxeBurger db = new DeluxeBurger();

        db.addHamburgerAdition4("Tomato",50.3);

        db.itemizeHamburger();

        HealthyBurger healthyBurger = new HealthyBurger("Vegan Burger", 5.67, "Sandwich");

        healthyBurger.addHamburgerAddition1("Egg", 5.43);

        healthyBurger.addHealthyAddition1("Lentils", 3.41);

        healthyBurger.itemizeHamburger();
    }
}