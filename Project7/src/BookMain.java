
public class BookMain {
    public static void main (String[] args){
        Book gamesOfThrones = new Book("Games of Thrones","Jonb Dow", "Fiction", 987);
        Book matchBook = new Book("Match with number", "Matthew Bo","Match", 230);
        Book javaBook = new Book("Learn Java", "Alexandru Tomus","Tehnology", 500);

        printBookDetails(gamesOfThrones);
        printBookDetails(matchBook);
        printBookDetails(javaBook);
    } // endMain

    public static void printBookDetails(Book book){

        System.out.println(book.getName());
        System.out.println("by " + book.getAuthor());
        System.out.println("has "+book.getPages() + " pages");
        System.out.println("and its gender is: "+book.getGender());
        System.out.println();

    }
}
