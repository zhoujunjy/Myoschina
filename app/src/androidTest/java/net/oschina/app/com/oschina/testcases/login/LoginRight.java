package net.oschina.app.com.oschina.testcases.login;

import android.os.Environment;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.robotium.solo.Solo;

import net.oschina.app.BasicTestCases;

/**
 * Created by lenovo on 2016/11/29.
 */

public class LoginRight extends BasicTestCases{
    public LoginRight(){
        super(false);
    }
    public void testRightLogin(){
        Log.i("AUTO", Environment.getExternalStorageDirectory()+"===============================");
        solo.clickOnButton(0);
        pageHelper.getPageNavigation().clickMyTab();
        pageHelper.getPageMyLogin().clickSettings();
        pageHelper.getPageSettings().clickCancle();
        pageHelper.getPageMyUnlogin().clickLoginIcon();
        pageHelper.getPaginLogin().login("18311215499", "Jun=1234");
        assertTrue(pageHelper.getPageAssert().searchText("apple_zj"));
        pageHelper.getPageScreenshot().takeScreenshot(this.getClass().getSimpleName());
    }

}
