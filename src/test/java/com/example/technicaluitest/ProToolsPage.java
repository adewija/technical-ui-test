package com.example.technicaluitest;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ProToolsPage {
    public SelenideElement txtPricingPlan = $x("//*[contains(text(), \"Pricing Plan\")]");
    public SelenideElement btnSubscribe1Month = $x("//span[contains(text(),\"1 Bulan\")]/parent::div//following-sibling::div//*[contains(text(), \"Subscribe\")]");
    public SelenideElement btnSubscribe2Month = $x("//span[contains(text(),\"2 Bulan\")]/parent::div//following-sibling::div//*[contains(text(), \"Subscribe\")]");
    public SelenideElement btnSubscribe3Month = $x("//span[contains(text(),\"3 Bulan\")]/parent::div//following-sibling::div//*[contains(text(), \"Subscribe\")]");
    public SelenideElement btnSubscribeFree = $x("//span[contains(text(),\"3 Bulan\")]/parent::div//following-sibling::div//*[contains(text(), \"Subscribe\")]");
}
