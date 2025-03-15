public class pricecart {

    public static double calculateTotalPrice(int[] prices, boolean isPremiumMember) {
        double totalPrice = 0;

        
        for (int price : prices) {
            totalPrice += price;
        }

        if (isPremiumMember) {
            totalPrice *= 0.95; 
        }

        
        if (totalPrice > 5000) {
            totalPrice *= 0.90; 
        }

        return totalPrice;
    }

    public static void main(String[] args) {
        int[] prices = {2000, 1500, 1800, 1200}; 
        boolean isPremiumMember = true;         

        double finalPrice = calculateTotalPrice(prices, isPremiumMember);
        System.out.println("Final Total Price: ₹" + finalPrice);
    }
}
