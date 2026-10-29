
package model;

public class Bmi {
    private final double berat;
    private final int tinggi;
    private final String gender;

    public Bmi(double berat, int tinggi, String gender) {
        if (gender == null || gender.trim().isEmpty()) {
            throw new IllegalArgumentException("Gender tidak boleh kosong!");
        }

        if (tinggi <= 100) {
            throw new IllegalArgumentException("Silahkan isi dengan angka minimal 3 digit, angka pertama tidak boleh 0");
        }
        
        if (berat <= 10) {
            throw new IllegalArgumentException("Silahkan isi dengan angka minimal 2 digit, angka pertama tidak boleh 0");
        }
        
        this.berat = berat;
        this.tinggi = tinggi;
        this.gender = gender;
    }
    
    public double calculateBmi(){
        double tinggiMeter = this.tinggi / 100.0;
        
        double skor = this.berat / (tinggiMeter * tinggiMeter);
        return skor;
    }
    
    public String kategori(double skorBmi) {
        if (skorBmi < 18.5) {
            return "Badan Kurang";
        } else if (skorBmi >= 18.5 && skorBmi < 25) {
            return "Badan Ideal";
        } else if (skorBmi >= 25 && skorBmi < 30) {
            return "Badan Berlebih";
        } else {
            return "Obesitas";
        }
    }
}
