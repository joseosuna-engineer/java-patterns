package com.prottonne.pattern;

import com.prottonne.pattern.dao.Customer;
import com.prottonne.pattern.dao.CustomerDAO;
import com.prottonne.pattern.dao.CustomerDAOImpl;
import com.prottonne.pattern.facade.Flight;
import com.prottonne.pattern.facade.FlightsAndHotels;
import com.prottonne.pattern.facade.Hotel;
import com.prottonne.pattern.facade.TravelFacade;
import com.prottonne.pattern.factory.abstracto.DocumentCreator;
import com.prottonne.pattern.factory.abstracto.DocumentType;
import com.prottonne.pattern.factory.abstracto.IDocumentCreator;
import com.prottonne.pattern.factory.abstracto.Resume;
import com.prottonne.pattern.factory.method.CardValidator;
import com.prottonne.pattern.factory.method.CreditCard;
import com.prottonne.pattern.factory.method.CreditCardType;
import com.prottonne.pattern.factory.method.CreditCardTypeException;
import com.prottonne.pattern.factory.method.ICardValidator;
import com.prottonne.pattern.singleton.Universe;
import java.util.Date;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        /**
         * DAO
         */
        CustomerDAO customerDAO = new CustomerDAOImpl();

        Customer customer = new Customer();
        customer.setEmail("john.doe@email.org");
        customer.setName("John");

        customer = customerDAO.save(customer);

        System.out.println("Name: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());

        /**
         * FACADE
         */
        Date from = new Date();
        Date to = new Date();
        TravelFacade travelFacade = new TravelFacade();
        FlightsAndHotels flightsAndHotels = travelFacade.getFlightsAndHotels(from, to);
        List<Flight> flights = flightsAndHotels.getFlights();
        List<Hotel> hotels = flightsAndHotels.getHotels();

        System.out.println("Flights:");
        for (Flight flight : flights) {
            System.out.println("Flight: " + flight.getNumber());
            System.out.println("Date: " + flight.getDate());
        }
        System.out.println("Hotels:");
        for (Hotel hotel : hotels) {
            System.out.println("Hotel: " + hotel.getName());
            System.out.println("Date: " + hotel.getDate());
        }

        /**
         * FACTORY
         */
        try {
            DocumentType userChoice = DocumentType.MOTHERN;
            IDocumentCreator factory = DocumentCreator.getDocumentCreator(userChoice);
            Resume mothernResume = factory.createResume();
            mothernResume.save();
        } catch (Exception ex) {
            System.out.println(ex);
        }

        /**
         * FACTORY METHOD
         */
        CreditCard creditCard = new CreditCard();
        creditCard.setType(CreditCardType.VISA);
        try {
            ICardValidator cardValidator = CardValidator.getCardValidator(creditCard);
            boolean valid = cardValidator.validate(creditCard);
            System.out.println(valid);
        } catch (CreditCardTypeException ex) {
            System.out.println(ex);
        }

        /**
         * SINGLETON
         */
        try {
            Universe godUniverse = Universe.getUniverse();
            Universe bigBangUniverse = Universe.getUniverse();

            godUniverse.setGalaxyCount(3);

            System.out.println("Galaxies in God Universe: " + godUniverse.getGalaxyCount());
            System.out.println("Galaxies in Big Bang Universe: " + bigBangUniverse.getGalaxyCount());
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

}
