package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbTesting {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        WebElement abTestingLink = driver.findElement(By.linkText("A/B Testing"));
        abTestingLink.click();

        WebElement abTestControlElement = driver.findElement(By.xpath("//div[@id='content']//div[@class='example']/p"));
        String abTestControlText = abTestControlElement.getText();

        System.out.println("Textul A/B Test Control este: " + abTestControlText);

        driver.quit();

    }
}