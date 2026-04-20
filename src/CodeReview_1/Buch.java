package CodeReview_1;

public class Buch extends Medien {
    private String Autor;
    private int seitenAnzahl;

    public Buch(){
        this.Autor = "Leer";
        this.seitenAnzahl = 0;
    }
    public Buch (String autor, int seiten){
        this.Autor = autor;
        this.seitenAnzahl = seiten;
    }
    public Buch (Buch buch) {
        this.Autor = buch.Autor;
        this.seitenAnzahl = buch.seitenAnzahl;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getSeitenAnzahl() {
        return seitenAnzahl;
    }

    public void setSeitenAnzahl(int seitenAnzahl) {
        this.seitenAnzahl = seitenAnzahl;
    }

    @Override
    public void printClassInfo() {
        String s = "CodeReview_1.Buch";
        System.out.println(s);
    }

    @Override
    public String toString() {
        String s = "Autor: " + getAutor() + ", Seiten: " + getSeitenAnzahl();
        return s;
    }
}
