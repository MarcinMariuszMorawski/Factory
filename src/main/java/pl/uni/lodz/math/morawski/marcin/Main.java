package pl.uni.lodz.math.morawski.marcin;


import pl.uni.lodz.math.morawski.marcin.factory.DaoFactory;
import pl.uni.lodz.math.morawski.marcin.factory.IDaoFactory;
import pl.uni.lodz.math.morawski.marcin.person.Person;

public class Main {
    public static void main(String[] args) {
        IDaoFactory daoFactory = new DaoFactory();
        daoFactory.setSource("Json");
        Person person = daoFactory.getPersonById(1);
    }
}
