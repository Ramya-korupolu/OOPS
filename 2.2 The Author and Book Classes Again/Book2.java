import java.util.Arrays;

public class Book2 {
    private String name;
    private Author[] authors; 
    private double price;
    private int qty = 0; 

    public Book2(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book2(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorNames() {
        StringBuilder names = new StringBuilder();
        for (Author author : authors) {
            if (names.length() > 0) {
                names.append(", ");
            }
            names.append(author.getName());
        }
        return names.toString();
    }

    public String toString() {
        return "Book[name=" + name + ",authors=" + Arrays.toString(authors) + ",price=" + price + ",qty=" + qty + "]";
    }
}

