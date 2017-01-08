package net.oschina.app;

import com.zutubi.android.junitreport.JUnitReportTestRunner;

import junit.framework.TestSuite;

import net.oschina.app.com.oschina.testsuites.SuiteLogin1;
import net.oschina.app.com.oschina.testsuites.SuiteLogin2;

/**
 * Created by lenovo on 2016/12/29.
 */

public class Runner extends JUnitReportTestRunner {
    public TestSuite getAllTests(){
        TestSuite suites=new TestSuite();
        suites.addTest(SuiteLogin1.getLoginSuite1());
        return suites;
    }
}
