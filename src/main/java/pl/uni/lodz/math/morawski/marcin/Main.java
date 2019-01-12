package pl.uni.lodz.math.morawski.marcin;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import pl.uni.lodz.math.morawski.marcin.factory.DaoFactory;
import pl.uni.lodz.math.morawski.marcin.factory.SourceType;
import pl.uni.lodz.math.morawski.marcin.utils.Person;

public class Main {
    public static void main(String[] args) {

        DaoFactory daoFactory = new DaoFactory();

        SourceType sourceType = SourceType.Json;
        daoFactory.setSource(sourceType);

        Person person = daoFactory.getPersonById(1);

        Logger logger = Logger.getLogger(Main.class);
        BasicConfigurator.configure();
        logger.info(person.getId() + " " + person.getFirstName() + " " + person.getLastName());
    }
}
