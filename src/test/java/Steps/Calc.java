package Steps;

import Pages.CalcPage;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import cucumber.api.java.pt.Dado;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;

@Epic("Black Friday 2020")
@Feature("Calc")
public class Calc {
    CalcPage calcPage;

    AndroidDriver<MobileElement> driver;


    @Dado("^que abro a calculadora$")
    public void ue_abro_a_calculadora() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "9.0");
        desiredCapabilities.setCapability("automationName", "UIAutomator2");
        desiredCapabilities.setCapability("deviceName", "Nexus 6b API 28");
        desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
        desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");


        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver<MobileElement>(remoteUrl, desiredCapabilities);
    }
    @Quando("^digito \"([^\"]*)\"$")
    public void digito(String numero) throws Throwable {
        calcPage = new CalcPage(driver);
        calcPage.pressionarNumero(numero);
        /*
        switch (numero){
            case "0":
                MobileElement btn0 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_0");
                btn0.click();
                break;
            case "1":
                MobileElement btn1 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_1");
                btn1.click();
                break;
            case "2":
                MobileElement btn2 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
                btn2.click();
                break;
            case "3":
                MobileElement btn3 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_3");
                btn3.click();
                break;
            case "4":
                MobileElement btn4 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_4");
                btn4.click();
                break;
            case "5":
                MobileElement btn5 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_5");
                btn5.click();
                break;
            case "6":
                MobileElement btn6 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_6");
                btn6.click();
                break;
            case "7":
                MobileElement btn7 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_7");
                btn7.click();
                break;
            case "8":
                MobileElement btn8 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_8");
                btn8.click();
                break;
            case "9":
                MobileElement btn9 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_9");
                btn9.click();
                break;
        } */
    }

    @E("^clico em Somar$")
    public void clico_em_Somar() throws Throwable {
        //MobileElement btnSomar = (MobileElement) driver.findElementByAccessibilityId("plus");
        //btnSomar.click();
        calcPage = new CalcPage(driver);
        calcPage.pressionarSomar();
    }

    @E("^clico no Igual$")
    public void clico_no_Igual() throws Throwable {
        //MobileElement btnIgual = (MobileElement) driver.findElementByAccessibilityId("equals");
        //btnIgual.click();
        calcPage = new CalcPage(driver);
        calcPage.pressionarIgual();
    }

    @Entao("^exibe o \"([^\"]*)\"$")
    public void exibe_o(String resultado) throws Throwable {
        //MobileElement lblResultado = (MobileElement) driver.findElementById("com.android.calculator2:id/result");
        //Assert.assertEquals(lblResultado.getText(),resultado);

        // Validação do Resultado do Cálculo
        calcPage = new CalcPage(driver);
        Assert.assertEquals(calcPage.lerResultado(),resultado);
    }

}
