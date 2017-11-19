public class Client
{
    //declare variables
    private String name;
    private String phone;
    private String suspect;
    //ex: yyyy-MM-dd HH:mm
    private String submittedTime;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getSuspect()
    {
        return suspect;
    }

    public void setSuspect(String suspect)
    {
        this.suspect = suspect;
    }

    public String getSubmittedTime()
    {
        return submittedTime;
    }

    public void setSubmittedTime(String submittedTime)
    {
        this.submittedTime = submittedTime;
    }

    @Override
    public String toString()
    {
        return "Client{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", suspect='" + suspect + '\'' +
                ", submittedTime='" + submittedTime + '\'' +
                '}';
    }
}
