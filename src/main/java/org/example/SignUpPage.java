package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends Browserfactory{
    public SignUpPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "contact")
    WebElement typename;
    @FindBy(name="email")
     WebElement enteremail;
    @FindBy(name = "password")
    WebElement enterpassword;

   // @FindBy(xpath="//*[@id=__next]/div/div/div/form/div[4]/label/div/div")
   @FindBy(css="div.hl-checkbox__tick")
    WebElement checkedbox;
    @FindBy(css="button.hl-button")
    WebElement signupbutton;

    public void setTypename(String entername)
    {
        typename.sendKeys(entername);
    }
    public void setEnteremail(String giveemail)
    {
    enteremail.sendKeys(giveemail);
    }
    public void setEnterpassword( String pwd)
    {
        enterpassword.sendKeys(pwd);
            }
     public void setCheckedbox()
     {
         checkedbox.click();
              }
      public void setSignupbutton()
      {
          signupbutton.click();
      }

}

