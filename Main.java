public class Main {

    public static void main(String[] args) {
	    Books book1=new Books("hayatın sesi","gülseren budayıcıoğlu","doğan kitap",224,123,2022);
        BooksManager booksManager=new BooksManager();
       /* book1.setBookName("Hayatın Sesi");
        book1.setAuthor("Gülseren Budayıcıoğlu");
        book1.setYear(2022);
        book1.setPublishHouse("Doğan Kitap");
        book1.setNumberOfPage(224);
        book1.setBarcode(123);*/

        booksManager.Add(book1);
        System.out.println("Kitabın ismi: "+book1.getBookName());

    }
}
