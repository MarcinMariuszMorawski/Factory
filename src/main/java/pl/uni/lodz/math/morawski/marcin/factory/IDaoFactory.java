package pl.uni.lodz.math.morawski.marcin.factory;

import pl.uni.lodz.math.morawski.marcin.person.Person;

public interface IDaoFactory {
    Person getPersonById(int id);
}
