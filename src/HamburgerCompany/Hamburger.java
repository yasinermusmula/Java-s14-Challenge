package HamburgerCompany;

public class Hamburger{
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String meat, double price, String breadRollType) {
        this.name = "Hamburger";
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddition1Name() {
        return addition1Name;
    }

    public void setAddition1Name(String addition1Name) {
        this.addition1Name = addition1Name;
    }

    public double getAddition1Price() {
        return addition1Price;
    }

    public void setAddition1Price(double addition1Price) {
        this.addition1Price = addition1Price;
    }

    public String getAddition2Name() {
        return addition2Name;
    }

    public void setAddition2Name(String addition2Name) {
        this.addition2Name = addition2Name;
    }

    public double getAddition2Price() {
        return addition2Price;
    }

    public void setAddition2Price(double addition2Price) {
        this.addition2Price = addition2Price;
    }

    public String getAddition3Name() {
        return addition3Name;
    }

    public void setAddition3Name(String addition3Name) {
        this.addition3Name = addition3Name;
    }

    public double getAddition3Price() {
        return addition3Price;
    }

    public void setAddition3Price(double addition3Price) {
        this.addition3Price = addition3Price;
    }

    public String getAddition4Name() {
        return addition4Name;
    }

    public void setAddition4Name(String addition4Name) {
        this.addition4Name = addition4Name;
    }

    public double getAddition4Price() {
        return addition4Price;
    }

    public void setAddition4Price(double addition4Price) {
        this.addition4Price = addition4Price;
    }

    public void addHamburgerAddition1(String addition1Name, double addition1Price){
        this.addition1Name = addition1Name;
        this.addition1Price=addition1Price;
    }

    public void addHamburgerAddition2(String addition2Name, double addition2Price){
        this.addition2Name = addition2Name;
        this.addition2Price=addition2Price;
    }

    public void addHamburgerAddition3(String addition3Name, double addition3Price){
        this.addition3Name = addition3Name;
        this.addition3Price=addition3Price;
    }

    public void addHamburgerAdition4(String addition4Name, double addition4Price){
        this.addition4Name = addition4Name;
        this.addition4Price=addition4Price;
    }

    public double getTotalPrice(){
        return (this.price + this.addition1Price +this.addition2Price +this.addition3Price +this.addition4Price);
    }

    public void itemizeHamburger() {
        System.out.println("Hamburger{" +
                "name='" + name + '\'' +
                ", meat='" + meat + '\'' +
                ", price=" + price +
                ", breadRollType='" + breadRollType + '\'' +
                ", addition1Name='" + addition1Name + '\'' +
                ", addition1Price=" + addition1Price +
                ", addition2Name='" + addition2Name + '\'' +
                ", addition2Price=" + addition2Price +
                ", addition3Name='" + addition3Name + '\'' +
                ", addition3Price=" + addition3Price +
                ", addition4Name='" + addition4Name + '\'' +
                ", addition4Price=" + addition4Price +  " Total Price " + getTotalPrice()) ;
    };
}
