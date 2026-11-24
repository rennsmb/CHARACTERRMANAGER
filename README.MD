## Character Manager — TP3 (Java Visual SIH-6406)
# Deskripsi Project

Character Manager merupakan project Java yang dibuat untuk memenuhi Tugas Praktik 3 (TP3) mata kuliah Java Visual SIH-6406. Project ini mengimplementasikan konsep Object-Oriented Programming (OOP), khususnya Encapsulation, Constructor, Enum, Getter, Setter, dan Method.

Project ini memungkinkan pengguna membuat dan mengelola karakter dengan atribut seperti ID, nama, tipe karakter, level, hit points, attack power, dan mana. Selain itu, terdapat fitur Level Up dan pengecekan status karakter menggunakan method isAlive().

## Fitur Program
Membuat karakter menggunakan constructor.
Menggunakan enum untuk menentukan jenis karakter.
Menerapkan Encapsulation dengan atribut private.
Menggunakan Getter dan Setter untuk mengakses atribut.
Menghitung HP dan Attack Power berdasarkan level.
Melakukan Level Up karakter.
Menambahkan atribut Mana dengan validasi nilai negatif.
Mengecek status kehidupan karakter menggunakan isAlive().
Menampilkan informasi karakter menggunakan toString().
Screenshot Output Program

## Berikut merupakan screenshot hasil eksekusi program Character Manager:

![TP3](outputtt.png)

Screenshot menampilkan hasil pembuatan karakter, demonstrasi Level Up, serta pengujian fitur Mana dan isAlive().

## Struktur Folder Project
text
javavisual-tp03-[253303621270]/
│
├── CharacterManager/
│   └── src/
│       └── com/
│           └── unpri/
│               └── charactermanager/
│                   ├── Main.java
│                   └── model/
│                       ├── Character.java
│                       └── CharacterType.java
│
├── screenshots/
│   └── output.png
│
└── README.md

Teknologi yang Digunakan
Bahasa Pemrograman: Java
JDK: Java Development Kit 17
IDE: Visual Studio Code
Version Control: Git dan GitHub

## Informasi Mahasiswa
Nama Lengkap: LOUREN KRISTIN BR BRAHMANA
NIM: 253303621270
Kelas: PAGI B
Mata Kuliah: Java Visual
Dokumentasi Analisis Desain

## Dokumentasi analisis desain dan ekosistem Java untuk Bagian D dapat diakses melalui Google Docs berikut:

