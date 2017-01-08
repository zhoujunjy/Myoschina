package net.oschina.app.com.oschina.pages;

import net.oschina.app.SoloWrap;

/**
 * Created by lenovo on 2016/12/15.
 */

public class PageScreenshot {
    private SoloWrap solo;

    public PageScreenshot(SoloWrap solo) {
        this.solo = solo;
    }
    //name表示当前截图下来的文件的名字
    public void takeScreenshot(String name){
        solo.takeScreenshot(name);
    }
}
