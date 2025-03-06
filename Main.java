import java.util.Scanner;

public class Main
{

    public static String getPlanePass(int planePass)
    {
        if (planePass == 1) return "Pilot";
        else if (planePass == 2) return "Staff";
        else if (planePass == 3) return "First-Class";
        else if (planePass == 4) return "Economy";
        else return ""; //Default case
    }
 
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        SeatManager plane = new SeatManager();

        /*
            1 = Pilot
            2 = Staff
            3 = First-Class
            4 = Economy
        */
        int planePass = 4;

        boolean running = true;
        while (running)
        {
            System.out.println("\n--Renz's Airline Menu--");
            System.out.println("1. Check airplane status");
            System.out.println("2. Reserve a seat");
            System.out.println("3. Cancel seat reservation");
            System.out.println("4. Check plane pass status");
            System.out.println("5. Upgrade plane pass");
            System.out.println("6. Degrade plane pass");
            System.out.println("7. Crash the plane (!!DANGEROUS!!)");
            System.out.println("8. Start up the plane (Exit)");
            System.out.println("9. Display HELP Menu");
            System.out.print("Input an option: ");
            String option = scan.nextLine();

            switch (option)
            {
                case "1": //Check airplane status
                {
                    plane.displayAirplane();
                    break;
                }
                case "2": //Reserve a seat
                {
                    System.out.println("\n--Enter the codes for the following--");

                    System.out.print("Enter seat row: ");
                    char seatRowCode = scan.next().charAt(0);

                    System.out.print("Enter seat column: ");
                    char seatColCode = scan.next().charAt(0);

                    scan.nextLine();

                    plane.reservePlaneSeat(planePass, seatRowCode, seatColCode);
                    break;
                }
                case "3": //Cancel seat reservation
                {
                    System.out.println("\n--Enter the codes for the following--");

                    System.out.print("Enter seat row: ");
                    char seatRowCode = scan.next().charAt(0);

                    System.out.print("Enter seat column: ");
                    char seatColCode = scan.next().charAt(0);

                    scan.nextLine();

                    plane.cancelPlaneSeatReservaton(planePass, seatRowCode, seatColCode);
                    break;
                }
                case "4": //Check plane pass status
                {
                    System.out.println("\n-------------------------------------");
                    System.out.println("Your plane pass is: " + getPlanePass(planePass));
                    System.out.println("-------------------------------------");
                    break;
                }
                case "5": //Upgrade plane pass
                {
                    if (planePass >= 2 && planePass <= 4)
                    {
                        --planePass;
                        System.out.println("\n----------------------------------------------------");
                        System.out.println("Upgrade successful!, your new plane pass is: " + getPlanePass(planePass));
                        System.out.println("----------------------------------------------------");
                    }
                    else
                    {
                        System.out.println("\n------------------------------------------------------");
                        System.out.println("You have the highest pass attainable, upgrade failed.");
                        System.out.println("------------------------------------------------------");
                    }
                    break;
                }
                case "6": //Degrade plane pass
                {
                    if (planePass >= 1 && planePass <= 3)
                    {
                        ++planePass;
                        System.out.println("\n----------------------------------------------------");
                        System.out.println("Degrade successful!, your new plane pass is: " + getPlanePass(planePass));
                        System.out.println("----------------------------------------------------");
                    }
                    else
                    {
                        System.out.println("\n-----------------------------------------------------");
                        System.out.println("You have the lowest pass attainable, degrade failed.");
                        System.out.println("-----------------------------------------------------");
                    }
                    break;
                }
                case "7": //Crash the plane
                {
                    plane.crashAirplane();
                    System.out.println("\n-----------------------------------------------------");
                    System.out.println(plane.getPassengerCount() + " died in the plane crash.");
                    System.out.println("You messed up...");
                    System.out.println("-----------------------------------------------------");

                    running = false;
                    break;
                }
                case "8": //Start up the plane
                {
                    System.out.println("\n--------------------------------------------------------");
                    System.out.println("You have " + plane.getPassengerCount() + " in the plane.");
                    System.out.println("The airplane is taking off...");
                    System.out.println("--------------------------------------------------------");
                    
                    running = false;
                    break;
                }
                case "9": //Display HELP Menu
                {
                    plane.displayHelp();
                    break;
                }
                default:
                {
                    System.out.println("\n---------------------------------------------------");
                    System.out.println("Invalid option. Please enter a number between 1-9.");
                    System.out.println("---------------------------------------------------");
                    break;
                }
            } //main switch
        } //main loop
        scan.close();
    } //main function
} //main class