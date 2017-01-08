package net.oschina.app.com.oschina.testsuites;

import junit.framework.TestSuite;

import net.oschina.app.com.oschina.testcases.login.LoginError;
import net.oschina.app.com.oschina.testcases.login.LoginRight;

/**
 * Created by lenovo on 2016/12/29.
 */

public class SuiteLogin1 {
    public static TestSuite getLoginSuite1(){
        TestSuite suite=new TestSuite();
        suite.addTestSuite(LoginError.class);
        suite.addTestSuite(LoginRight.class);
        return suite;
    }
}
