package com.example.technicaluitest;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class InvestingPage {
    public SelenideElement txtDaftarOnline = $x("//h1[contains(@class,\"HeaderTitle\")]");
    public SelenideElement iptInvestasiPerBulan = $x("//div[contains(text(),'Investasi per Bulan')]//following-sibling::div//input");
    public SelenideElement iptJangkaWaktuInvestasi = $x("//div[contains(text(),'Tahun')]//preceding-sibling::p//input");
    public SelenideElement canvasGrafikPerbandingan = $x("//canvas[@class=\"chartjs-render-monitor\"]");
}
