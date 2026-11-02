
# Kalkulator BMI

Aplikasi Kalkulator BMI merupakan aplikasi desktop berbasis Java yang dikembangkan menggunakan JavaFX untuk membangun Graphical User Interface (GUI). Aplikasi ini dibuat untuk menghitung Body Mass Index (BMI) berdasarkan data tinggi badan, berat badan, dan pilihan jenis kelamin yang dimasukkan oleh pengguna. Hasil perhitungan akan ditampilkan melalui antarmuka aplikasi beserta kategori BMI.

## Fitur

- Input tinggi badan dalam satuan sentimeter (cm).
- Input berat badan dalam satuan kilogram (kg).
- Pilihan jenis kelamin.
- Perhitungan Body Mass Index (BMI).
- Menampilkan hasil perhitungan BMI.
- Menampilkan kategori berdasarkan hasil BMI.
- Validasi input untuk memastikan data yang dimasukkan sesuai.

## Tampilan Aplikasi

![Tampilan Kalkulator BMI](KalkulatorBMI/screenshots/kalkulatorBMI.png)

## Rumus Perhitungan

BMI dihitung menggunakan rumus berikut:

BMI = Berat Badan (kg) / Tinggi Badan (m)²

### Kategori BMI

| Nilai BMI | Kategori |
|---|---|
| < 18,5 | Berat badan kurang |
| 18,5 – < 25 | Berat badan normal |
| 25 – < 30 | Berat badan berlebih |
| ≥ 30 | Obesitas |

## Struktur Project

```text
KalkulatorBMI/
├── src/
│   └── main/
│       ├── java/
│       │   ├── main/
│       │   │   └── Main.java
│       │   ├── controller/
│       │   │   └── KalkuBmiController.java
│       │   └── model/
│       │       └── Bmi.java
│       └── resources/
│           └── fxml/
│               └── KalkuBmi.fxml
├── screenshots/
│   └── kalkulatorBMI.png
├── pom.xml
└── README.md
```

## Cara Menjalankan

### 1. Clone Repository

Buka terminal atau Command Prompt, kemudian jalankan perintah berikut:

```bash
git clone https://github.com/lannmhrni/KalkulatorBMI.git
```

### 2. Masuk ke Direktori Project

Setelah proses clone selesai, arahkan terminal ke folder proyek:

```bash
cd KalkulatorBMI
```

### 3. Periksa Instalasi Java dan Maven

Pastikan JDK dan Maven sudah terpasang dengan menjalankan perintah:

```bash
java -version
```

```bash
mvn -version
```

### 4. Buka Project

Buka Apache NetBeans, kemudian pilih **File → Open Project**. Cari folder `KalkulatorBMI` yang sudah di-clone sebelumnya.

### 5. Jalankan Aplikasi

Buka terminal pada direktori utama proyek, kemudian jalankan perintah:

```bash
mvn clean javafx:run
```

Tunggu hingga proses build selesai. Jika berhasil, aplikasi Kalkulator BMI akan terbuka dan siap digunakan.


## Cara Menggunakan Aplikasi

1. Jalankan aplikasi Kalkulator BMI.
2. Pilih jenis kelamin.
3. Masukkan tinggi badan pada kolom yang tersedia.
4. Masukkan berat badan pada kolom yang tersedia.
5. Klik tombol **Hitung BMI**.
6. Hasil perhitungan dan kategori BMI akan ditampilkan pada aplikasi.

