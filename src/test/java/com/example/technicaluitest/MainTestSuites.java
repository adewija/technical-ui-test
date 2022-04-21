package com.example.technicaluitest;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTestSuites {
    HomePage homePage = new HomePage();
    InvestingPage investingPage = new InvestingPage();
    ProToolsPage proToolsPage = new ProToolsPage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();

    String phoneNumber = "81224567899";
    String phoneNumberAlreadyRegistered = "81234567890";
    String phoneNumberBelowTenDigits = "81234567";
    String phoneNumberAboveThirteenDigits = "8123456790123";
    String name = "Ade Wija Nugraha";
    String email = "adewija.awn@gmail.com";
    String incorrectEmail = "lalalala";
    String registeredEmail = "abc@gmail.com";
    String username = "adewija";
    String unavailableUsername = "abcd";
    String usernameThreeChars = "abc";
    String password = "qwerty12345";
    String passwordFiveChars = "12345";
    String passwordNineTeenChars = "1234567890123456789";
    String incorrectConfirmPassword = "12345qwerty";
    String investasiSahamBersama = "Investasi Saham Bersama";
    String mulaiBerinvestasi = "Mulai Berinvestasi";


    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1280x800";
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @BeforeEach
    public void setUp() {
        open("https://stockbit.com/");
    }

    @Test
    public void openStockbitHomepage() {
        homePage.imgStockbitLogo.shouldBe(visible);
        homePage.txtInvestasiSaham.shouldBe(visible);
        homePage.txtInvestasiSaham.shouldHave(text(investasiSahamBersama));
        homePage.aInvesting.shouldBe(and("can be clicked", visible, enabled));
        homePage.aProTools.shouldBe(and("can be clicked", visible, enabled));
        homePage.aAcademy.shouldBe(and("can be clicked", visible, enabled));
        homePage.aAboutUs.shouldBe(and("can be clicked", visible, enabled));
        homePage.aBlog.shouldBe(and("can be clicked", visible, enabled));
        homePage.aHelp.shouldBe(and("can be clicked", visible, enabled));
        homePage.aSignUp.shouldBe(and("can be clicked", visible, enabled));
        homePage.aLogIn.shouldBe(and("can be clicked", visible, enabled));
        homePage.aMulaiBerinvestasi.shouldBe(and("can be clicked", visible, enabled));
        homePage.aMulaiBerinvestasi.shouldHave(href("https://my.stockbit.com/#/register"));
        homePage.aMulaiBerinvestasi.shouldHave(text(mulaiBerinvestasi));
        homePage.aDownloadAppStore.shouldBe(and("can be clicked", visible, enabled));
        homePage.aGetItOnGooglePlay.shouldBe(and("can be clicked", visible, enabled));
        homePage.btnIntercom.shouldBe(and("can be clicked", visible, enabled));
    }

    @Test
    public void openStockbitHomepageByClickingStockbitIcon() {
        homePage.imgStockbitLogo.shouldBe(visible);
        homePage.imgStockbitLogo.click();
        homePage.imgStockbitLogo.shouldBe(visible);
        homePage.txtInvestasiSaham.shouldBe(visible);
        homePage.txtInvestasiSaham.shouldHave(text(investasiSahamBersama));
        homePage.aInvesting.shouldBe(and("can be clicked", visible, enabled));
        homePage.aProTools.shouldBe(and("can be clicked", visible, enabled));
        homePage.aAcademy.shouldBe(and("can be clicked", visible, enabled));
        homePage.aAboutUs.shouldBe(and("can be clicked", visible, enabled));
        homePage.aBlog.shouldBe(and("can be clicked", visible, enabled));
        homePage.aHelp.shouldBe(and("can be clicked", visible, enabled));
        homePage.aSignUp.shouldBe(and("can be clicked", visible, enabled));
        homePage.aLogIn.shouldBe(and("can be clicked", visible, enabled));
        homePage.aMulaiBerinvestasi.shouldBe(and("can be clicked", visible, enabled));
        homePage.aMulaiBerinvestasi.shouldHave(href("https://my.stockbit.com/#/register"));
        homePage.aMulaiBerinvestasi.shouldHave(text(mulaiBerinvestasi));
        homePage.aDownloadAppStore.shouldBe(and("can be clicked", visible, enabled));
        homePage.aGetItOnGooglePlay.shouldBe(and("can be clicked", visible, enabled));
        homePage.btnIntercom.shouldBe(and("can be clicked", visible, enabled));
    }

    @Test
    public void openInvestingLandingPage() {
        homePage.aInvesting.shouldBe(and("can be clicked", visible, enabled));
        homePage.aInvesting.click();
        webdriver().shouldHave(url("https://stockbit.com/info/mulai-investasi"));
        investingPage.txtDaftarOnline.shouldBe(visible);
        investingPage.iptInvestasiPerBulan.scrollIntoView(true).shouldBe(visible);
        investingPage.iptInvestasiPerBulan.shouldBe(attribute("value", "1,000,000"));
        investingPage.iptJangkaWaktuInvestasi.shouldBe(visible);
        investingPage.iptJangkaWaktuInvestasi.shouldBe(attribute("value", "21"));
        investingPage.canvasGrafikPerbandingan.shouldBe(visible);
    }

    @Test
    public void openProToolsLandingPage() {
        homePage.aProTools.shouldBe(and("can be clicked", visible, enabled));
        homePage.aProTools.click();
        webdriver().shouldHave(url("https://stockbit.com/info/pro-tools"));
        proToolsPage.txtPricingPlan.scrollIntoView(true).shouldBe(visible);
        proToolsPage.btnSubscribe1Month.shouldBe(and("can be clicked", visible, enabled));
        proToolsPage.btnSubscribe1Month.shouldBe(and("can be clicked", visible, enabled));
        proToolsPage.btnSubscribe2Month.shouldBe(and("can be clicked", visible, enabled));
        proToolsPage.btnSubscribe3Month.shouldBe(and("can be clicked", visible, enabled));
        proToolsPage.btnSubscribeFree.shouldBe(and("can be clicked", visible, enabled));
    }

    @Test
    public void openRegisterPage() {
        homePage.aSignUp.shouldBe(and("can be clicked", visible, enabled));
        homePage.aSignUp.click();
        webdriver().shouldHave(url("https://stockbit.com/#/register"));
        registerPage.btnRegisterWithGoogle.shouldBe(and("can be clicked", visible, enabled));
        registerPage.btnRegisterWithFacebook.shouldBe(and("can be clicked", visible, enabled));
        registerPage.btnRegisterWithEmail.shouldBe(and("can be clicked", visible, enabled));
        registerPage.aLogin.shouldBe(and("can be clicked", visible, enabled));
        registerPage.aTnC.shouldBe(and("can be clicked", visible, enabled));
    }

    @Test
    public void registerWithGoogle() {
        homePage.aSignUp.shouldBe(and("can be clicked", visible, enabled));
        homePage.aSignUp.click();
        webdriver().shouldHave(url("https://stockbit.com/#/register"));
        registerPage.btnRegisterWithGoogle.click();
        switchTo().window(1);
        String expectedUrl = "https://accounts.google.com/";
        String actualUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertTrue(actualUrl.contains(expectedUrl));
        Selenide.closeWindow();
        switchTo().window(0);
    }

    @Test
    public void registerWithEmailGetCaptchaFailed() {
        homePage.aSignUp.shouldBe(and("can be clicked", visible, enabled));
        homePage.aSignUp.click();
        registerPage.btnRegisterWithEmail.click();
        registerPage.iptName.sendKeys(name);
        registerPage.iptEmail.sendKeys(email);
        registerPage.iptUsername.sendKeys(username);
        registerPage.iptPassword.sendKeys(password);
        registerPage.iptConfirmPassword.sendKeys(password);
        registerPage.btnRegister.click();
        registerPage.txtSMSVerification.shouldBe(visible);
        registerPage.iptPhoneNumber.sendKeys(phoneNumber);
        registerPage.btnVerificationCode.click();
        registerPage.txtCaptchaFailed.shouldBe(visible);
    }

    @Test
    public void registerWithPhoneNumberAlreadyRegistered() {
        homePage.aSignUp.shouldBe(and("can be clicked", visible, enabled));
        homePage.aSignUp.click();
        registerPage.btnRegisterWithEmail.click();
        registerPage.iptName.sendKeys(name);
        registerPage.iptEmail.sendKeys(email);
        registerPage.iptUsername.sendKeys(username);
        registerPage.iptPassword.sendKeys(password);
        registerPage.iptConfirmPassword.sendKeys(password);
        registerPage.btnRegister.click();
        registerPage.txtSMSVerification.shouldBe(visible);
        registerPage.iptPhoneNumber.sendKeys(phoneNumberAlreadyRegistered);
        registerPage.btnVerificationCode.click();
        registerPage.txtNomorTeleponSudahTerdaftar.shouldBe(visible);
    }

    @Test
    public void registerWithIncorrectEmail() {
        homePage.aSignUp.shouldBe(and("can be clicked", visible, enabled));
        homePage.aSignUp.click();
        registerPage.btnRegisterWithEmail.click();
        registerPage.iptName.sendKeys(name);
        registerPage.iptEmail.sendKeys(incorrectEmail);
        registerPage.txtFormatEmailSalah.shouldBe(visible);
        registerPage.imgEmailFieldError.shouldBe(visible);
    }

    @Test
    public void registerWithRegisteredEmail() {
        homePage.aSignUp.shouldBe(and("can be clicked", visible, enabled));
        homePage.aSignUp.click();
        registerPage.btnRegisterWithEmail.click();
        registerPage.iptName.sendKeys(name);
        registerPage.iptEmail.sendKeys(registeredEmail);
        registerPage.txtEmailSudahTerdaftar.shouldBe(visible);
        registerPage.imgEmailFieldError.shouldBe(visible);
    }

    @Test
    public void registerWithUnavailableUsername() {
        homePage.aSignUp.shouldBe(and("can be clicked", visible, enabled));
        homePage.aSignUp.click();
        registerPage.btnRegisterWithEmail.click();
        registerPage.iptName.sendKeys(name);
        registerPage.iptEmail.sendKeys(email);
        registerPage.iptUsername.sendKeys(unavailableUsername);
        registerPage.txtUsernameTidakTersedia.shouldBe(visible);
        registerPage.imgUsernameFieldError.shouldBe(visible);
    }

    @Test
    public void registerWithIncorrectUsernameBelowFourChars() {
        homePage.aSignUp.shouldBe(and("can be clicked", visible, enabled));
        homePage.aSignUp.click();
        registerPage.btnRegisterWithEmail.click();
        registerPage.iptName.sendKeys(name);
        registerPage.iptEmail.sendKeys(email);
        registerPage.iptUsername.sendKeys(usernameThreeChars);
        registerPage.txtUsernameMinEmpatKarakter.shouldBe(visible);
        registerPage.imgUsernameFieldError.shouldBe(visible);
    }

    @Test
    public void registerWithIncorrectPasswordBelowSixCharactes() {
        homePage.aSignUp.shouldBe(and("can be clicked", visible, enabled));
        homePage.aSignUp.click();
        registerPage.btnRegisterWithEmail.click();
        registerPage.iptName.sendKeys(name);
        registerPage.iptEmail.sendKeys(email);
        registerPage.iptUsername.sendKeys(username);
        registerPage.iptPassword.sendKeys(passwordFiveChars);
        registerPage.txtPasswordMinEnamKarakter.shouldBe(visible);
        registerPage.imgPasswordFieldError.shouldBe(visible);
    }

    @Test
    public void registerWithIncorrectPasswordAboveEightteenCharactes() {
        homePage.aSignUp.shouldBe(and("can be clicked", visible, enabled));
        homePage.aSignUp.click();
        registerPage.btnRegisterWithEmail.click();
        registerPage.iptName.sendKeys(name);
        registerPage.iptEmail.sendKeys(email);
        registerPage.iptUsername.sendKeys(username);
        registerPage.iptPassword.sendKeys(passwordNineTeenChars);
        registerPage.txtPasswordMaksDelapanBelasKarakter.shouldBe(visible);
        registerPage.imgPasswordFieldError.shouldBe(visible);
    }

    @Test
    public void registerWithIncorrectConfirmPassword() {
        homePage.aSignUp.shouldBe(and("can be clicked", visible, enabled));
        homePage.aSignUp.click();
        registerPage.btnRegisterWithEmail.click();
        registerPage.iptName.sendKeys(name);
        registerPage.iptEmail.sendKeys(email);
        registerPage.iptUsername.sendKeys(username);
        registerPage.iptPassword.sendKeys(password);
        registerPage.iptConfirmPassword.sendKeys(incorrectConfirmPassword);
        registerPage.txtConfirmPasswordDoesNotMatch.shouldBe(visible);
        registerPage.imgConfirmPasswordFieldError.shouldBe(visible);
    }

    @Test
    public void registerWithIncorrectPhoneNumberBelowTenDigits() {
        homePage.aSignUp.shouldBe(and("can be clicked", visible, enabled));
        homePage.aSignUp.click();
        registerPage.btnRegisterWithEmail.click();
        registerPage.iptName.sendKeys(name);
        registerPage.iptEmail.sendKeys(email);
        registerPage.iptUsername.sendKeys(username);
        registerPage.iptPassword.sendKeys(password);
        registerPage.iptConfirmPassword.sendKeys(password);
        registerPage.btnRegister.click();
        registerPage.txtSMSVerification.shouldBe(visible);
        registerPage.iptPhoneNumber.sendKeys(phoneNumberBelowTenDigits);
        registerPage.btnVerificationCode.click();
        registerPage.txtGagalMengirimKodeVerifikasi.shouldBe(visible);
    }

    @Test
    public void registerWithIncorrectPhoneNumberAboveThirteenDigits() {
        homePage.aSignUp.shouldBe(and("can be clicked", visible, enabled));
        homePage.aSignUp.click();
        registerPage.btnRegisterWithEmail.click();
        registerPage.iptName.sendKeys(name);
        registerPage.iptEmail.sendKeys(email);
        registerPage.iptUsername.sendKeys(username);
        registerPage.iptPassword.sendKeys(password);
        registerPage.iptConfirmPassword.sendKeys(password);
        registerPage.btnRegister.click();
        registerPage.txtSMSVerification.shouldBe(visible);
        registerPage.iptPhoneNumber.sendKeys(phoneNumberAboveThirteenDigits);
        registerPage.btnVerificationCode.click();
        registerPage.txtGagalMengirimKodeVerifikasi.shouldBe(visible);
    }

    @Test
    public void loginWithFacebook() {
        homePage.aSignUp.shouldBe(and("can be clicked", visible, enabled));
        homePage.aLogIn.click();
        webdriver().shouldHave(url("https://stockbit.com/#/login"));
        loginPage.btnLoginWithFacebook.click();
        switchTo().window(1);
        String expectedUrl = "https://www.facebook.com";
        String actualUrl = WebDriverRunner.getWebDriver().getCurrentUrl();
        assertTrue(actualUrl.contains(expectedUrl));
        Selenide.closeWindow();
        switchTo().window(0);
    }

    @Test
    public void loginWithIncorrectUsername() {
        homePage.aSignUp.shouldBe(and("can be clicked", visible, enabled));
        homePage.aLogIn.click();
        webdriver().shouldHave(url("https://stockbit.com/#/login"));
        loginPage.iptUsername.sendKeys(usernameThreeChars);
        loginPage.iptPassword.sendKeys(password);
        loginPage.btnLogin.click();
        loginPage.txtErrorUsernameAtauPasswordSalah.shouldBe(visible);
    }

    @Test
    public void loginWithIncorrectPassword() {
        homePage.aSignUp.shouldBe(and("can be clicked", visible, enabled));
        homePage.aLogIn.click();
        webdriver().shouldHave(url("https://stockbit.com/#/login"));
        loginPage.iptUsername.sendKeys(username);
        loginPage.iptPassword.sendKeys(passwordFiveChars);
        loginPage.btnLogin.click();
        loginPage.txtErrorUsernameAtauPasswordSalah.shouldBe(visible);
    }

    @Test
    public void userAbleToSeeTheirPassword() {
        homePage.aSignUp.shouldBe(and("can be clicked", visible, enabled));
        homePage.aLogIn.click();
        webdriver().shouldHave(url("https://stockbit.com/#/login"));
        loginPage.iptUsername.sendKeys(username);
        loginPage.iptPassword.sendKeys(password);
        loginPage.imgEyeIcon.click();
        loginPage.iptPassword.shouldBe(attribute("type", "text"));
        String value = loginPage.imgEyeIcon.getAttribute("src");
        assertTrue(value.contains("eye-off.svg"));
    }

    @Test
    public void userUnableToSeeTheirPassword() {
        homePage.aSignUp.shouldBe(and("can be clicked", visible, enabled));
        homePage.aLogIn.click();
        webdriver().shouldHave(url("https://stockbit.com/#/login"));
        loginPage.iptUsername.sendKeys(username);
        loginPage.iptPassword.sendKeys(password);
        loginPage.iptPassword.shouldBe(attribute("type", "password"));
        String value = loginPage.imgEyeIcon.getAttribute("src");
        assertTrue(value.contains("eye.svg"));
    }
}
