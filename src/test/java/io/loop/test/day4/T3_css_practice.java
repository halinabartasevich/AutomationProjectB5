package io.loop.test.day4;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/*

    go to docuport app
    identify docuport with css
    get value of the attribute
    validate if it is "Docuport"

    the rest is home work
    locate:
    username
    password
    login
        with css
    login to docuport
    locate home icon of docuport after login or any other element after login
    validated that you logged in
     */
public class T3_css_practice {
    public static void main(String[] args) {

        // go to the docuport url
        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();
        driver.navigate().to(DocuportConstants.DOCUPORT_TEST);

        // locate teh element with CSS
        WebElement logo = driver.findElement(By.cssSelector("img[src='/img/logo.d7557277.svg']"));


        // get value of attribute
        String actualLogoDocuport = logo.getDomAttribute("alt");
        //String docuportExpected = logo.getAttribute("alt");


        System.out.println("docuport = " + actualLogoDocuport);


        // validation
        if (DocuportConstants.EXPECTED_LOGO_DOCUPORT.equals(actualLogoDocuport)) {
            System.out.println("expected logo: \"" + DocuportConstants.EXPECTED_LOGO_DOCUPORT + "\", matches actual logo: \"" + actualLogoDocuport + "\" => TEST PASS");
        } else {
            System.out.println("expected logo: \"" + DocuportConstants.EXPECTED_LOGO_DOCUPORT + "\", DOES NOT match actual logo: \"" + actualLogoDocuport + "\" => TEST FAIL");
        }


    }


}
