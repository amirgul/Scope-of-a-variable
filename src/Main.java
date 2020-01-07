public class Main
{

    public static void main(String[] args)
    {
        bankAccount account = new bankAccount();
        account.amount =100;
        account.rate = 5;
        double newBalance = 800;
        account.showAmount();
        System.out.println("I wish my new balance was: "+ newBalance);


    }
}
