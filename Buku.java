public class Buku {
    private String judul;
    private String penulis;
    private String kodeBuku;
    private GenreBuku genre;

    public Buku(String judul, String penulis, String kodeBuku, GenreBuku genre){
        this.judul = judul;
        this.penulis = penulis;
        this.kodeBuku = kodeBuku;
        this.genre = genre;
        genre.tambahBuku(this);
    }

    public String getJudul(){
        return judul;
    }

    public String getPenulis(){
        return penulis;
    }

    public String getKodeBuku(){
        return kodeBuku;
    }

    public GenreBuku getGenre(){
        return genre;
    }

    public void tampilkanInfo(){
        System.out.println(kodeBuku + " - " + judul + " oleh " + penulis + " (" + genre.getNamaGenre() + ")");
    }
}
