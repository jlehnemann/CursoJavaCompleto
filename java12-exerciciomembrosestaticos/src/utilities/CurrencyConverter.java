package utilities;

public class CurrencyConverter {

    public static double iof = 6.0 / 100.0;


    public static double converter(double dollarPrice, double dollarBought) {
        dollarBought = dollarBought + (dollarBought * iof);
        return (dollarPrice * dollarBought);
    }
}
