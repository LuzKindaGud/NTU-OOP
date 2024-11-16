package Ex7_01;

import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, Date date){
        this.customer = customer;
        this.date = date;
    }

    public String getName(){
        return customer.getName();
    }

    public double getServiceExpense(){
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense(){
        return productExpense + serviceExpense;
    }

    public String toString(){
        return customer.toString() + "[Service Expense= " + serviceExpense+ ", Product Expense= "+ productExpense + ", Total = " + getTotalExpense();
    }
}
