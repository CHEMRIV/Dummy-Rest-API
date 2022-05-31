package com.restapiexample.dummy.studentinfo;

import com.restapiexample.dummy.model.StudentPojo;
import com.restapiexample.dummy.testbase.TestBase;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PutDetail extends TestBase {
    @Test
    public void updateEmployeeDetail() {
        StudentPojo studentPojo = new StudentPojo();
        studentPojo.setEmployee_name("dhyani");
        studentPojo.setEmployee_salary("50000");
        studentPojo.setEmployee_age("35");

        Response response = given()
                .header("Content-type", "application/json")
                .header("Authorization","Bearer 914c0f670f001278363480f4134d14f5dbf7d901652c1212fe3ce872e9e07d7b")
                .and()
                .body(studentPojo)
                .when()
                .put("update/21")
                .then()
                .extract().response();
        response.then().statusCode(200);
        response.prettyPrint();

    }

}

