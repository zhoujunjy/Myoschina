package net.oschina.app.com.oschina.testcases.login;

import android.os.Environment;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;


import net.oschina.app.BasicTestCases;

/**
 * Created by lenovo on 2016/11/28.
 */

public class LoginError extends BasicTestCases {


    public LoginError() {
        super(true);
    }

    public void testWrongLogin() {
        Log.i("AUTO", Environment.getExternalStorageDirectory()+"===============================");
        pageHelper.getPageNavigation().clickMyTab();
        pageHelper.getPageMyLogin().clickSettings();
        pageHelper.getPageSettings().clickCancle();
        pageHelper.getPageMyUnlogin().clickLoginIcon();
        pageHelper.getPaginLogin().login("18311215499", "Jun=12345");
        assertTrue(pageHelper.getPageAssert().searchText("用户名或口令错"));
        pageHelper.getPageScreenshot().takeScreenshot(this.getClass().getSimpleName());

    }

}
