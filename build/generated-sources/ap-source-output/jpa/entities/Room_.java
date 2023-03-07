package jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entities.Roomreservation;

@Generated(value="EclipseLink-2.7.7.v20200504-rNA", date="2022-04-27T17:05:48")
@StaticMetamodel(Room.class)
public class Room_ { 

    public static volatile SingularAttribute<Room, String> roomlocation;
    public static volatile SingularAttribute<Room, Integer> roomcapacity;
    public static volatile SingularAttribute<Room, String> roomname;
    public static volatile CollectionAttribute<Room, Roomreservation> roomreservationCollection;
    public static volatile SingularAttribute<Room, Integer> roomid;

}