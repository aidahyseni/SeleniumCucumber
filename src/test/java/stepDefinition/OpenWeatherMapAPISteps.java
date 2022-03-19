package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;


public class OpenWeatherMapAPISteps {




    @Given("I set GET weather service api for London")
    public void i_set_get_weather_service_api_for_london() {
        Response resp = RestAssured.get("https://api.openweathermap.org/data/2.5/onecall?lat=51.5085&lon=-0.1257&exclude=minutely,hourly&appid=22d22ac5b842b1d39ee15e571564a988");
        int code = resp.getStatusCode();
        System.out.println("Status code is :" + code);
        Assert.assertEquals(code, 200);
        //convert json to string
        JsonPath t = new JsonPath(resp.asString());
        //get values of JSON array after getting array size
        int s = t.getInt("daily.size()");
        for (int i = 0; i < s; i++) {

            String date =t.getString("daily["+ i + "].dt");
            String temp_min = t.getString("daily[" + i + "].temp.min");
            String temp_max = t.getString("daily[" + i + "].temp.max");
            String clouds =t.getString("daily[" + i + "].clouds");
            System.out.println(+i+")London Date:" + date);
            System.out.println("Temp_min:" + temp_min);
            System.out.println("Temp_max:" + temp_max);
            System.out.println("Clouds:" +clouds);
        }

    }

    @Then("I set Get weather api for Pristina")
    public void i_set_get_weather_api_for_pristina() {
        Response resp = RestAssured.get("https://api.openweathermap.org/data/2.5/onecall?lat=42.667542&lon=21.166191&exclude=minutely,hourly&appid=22d22ac5b842b1d39ee15e571564a988");
        int code = resp.getStatusCode();
        System.out.println("Status code is :" + code);
        Assert.assertEquals(code, 200);
        //convert json to string
        JsonPath t = new JsonPath(resp.asString());
        //get values of JSON array after getting array size
        int s = t.getInt("daily.size()");
        for (int i = 0; i < s; i++) {

            String date =t.getString("daily["+ i + "].dt");
            String temp_min = t.getString("daily[" + i + "].temp.min");
            String temp_max = t.getString("daily[" + i + "].temp.max");
            String clouds =t.getString("daily[" + i + "].clouds");
            System.out.println(+i+")Pristina Date:" + date);
            System.out.println("Temp_min:" + temp_min);
            System.out.println("Temp_max:" + temp_max);
            System.out.println("Clouds:" +clouds);
        }


    }

    @Then("I set Get weather api for Oslo")
    public void i_set_get_weather_api_for_oslo() {
        Response resp = RestAssured.get("https://api.openweathermap.org/data/2.5/onecall?lat=59.911491&lon=10.757933&exclude=minutely,hourly,current&appid=22d22ac5b842b1d39ee15e571564a988");
        int code = resp.getStatusCode();
        System.out.println("Status code is :" + code);
        Assert.assertEquals(code, 200);
        //convert json to string
        JsonPath t = new JsonPath(resp.asString());
        //get values of JSON array after getting array size
        int s = t.getInt("daily.size()");
        for (int i = 0; i < s; i++) {

            String date =t.getString("daily["+ i + "].dt");
            String temp_min = t.getString("daily[" + i + "].temp.min");
            String temp_max = t.getString("daily[" + i + "].temp.max");
            String clouds =t.getString("daily[" + i + "].clouds");
            System.out.println(+i+")Oslo Date:" + date);
            System.out.println("Temp_min:" + temp_min);
            System.out.println("Temp_max:" + temp_max);
            System.out.println("Clouds:" +clouds);
        }
    }

    @Then("I set Get weather api for Sydney")
    public void i_set_get_weather_api_for_sydney() {

        Response resp = RestAssured.get("https://api.openweathermap.org/data/2.5/onecall?lat=-33.865143&lon=151.209900&exclude=minutely,hourly&appid=22d22ac5b842b1d39ee15e571564a988");
        int code=resp.getStatusCode();
        System.out.println("Status code is :"+code);
        Assert.assertEquals(code,200);
         //convert json to string
        JsonPath t = new JsonPath(resp.asString());
        //get values of JSON array after getting array size
        int s = t.getInt("daily.size()");
        for (int i = 0; i < s; i++) {

            String date =t.getString("daily["+ i + "].dt");
            String temp_min = t.getString("daily[" + i + "].temp.min");
            String temp_max = t.getString("daily[" + i + "].temp.max");
            String clouds =t.getString("daily[" + i + "].clouds");
            System.out.println(i+")Sydney Date:" + date);
            System.out.println("Temp_min:" + temp_min);
            System.out.println("Temp_max:" + temp_max);
            System.out.println("Clouds:" +clouds);
            }
        }
    }
