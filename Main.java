public class Main {
    public static void main(String[] args){

        AplikasiPerpus perpus = new AplikasiPerpus();

        GenreBuku fiksi = new GenreBuku("Fiksi");
        GenreBuku sains = new GenreBuku("Sains");

        Buku b1 = new Buku("Laskar Pelangi", "Andrea Hirata", "BK001", fiksi);
        Buku b2 = new Buku("Bumi Manusia", "Pramoedya Ananta Toer", "BK002", fiksi);
        Buku b3 = new Buku("Sapiens", "Yuval Noah Harari", "BK003", sains);

        perpus.tambahGenre(fiksi);
        perpus.tambahGenre(sains);
        perpus.tambahBuku(b1);
        perpus.tambahBuku(b2);
        perpus.tambahBuku(b3);

        Member m1 = new Member("M001", "Lumi");
        Member m2 = new Member("M002", "Rifqi");
        perpus.tambahMember(m1);
        perpus.tambahMember(m2);

        perpus.tampilkanMember();
        System.out.println();
        perpus.tampilkanBuku();
        System.out.println();
        perpus.tampilkanGenre();
        System.out.println();

        m1.pinjamBuku(b1);
        m1.pinjamBuku(b3);
        m2.pinjamBuku(b2);
        System.out.println();

        m1.tampilkanBuku();
        System.out.println();

        m1.kembalikanBuku(b1);
        System.out.println();
        m1.tampilkanBuku();
        System.out.println();

        fiksi.tampilkanBuku();
        sains.tampilkanBuku();
    }
}
