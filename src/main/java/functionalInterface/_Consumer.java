package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        System.out.println("//Normal java function");
        Customer maria = new Customer("Maria", "999999");
        greetCustomer(maria);

        greetCustomerV2(maria, true);


        System.out.println("// Consumer Functional interface");
        greetCustomerConsumer.accept(maria);

        System.out.println("//BiConsumer Functional interface");
        greetCustomerConsumerV2.accept(maria, true);

    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = ((customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName + ", thanks for registering phone number "
                    + (showPhoneNumber ? customer.customerPhoneNumber : "********")));

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber);




    static void greetCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName + ", thanks for registering phone number " + customer.customerPhoneNumber);
    }


    static void greetCustomerV2(Customer customer, boolean showPhoneNumber){
        System.out.println("Hello " + customer.customerName + ", thanks for registering phone number "
                + (showPhoneNumber ? customer.customerPhoneNumber : "********"));
    }


    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }

}
