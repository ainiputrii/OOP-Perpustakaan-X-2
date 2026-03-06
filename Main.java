public class Main {
    public static void main(String[] args) {
        System.out.println("----Perpustakaan X----");
        System.out.println("Berikut Daftar Bukunya: ");

        Kategori[] kategoriList = new Kategori[7];

        kategoriList[0] = new Kategori("Teknologi", 5);
        kategoriList[1] = new Kategori("Filsafat", 5);
        kategoriList[2] = new Kategori("Sejarah", 5);
        kategoriList[3] = new Kategori("Agama", 5);
        kategoriList[4] = new Kategori("Psikologi", 5);
        kategoriList[5] = new Kategori("Politik", 5);
        kategoriList[6] = new Kategori("Fiksi", 5);

        //contoh menggunakan sinopsis
        kategoriList[0].setBuku(0, new Buku("Dasar Pemrograman", 2020, new Penulis[]{new Penulis("Andi")}, 
            "Buku ini menjelaskan dasar dasar pemrograman komputer untuk pemula agar memahami logika coding"));
        kategoriList[0].setBuku(1, new Buku("Algoritma", 2021, new Penulis[]{new Penulis("Budi")}, 
            "Buku ini membahas konsep algoritma pemrograman dan cara menyelesaikan masalah menggunakan logika terstruktur"));
        kategoriList[0].setBuku(2, new Buku("Jaringan Komputer", 2019, new Penulis[]{new Penulis("Citra")}, 
            "Buku ini menjelaskan konsep jaringan komputer perangkat jaringan dan cara komunikasi data antar komputer"));
        kategoriList[0].setBuku(3, new Buku("AI Modern", 2023, new Penulis[]{new Penulis("Dewi")}, 
            "Buku ini membahas perkembangan kecerdasan buatan modern serta penerapannya dalam teknologi masa kini"));
        kategoriList[0].setBuku(4, new Buku("Sistem Informasi", 2018, new Penulis[]{new Penulis("Rian")}, 
            "Buku ini menjelaskan sistem informasi organisasi pengolahan data dan pemanfaatan teknologi informasi"));

        //tidak menggunakan sinopsis
        kategoriList[0].setBuku(0, new Buku("Dasar Pemrograman", 2020, new Penulis[]{new Penulis("Andi")}, "Buku ini menjelaskan dasar dasar pemrograman komputer untuk pemula agar memahami logika coding"));
        kategoriList[0].setBuku(1, new Buku("Algoritma", 2021, new Penulis[]{new Penulis("Budi")}, "Buku ini membahas konsep algoritma pemrograman dan cara menyelesaikan masalah menggunakan logika terstruktur"));
        kategoriList[0].setBuku(2, new Buku("Jaringan Komputer", 2019, new Penulis[]{new Penulis("Citra")}, "Buku ini menjelaskan konsep jaringan komputer perangkat jaringan dan cara komunikasi data antar komputer"));
        kategoriList[0].setBuku(3, new Buku("AI Modern", 2023, new Penulis[]{new Penulis("Dewi")}, "Buku ini membahas perkembangan kecerdasan buatan modern serta penerapannya dalam teknologi masa kini"));
        kategoriList[0].setBuku(4, new Buku("Sistem Informasi", 2018, new Penulis[]{new Penulis("Rian")}, "Buku ini menjelaskan sistem informasi organisasi pengolahan data dan pemanfaatan teknologi informasi"));

        kategoriList[1].setBuku(0, new Buku("Pancasila", 2020, new Penulis[]{new Penulis("Nina")}, ""));
        kategoriList[1].setBuku(1, new Buku("Filsafat Modern", 2021, new Penulis[]{new Penulis("Omar")}, ""));
        kategoriList[1].setBuku(2, new Buku("Filsafat Klasik", 2019, new Penulis[]{new Penulis("Putu")}, ""));
        kategoriList[1].setBuku(3, new Buku("Filsafat Kontemporer", 2023, new Penulis[]{new Penulis("Qori")}, ""));
        kategoriList[1].setBuku(4, new Buku("Etika", 2018, new Penulis[]{new Penulis("Rita")}, ""));

        kategoriList[2].setBuku(0, new Buku("Indonesia Merdeka", 2009, new Penulis[]{new Penulis("Nina &"), new Penulis("Budi")}, ""));
        kategoriList[2].setBuku(1, new Buku("Terbentuknya UB", 2023, new Penulis[]{new Penulis("Omar &"), new Penulis("Dewi")}, ""));
        kategoriList[2].setBuku(2, new Buku("Sejarah FILKOM", 2020, new Penulis[]{new Penulis("Putu &"), new Penulis("Rian")}, ""));
        kategoriList[2].setBuku(3, new Buku("Asal Usul Junction", 2008, new Penulis[]{new Penulis("Qori &"), new Penulis("Andi")}, ""));
        kategoriList[2].setBuku(4, new Buku("Manusia Purba", 2019, new Penulis[]{new Penulis("Rita &"), new Penulis("Citra")}, ""));

        kategoriList[3].setBuku(0, new Buku("Sejarah Peradaban Islam", 2017, new Penulis[]{new Penulis("Ahmad,"), new Penulis("Farhan, &"), new Penulis("Hana")}, ""));
        kategoriList[3].setBuku(1, new Buku("Pemikiran Ulama Nusantara", 2015, new Penulis[]{new Penulis("Latif,"), new Penulis("Yusuf, &"), new Penulis("Nadia")}, ""));
        kategoriList[3].setBuku(2, new Buku("Akhlak dan Kehidupan", 2021, new Penulis[]{new Penulis("Salman,"), new Penulis("Karim, &"), new Penulis("Rahman")}, ""));
        kategoriList[3].setBuku(3, new Buku("Ilmu Tafsir Modern", 2018, new Penulis[]{new Penulis("Aisyah,"), new Penulis("Fikri, &"), new Penulis("Rizal")}, ""));
        kategoriList[3].setBuku(4, new Buku("Pemahaman Hadis", 2016, new Penulis[]{new Penulis("Imran,"), new Penulis("Zaki, &"), new Penulis("Farid")}, ""));

        kategoriList[4].setBuku(0, new Buku("Psikologi Kepribadian", 2019, new Penulis[]{new Penulis("Sinta")}, ""));
        kategoriList[4].setBuku(1, new Buku("Perilaku Manusia", 2017, new Penulis[]{new Penulis("Rudi")}, ""));
        kategoriList[4].setBuku(2, new Buku("Psikologi Sosial", 2022, new Penulis[]{new Penulis("Laras")}, ""));
        kategoriList[4].setBuku(3, new Buku("Mental Health Modern", 2020, new Penulis[]{new Penulis("Kevin")}, ""));
        kategoriList[4].setBuku(4, new Buku("Motivasi dan Diri", 2018, new Penulis[]{new Penulis("Putri")}, ""));

        kategoriList[5].setBuku(0, new Buku("Politik Indonesia Modern", 2021, new Penulis[]{new Penulis("Arif")}, ""));
        kategoriList[5].setBuku(1, new Buku("Demokrasi di Asia", 2016, new Penulis[]{new Penulis("Rangga")}, ""));
        kategoriList[5].setBuku(2, new Buku("Kebijakan Publik", 2020, new Penulis[]{new Penulis("Yoga")}, ""));
        kategoriList[5].setBuku(3, new Buku("Sistem Pemerintahan", 2018, new Penulis[]{new Penulis("Fajar")}, ""));
        kategoriList[5].setBuku(4, new Buku("Geopolitik Dunia", 2022, new Penulis[]{new Penulis("Aditya")}, ""));

        kategoriList[6].setBuku(0, new Buku("Petualangan di Nusantara", 2019, new Penulis[]{new Penulis("Raka")}, ""));
        kategoriList[6].setBuku(1, new Buku("Misteri Kota Tua", 2021, new Penulis[]{new Penulis("Mira")}, ""));
        kategoriList[6].setBuku(2, new Buku("Legenda Gunung Selatan", 2017, new Penulis[]{new Penulis("Bima")}, ""));
        kategoriList[6].setBuku(3, new Buku("Rahasia Dunia Paralel", 2023, new Penulis[]{new Penulis("Alya")}, ""));
        kategoriList[6].setBuku(4, new Buku("Perjalanan Tanpa Akhir", 2018, new Penulis[]{new Penulis("Nisa")}, ""));

        for (Kategori kategori : kategoriList) {
            kategori.tampilkanData();
        }
    }
}
