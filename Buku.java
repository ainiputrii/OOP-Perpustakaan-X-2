public class Buku {
    private String judul;
    private int tahunTerbit;
    private Penulis[] penulis;
    private String sinopsis;

    //construktornya
    public Buku(String judul, int tahunTerbit, Penulis[] penulis, String sinopsis) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.penulis = penulis;
        this.sinopsis = sinopsis;
    }

    public String getJudul() {
        return judul;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public Penulis[] getPenulis() {
        return penulis;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    //penghitungan kata sinopsis
    public int hitungJumlahKataSinopsis() {
        if (sinopsis == null || sinopsis.isEmpty()) {
            return 0;
        }
        String[] kata = sinopsis.split(" ");
        return kata.length;
    }

    public double cekKesamaan(Buku bukuLain) {
        int sama = 0;
        int total = 4;

        if (this.judul.equals(bukuLain.judul)) {
            sama++;
        }

        if (this.tahunTerbit == bukuLain.tahunTerbit) {
            sama++;
        }

        if (this.sinopsis.equals(bukuLain.sinopsis)) {
            sama++;
        }

        if (this.penulis.length == bukuLain.penulis.length) {
            boolean penulisSama = true;
            for (int i = 0; i < penulis.length; i++) {
                if (!this.penulis[i].getNama().equals(bukuLain.penulis[i].getNama())) {
                    penulisSama = false;
                    break;
                }
            }
            if (penulisSama) {
                sama++;
            }
        }

        return (sama * 100.0) / total;
    }

    public Buku copy() {
        Penulis[] copyPenulis = new Penulis[this.penulis.length];
        for (int i = 0; i < penulis.length; i++) {
            copyPenulis[i] = new Penulis(this.penulis[i].getNama());
        }
        return new Buku(this.judul, this.tahunTerbit, copyPenulis, this.sinopsis);
    }
}
