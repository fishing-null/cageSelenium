package org.example.impl;

import org.openqa.selenium.WebElement;

public interface ClickInterface extends WebInterface{
    //调用这个方法来获取页面元素
    WebElement getPath();
}
