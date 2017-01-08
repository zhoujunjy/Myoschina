package net.oschina.app.com.oschina.pages;

import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import net.oschina.app.SoloWrap;

import static android.R.attr.id;
import static net.oschina.app.R.id.ly_share_qq;

/**
 * Created by lenovo on 2016/12/11.
 */

public class PageNewsDetail {
    private SoloWrap    solo;
    private EditText    comment_ET;
    private FrameLayout menu_comment_FL;
    private ImageView   star_IV,share_IV;
    private ImageButton back_IB;
    private LinearLayout shareQQ_LineL;
    public PageNewsDetail(SoloWrap solo){
        this.solo=solo;
    }
    //用来加载出这个页面要使用到的控件
    public void initViews(){
        comment_ET = (EditText) solo.getView("net.oschina.app:id/et_input");
        menu_comment_FL = (FrameLayout) solo.getView("net.oschina.app:id/menu_scroll_comment");
        star_IV = (ImageView) solo.getView("net.oschina.app:id/iv_fav");
        share_IV = (ImageView) solo.getView("net.oschina.app:id/iv_share");
        back_IB=(ImageButton) solo.getView("");
        shareQQ_LineL=(LinearLayout)solo.getView("net.oschina.app:id/ly_share_qq");
    }
    public void inputComment(String comment){
        solo.enterText(comment_ET,comment);
    }
    public void checkComment(){
        solo.clickOnView(menu_comment_FL);
    }
    public void clickStar(){
        solo.clickOnView(star_IV);
    }
    public void clickShares(){
        solo.clickOnView(share_IV);
    }
    public void clickBack(){
    }
    public void clickShareQQ(){
        solo.clickOnView(shareQQ_LineL);
    }


}
