public class Nonfiction extends Bbook {
    public Nonfiction(String titel) {
        super(titel);
        setPrice();
    }

    @Override
    public void setPrice() {
        price = 37.92;
    }
}
