package pl.uni.lodz.math.morawski.marcin.factory;

import pl.uni.lodz.math.morawski.marcin.person.Person;

public class FactoryXML implements IDaoFactory {
    @Override
    public Person getPersonById(int id) {
        Person person = new Person(id, "Xemelek", "Xemelkowy");
        return person;
    }
}