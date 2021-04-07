package components;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Components {


    // isso é um método
    public void InitialEndpoint(String endpoint) {
        RestAssured.baseURI = "https://reqres.in" + endpoint;
        System.out.println(RestAssured.baseURI);
    }

    public void ValidarValor(String valor){
        given().when().get().then().body("data.first_name", is(valor));
    }



}
