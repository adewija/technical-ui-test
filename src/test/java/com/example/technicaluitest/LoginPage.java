package com.example.technicaluitest;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    public SelenideElement btnLoginWithFacebook = $x("//a[contains(text(), \"Log in with Facebook\")]");
    public SelenideElement iptUsername = $x("//input[contains(@id, \"username\")]");
    public SelenideElement iptPassword = $x("//input[contains(@id, \"password\")]");
    public SelenideElement imgEyeIcon = $x("//img[contains(@class, \"eye-icon\")]");
    public SelenideElement btnLogin = $x("//input[contains(@id, \"loginbutton\")]");
    public SelenideElement txtErrorUsernameAtauPasswordSalah = $x("//*[contains(text(),\"Username atau password salah. Mohon coba lagi\")]");
}
