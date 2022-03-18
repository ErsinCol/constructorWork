public class Books {

    public Books(String bookName,String author,String publishHouse,int numberOfPage,int barcode,int year){
        System.out.println("Parametreli yapıcı method çalıştı");
        this.bookName=bookName;
        this.author=author;
        this.publishHouse=publishHouse;
        this.numberOfPage=numberOfPage;
        this.barcode=barcode;
        this.year=year;
    }

    public Books(){
        System.out.println("Yapıcı method çalıştı");
    }
    // create field
    private String bookName;
    private String author;
    private String publishHouse;
    private int numberOfPage;
    private int barcode;
    private int year;

    // get and set methods

    public String getBookName(){
        return bookName;
    }
    public void setBookName(String bookName){
        this.bookName=bookName;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishHouse() {
        return publishHouse;
    }

    public void setPublishHouse(String publishHouse) {
        this.publishHouse = publishHouse;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
