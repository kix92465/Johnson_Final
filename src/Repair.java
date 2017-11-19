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
        sort(inStoreSuspects);
        return inStoreSuspects.pop();
    }

    //Complete another sort before returning the next suspect as there can be a
    //new suspect is entered in the system with an earlier check-in time
    public Client getNextServiceCenterRepairableSuspect()
    {
        sort(serviceCenterSuspects);
        return serviceCenterSuspects.pop();
    }

    //Complete another sort before returning the next suspect as there can be a
    //new suspect is entered in the system with an earlier check-in time
    public Client viewNextInStoreRepairableSuspect()
    {
        sort(inStoreSuspects);
        return inStoreSuspects.top();
    }

    //Complete another sort before returning the next suspect as there can be a
    //new suspect is entered in the system with an earlier check-in time
    public Client viewNextServiceCenterRepairableSuspect()
    {
        sort(serviceCenterSuspects);
        return serviceCenterSuspects.top();
    }

    private static void sort(Suspects suspects)
    {
        suspects.setTop(suspects.mergeSort(suspects.getTop()));
    }

    public void printSortedInStoreSuspectsList()
    {
        System.out.println("In-Store Suspects (sorted by time reported)");
        sort(inStoreSuspects);
        inStoreSuspects.print();
    }

    public void printSortedServiceCenterSuspectsList()
    {
        System.out.println("Service-Center Suspects (sorted by time reported)");
        sort(serviceCenterSuspects);
        serviceCenterSuspects.print();
    }

    public void printInStoreSuspectsList()
    {
        System.out.println("In-Store Suspects");
        inStoreSuspects.print();
    }

    public void printServiceCenterSuspectsList()
    {
        System.out.println("Service-Center Suspects");
        serviceCenterSuspects.print();
    }
}