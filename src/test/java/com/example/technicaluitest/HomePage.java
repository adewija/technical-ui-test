package com.example.technicaluitest;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class HomePage {
    public SelenideElement imgStockbitLogo = $x("//img[contains(@class, \"logo-big\")]");
    public SelenideElement txtInvestasiSaham = $x("//h1[contains(@class, \"home-title\")]");
    public SelenideElement aInvesting = $x("//div[contains(@class,\"menuchild-parent desktop\")]//a[contains(text(), \"Investing\")]");
    public SelenideElement aProTools = $x("//div[contains(@class,\"menuchild-parent desktop\")]//a[contains(text(), \"Pro Tools\")]");
    public SelenideElement aAcademy = $x("//div[contains(@class,\"menuchild-parent desktop\")]//a[contains(text(), \"Academy\")]");
    public SelenideElement aAboutUs = $x("//div[contains(@class,\"menuchild-parent desktop\")]//a[contains(text(), \"About Us\")]");
    public SelenideElement aBlog = $x("//div[contains(@class,\"menuchild-parent desktop\")]//a[contains(text(), \"Blog\")]");
    public SelenideElement aHelp = $x("//div[contains(@class,\"menuchild-parent desktop\")]//a[contains(text(), \"Help\")]");
    public SelenideElement aSignUp = $x("//div[contains(@class, \"menuchild-parent desktop\")]//a[contains(text(), \"Sign Up\")]");
    public SelenideElement aLogIn = $x("//div[contains(@class, \"menuchild-parent desktop\")]//a[contains(text(), \"Log In\")]");
    public SelenideElement aMulaiBerinvestasi = $x("//a[contains(@class,\"home-btn start-investing\")]");
    public SelenideElement aDownloadAppStore = $x("//div[@class = \"home-badges depan\"]//a[contains(@href,\"itunes.apple\")]");
    public SelenideElement aGetItOnGooglePlay = $x("//div[@class = \"home-badges depan\"]//a[contains(@href,\"play.google\")]");
    public SelenideElement btnIntercom = $x("//button[contains(@class,\"intercom-launcher\")]");
}
