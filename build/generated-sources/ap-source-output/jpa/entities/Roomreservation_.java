package jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entities.Club;
import jpa.entities.Room;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-04-27T17:05:49")
@StaticMetamodel(Roomreservation.class)
public class Roomreservation_ { 

    public static volatile SingularAttribute<Roomreservation, Integer> roomreservationid;
    public static volatile SingularAttribute<Roomreservation, Integer> numberofguests;
    public static volatile SingularAttribute<Roomreservation, Club> clubid;
    public static volatile SingularAttribute<Roomreservation, String> reservationenddatetime;
    public static volatile SingularAttribute<Roomreservation, String> reservationstartdatetime;
    public static volatile SingularAttribute<Roomreservation, Room> roomid;

}