/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author turta
 */
@Entity
@Table(name = "ROOMRESERVATION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Roomreservation.findAll", query = "SELECT r FROM Roomreservation r"),
    @NamedQuery(name = "Roomreservation.findByRoomreservationid", query = "SELECT r FROM Roomreservation r WHERE r.roomreservationid = :roomreservationid"),
    @NamedQuery(name = "Roomreservation.findByReservationstartdatetime", query = "SELECT r FROM Roomreservation r WHERE r.reservationstartdatetime = :reservationstartdatetime"),
    @NamedQuery(name = "Roomreservation.findByReservationenddatetime", query = "SELECT r FROM Roomreservation r WHERE r.reservationenddatetime = :reservationenddatetime"),
    @NamedQuery(name = "Roomreservation.findByNumberofguests", query = "SELECT r FROM Roomreservation r WHERE r.numberofguests = :numberofguests")})
public class Roomreservation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ROOMRESERVATIONID")
    private Integer roomreservationid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "RESERVATIONSTARTDATETIME")
    private String reservationstartdatetime;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "RESERVATIONENDDATETIME")
    private String reservationenddatetime;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMBEROFGUESTS")
    private int numberofguests;
    @JoinColumn(name = "CLUBID", referencedColumnName = "CLUBID")
    @ManyToOne(optional = false)
    private Club clubid;
    @JoinColumn(name = "ROOMID", referencedColumnName = "ROOMID")
    @ManyToOne(optional = false)
    private Room roomid;

    public Roomreservation() {
    }

    public Roomreservation(Integer roomreservationid) {
        this.roomreservationid = roomreservationid;
    }

    public Roomreservation(Integer roomreservationid, String reservationstartdatetime, String reservationenddatetime, int numberofguests) {
        this.roomreservationid = roomreservationid;
        this.reservationstartdatetime = reservationstartdatetime;
        this.reservationenddatetime = reservationenddatetime;
        this.numberofguests = numberofguests;
    }

    public Integer getRoomreservationid() {
        return roomreservationid;
    }

    public void setRoomreservationid(Integer roomreservationid) {
        this.roomreservationid = roomreservationid;
    }

    public String getReservationstartdatetime() {
        return reservationstartdatetime;
    }

    public void setReservationstartdatetime(String reservationstartdatetime) {
        this.reservationstartdatetime = reservationstartdatetime;
    }

    public String getReservationenddatetime() {
        return reservationenddatetime;
    }

    public void setReservationenddatetime(String reservationenddatetime) {
        this.reservationenddatetime = reservationenddatetime;
    }

    public int getNumberofguests() {
        return numberofguests;
    }

    public void setNumberofguests(int numberofguests) {
        this.numberofguests = numberofguests;
    }

    public Club getClubid() {
        return clubid;
    }

    public void setClubid(Club clubid) {
        this.clubid = clubid;
    }

    public Room getRoomid() {
        return roomid;
    }

    public void setRoomid(Room roomid) {
        this.roomid = roomid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (roomreservationid != null ? roomreservationid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Roomreservation)) {
            return false;
        }
        Roomreservation other = (Roomreservation) object;
        if ((this.roomreservationid == null && other.roomreservationid != null) || (this.roomreservationid != null && !this.roomreservationid.equals(other.roomreservationid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.Roomreservation[ roomreservationid=" + roomreservationid + " ]";
    }
    
}
