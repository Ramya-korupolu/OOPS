public class TestBook2 {
    public static void main(String[] args) {
    
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        Book2 javaDummy = new Book2("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  

        System.out.println("Book name: " + javaDummy.getName());
        System.out.println("Price: " + javaDummy.getPrice());
        System.out.println("Quantity: " + javaDummy.getQty());
        System.out.println("Authors: " + javaDummy.getAuthorNames()); 

        javaDummy.setPrice(29.99);
        javaDummy.setQty(50);
        System.out.println("Updated price: " + javaDummy.getPrice());
        System.out.println("Updated quantity: " + javaDummy.getQty());

        Author[] bookAuthors = javaDummy.getAuthors();
        for (Author author : bookAuthors) {
            System.out.println("Author: " + author); 
        }
    }
}
