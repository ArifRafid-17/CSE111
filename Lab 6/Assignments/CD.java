public class CD extends Product {
    String band;
    int duration;
    String genre;
    public CD(int a, String b, int c, String d, int e, String f){
        super(a,b,c);
        band =d;
        duration=e;
        genre=f;
    }
    public String printDetail(){
        return getIdTitlePrice()+"\nBand: "+band+" Duration: "+duration+" Minutes"+ "\nGenre: "+genre;
    }
}
