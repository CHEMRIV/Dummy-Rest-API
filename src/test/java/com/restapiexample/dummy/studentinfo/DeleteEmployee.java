package com.restapiexample.dummy.studentinfo;

import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteEmployee extends TestBase {

    @Test

    public void deleteSingleEmployeeInfo() {
        Response response = given()
                .header("Content-type", "application/json")
                .header("Authorization", "Bearer 914c0f670f001278363480f4134d14f5dbf7d901652c1212fe3ce872e9e07d7b")
                .when()
                .delete("/delete/2")
                .then()
                .extract().response();
        response.then().statusCode(200);//Here its bug because status code will show 200 was passed.
        response.prettyPrint();
    }
}
