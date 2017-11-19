public class Repair
{
    private Suspects inStoreSuspects;
    private Suspects serviceCenterSuspects;

    public Repair()
    {
        inStoreSuspects = new Suspects();
        serviceCenterSuspects = new Suspects();
    }

    public void addSuspect(Client client, boolean isServiceCenter)
    {
        if (isServiceCenter)
            serviceCenterSuspects.push(client);
        else
            inStoreSuspects.push(client);
    }

    //do a sort before returning the next suspect because there can be a new suspect
    //that has been entered into the system with an earlier appointment
    public Client getNextInStoreRepairableSuspect()
    {

    }

    //do a sort before returning the next suspect because there can be a new suspect
    //that has been entered into the system with an earlier appointment
    public Client getNextServiceCenterRepairableSuspect()
    {

    }

    //do a sort before returning the next suspect because there can be a new suspect
    //that has been entered into the system with an earlier appointment
    public Client viewNextInStoreRepairableSuspect()
    {

    }

    //do a sort before returning the next suspect because there can be a new suspect
    //that has been entered into the system with an earlier appointment
    public Client viewNextServiceCenterRepairableSuspect()
    {

    }

    private static void sort(Suspects suspects)
    {

    }

    public void printSortedInStoreSuspectList()
    {

    }

    public void printSortedServiceCenterSuspectsList()
    {

    }

    public void printInStoreSuspectsList()
    {

    }

    public void printServiceCenterSuspectsList()
    {

    }
}
