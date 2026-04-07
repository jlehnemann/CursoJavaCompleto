package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {

    LocalDate manufactureDate;
    DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public UsedProduct(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactareDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return getName() + " (used) $ " + String.format("%.2f", getPrice()) +
                " (Manufacture date: " + dtf2.format(manufactureDate) + ")";
    }
}
