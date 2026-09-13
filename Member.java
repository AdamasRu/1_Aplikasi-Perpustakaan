import java.util.ArrayList;
import java.util.List;

public class Member extends Pengguna{
    private List<Buku> daftarBuku;

    public Member(String idMember, String nama){
        super(idMember, nama);
        this.daftarBuku = new ArrayList<>();
    }

    public String getIdMember(){
        return id;
    }

    @Override
    public String getNama(){
        return nama;
    }

    public void pinjamBuku(Buku b){
        if(!daftarBuku.contains(b)){
            daftarBuku.add(b);
            System.out.println(nama + " berhasil meminjam " + b.getJudul());
        } else {
            System.out.println(nama + " sudah meminjam buku ini");
        }
    }

    public void kembalikanBuku(Buku b){
        if(daftarBuku.contains(b)){
            daftarBuku.remove(b);
            System.out.println(nama + " mengembalikan " + b.getJudul());
        } else {
            System.out.println(nama + " tidak sedang meminjam buku ini");
        }
    }

    public void tampilkanBuku(){
        System.out.println("Daftar Buku Dipinjam " + nama + " : ");
        int i = 1;
        for(Buku b : daftarBuku){
            System.out.println(i + ". " + b.getKodeBuku() + " " + b.getJudul());
            i++;
        }
    }
}
