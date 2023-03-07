/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author turta
 */
@Entity
@Table(name = "ROOM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Room.findAll", query = "SELECT r FROM Room r"),
    @NamedQuery(name = "Room.findByRoomid", query = "SELECT r FROM Room r WHERE r.roomid = :roomid"),
    @NamedQuery(name = "Room.findByRoomname", query = "SELECT r FROM Room r WHERE r.roomname = :roomname"),
    @NamedQuery(name = "Room.findByRoomlocation", query = "SELECT r FROM Room r WHERE r.roomlocation = :roomlocation"),
    @NamedQuery(name = "Room.findByRoomcapacity", query = "SELECT r FROM Room r WHERE r.roomcapacity = :roomcapacity")})
public class Room implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ROOMID")
    private Integer roomid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "ROOMNAME")
    private String roomname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "ROOMLOCATION")
    private String roomlocation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ROOMCAPACITY")
    private int roomcapacity;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "roomid")
    private Collection<Roomreservation> roomreservationCollection;

    public Room() {
    }

    public Room(Integer roomid) {
        this.roomid = roomid;
    }

    public Room(Integer roomid, String roomname, String roomlocation, int roomcapacity) {
        this.roomid = roomid;
        this.roomname = roomname;
        this.roomlocation = roomlocation;
        this.roomcapacity = roomcapacity;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public String getRoomlocation() {
        return roomlocation;
    }

    public void setRoomlocation(String roomlocation) {
        this.roomlocation = roomlocation;
    }

    public int getRoomcapacity() {
        return roomcapacity;
    }

    public void setRoomcapacity(int roomcapacity) {
        this.roomcapacity = roomcapacity;
    }

    @XmlTransient
    public Collection<Roomreservation> getRoomreservationCollection() {
        return roomreservationCollection;
    }

    public void setRoomreservationCollection(Collection<Roomreservation> roomreservationCollection) {
        this.roomreservationCollection = roomreservationCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roomid != null ? roomid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Room)) {
            return false;
        }
        Room other = (Room) object;
        if ((this.roomid == null && other.roomid != null) || (this.roomid != null && !this.roomid.equals(other.roomid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return roomid+"-"+roomname;
    }
    
}
