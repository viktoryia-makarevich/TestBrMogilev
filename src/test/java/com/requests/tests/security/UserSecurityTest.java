package com.requests.tests.security;

import com.jayway.restassured.http.ContentType;
import com.requests.data.RequestData;
import com.requests.helpers.RequestHelperMethods;
import com.requests.models.User;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;

public class UserSecurityTest {

    @Test
    public void verifyThatReadListOfAccountsRequestIsSecured() {
        given()
                .when().get(RequestData.BaseUrl + "/users")
                .then().assertThat().statusCode(401);
    }

    @Test
    public void verifyThatReadListOfAccountsRequestIsSecuredWithFakeBearerToken() {
        given()
                .header("Authorization", RequestData.FAKE_BEARER)
                .when().get(RequestData.BaseUrl + "/users")
                .then().assertThat().statusCode(401);
    }

    @Test
    public void verifyThatReadAccountDetailsIsSecured() {
        given()
                .when().get(RequestData.BaseUrl + "/users/" + RequestHelperMethods.getExistedUserId())
                .then().assertThat().statusCode(401);
    }

    @Test
    public void verifyThatCreateAccountRequestIsSecured() {
        given()
                .body(new User())
                .header("Accept", "application/scim+json")
                .and()
                .contentType(ContentType.JSON)
                .when().post(RequestData.BaseUrl + "/users/")
                .then().assertThat().statusCode(401);
    }

    @Test
    public void verifyThatUpdateAccountDetailsRequestIsSecured() {
        User user = new User();
        user.setFirstName("test1");
        user.setLastName("test2");
        given()
                .body(user)
                .header("Accept", "application/scim+json")
                .and()
                .contentType(ContentType.JSON)
                .when().put(RequestData.BaseUrl + "/users/" + RequestHelperMethods.getExistedUserId())
                .then().assertThat().statusCode(401);
    }
}
