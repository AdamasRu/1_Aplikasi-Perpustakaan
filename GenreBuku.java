import java.util.ArrayList;
import java.util.List;

public class GenreBuku {
    private String namaGenre;
    private List<Buku> daftarBuku;

    public GenreBuku(String namaGenre){
        this.namaGenre = namaGenre;
        this.daftarBuku = new ArrayList<>();
    }

    public String getNamaGenre(){
        return namaGenre;
    }

    public void tambahBuku(Buku b){
        if(!daftarBuku.contains(b)){
            daftarBuku.add(b);
        }
    }

    public void tampilkanBuku(){
        System.out.println("Daftar Buku Genre " + namaGenre + " : ");
        int i = 1;
        for(Buku b : daftarBuku){
            System.out.println(i + ". " + b.getKodeBuku() + " " + b.getJudul());
            i++;
        }
    }
}
