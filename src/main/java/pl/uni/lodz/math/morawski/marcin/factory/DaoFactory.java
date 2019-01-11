package pl.uni.lodz.math.morawski.marcin.factory;

import pl.uni.lodz.math.morawski.marcin.utils.Person;

import java.util.HashMap;
import java.util.Map;

public class DaoFactory implements IDaoFactory {
    private Map<SourceType, IDaoFactory> daoMap = new HashMap<>();
    IDaoFactory factory;

    public DaoFactory() {
        newMapping();
    }

    private void newMapping() {
        daoMap.put(SourceType.XML, new FactoryXML());
        daoMap.put(SourceType.DataBase, new FactoryDataBase());
        daoMap.put(SourceType.Json, new FactoryJson());
    }

    public void setSource(String source) {
        factory = daoMap.get(SourceType.valueOf(source));
    }

    @Override
    public Person getPersonById(int id) {
        return factory.getPersonById(id);
    }
}