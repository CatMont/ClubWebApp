package jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entities.Roomreservation;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-04-27T17:05:49")
@StaticMetamodel(Club.class)
public class Club_ { 

    public static volatile SingularAttribute<Club, String> clubregularmeetingtimes;
    public static volatile SingularAttribute<Club, String> clubname;
    public static volatile SingularAttribute<Club, String> clubregularmeetingdays;
    public static volatile SingularAttribute<Club, Integer> clubid;
    public static volatile SingularAttribute<Club, String> clubpresident;
    public static volatile CollectionAttribute<Club, Roomreservation> roomreservationCollection;
    public static volatile SingularAttribute<Club, Integer> clubmembercount;

}