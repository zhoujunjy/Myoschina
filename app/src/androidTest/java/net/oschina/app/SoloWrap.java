package net.oschina.app;

import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.robotium.solo.By;
import com.robotium.solo.Solo;
import com.robotium.solo.WebElement;

import junit.framework.AssertionFailedError;

/**
 * Created by lenovo on 2016/12/11.
 */

public class SoloWrap {
    private Solo solo;
    public SoloWrap(Solo solo){
        this.solo=solo;
    }
    public void clickOnText(String text){
        solo.clickOnText(text);
        Log.i("AUTO","点击文本:"+text);
    }
    public void clickOnButton(int text){
        solo.clickOnButton(text);
        Log.i("AUTO","点击按钮:"+text);
    }
    public View getView(String id){
        try{
            //对于不需要用到的控件我自己进行捕获，就不会报错
            return solo.getView(id);
        }catch (AssertionFailedError error){
            return null;
        }
    }
    public View getView(int id){
        try{
            //对于不需要用到的控件我自己进行捕获，就不会报错
            return solo.getView(id);
        }catch (AssertionFailedError error){
            return null;
        }
    }

    public void enterText(EditText et,String text){
        solo.enterText(et,text);
        Log.i("AUTO","我要往输入框："+et+",输入文本"+text);
    }

    public void clearEditText(EditText et){
        solo.clearEditText(et);
        Log.i("AUTO","清空："+et);
    }
    public void clickOnView(View view){
        solo.clickOnView(view);
        Log.i("AUTO","点击："+view);
    }
    public boolean searchText(String text){
        return solo.searchText(text);
    }
    public void takeScreenshot(String name){
        solo.takeScreenshot(name);
    }
    //xpath定位，0表示是第几个元素，如果有精确的xpath,就写0,其他定位方式也是类似
    public WebElement getWebElement(By by,int index){
        WebElement element= solo.getWebElement(by,index);
        return element;
    }
    public void enterTextInWebElement(By by, String text){
        solo.enterTextInWebElement(by,text);
    }
    public void clearTextInWebElement(By by){
        solo.clearTextInWebElement(by);
    }
    public void clickOnWebElement(WebElement element){
        solo.clickOnWebElement(element);
    }
    public boolean waitForText(String text){
        //第一个是我要等待的文本，页面上第一个，等待5s,不让他滚动，显示的采取搜索
        return solo.waitForText(text,1,5000,false,true);
    }
    public void finishOpenedActivities(){
        solo.finishOpenedActivities();
    }
    public void sleep(long time) throws InterruptedException {
        solo.wait(time);
    }

}
