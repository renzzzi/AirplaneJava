public class Seat 
{
    //Attributes
    private boolean available;
    private int seatTypeCode;
    private char seatRowCode;
    private char seatColCode;
    
    //Constructors
    public Seat(boolean available, int seatTypeCode, char seatRowCode, char seatColCode)
    {
        this.available = available;
        setSeatTypeCode(seatTypeCode);
        setSeatRowCode(seatRowCode);
        setSeatColCode(seatColCode);
    }

    //Setters
    public void setAvailable(boolean available)
    {
        this.available = available;
    }

    public void setSeatTypeCode(int seatTypeCode)
    {
        if (seatTypeCode >= 1 && seatTypeCode <= 4)
        {
            this.seatTypeCode = seatTypeCode;
        }
        else
        {
            System.out.println("Error initializing seat type code.");
        }
    }

    public void setSeatRowCode(char seatRowCode)
    {
        if (seatRowCode >= 'A' && seatRowCode <= 'D')
        {
            this.seatRowCode = seatRowCode;
        }
        else
        {
            System.out.println("Error intializing seat row code.");
        }
    }

    public void setSeatColCode(char seatColCode)
    {
        if (seatColCode >= '0' && seatColCode <= '9')
        {
            this.seatColCode = seatColCode;
        }
        else
        {
            System.out.println("Error intializing seat column code.");
        }
    }

    //Getters
    public char getAvailable()
    {
        if (available)
        {
            return 'O';
        }
        else
        {
            return 'X';
        }
    }

    public int getSeatTypeCode()
    {
        return this.seatTypeCode;
    }

    public char getSeatRowCode()
    {
        return this.seatRowCode;
    }

    public char getSeatColCode()
    {
        return this.seatColCode;
    }
}
