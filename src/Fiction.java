public class Fiction extends Bbook {

    public Fiction(String titel) {
        super(titel);
        setPrice();
    }

    @Override
    public void setPrice() {
        price = 24.99;
    }
}
