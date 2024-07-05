package org.example.Test;

import org.example.LoginController;

public class LoginTest {
    public static void main(String[] args) throws InterruptedException {
        LoginController loginController = new LoginController("#app > div > div:nth-child(7)","http://" +
                "175.27.136.248:9099/#/",PathType.CSSSLC);
        loginController.loginByCssslc();
    }
}
