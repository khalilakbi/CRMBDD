package hooks;

import base.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hook extends CommonMethods {

    @Before
    public void driverInitialisation() {
        driverInit("chrome");
    }

    @After
    public void driverClose() {
        driver.close();
    }
}
