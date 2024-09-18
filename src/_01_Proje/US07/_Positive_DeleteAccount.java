package _01_Proje.US07;

import Unity.BaseDriver;
import Unity.MyFunc;
import org.junit.Test;

public class _Positive_DeleteAccount extends BaseDriver {
    @Test
    public void test(){
        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(2);
//        WebElement login = driver.findElement(By.cssSelector("[id='H_rl_v8'] > :nth-child(1)+a"));
//        login.click();
//        MyFunc.Bekle(2);
//
//        WebElement eMail = driver.findElement(By.xpath("//span[@class='frm_v8'] / input[@name='life']"));
//        eMail.sendKeys("yoxoseh907@barakal.com");
//        MyFunc.Bekle(2);
//
//        WebElement password = driver.findElement(By.xpath("//input[@class='t' and @name='lifp']"));
//        password.sendKeys("Password123");
//        MyFunc.Bekle(2);
//
//        WebElement login2 = driver.findElement(By.cssSelector("[type='submit'][class='s'][value='Giriş yap']"));
//        login2.click();
//        MyFunc.Bekle(2);
//
//        WebElement account = driver.findElement(By.xpath("//a[@title='Hesabım']"));
//        account.click();
//        MyFunc.Bekle(2);
//
//        WebElement account2 = driver.findElement(By.xpath("//a[text()='Hesabımı Sil']"));
//        account2.click();
//        MyFunc.Bekle(2);
//
//        WebElement password2 = driver.findElement(By.xpath("[type='password']"));
//        password2.sendKeys("Password123");
//        MyFunc.Bekle(2);
//branc aktif değil ne yapabilirim
//        WebElement deleteAccount  = driver.findElement(By.xpath("[value='Hesabımı sil']"));
//        deleteAccount.click();
//        MyFunc.Bekle(2);
//
//        WebElement Mesajlarim = driver.findElement(By.xpath("li> p"));
//        System.out.println("Mesajlarim.isDisplayed() = " + Mesajlarim.isDisplayed());
//        MyFunc.Bekle(2);
BekleKapat();
    }
}
