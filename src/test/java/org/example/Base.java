package org.example;

import org.junit.Before;

public class Base extends Browserfactory{
    @Before
    public void setUp()
    {
        Browserfactory bros=new Browserfactory();
        bros.openBrowser("chrome","https://signup.skimlinks.com/");
    }
}
