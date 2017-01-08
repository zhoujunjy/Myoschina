package net.oschina.app.com.oschina.pages;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import net.oschina.app.R;
import net.oschina.app.SoloWrap;

/**
 * Created by lenovo on 2016/12/11.
 */

public class PageLogin {
    private SoloWrap solo;
    private EditText user_ET,pwd_ET;
    private Button login_BT;
    public PageLogin(SoloWrap solo){
        this.solo=solo;
    }
    //用来加载出这个页面要使用到的控件
    public void initViews(){
        user_ET = (EditText) solo.getView("net.oschina.app:id/et_username");
        pwd_ET = (EditText) solo.getView("net.oschina.app:id/et_password");
        login_BT = (Button) solo.getView("net.oschina.app:id/btn_login");
    }
    public void enterName(String name){
        solo.enterText(user_ET,name);
    }
    public void enterPwd(String pwd){
        solo.enterText(pwd_ET,pwd);
    }
    public void clearName(){
        solo.clearEditText(user_ET);
    }
    public void clearPwd(){
        solo.clearEditText(pwd_ET);
    }
    public void clickLogin(){
        solo.clickOnView(login_BT);
    }
    public void login(String name,String pwd){
        clearName();
        enterName(name);
        clearPwd();
        enterPwd(pwd);
        clickLogin();
/*        try {
            solo.wait(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
