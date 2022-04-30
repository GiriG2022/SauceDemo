package configuration;

import org.openqa.selenium.WebDriver;
import pages.Login;

public class PageFactory {

    private WebDriver driver ;
    private Login loginPage;

    public PageFactory(String browser){
        this.driver =  DriverFactoryFacade.setDriver(browser);
        loginPage = new Login(driver);
    }

    public WebDriver getDriver()
    {
        return DriverFactoryFacade.getDriver();
    }

    public Login getLoginPage()
    {
        return loginPage;
    }

}
