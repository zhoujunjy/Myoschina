package net.oschina.app.com.oschina.pages;

import android.widget.ImageView;
import android.widget.TextView;

import net.oschina.app.R;
import net.oschina.app.SoloWrap;

/**
 * Created by lenovo on 2016/12/11.
 */

public class PageSettings {
    private SoloWrap solo;
    private TextView settingCancle;
    public PageSettings(SoloWrap solo){
        this.solo=solo;
    }
    //用来加载出这个页面要使用到的控件
    public void initViews(){
        settingCancle=(TextView)solo.getView(R.id.setting_cancle);
    }
    public void clickCancle(){
        solo.clickOnView(settingCancle);
    }


}
