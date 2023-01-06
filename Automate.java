
public class Automate{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\98nla\\OneDrive\\Desktop\\Automation test\\practiceAutomation\\execfiles\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
    }
}