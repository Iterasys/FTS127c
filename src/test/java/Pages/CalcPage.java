package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class CalcPage {

    public CalcPage(AndroidDriver<MobileElement> driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    // Digitos
    @AndroidFindBy(id = "com.android.calculator2:id/digit_0")
    private MobileElement btn0;
    @AndroidFindBy(id = "com.android.calculator2:id/digit_1")
    private MobileElement btn1;
    @AndroidFindBy(id = "com.android.calculator2:id/digit_2")
    private MobileElement btn2;
    @AndroidFindBy(id = "com.android.calculator2:id/digit_3")
    private MobileElement btn3;
    @AndroidFindBy(id = "com.android.calculator2:id/digit_4")
    private MobileElement btn4;
    @AndroidFindBy(id = "com.android.calculator2:id/digit_5")
    private MobileElement btn5;
    @AndroidFindBy(id = "com.android.calculator2:id/digit_6")
    private MobileElement btn6;
    @AndroidFindBy(id = "com.android.calculator2:id/digit_7")
    private MobileElement btn7;
    @AndroidFindBy(id = "com.android.calculator2:id/digit_8")
    private MobileElement btn8;
    @AndroidFindBy(id = "com.android.calculator2:id/digit_9")
    private MobileElement btn9;

    @AndroidFindBy(accessibility = "plus")
    private MobileElement btnSomar;

    //private MobileElement btnSomar;
    @AndroidFindBy(id = "minus")
    private MobileElement btnSubtrair;
    @AndroidFindBy(id = "multiply")
    private MobileElement btnMultiplicar;
    @AndroidFindBy(id = "divide")
    private MobileElement btnDividir;
    @AndroidFindBy(accessibility = "equals")
    private MobileElement btnIgual;

    // Display do Resultado
    @AndroidFindBy(id = "result")
    private MobileElement lblResultado;

   // Métodos e funções
    public void pressionarNumero(String numero){
        switch (numero){
            case "0":
                btn0.click();
                break;
            case "1":
                btn1.click();
                break;
            case "2":
                btn2.click();
                break;
            case "3":
                btn3.click();
                break;
            case "4":
                btn4.click();
                break;
            case "5":
                btn5.click();
                break;
            case "6":
                btn6.click();
                break;
            case "7":
                btn7.click();
                break;
            case "8":
                btn8.click();
                break;
            case "9":
                btn9.click();
                break;
        }
    }

    public void pressionarSomar(){
        btnSomar.click();
    }

    public void pressionarIgual() {
        btnIgual.click();
    }

    public String lerResultado(){
        return lblResultado.getText();
    }
}
