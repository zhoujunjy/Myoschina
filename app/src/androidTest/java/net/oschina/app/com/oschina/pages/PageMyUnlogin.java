package net.oschina.app.com.oschina.pages;

import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import net.oschina.app.R;
import net.oschina.app.SoloWrap;

/**
 * Created by lenovo on 2016/12/11.
 */

public class PageMyUnlogin {
    private SoloWrap solo;
    private ImageView setting_IV,loginIcon_IV;
    public PageMyUnlogin(SoloWrap solo){
        this.solo=solo;
    }
    //用来加载出这个页面要使用到的控件
    public void initViews(){
        setting_IV=(ImageView)solo.getView(R.id.iv_logo_setting);
        loginIcon_IV = (ImageView) solo.getView(R.id.iv_portrait);
    }
    public void clickLoginIcon(){
        solo.clickOnView(loginIcon_IV);
    }
    public void clickSetting(){
        solo.clickOnView(setting_IV);
    }

}
