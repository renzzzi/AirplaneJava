public class SeatManager
{
     private Seat[][] planeSeats = new Seat[4][];
     private int passengerCount = 0;

     public SeatManager() 
     {
          //Amount of columns in each row
          planeSeats[0] = new Seat[9];
          planeSeats[1] = new Seat[7];
          planeSeats[2] = new Seat[7];
          planeSeats[3] = new Seat[9];

          //First row
          char seatColCode = '1';
          char seatRowCode = 'A';

          for (int i = 0; i < planeSeats[0].length; ++i)
          {
               int seatTypeCode = 0;

               if (i == 0 || i == 1 || i == 8)
               {
                    seatTypeCode = 2;
               }
               else if (i == 2 || i == 3)
               {
                    seatTypeCode = 3;
               }
               else if (i >= 4 && i <= 7)
               {
                    seatTypeCode = 4;
               }

               planeSeats[0][i] = new Seat(true, seatTypeCode, seatRowCode, seatColCode);
               ++seatColCode;
          }
          
          //Second row
          seatColCode = '0';
          seatRowCode = 'B';
          for (int i = 0; i < planeSeats[1].length; ++i)
          {
               int seatTypeCode = 0;

               if (i == 0)
               {
                    seatTypeCode = 1;
               }
               else if (i == 1 || i == 2)
               {
                    seatTypeCode = 3;
               }
               else if (i >= 3 && i <= 6)
               {
                    seatTypeCode = 4;
               }

               planeSeats[1][i] = new Seat(true, seatTypeCode, seatRowCode, seatColCode);
               ++seatColCode;
          }

          //Third row
          seatColCode = '0';
          seatRowCode = 'C';
          for (int i = 0; i < planeSeats[2].length; ++i)
          {
               int seatTypeCode = 0;

               if (i == 0)
               {
                    seatTypeCode = 1;
               }
               else if (i == 1 || i == 2)
               {
                    seatTypeCode = 3;
               }
               else if (i >= 3 && i <= 6)
               {
                    seatTypeCode = 4;
               }

               planeSeats[2][i] = new Seat(true, seatTypeCode, seatRowCode, seatColCode);
               ++seatColCode;
          }

          //Fourth row
          seatColCode = '1';
          seatRowCode = 'D';

          for (int i = 0; i < planeSeats[3].length; ++i)
          {
               int seatTypeCode = 0;

               if (i == 0 || i == 1 || i == 8)
               {
                    seatTypeCode = 2;
               }
               else if (i == 2 || i == 3)
               {
                    seatTypeCode = 3;
               }
               else if (i >= 4 && i <= 7)
               {
                    seatTypeCode = 4;
               }

               planeSeats[3][i] = new Seat(true, seatTypeCode, seatRowCode, seatColCode);
               ++seatColCode;
          }
     }

     public int getPassengerCount()
     {
          return this.passengerCount;
     }

     public void displayAirplane()
     {
          System.out.println("\n\t                       /\\                       ____");
          System.out.println("\t      COLUMNS         /  |                     /    |");
          System.out.println("\t                     |   |                    /     |");
          System.out.println("\t    0   1 2     3 4  |   |  5 6 7 8      9   /      |");
          System.out.println("\t    -----------------------------------------       |");
          System.out.println("R\tA  /  \t" + planeSeats[0][0].getAvailable() + " " + planeSeats[0][1].getAvailable() + "\t" + planeSeats[0][2].getAvailable() + " " + planeSeats[0][3].getAvailable() + "\t    " + planeSeats[0][4].getAvailable() + " " + planeSeats[0][5].getAvailable() + " " + planeSeats[0][6].getAvailable() + " " + planeSeats[0][7].getAvailable() + "\t " + planeSeats[0][8].getAvailable() + "  |       |");
          System.out.println("O\tB | " + planeSeats[1][0].getAvailable() + "\t" + "  \t" + planeSeats[1][1].getAvailable() + " " + planeSeats[1][2].getAvailable() + "\t    " + planeSeats[1][3].getAvailable() + " " + planeSeats[1][4].getAvailable() + " " + planeSeats[1][5].getAvailable() + " " + planeSeats[1][6].getAvailable() + "\t    |       |");
          System.out.println("W\tC | " + planeSeats[2][0].getAvailable() + "\t" + "  \t" + planeSeats[2][1].getAvailable() + " " + planeSeats[2][2].getAvailable() + "\t    " + planeSeats[2][3].getAvailable() + " " + planeSeats[2][4].getAvailable() + " " + planeSeats[2][5].getAvailable() + " " + planeSeats[2][6].getAvailable() + "\t    |       |");
          System.out.println("S\tD  \\  \t" + planeSeats[3][0].getAvailable() + " " + planeSeats[3][1].getAvailable() + "\t" + planeSeats[3][2].getAvailable() + " " + planeSeats[3][3].getAvailable() + "\t    " + planeSeats[3][4].getAvailable() + " " + planeSeats[3][5].getAvailable() + " " + planeSeats[3][6].getAvailable() + " " + planeSeats[3][7].getAvailable() + "\t " + planeSeats[3][7].getAvailable() + "  |       |");
          System.out.println("\t    ------------------------------------------------|");
          System.out.println("\t                     |   |");
          System.out.println("\t                     |   |");
          System.out.println("\t                      \\  |");
          System.out.println("\t                       \\/");
     }

     public void displayHelp()
     {
          System.out.println("\n-------------------------------------------");
          System.out.println("--Seat Type Codes--");
          System.out.println("1 = Pilot (0th Column)");
          System.out.println("2 = Staff (1st, 2nd, and 9th Column");
          System.out.println("3 = First-Class (3rd and 4th Column)");
          System.out.println("4 = Economy (5th, 6th, 7th, and 8th Column)");
          System.out.println("--Seat Row Codes--");
          System.out.println("A = 1st Row");
          System.out.println("B = 2nd Row");
          System.out.println("C = 3rd Row");
          System.out.println("D = 4th Row");
          System.out.println("--Seat Column Codes--");
          System.out.println("0-9 = 0th to 9th Column");
          System.out.println("-------------------------------------------");
     }

     public void reservePlaneSeat(int planePass, char seatRowCode, char seatColCode)
     {

          for (int i = 0; i < planeSeats.length; ++i)
          {
               for (int j = 0; j < planeSeats[i].length; ++j)
               {
                    if (planeSeats[i][j].getSeatRowCode() == seatRowCode && planeSeats[i][j].getSeatColCode() == seatColCode)
                    {
                         if (planeSeats[i][j].getSeatTypeCode() < planePass)
                         {
                              System.out.println("\n-----------------------------------------------------------------------------------------");
                              System.out.println("You don't have the appropriate pass for this seat. Please upgrade your plane pass first.");
                              System.out.println("-----------------------------------------------------------------------------------------");
                              return;
                         }

                         if (planeSeats[i][j].getAvailable() == 'X')
                         {
                              System.out.println("\n-----------------------------");
                              System.out.println("Sorry, the seat is reserved.");
                              System.out.println("-----------------------------");
                              return;
                         }
                         
                         ++passengerCount;
                         planeSeats[i][j].setAvailable(false);
                         System.out.println("\n----------------------------");
                         System.out.println("Seat successfully reserved.");
                         System.out.println("----------------------------");
                         return;
                    }
               }
          }
          System.out.println("\n-----------------------------------------------------------------------");
          System.out.println("Seat position does not exist. Please enter proper seat row and column.");
          System.out.println("-----------------------------------------------------------------------");
     }

     public void cancelPlaneSeatReservaton(int planePass, char seatRowCode, char seatColCode)
     {

          for (int i = 0; i < planeSeats.length; ++i)
          {
               for (int j = 0; j < planeSeats[i].length; ++j)
               {
                    if (planeSeats[i][j].getSeatRowCode() == seatRowCode && planeSeats[i][j].getSeatColCode() == seatColCode)
                    {
                         if (planeSeats[i][j].getSeatTypeCode() < planePass)
                         {
                              System.out.println("\n---------------------------------------------------------------------------------------------------------------");
                              System.out.println("You don't have the appropriate pass to cancel reservation for this seat. Please upgrade your plane pass first.");
                              System.out.println("---------------------------------------------------------------------------------------------------------------");
                              return;
                         }

                         if (planeSeats[i][j].getAvailable() == 'O')
                         {
                              System.out.println("\n------------------------------------------------------------------");
                              System.out.println("You cannot cancel the reservation of a seat that is not reserved.");
                              System.out.println("------------------------------------------------------------------");
                              return;
                         }

                         --passengerCount;
                         planeSeats[i][j].setAvailable(true);
                         System.out.println("\n-----------------------------------------");
                         System.out.println("Seat reservation successfully cancelled.");
                         System.out.println("-----------------------------------------");
                         return;
                    }
               }
          }
          System.out.println("\n-----------------------------------------------------------------------");
          System.out.println("Seat position does not exist. Please enter proper seat row and column.");
          System.out.println("-----------------------------------------------------------------------");
     }

     public void crashAirplane()
     {
          System.out.println("\n\t   |---------------------------|                                           /\\                       ____");
          System.out.println("\t   ||                         ||                                          /  |                     /    |");
          System.out.println("\t   ||  |_|      |_|      |_|  ||                                         |   |                    /     |");
          System.out.println("\t   ||                         ||                                         |   |                   /      |");
          System.out.println("\t   ||                         ||                        -----------------------------------------       |");
          System.out.println("\t   ||  |_|      |_|      |_|  ||        /|            /    X X     X X         X X X X       X  |       |");
          System.out.println("\t   ||                         ||       /  -------    | X           X X         X X X X          |       |");
          System.out.println("\t   ||                         ||       \\  -------    | X           X X         X X X X          |       |");
          System.out.println("\t   ||  |_|      |_|      |_|  ||        \\|            \\    X X     X X         X X X X       X  |       |");
          System.out.println("\t   ||                         ||                        ------------------------------------------------|");
          System.out.println("\t   ||                         ||                                         |   |");
          System.out.println("\t   ||  |_|      |_|      |_|  ||                                         |   |");
          System.out.println("\t   ||                         ||                                          \\  |");
          System.out.println("\t   ||                         ||                                           \\/\n");
     }
}
