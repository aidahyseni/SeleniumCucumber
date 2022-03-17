package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;


public class OpenWeatherMapAPISteps {


    @Given("I set GET weather service api for London")
    public void i_set_get_weather_service_api_for_london() {
        Response resp=RestAssured.get("https://api.openweathermap.org/data/2.5/forecast?q=london&appid=6096ffa7b82c16c8eb721154561cff3f");
       String responsebo = resp.getBody().asString();
       //String[] ss= responsebo.split(",");
       //JsonArray body=new JsonArray(responsebo);
       //for (int i=0; i<body.size(); i++){
           //JsonObject bb = body.getAsJsonObject(i);
       boolean temp_min = responsebo.startsWith("temp_min");
        System.out.println("Response Body for London is:"+temp_min);
//String ss= responsebo.startsWith("temp_min");
        int code=resp.getStatusCode();
        System.out.println("Status code is :"+code);
        Assert.assertEquals(code,200);

    }
    @When("I set request HEADER")
    public void i_set_request_header() {



    }
    @Then("I recieve valid HTTP response")
    public void i_recieve_valid_http_response() {

    }
    @Then("I set Get weather api for Pristina")
    public void i_set_get_weather_api_for_pristina() {
        Response resp=RestAssured.get("https://api.openweathermap.org/data/2.5/forecast?q=pristina&appid=6096ffa7b82c16c8eb721154561cff3f");
        String responsebo = resp.getBody().asString();
        System.out.println("Response Body For Pristina is:"+responsebo);

    }
    @Then("I set Get weather api for Oslo")
    public void i_set_get_weather_api_for_oslo() {
        Response resp=RestAssured.get("https://api.openweathermap.org/data/2.5/forecast?q=Oslo&appid=6096ffa7b82c16c8eb721154561cff3f");
        String responsebo = resp.getBody().asString();
        System.out.println("Response Body For Oslo is:"+responsebo);
    }

    @Then("I set Get weather api for Sydney")
    public void i_set_get_weather_api_for_sydney() {
        Response resp=RestAssured.get("https://api.openweathermap.org/data/2.5/forecast?q=Sydney&appid=6096ffa7b82c16c8eb721154561cff3f");
        String responsebo = resp.getBody().asString();
        System.out.println("Response Body For Sydney is:"+responsebo);

    }
}
