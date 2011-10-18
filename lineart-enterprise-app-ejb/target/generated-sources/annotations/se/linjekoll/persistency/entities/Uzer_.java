package se.linjekoll.persistency.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.linjekoll.persistency.entities.Role;
import se.linjekoll.persistency.entities.superclasses.TimeStampedEntity_;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-10-18T12:55:56")
@StaticMetamodel(Uzer.class)
public class Uzer_ extends TimeStampedEntity_ {

    public static volatile SingularAttribute<Uzer, Integer> id;
    public static volatile SingularAttribute<Uzer, String> email;
    public static volatile SingularAttribute<Uzer, String> passwordSalt;
    public static volatile SingularAttribute<Uzer, String> name;
    public static volatile SingularAttribute<Uzer, Role> role;
    public static volatile SingularAttribute<Uzer, String> passwordHash;

}