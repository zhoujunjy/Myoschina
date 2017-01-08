package net.oschina.app.com.oschina.pages;

import android.widget.ImageView;

import net.oschina.app.SoloWrap;

/**
 * Created by lenovo on 2016/12/11.
 */

public class PageAssert {
    private SoloWrap solo;

    public PageAssert(SoloWrap solo){
        this.solo=solo;
    }
    public boolean searchText(String text){
        return solo.searchText(text);
    }

}
