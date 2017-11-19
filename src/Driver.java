import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Driver
{
    public static void main(String args[])
    {
        //enter clients information
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
                        System.out.println("Latest In-Store Suspect to repair: " + repair.viewNextInStoreRepairableSuspect());
                        break;
                    case 7:
                        System.out.println("Latest In-Store Suspect being repaired: " + repair.getNextInStoreRepairableSuspect() + " (Removed from the system)");
                        break;
                    case 8:
                        System.out.println("Next Service Center Suspect to repair: " + repair.viewNextServiceCenterRepairableSuspect());
                        break;
                    case 9:
                        System.out.println("Next Service Center Suspect being repaired: " + repair.getNextServiceCenterRepairableSuspect() + " (Removed from the system)");
                        break;
                    case 10:
                        System.exit(0);
                    default:
                        System.out.println("Invalid option please choose another number.");

                }
                System.out.println("\n\n Returning to repair system menu.");
            }
            catch(Exception e)
            {
                System.out.println("Repair System Error! Please try again!");
                e.printStackTrace();
            }
        }
        private static void addSuspect(Repair repair, BufferedReader br) throws Exception
        {
            System.out.println("\n\n1. Add a Suspect.");
            Client client = new Client();
            System.out.print("Enter Client Name: ");
            client.setName(br.readLine());
            System.out.print("Enter Client Phone: ");
            client.setPhone(br.readLine());
            System.out.print("Enter Check-In date and time (ex: 2017-10-24 14:22) : ");
            client.setSubmittedTime(br.readLine());
            System.out.println("Is the repair type Precinct? (Y/N) : ");
            repair.addSuspect(client, br.readLine().equalsIgnoreCase("N"));
            System.out.println("Suspect Added Successfully!");
        }

        private static void printMenu()
        {
            System.out.println("Repair System:  ");
            System.out.println("1. Add a Suspect.");
            System.out.println("2. Print all Precinct suspects.");
            System.out.println("3. Print all Geek Squad City suspects.");
            System.out.println("4. Print sorted Precinct Suspects according to time checked-in.");
            System.out.println("5. Print sorted Service Center Suspects according to time checked-in.");
            System.out.println("6. View the next Precinct Suspect.");
            System.out.println("7. Get the next Precinct Suspect.");
            System.out.println("8. View the next Precinct Suspect.");
            System.out.println("9. Get the next Geek Squad City Suspect.");
            System.out.println("10. Exit.");
            System.out.print("Enter you option number (1...10): ");
        }

}

