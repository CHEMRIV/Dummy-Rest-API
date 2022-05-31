package com.restapiexample.dummy.studentinfo;

import com.restapiexample.dummy.model.StudentPojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostCreateNewEmployeeId extends TestBase {


    @Test
    public void createNewEmployeeId() {

        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setEmployee_name("John");
        studentPojo.setEmployee_salary("80000");
        studentPojo.setEmployee_age("45");


        Response response = given()
                .header("Content-type", "application/json")
                .and()
                .body(studentPojo)
                .when()
                .post("/create")
                .then()
                .extract().response();
        response.then().statusCode(200);
        response.prettyPrint();

    }
}
