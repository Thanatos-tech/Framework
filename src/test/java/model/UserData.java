package model;

public class UserData
{
    private String email;
    private String password;
    private String promocode;
    private String valueForSearchLine;

    public UserData(String email, String password, String promocode, String valueForSearchLine)
    {
        this.email=email;
        this.password=password;
        this.promocode=promocode;
        this.valueForSearchLine = valueForSearchLine;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email=email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password=password;
    }

    public String getPromocode()
    {
        return promocode;
    }

    public void setPromocode(String promocode)
    {
        this.promocode=promocode;
    }

    public String getValueForSearchLine()
    {
        return valueForSearchLine;
    }

    public void setValueForSearchLine(String valueForSearchLine)
    {
        this.valueForSearchLine=valueForSearchLine;
    }
}