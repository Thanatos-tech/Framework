package service;

import model.UserData;

public class UserDataCreator {
    public static final String USER_EMAIL ="test.data.email";
    public static final String USER_PASSWORD="test.data.password";
    public static final String USER_PROMOCODE="test.data.promocode";
    public static final String USER_VALUEFORSEARCHLINE="test.data.valueForSearchLine";

    public static UserData withCredentialsFromProperty(){
        return new UserData(TestDataReader.getTestData(USER_EMAIL), TestDataReader.getTestData(USER_PASSWORD)
                ,TestDataReader.getTestData(USER_PROMOCODE), TestDataReader.getTestData(USER_VALUEFORSEARCHLINE));
    }
}