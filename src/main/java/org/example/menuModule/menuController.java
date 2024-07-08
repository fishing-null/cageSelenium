package org.example.menuModule;

import org.example.impl.ClickInterface;
import org.example.loginModule.PathType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class menuController implements ClickInterface{
    private String menuPath;
    private PathType pathType;

    private WebDriver webDriver = new ChromeDriver();

    @Override
    public WebElement getPath() {
        return null;
    }

    /**
     * 点击展开菜单
     */
    private void clickMenu(){
        webDriver.findElement(By.cssSelector("#vue-admin-beautiful > div > div > div.vab-main > div.fixed-header > div." +
                "nav-bar-container > div > div.el-col.el-col-24.el-col-xs-4.el-col-sm-12.el-col-md-12.el-col-lg-12.el-co" +
                "l-xl-12 > div > i")).click();
    }

}
