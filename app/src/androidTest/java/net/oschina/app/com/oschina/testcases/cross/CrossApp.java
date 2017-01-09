package net.oschina.app.com.oschina.testcases.cross;


import net.oschina.app.BasicTestCases;

/**
 * Created by lenovo on 2016/12/25.
 */

public class CrossApp extends BasicTestCases{

    //写成false,表示不需要执行父类的方法
    public CrossApp() {
        super(false);
    }

    public void testCross(){
        pageHelper.getPageNavigation().cancelBtn();
        pageHelper.getPageNavigation().clickContent("sumk 1.6.3 更新，添加分布式锁");
        //pageHelper.getPageNavigation().waitFor(10000);
        pageHelper.getPageNewsDetail().clickShares();
        pageHelper.getPageNewsDetail().clickShareQQ();
        //发送http的requestt,指定其包名和方法名
        //Utils.sendHttpRequest("Cross","testCross");
        //pageHelper.getPageNewsDetail().checkComment();

    }

}
