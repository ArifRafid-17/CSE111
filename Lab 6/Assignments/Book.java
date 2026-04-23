public class Book extends Product {
    String isbn;
    String publisher;
    public Book(int a, String b, int c, String d, String e){
        super(a,b,c);
        isbn =d;
        publisher =e;
    }
    public String printDetail(){
        return getIdTitlePrice()+"\nISBN: "+isbn+" Publisher: "+publisher;
    }

}
