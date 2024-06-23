# No. 1
Program Java ini meminta pengguna untuk memasukkan satu baris kata atau kalimat. Setelah itu, program akan memisahkan karakter vokal dan konsonan dari input tersebut, mengurutkan karakter vokal secara alfabetis, dan kemudian menampilkan hasilnya.

## Langkah-langkah Program
### Input Pengguna
* Program menggunakan Scanner untuk meminta pengguna memasukkan satu baris kata atau kalimat dari keyboard.

### Inisialisasi StringBuilder
* StringBuilder digunakan untuk mengumpulkan karakter vokal dan konsonan terpisah dari input.

### Daftar Karakter Vokal
* vowelList adalah string yang berisi karakter vokal yang diizinkan, yaitu "aiueo". Karakter-karakter ini digunakan sebagai acuan untuk memeriksa apakah suatu karakter dari input adalah vokal atau konsonan.

### Pemrosesan Karakter Input
* Program melakukan iterasi melalui setiap karakter dari input yang sudah dikonversi menjadi huruf kecil (toLowerCase()). Jika karakter adalah spasi, program melewatinya.
* Untuk setiap karakter, program memeriksa apakah karakter tersebut terdapat dalam vowelList.
* Jika karakter termasuk dalam vowelList, karakter tersebut ditambahkan ke vowel StringBuilder, dan jika tidak, ditambahkan ke consonant StringBuilder.

### Pengurutan Karakter Vokal
* Setelah semua karakter vokal terkumpul di vowel StringBuilder, program mengonversinya menjadi array karakter (char[]).
* Menggunakan Arrays.sort() untuk mengurutkan array karakter vokal secara alfabetis.

### Output
* Program mencetak karakter vokal yang sudah diurutkan secara alfabetis.
* Program juga mencetak karakter konsonan tanpa pengurutan.

# No. 2
Program Java ini menghitung jumlah minimum bus yang diperlukan untuk mengangkut semua anggota keluarga berdasarkan ukuran kelompok mereka. Program ini mengelompokkan anggota keluarga menjadi kelompok dengan jumlah anggota 1 hingga 4 dan menentukan jumlah bus yang optimal berdasarkan aturan tertentu.

## Fitur:
* Persyaratan Input:
    * Jumlah keluarga.
    * Jumlah anggota dalam setiap keluarga (dipisahkan oleh spasi).

* Output:
    * Menampilkan jumlah minimum bus yang diperlukan.

## Cara Kerja:
### Penanganan Input:
* Membaca jumlah keluarga (n) dan jumlah anggota keluarga mereka dari pengguna.
* Memvalidasi bahwa input sesuai dengan jumlah keluarga yang diharapkan.
### Perhitungan Frekuensi:
* Menggunakan array untuk menghitung jumlah anggota keluarga dalam setiap kelompok dari 1 hingga 4.
### Logika Perhitungan Bus:
* Menambahkan bus berdasarkan keluarga yang memiliki tepat 4 anggota.
* Mengelola keluarga dengan kombinasi 3 dan 1 anggota.
* Menghitung kebutuhan bus untuk keluarga dengan tepat 3 anggota.
* Mengelompokkan keluarga dengan 2 anggota untuk menentukan tambahan bus yang diperlukan.
* Menangani keluarga dengan 1 anggota untuk menghitung kebutuhan bus akhir.
### Output:
* Mencetak jumlah minimum bus yang diperlukan untuk mengangkut semua anggota keluarga.
