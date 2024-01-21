package HamburgerCompany;

public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;



    public HealthyBurger(String meat, double price, String breadRollType) {
        super(meat,price,breadRollType);
        super.setName("Healthy Burger");
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        super.addHamburgerAddition1(addition1Name, addition1Price);
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        super.addHamburgerAddition2(addition2Name, addition2Price);
    }


    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price){
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }


    @Override
    public String toString() {
        return "HealthyBurger{" +
                super.getName()+ " " +
                super.getMeat()+ " " +
                super.getPrice()+ " " +
                super.getAddition1Name() + " " +
                super.getAddition1Price()+ " " +
                super.getAddition2Name() + " " +
                super.getAddition2Price()+ " " +
                super.getAddition3Name() + " " +
                super.getAddition3Price()+ " " +
                super.getAddition4Name() + " " +
                super.getAddition4Price()+ " " +
                "healthyExtra1Name='" + healthyExtra1Name + '\'' +
                ", healthyExtra1Price=" + healthyExtra1Price +
                ", healthyExtra2Name='" + healthyExtra2Name + '\'' +
                ", healthyExtra2Price=" + healthyExtra2Price +
                  super.getTotalPrice()  +
                '}' ;
    }

    @Override
    public void itemizeHamburger() {
        System.out.println(toString());
    }
}
