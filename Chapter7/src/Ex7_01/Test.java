package Ex7_01;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer("KhaBeo");
        customer.setMemberType("Premium");

        Visit visit = new Visit(customer, new Date());
        visit.setServiceExpense(100.0);
        visit.setProductExpense(50.0);

        DiscountRate discountRate = new DiscountRate();
        double serviceDiscount = discountRate.getServiceDiscountRate(customer.getMemberType());
        double productDiscount = discountRate.getProductDiscountRate(customer.getMemberType());
        double totalExpense = (visit.getServiceExpense() * (1 - serviceDiscount)) +
                (visit.getProductExpense() * (1 - productDiscount));

        System.out.println("Customer Name: " + visit.getName());
        System.out.println("Membership Type: " + customer.getMemberType());
        System.out.println("Service Expense: " + visit.getServiceExpense());
        System.out.println("Service Discount: " + (serviceDiscount * 100) + "%");
        System.out.println("Product Expense: " + visit.getProductExpense());
        System.out.println("Product Discount: " + (productDiscount * 100) + "%");
        System.out.println("Total Expense: " + visit.getTotalExpense());
    }
}
