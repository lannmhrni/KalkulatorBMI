package controller;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Button;
import model.Bmi;

public class KalkuBmiController {

    @FXML
    private TextField txtTinggi;

    @FXML
    private TextField txtBerat;

    @FXML
    private RadioButton rbLaki;

    @FXML
    private RadioButton rbPerempuan;

    @FXML
    private Label lblHasil;
    
    @FXML
    private Button btnHitung;
    
    @FXML
    private void pilihLaki() {
    }

    @FXML
    private void pilihPerempuan() {
    }

    @FXML
    private void initialize() {
        ToggleGroup genderGroup = new ToggleGroup();

        rbLaki.setToggleGroup(genderGroup);
        rbPerempuan.setToggleGroup(genderGroup);
    }

    @FXML
    private void hitungBMI() {
        try {
            String inputTinggi = txtTinggi.getText();
            String inputBerat = txtBerat.getText();

            System.out.println("Tinggi: [" + inputTinggi + "]");
            System.out.println("Berat: [" + inputBerat + "]");

            int tinggi = Integer.parseInt(inputTinggi.trim());
            double berat = Double.parseDouble(inputBerat.trim());

            String gender;

        if (rbLaki.isSelected()) {
            gender = "Laki-laki";
        } else if (rbPerempuan.isSelected()) {
            gender = "Perempuan";
        } else {
            lblHasil.setText("Pilih jenis kelamin!");
            return;
        }

        Bmi bmi = new Bmi(berat, tinggi, gender);

        double skor = bmi.calculateBmi();
        String kategori = bmi.kategori(skor);

        lblHasil.setText(String.format(
            "BMI: %.2f\nKategori: %s",
            skor, kategori
        ));

        System.out.println("Hasil berhasil dihitung: " + skor);

    } catch (NumberFormatException e) {
        lblHasil.setText("Tinggi dan berat harus berupa angka!");
        e.printStackTrace();

    } catch (IllegalArgumentException e) {
        lblHasil.setText(e.getMessage());
        e.printStackTrace();
    }
}
}

