package Task3;

import java.util.ArrayList;

public class Main
{
    public static ArrayList<Customer> customers = new ArrayList<>();
    public static void main(String[] args)
    {
        customers.add(new Customer("Christian", "Sørensen", "Ruaffu"));
        customers.add(new Customer("Sarah", "Connor", "Skynet"));
        customers.add(new Customer("Monica", "Rambeau", "Photon"));
        customers.add(new Customer("John", "Spartan", "Chief"));
        customers.add(new Customer("Gordon", "Freeman", "Freeboi2000"));
        customers.add(new Customer("Wanda", "Maximoff", "ScarletWitch"));

        printCustomers();

        findCustomer(5);
    }

    public static void printCustomers()
    {
        for (Customer a: customers)
        {
            System.out.println(a);
        }
    }

    public static void findCustomer(int id)
    {
        for (Customer customer: customers)
        {
            if (customer.getId() == id)
            {
                System.out.println("Found customer with ID "+id +"\n"+ customer);
            }
        }
    }
}
