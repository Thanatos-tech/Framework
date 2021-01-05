package service;

import model.UserData;

public class UserDataCreator {
    public static final String USER_EMAIL ="test.data.email";
    public static final String USER_PASSWORD="test.data.password";
    public static final String USER_PROMOCODE="test.data.promocode";
    public static final String USER_VALUEFORSEARCHLINE="test.data.valueForSearchLine";

    public static UserData withCredentialsFromProperty(){
        return new UserData(USER_EMAIL, USER_PASSWORD,USER_PROMOCODE, USER_VALUEFORSEARCHLINE);
    }
}