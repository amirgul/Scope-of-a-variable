public class bankAccount
{
    public double amount;
    public double rate;
    public void showAmount()
    {
        double newBalance = amount + ((rate/100)*amount);
        System.out.println("With interest added new balance is going to be: " + newBalance);
    }

}
