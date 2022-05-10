package uk.co.library.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "gdpr-consent-notice")
    WebElement getInToIFrame;
    @CacheLookup
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptAllBtn;

    @FindBy(xpath = "//input[@id='keywords']")
    WebElement jobRole;
    @FindBy(xpath = "//input[@id='location']")
    WebElement loctn;
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distance1;
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearch;
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement minSal;
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement maxSal;
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salType;
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jpType;
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement jbBtn;


    public void clickOnFindJobsButton() {
        clickOnElement(jbBtn);
    }

    public void selectJobType(String jobType) {
        selectByVisibleTextFromDropDown(jpType, jobType);
    }

    public void selectSalaryType(String sType) {
        selectByVisibleTextFromDropDown(salType, sType);
    }

    public void enterMaxSalary(String maxSalary) {
        sendTextToElement(maxSal, maxSalary);
    }

    public void enterMinSalary(String minSalary) {
        sendTextToElement(minSal, minSalary);
    }

    public void clickOnMoreSearchOptionLink() {
        clickOnElement(moreSearch);
    }

    public void selectDistance(String distance) {
        selectByVisibleTextFromDropDown(distance1, distance);
    }

    public void enterLocation(String location) {
        sendTextToElement(loctn, location);
    }

    public void enterJobTitle(String jobTitle) {
        sendTextToElement(jobRole, jobTitle);
    }
    public void acceptIFrameAlert() throws InterruptedException {
        Thread.sleep(2000);
        driver.switchTo().frame(getInToIFrame);
        clickOnElement(acceptAllBtn);
        driver.switchTo().defaultContent();
        //log.info("Accepting cookies: " + acceptAllBtn.toString());
    }


}
