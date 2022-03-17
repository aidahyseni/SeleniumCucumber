package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;


public class OpenWeatherMapAPISteps {


    @Given("I set GET weather service api for London")
    public void i_set_get_weather_service_api_for_london() {
        Response resp=RestAssured.get("https://api.openweathermap.org/data/2.5/onecall?lat=51.5085&lon=-0.1257&exclude=minutely,hourly&appid=22d22ac5b842b1d39ee15e571564a988");
       String responsebo = resp.getBody().asString();

        System.out.println("Response Body for London is:"+responsebo);
        int code=resp.getStatusCode();
        System.out.println("Status code is :"+code);
        Assert.assertEquals(code,200);

    }

    @Then("I set Get weather api for Pristina")
    public void i_set_get_weather_api_for_pristina() {
        Response resp=RestAssured.get("https://api.openweathermap.org/data/2.5/onecall?lat=42.667542&lon=21.166191&exclude=minutely,hourly&appid=22d22ac5b842b1d39ee15e571564a988");
        String responsebo = resp.getBody().asString();
        System.out.println("Response Body For Pristina is:"+responsebo);
        int code=resp.getStatusCode();
        System.out.println("Status code is :"+code);
        Assert.assertEquals(code,200);

    }
    @Then("I set Get weather api for Oslo")
    public void i_set_get_weather_api_for_oslo() {
        Response resp=RestAssured.get("https://api.openweathermap.org/data/2.5/onecall?lat=59.911491&lon=10.757933&exclude=minutely,hourly&appid=22d22ac5b842b1d39ee15e571564a988");
        String responsebo = resp.getBody().asString();
        System.out.println("Response Body For Oslo is:"+responsebo);
        int code=resp.getStatusCode();
        System.out.println("Status code is :"+code);
        Assert.assertEquals(code,200);
    }

    @Then("I set Get weather api for Sydney")
    public void i_set_get_weather_api_for_sydney() {
        Response resp=RestAssured.get("https://api.openweathermap.org/data/2.5/onecall?lat=-33.865143&lon=151.209900&exclude=minutely,hourly&appid=22d22ac5b842b1d39ee15e571564a988");
        String responsebo = resp.getBody().asString();
        System.out.println("Response Body For Sydney is:"+responsebo);
        int code=resp.getStatusCode();
        System.out.println("Status code is :"+code);
        Assert.assertEquals(code,200);

    }
}
