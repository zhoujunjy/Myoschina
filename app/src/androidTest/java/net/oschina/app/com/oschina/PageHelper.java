package net.oschina.app.com.oschina;

import net.oschina.app.SoloWrap;
import net.oschina.app.com.oschina.pages.PageAssert;
import net.oschina.app.com.oschina.pages.PageLogin;
import net.oschina.app.com.oschina.pages.PageLoginQQ;
import net.oschina.app.com.oschina.pages.PageMyLogin;
import net.oschina.app.com.oschina.pages.PageMyUnlogin;
import net.oschina.app.com.oschina.pages.PageNavigation;
import net.oschina.app.com.oschina.pages.PageNewsDetail;
import net.oschina.app.com.oschina.pages.PageScreenshot;
import net.oschina.app.com.oschina.pages.PageSettings;

/**
 * Created by lenovo on 2016/12/11.
 */

public class PageHelper {
    private PageLogin      pageLogin;
    private PageNewsDetail pageNewsDetail;
    public  SoloWrap       solo;
    private PageMyUnlogin  pageMyUnlogin;
    private PageSettings   pageSettings;
    private PageMyLogin    pageMyLogin;
    private PageNavigation pageNavigation;
    private PageAssert     pageAssert;
    private PageScreenshot pageScreenshot;
    private PageLoginQQ    pageLoginQQ;

    public PageHelper(SoloWrap solo){
        this.solo=solo;
    }
    public PageLogin getPaginLogin(){
        if (pageLogin==null){
            pageLogin=new PageLogin(solo);

        }
        //放在if外面，每次获取到的页面都是最新的
        pageLogin.initViews();
        return pageLogin;
    }
    public PageMyUnlogin getPageMyUnlogin(){
        if (pageMyUnlogin==null){
            pageMyUnlogin=new PageMyUnlogin(solo);
        }
        pageMyUnlogin.initViews();
        return pageMyUnlogin;
    }
    public PageSettings getPageSettings(){
        if (pageSettings==null){
            pageSettings=new PageSettings(solo);
        }
        pageSettings.initViews();
        return pageSettings;
    }
    public PageMyLogin getPageMyLogin(){
        if (pageMyLogin==null){
            pageMyLogin=new PageMyLogin(solo);
        }
        pageMyLogin.initViews();
        return pageMyLogin;
    }
    public PageNavigation getPageNavigation(){
        if (pageNavigation==null){
            pageNavigation=new PageNavigation(solo);
        }
        pageNavigation.initViews();
        return pageNavigation;
    }
    public PageAssert getPageAssert(){
        if (pageAssert==null){
            pageAssert=new PageAssert(solo);
        }
        return pageAssert;
    }
    public PageScreenshot getPageScreenshot(){
        if (pageScreenshot==null){
            pageScreenshot=new PageScreenshot(solo);
        }
        return pageScreenshot;
    }
    public PageNewsDetail getPageNewsDetail(){
        if (pageNewsDetail==null){
            pageNewsDetail=new PageNewsDetail(solo);
        }
        pageNewsDetail.initViews();
        return pageNewsDetail;
    }
    public PageLoginQQ getPageLoginQQ(){
        if (pageLoginQQ==null){
            pageLoginQQ=new PageLoginQQ(solo);
        }
        pageLoginQQ.initWebElements();
        return pageLoginQQ;
    }


}
