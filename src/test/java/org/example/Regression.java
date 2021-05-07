package org.example;

import org.junit.Test;

public class Regression extends Base{


    @Test
    public void signingupRegression()
    {
        SignUpPage sp=new SignUpPage(driver);
        sp.setTypename("vbs");
        sp.setEnteremail("lakshmivbs396@gmail.com");
        sp.setEnterpassword("AprilMay21*");
        sp.setCheckedbox();
        sp.setSignupbutton();


    }
}
