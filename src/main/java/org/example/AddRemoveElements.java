package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddRemoveElements {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        WebElement addRemoveElementsLink = driver.findElement(By.linkText("Add/Remove Elements"));
        addRemoveElementsLink.click();

        WebElement addElementButton = driver.findElement(By.xpath("//button[contains(text(),'Add Element')]"));
        addElementButton.click();

        WebElement addedElement = driver.findElement(By.xpath("//div[@id='elements']//button"));

        WebElement deleteButton = driver.findElement(By.xpath("//button[contains(text(),'Delete')]"));
        if (deleteButton.isDisplayed()) {
            System.out.println("Elementul a fost adaugat cu succes!");
        } else {
            System.out.println("Eroare: Elementul nu a fost adaugat!");
        }

        addedElement.click();

        try {
            deleteButton = driver.findElement(By.xpath("//button[contains(text(),'Delete')]"));
            System.out.println("Eroare: Elementul nu a fost sters!");
        } catch (org.openqa.selenium.NoSuchElementException e) {
            System.out.println("Elementul a fost sters cu succes!");
        }


        driver.quit();
    }
}
