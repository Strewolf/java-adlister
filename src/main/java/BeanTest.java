import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        // Create some Album instances
        albums album1 = new albums(1, "Frank Ocean", "Pyramids", 2012, 24.5, "R&B");
        albums album2 = new albums(2, "Steve Lacey", "Gemini", 2022, 40.6, "R&B");

        // Create some Author instances
        authors author1 = new authors(1, "horace", "smith");
        authors author2 = new authors(2, "Tina", "Pavic");

        // Create some Quote instances with Author objects
        ArrayList<quotes>quote=new ArrayList<quotes>();

        quote.add(new quotes(1, "horace smith", "to be or not to be"));
        quote.add(new quotes(2, "Tina Pavic", "whatever you are be a good one"));

        // Print out the objects
        System.out.println(album1);
        System.out.println(album2);
        for (quotes quotes: quote){
            System.out.println("author:" + quotes.getAuthor());
            System.out.println("content" + quotes.getContent());

        }
    }
}
