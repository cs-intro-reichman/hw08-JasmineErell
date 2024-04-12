public class MoltDriver
{
    private int id;
    private String name;
    private int nextAvailableTimeForDelivery;
    private int alreadyDoneDeliveries;

    // a contructor
    public MoltDriver(int id, String name, int nextAvailableTimeForDelivery)
    {
        this.id = id;
        this.name = name;
        this.nextAvailableTimeForDelivery = nextAvailableTimeForDelivery;
        this.alreadyDoneDeliveries = 0;
    }

    public int getNextAvailableTimeForDelivery ()
    {
        return this.nextAvailableTimeForDelivery;
    }
    public void setNextAvailableTimeForDelivery ( int time)
    {
        this.nextAvailableTimeForDelivery = time;
    }
    public String getName ()
    {
        return this.name;
    }
    public void tostring()
    {
        System.out.println("hi");
    }
}

