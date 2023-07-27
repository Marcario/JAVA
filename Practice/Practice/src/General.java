import java.util.*;

class FoodDonation {
    private String donorName;
    private String foodType;
    private int quantity;

    public FoodDonation(String donorName, String foodType, int quantity) {
        this.donorName = donorName;
        this.foodType = foodType;
        this.quantity = quantity;
    }

    public String getDonorName() {
        return donorName;
    }

    public String getFoodType() {
        return foodType;
    }

    public int getQuantity() {
        return quantity;
    }
}

class DonationManagementSystem {
    private List<FoodDonation> donations;

    public DonationManagementSystem() {
        donations = new ArrayList<>();
    }

    public void addDonation(String donorName, String foodType, int quantity) {
        FoodDonation donation = new FoodDonation(donorName, foodType, quantity);
        donations.add(donation);
        System.out.println("Donation added successfully!");
    }

    public void displayDonations() {
        if (donations.isEmpty()) {
            System.out.println("No donations found.");
            return;
        }

        System.out.println("Donations:");
        for (FoodDonation donation : donations) {
            System.out.println("Donor: " + donation.getDonorName());
            System.out.println("Food Type: " + donation.getFoodType());
            System.out.println("Quantity: " + donation.getQuantity());
            System.out.println("----------------------");
        }
    }
}

public class General{
    public static void main(String[] args) {
        DonationManagementSystem managementSystem = new DonationManagementSystem();

        // Example usage
        managementSystem.addDonation("John Doe", "Canned Goods", 10);
        managementSystem.addDonation("Jane Smith", "Produce", 5);
        managementSystem.addDonation("Mike Johnson", "Bakery", 3);

        managementSystem.displayDonations();
    }
}

