package technostudyB7.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        //to set the chrom sriver
        WebDriverManager.chromedriver().setup();
///create an  object For opening the browser
        WebDriver driver=new ChromeDriver();

        driver.get("http://www.google.com");

        System.out.println("title of google.com ="+driver.getTitle());
        System.out.println("url of google.com = "+driver.getCurrentUrl());
        driver.navigate().to("https://wwww.techno.study");

        String expectedTitle = "Join the best coding bootcamps online and get IT training in the US";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)) {
            System.out.println("verification is done : PASS");
            System.out.println("actual title =" + actualTitle);
        }else {
            System.out.println("verification is FAILD");
            System.out.println("actual title =" + actualTitle);
        }



        }
    }
