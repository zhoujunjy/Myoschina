package net.oschina.app.com.oschina.pages;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import net.oschina.app.R;
import net.oschina.app.SoloWrap;

/**
 * Created by lenovo on 2016/12/11.
 */

public class PageNavigation {
    private SoloWrap solo;
    //大框是frameLayout的类型，而不只是小图标ImageView类型
    private FrameLayout newTab,tweetTab,exploretab,myTab;
    private ImageView    pubIM;
    private ListView     listview;
    public  LinearLayout content;
    private Button       cancelbtn;
    private View         view;
    public PageNavigation(SoloWrap solo){
        this.solo=solo;
    }
    //用来加载出这个页面要使用到的控件
    public void initViews(){
        newTab = (FrameLayout) solo.getView(R.id.nav_item_news);
        tweetTab=(FrameLayout) solo.getView(R.id.nav_item_tweet);
        exploretab = (FrameLayout) solo.getView(R.id.nav_item_explore);
        myTab=(FrameLayout) solo.getView(R.id.nav_item_me);
        pubIM=(ImageView) solo.getView( R.id.nav_item_tweet_pub);

       // content=(LinearLayout) listview.getChildAt(1);

    }
    public void clickNewsTab(){
        solo.clickOnView(newTab);
    }
    public void clickTweetTab(){
        solo.clickOnView(tweetTab);
    }
    public void clickExploreTab(){
        solo.clickOnView(exploretab);
    }
    public void clickMyTab(){
        solo.clickOnView(myTab);
    }
    public void clickPubIMTab(){
        solo.clickOnView(pubIM);
    }
    public void clickContent(String text){
        solo.clickOnText(text);
    }
    public void cancelBtn(){
        solo.clickOnButton(0);
    }
    public void waitForText(String text) throws InterruptedException {
        solo.waitForText(text);
    }
}
