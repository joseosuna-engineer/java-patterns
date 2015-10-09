package org.study.example.pattern.dao;

public class MainDAO {

    public static void main(String[] args) {
        try {
            CustomerDAO customerDAO = new CustomerDAOImpl();

            Customer customer = new Customer();
            customer.setEmail("joseosuna@email.org");
            customer.setName("Jose");

            customer = customerDAO.save(customer);

            System.out.println("Name: " + customer.getName());
            System.out.println("Email: " + customer.getEmail());
        } catch (Exception e) {
        }
    }
}
