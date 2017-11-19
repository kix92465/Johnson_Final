import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Driver
{
    public static void main(String args[])
    {
        Repair repair = new Repair();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            while (true)
            {
                printMenu();
                int option = Integer.parseInt(br.readLine());

                switch (option)
                {

                    case 1:
                        addSuspect(repair, br);
                        break;
                    case 2:
                        repair.printInStoreSuspectsList();
                        break;
                    case 3:
                        repair.printServiceCenterSuspectsList();
                        break;
                    case 4:
                        repair.printSortedInStoreSuspectsList();
                        break;
                    case 5:
                        repair.printSortedServiceCenterSuspectsList();
                        break;
                    case 6:
                        System.out.println("Latest Precinct Suspect to repair: " + repair.viewNextInStoreRepairableSuspect());
                        break;
                    case 7:
                        System.out.println("Latest Precinct Suspect being repaired: " + repair.getNextInStoreRepairableSuspect() + " (Removed from the system)");
                        break;
                    case 8:
                        System.out.println("Latest Geek Squad City Suspect to repair: " + repair.viewNextServiceCenterRepairableSuspect());
                        break;
                    case 9:
                        System.out.println("Latest Geek Squad City Suspect being repaired: " + repair.getNextServiceCenterRepairableSuspect() + " (Removed from the system)");
                        break;
                    case 10:
                        System.exit(0);
                    default:
                        System.out.println("Invalid Option!!");
                }
                System.out.println("\n\n Returning to Repair System menu.");
            }
        }
        catch (Exception e)
        {
            System.out.println("Repair System Error!! ");
            e.printStackTrace();
        }
    }

    private static void addSuspect(Repair repair, BufferedReader br) throws Exception
    {
        System.out.println("\n\n1. Add a Suspect.");
        Client client = new Client();
        System.out.print("Enter Client name: ");
        client.setName(br.readLine());
        System.out.print("Enter Client phone: ");
        client.setPhone(br.readLine());
        System.out.print("Enter check-in date and time (ex: 2017-10-24 14:22) : ");
        client.setSubmittedTime(br.readLine());
        System.out.println("Is the repair type Precinct? (Y/N) : ");
        repair.addSuspect(client, br.readLine().equalsIgnoreCase("N"));
        System.out.println("Suspect added successfully!");
    }

    private static void printMenu()
    {
        System.out.println("Repair System:  ");
        System.out.println("1. Add a Suspect to queue:  ");
        System.out.println("2. Display all Suspects in the Precinct queue (non sorted):  ");
        System.out.println("3. Display all Suspects in the Geek Squad City queue (non sorted):  ");
        System.out.println("4. Display sorted Precinct Suspects according to time checked-in:  ");
        System.out.println("5. Display sorted Geek Squad City Suspects according to time checked-in:  ");
        System.out.println("6. View the next Precinct Suspect:  ");
        System.out.println("7. Get the next Precinct Suspect:  ");
        System.out.println("8. View the next Precinct Suspect:  ");
        System.out.println("9. Get the next Geek Squad City Suspect:  ");
        System.out.println("10. Exit");
        System.out.println("Enter menu number of the action you'd like to complete (1 through 10): ");
    }
}