[DOCS](https://drive.google.com/file/d/1a5pzSZgiHmdTFMs5o29KIncLWAodGXss/view?usp=drivesdk)]


# Character Manager — AP6 (Java Visual SIH-6406)
## Deskripsi Project

Character Manager merupakan aplikasi berbasis Java yang dikembangkan untuk memenuhi tugas praktik AP6 mata kuliah Java Visual SIH-6406. Project ini menerapkan konsep Object-Oriented Programming (OOP), khususnya Class, Object, Encapsulation, Reference, ArrayList, Static Variable, dan Method Overriding.

Aplikasi ini digunakan untuk mengelola data karakter game, mulai dari menambahkan karakter, mencari karakter berdasarkan nama, menghapus karakter, hingga menghitung jumlah karakter yang tersimpan.

Project ini juga dikembangkan dengan fitur tambahan untuk menganalisis karakter berdasarkan level, tipe, dan kekuatan serangan.

## Fitur Program
A. Core Features
Add Character — Menambahkan karakter baru ke dalam daftar.
Duplicate Validation — Menolak penambahan karakter dengan nama yang sudah terdaftar.
Find by Name — Mencari karakter berdasarkan nama.
Remove Character — Menghapus karakter dari daftar.
Get Total Characters — Menghitung jumlah karakter yang tersimpan.
Get All Characters — Mengembalikan salinan ArrayList agar data internal tetap terlindungi.
Equals Method — Membandingkan karakter berdasarkan nama.
## B. Mini-Challenge
getAverageLevel() — Menghitung rata-rata level seluruh karakter dan mengembalikan 0 jika daftar kosong.
findByType() — Mencari seluruh karakter berdasarkan jenis CharacterType.
## C. Fitur Analitik Tambahan

findStrongest()

Fitur tambahan untuk mencari karakter dengan nilai attack power tertinggi.

Fitur ini dibuat untuk membantu menganalisis karakter terkuat dalam daftar tanpa mengekspos ArrayList internal dari CharacterManager.

Screenshot Output Program

## Berikut merupakan dokumentasi hasil pengujian program melalui terminal Visual Studio Code.

![TP05](outputTP05.png)

Pengujian yang ditampilkan meliputi:

Penambahan karakter Arjuna, Merlin, dan Athena.
Penolakan nama karakter duplikat.
Penghitungan total karakter.
Pencarian karakter berdasarkan nama.
Penghapusan karakter.
Penampilan daftar karakter yang tersisa.

Catatan: Screenshot perlu diperbarui setelah seluruh pengujian Mini-Challenge AP6 selesai agar hasil getAverageLevel(), findByType(), dan eksperimen salinan ArrayList juga terlihat.

## Struktur Folder Project
text
CHARACTERMANAGER/
│
├── src/
│   └── com/
│       └── unpri/
│           └── charactermanager/
│               ├── Main.java
│               │
│               └── model/
│                   ├── Character.java
│                   ├── CharacterManager.java
│                   └── CharacterType.java
│
├── outputtt.png
├── outputTP05.png
│
└── README.md

## Teknologi yang Digunakan
Programming Language: Java
JDK: Java 21
IDE: Visual Studio Code
Version Control: Git
Repository: GitHub
Konsep OOP yang Diterapkan
Encapsulation: Menggunakan atribut private dan method getter/setter.
Reference: Memahami bahwa beberapa variabel dapat menunjuk object yang sama.
ArrayList: Mengelola kumpulan object Character.
Static Variable: Menyimpan data yang dimiliki bersama oleh seluruh object.
Method Overriding: Mengimplementasikan equals() untuk membandingkan nama karakter.
Defensive Copy: Mengembalikan salinan ArrayList untuk melindungi data internal.
Alasan Pemilihan Fitur Analitik

Fitur findStrongest() dipilih karena dapat membantu mengetahui karakter dengan attack power tertinggi dalam aplikasi Character Manager.

Selain memberikan informasi tambahan kepada pengguna, fitur ini juga menerapkan konsep Encapsulation karena proses pencarian dilakukan di dalam class CharacterManager tanpa memberikan akses langsung ke ArrayList internal.

## Informasi Mahasiswa
Nama Lengkap: LOUREN KRISTIN BR BRAHMANA
NIM: 253303621270
Kelas: PAGI B
Mata Kuliah: Java Visual
Tugas: AP6 — Character Manager
Dokumentasi Analisis Desain

## Analisis mengenai Java Reference, Primitive Value, Static Variable, equals(), dan Encapsulation dapat dibaca melalui Google Docs berikut:

[(https://drive.google.com/file/d/1lgrbDsuZ1SNDt5Mzoey_uO7kUBmcxiTZ/view?usp=drivesdk)]


## Character Manager – tp08
TP8: Elemen GUI Dasar (Frame / Panel / Label)

Mata Kuliah: Java Visual 
Universitas: Universitas Prima Indonesia (UNPRI)
Fakultas: Sains dan Teknologi
Program Studi: Sistem Informasi
Tahun Angkatan: 2025
Dosen Pengampu: Dr. Evta Indra

## DATA MAHASISWA
Nama Lengkap: LOUREN KRISTIN BR BRAHMANA
NIM: 253303621270
Kelas: PAGI B
Mata Kuliah: Java Visual
Tugas: AP6 — Character Manager
Dokumentasi Analisis Desain

1. Deskripsi Project

Character Manager Sprint #3 merupakan pengembangan aplikasi sederhana berbasis Java yang digunakan untuk mengelola dan menampilkan data karakter menggunakan Graphical User Interface (GUI).

Pada tahap ini, aplikasi dikembangkan dari program berbasis console menjadi aplikasi desktop menggunakan Java Swing. Komponen GUI yang digunakan meliputi JFrame, JPanel, dan JLabel.

Aplikasi menampilkan daftar karakter secara dinamis berdasarkan data yang dikelola oleh CharacterManager. Selain itu, aplikasi juga memiliki fitur perhitungan statistik berupa rata-rata level seluruh karakter.

Pengembangan ini menerapkan konsep Object-Oriented Programming (OOP), Event-Driven Programming, dan Model-View-Controller (MVC).

2. Tujuan Praktikum

Tujuan pengembangan Character Manager Sprint #3 adalah:

Memahami penggunaan JFrame sebagai jendela utama aplikasi Java Swing.
Menggunakan JPanel sebagai tempat untuk menampung komponen GUI.
Menggunakan JLabel untuk menampilkan informasi karakter.
Menampilkan data karakter secara dinamis menggunakan perulangan.
Mengimplementasikan SwingUtilities.invokeLater() untuk menjalankan GUI melalui Event Dispatch Thread (EDT).
Menghitung dan menampilkan rata-rata level karakter.
Memahami aliran data dan penerapan prinsip MVC dalam aplikasi Java.
3. Teknologi yang Digunakan
Bahasa Pemrograman: Java
GUI Framework: Java Swing
IDE: Visual Studio Code
Java Library: JFrame, JPanel, JLabel, SwingUtilities
Version Control: Git dan GitHub
Konsep Pemrograman: OOP, MVC, dan Event-Driven Programming
4. Struktur Project

Struktur project Character Manager:

text
JavaVisual-253303621270/
│
├── src/
│   ├── Main.java
│   │
│   └── com/
│       └── unpri/
│           └── charactermanager/
│               ├── model/
│               │   ├── Character.java
│               │   ├── CharacterType.java
│               │   └── CharacterManager.java
│               │
│               └── view/
│                   └── MainWindow.java
├── outputtt.png
├── outputTP05.png
├── README.md
│
└── ...


Keterangan:

Main.java: Menjadi titik awal program dan mengatur proses inisialisasi data serta menjalankan GUI.
Character.java: Menyimpan informasi setiap karakter.
CharacterType.java: Menentukan tipe karakter seperti WARRIOR, MAGE, dan ARCHER.
CharacterManager.java: Mengelola kumpulan data karakter.
MainWindow.java: Menampilkan data karakter melalui antarmuka Java Swing.
README.md: Berisi dokumentasi project dan penjelasan hasil praktikum.
5. Implementasi TP8
A. Implementasi MainWindow

Pada praktikum ini dibuat class MainWindow yang berada di package view dan menggunakan inheritance dari JFrame.

java
public class MainWindow extends JFrame {
    private JPanel mainPanel;
    private ArrayList<Character> characterList;
    private double averageLevel;
}


MainWindow memiliki dua parameter constructor, yaitu:

ArrayList<Character> characterList untuk menerima daftar karakter.
double averageLevel untuk menerima nilai rata-rata level karakter.

Jendela aplikasi menggunakan title Character Manager v0.3, ukuran 500 × 450 pixel, dan posisi jendela berada di tengah layar.

B. Menampilkan Data Karakter Secara Dinamis

Data karakter ditampilkan menggunakan perulangan enhanced for:

java
for (Character c : characterList) {
    String info = c.getName() + " | " + c.getType()
                + " | Lv." + c.getLevel()
                + " | HP:" + c.getHitPoints()
                + " | ATK:" + c.getAttackPower();

    JLabel characterLabel = new JLabel(info);
    mainPanel.add(characterLabel);
}


Dengan menggunakan perulangan tersebut, setiap karakter yang tersimpan di CharacterManager dapat ditampilkan secara otomatis tanpa harus membuat JLabel satu per satu secara manual.

C. Statistik Rata-Rata Level

Aplikasi memiliki fitur tambahan berupa statistik rata-rata level karakter.

Perhitungan dilakukan dengan mengambil seluruh level karakter, kemudian membaginya dengan jumlah karakter.

Rumus:

text
Rata-rata Level = Total Level / Jumlah Karakter


Implementasi perhitungan pada Main.java:

java
double averageLevel = characters.stream()
        .mapToInt(Character::getLevel)
        .average()
        .orElse(0.0);


Hasil perhitungan kemudian dikirimkan ke MainWindow untuk ditampilkan menggunakan JLabel.

D. Event Dispatch Thread (EDT)

Untuk menjalankan GUI, Main.java menggunakan:

java
SwingUtilities.invokeLater(() -> {
    MainWindow window = new MainWindow(characters, averageLevel);
    window.setVisible(true);
});


Penggunaan SwingUtilities.invokeLater() bertujuan agar pembuatan dan pengelolaan komponen GUI Swing dilakukan melalui Event Dispatch Thread (EDT), sehingga pengelolaan antarmuka berjalan sesuai mekanisme Swing.

6. Data Karakter

Aplikasi menggunakan minimal lima karakter dengan tipe dan level yang berbeda.

No.	Nama	Tipe	Level
1	Arjuna	WARRIOR	5
2	Merlin	MAGE	3
3	Athena	ARCHER	4
4	Gatotkaca	WARRIOR	7
5	Luna	MAGE	6

Karakter Tambahan
1. Gatotkaca

Tipe: WARRIOR
Level: 7
Alasan: Gatotkaca dipilih sebagai karakter Warrior karena menggambarkan karakter yang kuat dan memiliki kemampuan bertarung. Level 7 diberikan untuk menunjukkan karakter dengan tingkat kemampuan yang lebih tinggi.
2. Luna

Tipe: MAGE
Level: 6
Alasan: Luna dipilih sebagai karakter Mage karena menggambarkan karakter yang menggunakan kemampuan sihir. Level 6 diberikan sebagai variasi kemampuan karakter dalam aplikasi.
7. Hasil Implementasi
A. Screenshot Sebelum Penambahan Karakter
Pada tahap awal aplikasi menampilkan tiga karakter, yaitu Arjuna, Merlin, dan Athena.

Statistik rata-rata level:

(5 + 3 + 4) / 3 = 4.0

!Screenshot Sebelum Penambahan Karakter

B. Screenshot Sesudah Penambahan Karakter
Setelah menambahkan Gatotkaca dan Luna, jumlah karakter menjadi lima.

Statistik rata-rata level:

(5 + 3 + 4 + 7 + 6) / 5 = 5.0

![TP08](SESUDAH+CHARACTER.png)

Penambahan karakter menyebabkan nilai rata-rata level berubah dari 4.0 menjadi 5.0. Hal ini menunjukkan bahwa statistik dihitung berdasarkan data karakter yang digunakan oleh aplikasi.

8. Alur Data dan Penerapan MVC
Aplikasi Character Manager menerapkan konsep Model-View-Controller (MVC) untuk memisahkan tanggung jawab setiap bagian program.

Aliran data aplikasi:

Main → CharacterManager → MainWindow

Penjelasan:

Main: Menjadi titik awal aplikasi, membuat objek karakter, menambahkan data karakter, dan menghitung rata-rata level.
CharacterManager: Bertanggung jawab mengelola kumpulan objek Character yang telah ditambahkan.
MainWindow: Berperan sebagai View yang menerima daftar karakter dan nilai rata-rata level untuk ditampilkan menggunakan komponen GUI seperti JLabel.
Dengan pemisahan tersebut, pengelolaan data tidak dicampurkan secara langsung dengan proses penampilan antarmuka. Hal ini membuat program lebih terstruktur, mudah dipahami, dan lebih mudah dikembangkan.

9. Kesimpulan
Melalui praktikum TP8 Character Manager Sprint #3, saya mempelajari cara mengembangkan aplikasi Java berbasis console menjadi aplikasi desktop menggunakan Java Swing.

Saya memahami penggunaan JFrame, JPanel, dan JLabel dalam membangun antarmuka grafis. Saya juga mempelajari cara menampilkan data karakter secara dinamis menggunakan perulangan, menghitung rata-rata level karakter, serta menjalankan GUI menggunakan SwingUtilities.invokeLater().

Selain implementasi GUI, praktikum ini memberikan pemahaman mengenai konsep Event-Driven Programming dan Model-View-Controller (MVC). Dengan penerapan konsep tersebut, aplikasi menjadi lebih terstruktur dan memiliki pemisahan tanggung jawab antara pengelolaan data dan tampilan antarmuka.

10. Dokumentasi Analisis GUI dan MVC
Dokumentasi analisis TP8 yang membahas perbedaan program sekuensial dan event-driven, penggunaan Event Dispatch Thread, debugging JFrame, konsep is-a dan has-a, serta penerapan prinsip MVC dapat diakses melalui Google Docs berikut:

Link Google Docs:

(https://docs.google.com/document/d/1HUeWjLftskILc-ugDS0gc9JHdNEDlhJl/edit?usp=drivesdk&ouid=112205440563882970961&rtpof=true&sd=true)


