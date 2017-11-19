public class Client
{
    //variables for client
    private String name;
    private String phone;
    private String suspect;
    //Check in time format yyyy-mm-dd hh:mm
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

    public String toString()
    {
        return "Client Name = " + name +  ", Phone = " + phone + ", Suspect = " + suspect + ", Submitted Time = " + submittedTime;
    }
}
