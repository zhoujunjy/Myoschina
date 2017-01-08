package net.oschina.app.com.oschina.pages;

import android.widget.ImageView;
import android.widget.TextView;

import net.oschina.app.R;
import net.oschina.app.SoloWrap;

/**
 * Created by lenovo on 2016/12/11.
 */

public class PageMyLogin {
    private SoloWrap solo;
    private ImageView setting_IV;
    private TextView nick_TV;
    public PageMyLogin(SoloWrap solo){
        this.solo=solo;
    }
    //用来加载出这个页面要使用到的控件
    public void initViews(){
        solo.waitForText("点击头像登录");
        setting_IV=(ImageView)solo.getView(R.id.iv_logo_setting);
        nick_TV=(TextView)solo.getView(R.id.tv_nick); //获取登录状态下的用户名控件

    }
    public void clickSettings(){
        solo.clickOnView(setting_IV);
    }
    public String getNickName(){
        return nick_TV.getText().toString();
    }
    public boolean isAlreadyLogin(){
        return getNickName().equals("apple_zj");

}

}
