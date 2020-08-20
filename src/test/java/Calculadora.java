import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Epic("Black Friday 2020")
@Feature("Calculadora")
public class Calculadora{

    private AndroidDriver<MobileElement> driver;

    @BeforeClass(description = "Antes do Teste")
    public void setUp() throws MalformedURLException {
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

    @Test(description = "Soma 2 Numeros")
    public void soma2Numeros() {
        MobileElement btn2 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
        btn2.click();
        MobileElement btnSomar = (MobileElement) driver.findElementByAccessibilityId("plus");
        btnSomar.click();
        MobileElement btn3 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_3");
        btn3.click();
        MobileElement btnIgual = (MobileElement) driver.findElementByAccessibilityId("equals");
        btnIgual.click();
        MobileElement lblResultado = (MobileElement) driver.findElementById("com.android.calculator2:id/result");
        // Validação do Resultado do Cálculo
        Assert.assertEquals(lblResultado.getText(),"5");


        /*
        MobileElement btnLimpar = (MobileElement) driver.findElementByAccessibilityId("delete");
        btnLimpar.click();
        MobileElement btnDividir = (MobileElement) driver.findElementByAccessibilityId("divide");
        btnDividir.click();
        MobileElement btnMultiplicar = (MobileElement) driver.findElementByAccessibilityId("multiply");
        btnMultiplicar.click();
        MobileElement btnSubtrair = (MobileElement) driver.findElementByAccessibilityId("minus");
        btnSubtrair.click();
        MobileElement btnDecimal = (MobileElement) driver.findElementByAccessibilityId("point");
        btnDecimal.click();
        MobileElement btnMenu = (MobileElement) driver.findElementByAccessibilityId("More options");
        btnMenu.click();

         */
    }

    @AfterClass(description = "Depois do Teste")
    public void tearDown() {
        driver.quit();
    }
}

