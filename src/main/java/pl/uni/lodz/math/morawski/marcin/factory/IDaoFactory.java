package pl.uni.lodz.math.morawski.marcin.factory;

import pl.uni.lodz.math.morawski.marcin.utils.Person;

public interface IDaoFactory {
    Person getPersonById(int id);
}
