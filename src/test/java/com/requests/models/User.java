package com.requests.models;

public class User {
    private String userName;
    private String externalId;
    private String formatted;
    private String familyName;
    private String givenName;
    private String schemas;
    private String firstName;
    private String lastName;

    {
        schemas = "urn:ietf:params:scim:schemas:core:2.0:User";
        userName = "bjensen";
        externalId = "bjensen";
        firstName = "Test FirstName";
        lastName = "Test LastName";
        formatted = "Ms. Barbara J Jensen III";
        familyName = "Jensen";
        givenName = "Barbara";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getFormatted() {
        return formatted;
    }

    public void setFormatted(String formatted) {
        this.formatted = formatted;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSchemas() {
        return schemas;
    }

    public void setSchemas(String schemas) {
        this.schemas = schemas;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "{\n" +
                "userId:" + "[" + schemas + "]" + "\n" +
                "userName:" + userName + "\n" +
                "firstName:" + firstName + "\n" +
                "lastName:" + lastName + "\n" +
                "externalId:" + externalId + "\n" +
                "name:{"  + "\n" +
                "formatted:" + formatted + "\n" +
                "familyName" + familyName + "\n" +
                "givenName" + givenName + "\n" +
                "}" + "\n" +
                "}";
    }
}
