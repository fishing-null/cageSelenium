package org.example.LoginModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginController {
    private String usrPath;
    private String jumpPageUrl;

    private PathType pathType;
    WebDriver webDriver = new ChromeDriver();

    public LoginController(String usrPath,String jumpPageUrl,PathType pathType) {
        this.usrPath = usrPath;
        this.jumpPageUrl = jumpPageUrl;
        this.pathType = pathType;
    }

    /**
     * 调用这个函数来实现页面的跳转
     * @param jumpPageUrl
     * @throws InterruptedException
     */
    private void jumpPage(String jumpPageUrl) throws InterruptedException {
        //设置页面全屏幕
        webDriver.manage().window().fullscreen();
        //跳转到对应的页面
        webDriver.get(jumpPageUrl);
        //页面跳转之后等待页面响应
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String webTitle = webDriver.getTitle();
        System.out.println("成功跳转到:"+webTitle);

    }

    /**
     * 实现选择角色登录页面
     * @throws InterruptedException
     */
    public void loginByXpath() throws InterruptedException {
        //首先跳转到页面
        jumpPage(jumpPageUrl);
        //定位角色

        try {
            webDriver.findElement(By.xpath(usrPath)).click();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("[LoginController]xPath路径不存在!");
            return;
        }

        webDriver.findElement(By.xpath("/html/body/div/button")).click();
    }

    public void loginByCssslc() throws InterruptedException {
        //首先跳转到页面
        jumpPage(jumpPageUrl);
        //定位角色

        try {
            webDriver.findElement(By.cssSelector(usrPath)).click();
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("[LoginController]css路径不存在!");
            return;
        }

        webDriver.findElement(By.xpath("/html/body/div/button")).click();
    }
    public static void main(String[] args) {

    }
}
