public class Kategori {     
    private String namaKategori;     
    private Buku[] daftarBuku; 
 
    public Kategori(String namaKategori, int jumlahBuku) { 
        this.namaKategori = namaKategori;         
        this.daftarBuku = new Buku[jumlahBuku]; 
    } 
 
    public void setBuku(int index, Buku buku) { 
        daftarBuku[index] = buku; 
    } 
 
    public String getNamaKategori() { 
        return namaKategori; 
    } 
 
    public Buku[] getDaftarBuku() { 
        return daftarBuku; 
    } 

    public void tampilkanData() {
        System.out.println("\nKategori: " + namaKategori);
        for (Buku buku : daftarBuku) {
            System.out.print("Judul : " + buku.getJudul() + ", Tahun : " + buku.getTahunTerbit() + ", Penulis : ");
            for (Penulis p : buku.getPenulis()) {
                System.out.print(p.getNama() + " ");
            }   
            System.out.print(", Sinopsis : " + buku.getSinopsis());
            System.out.println();
        }
    }
} 
