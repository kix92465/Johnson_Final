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

    //Complete a sort before returning the next suspect as there can be a
    //new suspect is entered in the system with an earlier check-in time
    public Client getNextInStoreRepairableSuspect()
    {

    }

    //Complete another sort before returning the next suspect as there can be a
    //new suspect is entered in the system with an earlier check-in time
    public Client getNextServiceCenterRepairableSuspect()
    {

    }

    //Complete another sort before returning the next suspect as there can be a
    //new suspect is entered in the system with an earlier check-in time
    public Client viewNextInStoreRepairableSuspect()
    {

    }

    //Complete another sort before returning the next suspect as there can be a
    //new suspect is entered in the system with an earlier check-in time
    public Client viewNextServiceCenterRepairableSuspect()
    {


    }

    private static void sort(Suspects suspects)
    {

    }

    public void printSortedInStoreSuspectsList()
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