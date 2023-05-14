package com.hormigo.david.parkingmanager.bdd.steps;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.hormigo.david.parkingmanager.bdd.CucumberConfiguration;
import com.hormigo.david.parkingmanager.user.service.UserService;

import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
public class CucumberSteps extends CucumberConfiguration {

    @MockBean
    private UserService userService;
    @Value("${local.server.port}")
    private  int port;
    private static ChromeDriver driver;
    @BeforeAll
    public static void prepareWebDriver() {

        System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        
    }

    @Given("un usuario esta en la pagina inicial")
    public void openHome() {
        driver.get("http://localhost:" + port + "/");


    }

    @Given("un administrador esta en el formulario de creación")
    public void openUserCreateForm()
    {
        driver.get("http://localhost:" + port + "/createUser");
    }



    @When("el usuario hace click sobre el botón de Usuarios")
    public void clickUserButton(){
        driver.findElement(By.id("to-users-link")).click();

    }

    @Then("se muestran todos los usuarios del sistema")
    public void navigateToUsersList(){
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("/users"));
    }

    @Given("un usuario esta en el indice")
    public void openIndex() {
        driver.get("http://localhost:" + port + "/index");
    }

    @When("hace clic en el boton de la lista de usuarios")
    public void clickUserListButton() {
        driver.findElement(By.id("to-list-link")).click();
    }

    @Then("se muestra la lista de usuarios") 
    public void navigateToList() {
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("/users"));
    }

    @When("hago click en el enlace de la lista de sorteos")
    public void clickSorteosButton() {
        driver.findElement(By.id("to-draw-link")).click();
    }

    @Then("se muestra la lista de sorteos")
    public void navigateToDrawList() {
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("/draw"));
    }

    @Given("que un usuario esta en la lista de sorteos")
    public void openDraw() {
        driver.get("http://localhost:" + port + "/draw");
    }

    @When("hago click en el boton de crear sorteo")
    public void clickCreateDraw() {
        driver.findElement(By.id("to-createdraw-link")).click();
    }

    @Then("compruebo que la url actual es la de la creación de sorteo")
    public void navigateToCreateDraw() {
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("/createdraw"));
    }

    @Given("que un administrador esta en la lista de usuarios")
    public void openUserList() {
        driver.get("http://localhost:" + port + "/users");
    }

    @When("hace click en el boton de crear usuario")
    public void ClickCreateUserButton() {
        driver.findElement(By.id("to-createuser-link")).click();
    }

    @Then("se muestra la creación de usuarios")
    public void navigateToCreateUsers() {
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("/createuser"));
    }


}





























































