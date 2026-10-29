
# Kalkulator BMI

Aplikasi Kalkulator BMI berbasis Java yang dibuat dengan menggunakan JavaFX dan Scene Builder.

## Fitur

- Input tinggi badan
- Input berat badan
- Pilihan jenis kelamin
- Perhitungan Body Mass Index (BMI)
- Menampilkan hasil BMI dan kategori

## Built with

- Java
- JavaFX
- Scene Builder
- Maven
- Apache NetBeans

## Tampilan Aplikasi

![Tampilan Kalkulator BMI](screenshots/kalkulatorBMI.png)

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
├── pom.xml
└── README.md
```

## Cara Menjalankan

1. Clone atau download repository ini.
2. Buka project menggunakan Apache NetBeans atau IDE Java yang mendukung Maven.
3. Pastikan JDK dan konfigurasi JavaFX sudah sesuai.
4. Jalankan aplikasi menggunakan Maven:

   ```bash
   clean javafx:run atau javafx:run
   ```
