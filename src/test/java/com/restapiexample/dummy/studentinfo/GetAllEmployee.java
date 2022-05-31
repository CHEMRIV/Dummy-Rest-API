package com.restapiexample.dummy.studentinfo;

import com.restapiexample.dummy.testbase.TestBase;
import groovy.lang.DelegatesTo;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetAllEmployee extends TestBase {

    @Test
    public void getAllEmployeeInfo() {
        Response response = given()
                .when()
                .get("/employees");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    @Test

    public void getSingleEmployeeInfo(){
        Response response=given()
                .pathParams("id"," ")
                .when()
                .get("/employee/2"+"{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }

}
