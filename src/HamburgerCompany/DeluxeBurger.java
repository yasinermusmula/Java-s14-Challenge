package HamburgerCompany;

public class DeluxeBurger extends Hamburger{
    private String cips;
    private String drink;
    public DeluxeBurger() {
        super("Double",19.01,"Double Sandwich");
//        super.addHamburgerAddition1("Cips",0.75);
//        super.addHamburgerAddition2("Drink",1.25);
         this.drink = "Drink";
         this.cips = "Cips";
         super.setName("Deluxe Burger");
  }


    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        super.addHamburgerAddition1(addition1Name,addition1Price);
        setAddition1Name("Shouldn't add item");
        setAddition1Price(0);
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        super.addHamburgerAddition2(addition2Name,addition2Price);
        setAddition2Name("Shouldn't add item");
        setAddition2Price(0);
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        super.addHamburgerAddition3(addition3Name,addition3Price);
        setAddition3Name("Shouldn't add item");
        setAddition3Price(0);
    }

    @Override
    public void addHamburgerAdition4(String addition4Name, double addition4Price) {
        super.addHamburgerAdition4(addition4Name,addition4Price);
        setAddition4Name("Shouldn't add item");
        setAddition4Price(0);
    }

    @Override
    public void itemizeHamburger() {
        super.itemizeHamburger();
    }
}
