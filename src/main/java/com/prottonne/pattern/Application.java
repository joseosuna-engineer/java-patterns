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
import java.time.LocalDateTime;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements ApplicationRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private static final String ERROR_MSG = "some error";

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(ApplicationArguments arg0) throws Exception {

        /**
         * DAO
         */
        CustomerDAO customerDAO = new CustomerDAOImpl();

        Customer customer = new Customer();
        customer.setEmail("john.doe@email.org");
        customer.setName("John");

        customer = customerDAO.save(customer);

        logger.info("Name: {}", customer.getName());
        logger.info("Email: {}", customer.getEmail());

        /**
         * FACADE
         */
        LocalDateTime from = LocalDateTime.now();
        LocalDateTime to = from.plusMonths(6);
        TravelFacade travelFacade = new TravelFacade();
        FlightsAndHotels flightsAndHotels = travelFacade.getFlightsAndHotels(from, to);
        List<Flight> flights = flightsAndHotels.getFlights();
        List<Hotel> hotels = flightsAndHotels.getHotels();

        logger.info("Flights:");
        for (Flight flight : flights) {
            logger.info("Flight: {}", flight.getNumber());
            logger.info("Date: {}", flight.getDate());
        }
        logger.info("Hotels:");
        for (Hotel hotel : hotels) {
            logger.info("Hotel: {}", hotel.getName());
            logger.info("Date: {}", hotel.getDate());
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
            logger.error(ERROR_MSG, ex);
        }

        /**
         * FACTORY METHOD
         */
        CreditCard creditCard = new CreditCard();
        creditCard.setType(CreditCardType.VISA);
        try {
            ICardValidator cardValidator = CardValidator.getCardValidator(creditCard);
            boolean valid = cardValidator.validate(creditCard);
            logger.info("valid={}", valid);
        } catch (CreditCardTypeException ex) {
            logger.error(ERROR_MSG, ex);
        }

        /**
         * SINGLETON
         */
        try {
            Universe godUniverse = Universe.getUniverse();
            Universe bigBangUniverse = Universe.getUniverse();

            godUniverse.setGalaxyCount(3);

            logger.info("Galaxies in God Universe: {}", godUniverse.getGalaxyCount());
            logger.info("Galaxies in Big Bang Universe: {}", bigBangUniverse.getGalaxyCount());
        } catch (Exception ex) {
            logger.error(ERROR_MSG, ex);
        }

    }

}
