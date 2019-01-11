package pl.uni.lodz.math.morawski.marcin.factory;

import pl.uni.lodz.math.morawski.marcin.utils.Person;

public class FactoryDataBase implements IDaoFactory {
    @Override
    public Person getPersonById(int id) {
        Person person = new Person(id, "Databasek", "Databaskowy");
        return person;
    }
}