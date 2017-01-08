package net.oschina.app.com.oschina.pages;

import android.widget.Button;
import android.widget.EditText;

import com.robotium.solo.By;
import com.robotium.solo.WebElement;

import net.oschina.app.SoloWrap;

import static com.robotium.solo.By.xpath;

/**
 * Created by lenovo on 2016/12/11.
 */

public class PageLoginQQ {
    private SoloWrap solo;
    WebElement user_element,pwd_element,login_element;
    public PageLoginQQ(SoloWrap solo){
        this.solo=solo;
    }
    public void initWebElements(){
        user_element =solo.getWebElement(By.xpath(".//*[@id=\"u\"]"),0);
        pwd_element=solo.getWebElement(By.xpath(".//*[@id=\"p\"]"),0);
        login_element=solo.getWebElement(By.xpath(".//*[@id=\"go\"]"),0);
    }
    public void enterNameQQ(String text){
        user_element.setTextContent(text);
    }
    public void enterPwdQQ(String text){
        pwd_element.setTextContent(text);
    }
    public void clickLoginQQ(){
        solo.clickOnWebElement(login_element);
    }
    public void loginQQ(String name,String pwd){
        enterNameQQ(name);
        enterPwdQQ(pwd);
        clickLoginQQ();
    }
    public void waitForText(String text) throws InterruptedException {
        solo.waitForText(text);
    }

}
