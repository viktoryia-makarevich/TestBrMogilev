package com.requests.helpers;

import com.requests.data.RequestData;

import java.util.List;

import static com.jayway.restassured.RestAssured.given;

public class RequestHelperMethods {
    public static int getExistedUserId() {
        List<Integer> responseBody = given().header("Authorization", "Bearer " + RequestData.BEARER).
                when().get(RequestData.BaseUrl + "/users").
                then().extract().body().jsonPath().getList("data.id");
        return responseBody.get(0);
    }
}
