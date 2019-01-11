package pl.uni.lodz.math.morawski.marcin.factory;

import pl.uni.lodz.math.morawski.marcin.utils.Person;

public class FactoryXML implements IDaoFactory {
    @Override
    public Person getPersonById(int id) {
        Person person = new Person(id, "Xemelek", "Xemelkowy");
        return person;
    }
}