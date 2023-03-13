
public abstract class Bbook {
    String titel;
    double price;

    public Bbook(String titel) {
        this.titel = titel;
    }

    public String getTitel() {
        return titel;
    }

    public double getPrice() {
        return price;
    }

    public abstract void setPrice(double price);
}



