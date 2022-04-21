package com.example.technicaluitest;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class RegisterPage {
    public SelenideElement btnRegisterWithGoogle = $x("//input[contains(@value,\"Register with Google\")]");
    public SelenideElement btnRegisterWithFacebook = $x("//a[contains(text(),\"Register with Facebook\")]");
    public SelenideElement btnRegisterWithEmail = $x("//a[contains(text(),\"Register with Email\")]");
    public SelenideElement aLogin = $x("//a[contains(text(),\"Login\")]");
    public SelenideElement aTnC = $x("//a[contains(text(),\"Terms & Conditions.\")]");
    public SelenideElement iptName = $x("//label[contains(text(),\"Your Name\")]//preceding-sibling::input");
    public SelenideElement iptEmail = $x("//label[contains(text(),\"Your Email\")]//preceding-sibling::input");
    public SelenideElement iptUsername = $x("//label[contains(text(),\"Username\")]//preceding-sibling::input");
    public SelenideElement iptPassword = $x("//label[contains(text(),\"Password\")]//preceding-sibling::input");
    public SelenideElement iptConfirmPassword = $x("//label[contains(text(),\"Confirm Password\")]//preceding-sibling::input");
    public SelenideElement btnRegister = $x("//input[contains(@value,\"Register\")]");
    public SelenideElement txtSMSVerification = $x("//div[contains(text(),\"SMS Verification\")]");
    public SelenideElement iptPhoneNumber = $x("//input[contains(@type,\"tel\")]");
    public SelenideElement btnVerificationCode = $x("//input[contains(@value,\"Send Verification Code\")]");
    public SelenideElement txtFormatEmailSalah = $x("//label[contains(text(),\"Your Email\")]//parent::div//span[contains(text(),\"Format email salah\")]");
    public SelenideElement txtEmailSudahTerdaftar = $x("//label[contains(text(),\"Your Email\")]//parent::div//span[contains(text(),\"Email sudah terdaftar\")]");
    public SelenideElement imgEmailFieldError = $x("//label[contains(text(),\"Your Email\")]//parent::div//i[contains(@class,\"icon-toolbar_error\")]");
    public SelenideElement txtUsernameTidakTersedia = $x("//label[contains(text(),\"Username\")]//parent::div//span[contains(text(),\"username tidak tersedia\")]");
    public SelenideElement txtUsernameMinEmpatKarakter = $x("//label[contains(text(),\"Username\")]//parent::div//span[contains(text(),\"value harus terdiri dari minimal 4 karakter\")]");
    public SelenideElement imgUsernameFieldError = $x("//label[contains(text(),\"Username\")]//parent::div//i[contains(@class,\"icon-toolbar_error\")]");
    public SelenideElement txtPasswordMinEnamKarakter = $x("//label[contains(text(),\"Password\")]//parent::div//span[contains(text(),\"value harus terdiri dari minimal 6 karakter\")]");
    public SelenideElement txtPasswordMaksDelapanBelasKarakter = $x("//label[contains(text(),\"Password\")]//parent::div//span[contains(text(),\"value tidak dapat melebihi 18 karakter\")]");
    public SelenideElement imgPasswordFieldError = $x("//label[contains(text(),\"Password\")]//parent::div//i[contains(@class,\"icon-toolbar_error\")]");
    public SelenideElement txtConfirmPasswordDoesNotMatch = $x("//label[contains(text(),\"Confirm Password\")]//parent::div//span[contains(text(),\"Password does not match\")]");
    public SelenideElement imgConfirmPasswordFieldError = $x("//label[contains(text(),\"Confirm Password\")]//parent::div//i[contains(@class,\"icon-toolbar_error\")]");
    public SelenideElement txtGagalMengirimKodeVerifikasi = $x("//*[contains(text(),\"Gagal mengirim kode verifikasi\")]");
    public SelenideElement txtCaptchaFailed = $x("//*[contains(text(),\"Captcha Failed\")]");
    public SelenideElement txtNomorTeleponSudahTerdaftar = $x("//*[contains(text(),\"Nomor telpon sudah terdaftar\")]");
}
