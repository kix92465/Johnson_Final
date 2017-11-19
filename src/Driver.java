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
            }
        }
    }
}
