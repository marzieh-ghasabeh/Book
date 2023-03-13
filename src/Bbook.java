
public abstract class Bbook {
    protected String titel;
    protected double price;

    public Bbook(String titel) {
        this.titel = titel;
    }

    public String getTitel() {
        return titel;
    }

    public double getPrice() {
        return price;
    }

    public abstract void setPrice();
    @Override
    public String toString(){
        return "titel is : " + getTitel() + " and price is: " + getPrice();
    }
}



