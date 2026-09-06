import java.util.ArrayList;
import java.util.List;

public class AplikasiPerpus {
    private List<Member> daftarMember;
    private List<Buku> daftarBuku;
    private List<GenreBuku> daftarGenre;

    public AplikasiPerpus(){
        this.daftarMember = new ArrayList<>();
        this.daftarBuku = new ArrayList<>();
        this.daftarGenre = new ArrayList<>();
    }

    public void tambahMember(Member m){
        if(!daftarMember.contains(m)){
            daftarMember.add(m);
        }
    }

    public void tambahBuku(Buku b){
        if(!daftarBuku.contains(b)){
            daftarBuku.add(b);
        }
    }

    public void tambahGenre(GenreBuku g){
        if(!daftarGenre.contains(g)){
            daftarGenre.add(g);
        }
    }

    public void tampilkanMember(){
        System.out.println("Daftar Member Perpustakaan : ");
        int i = 1;
        for(Member m : daftarMember){
            System.out.println(i + ". " + m.getIdMember() + " " + m.getNama());
            i++;
        }
    }

    public void tampilkanBuku(){
        System.out.println("Daftar Buku Perpustakaan : ");
        int i = 1;
        for(Buku b : daftarBuku){
            System.out.println(i + ". " + b.getKodeBuku() + " " + b.getJudul());
            i++;
        }
    }

    public void tampilkanGenre(){
        System.out.println("Daftar Genre Perpustakaan : ");
        int i = 1;
        for(GenreBuku g : daftarGenre){
            System.out.println(i + ". " + g.getNamaGenre());
            i++;
        }
    }
}
