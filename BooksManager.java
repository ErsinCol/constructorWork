public class BooksManager {
    public void Add(Books book1){
            System.out.println("Kitap eklendi:  "+book1.getBookName()+ "--" + book1.getAuthor()+"--"+book1.getPublishHouse()
            +"--"+book1.getNumberOfPage()+"--"+book1.getBarcode()+"--"+book1.getYear());
    }
}
