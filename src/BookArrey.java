public class BookArrey {
    static Bbook[] bookArrey = {new Fiction("F1"), new Fiction("F2"), new Fiction("F3"),
            new Fiction("F4"), new Fiction("F5"), new Nonfiction("F1"), new Nonfiction("F2"),
            new Nonfiction("F3"), new Nonfiction("F4"), new Nonfiction("F5")};

    public static void main(String[] args) {
        for (Bbook b: bookArrey
             ) {
            System.out.println(b);
        }
    }
}
