package net.oschina.app;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

import com.robotium.solo.Solo;

import net.oschina.app.com.oschina.PageHelper;

/**
 * Created by lenovo on 2017/1/8.
 */

public class BasicTestCases extends ActivityInstrumentationTestCase2<AppStart> {
    public    Solo       solo1;
    public    SoloWrap   solo;
    protected PageHelper pageHelper;
    private boolean isNeedLogin = false;

    public BasicTestCases(boolean isNeedLogin) {
        super(AppStart.class);
        this.isNeedLogin = isNeedLogin;
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        //调用这两个方法必须继承ActivityInstrumentationTestCase2,因为这两个方法来源于这个类
        solo1 = new Solo(getInstrumentation(), getActivity());
        solo = new SoloWrap(solo1);
        pageHelper = new PageHelper(solo);
        Log.i("AUTO", "=======================================================11");
        solo.clickOnButton(0);
        solo.clickOnText("我的");
        //判定是非需要登陆
        if (isNeedLogin) {
            if (!pageHelper.getPageMyLogin().isAlreadyLogin()) {
                pageHelper.getPageMyUnlogin().clickLoginIcon();
                pageHelper.getPaginLogin().login("18311215499", "Jun=1234");
            }

        } else {
            if (pageHelper.getPageMyLogin().isAlreadyLogin()) {
                pageHelper.getPageMyLogin().clickSettings();
                pageHelper.getPageSettings().clickCancle();
            }
        }
        pageHelper.getPageNavigation().clickNewsTab();

    }

    public void runTest() throws Throwable {
        try{
            super.runTest();
        }catch (Throwable th){
            Log.i("AUTO","Exception happened in setUp section,error message is"+th.getMessage());
            solo.takeScreenshot(this.getClass().getName());
            throw  th;
        }

    }
    @Override
    public void tearDown() throws Exception {
        solo1.finishOpenedActivities();
            super.tearDown();
        }

}
