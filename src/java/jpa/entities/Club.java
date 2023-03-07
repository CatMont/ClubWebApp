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
@Table(name = "CLUB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Club.findAll", query = "SELECT c FROM Club c"),
    @NamedQuery(name = "Club.findByClubid", query = "SELECT c FROM Club c WHERE c.clubid = :clubid"),
    @NamedQuery(name = "Club.findByClubname", query = "SELECT c FROM Club c WHERE c.clubname = :clubname"),
    @NamedQuery(name = "Club.findByClubregularmeetingdays", query = "SELECT c FROM Club c WHERE c.clubregularmeetingdays = :clubregularmeetingdays"),
    @NamedQuery(name = "Club.findByClubregularmeetingtimes", query = "SELECT c FROM Club c WHERE c.clubregularmeetingtimes = :clubregularmeetingtimes"),
    @NamedQuery(name = "Club.findByClubpresident", query = "SELECT c FROM Club c WHERE c.clubpresident = :clubpresident"),
    @NamedQuery(name = "Club.findByClubmembercount", query = "SELECT c FROM Club c WHERE c.clubmembercount = :clubmembercount")})
public class Club implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CLUBID")
    private Integer clubid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "CLUBNAME")
    private String clubname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "CLUBREGULARMEETINGDAYS")
    private String clubregularmeetingdays;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "CLUBREGULARMEETINGTIMES")
    private String clubregularmeetingtimes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "CLUBPRESIDENT")
    private String clubpresident;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CLUBMEMBERCOUNT")
    private int clubmembercount;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clubid")
    private Collection<Roomreservation> roomreservationCollection;

    public Club() {
    }

    public Club(Integer clubid) {
        this.clubid = clubid;
    }

    public Club(Integer clubid, String clubname, String clubregularmeetingdays, String clubregularmeetingtimes, String clubpresident, int clubmembercount) {
        this.clubid = clubid;
        this.clubname = clubname;
        this.clubregularmeetingdays = clubregularmeetingdays;
        this.clubregularmeetingtimes = clubregularmeetingtimes;
        this.clubpresident = clubpresident;
        this.clubmembercount = clubmembercount;
    }

    public Integer getClubid() {
        return clubid;
    }

    public void setClubid(Integer clubid) {
        this.clubid = clubid;
    }

    public String getClubname() {
        return clubname;
    }

    public void setClubname(String clubname) {
        this.clubname = clubname;
    }

    public String getClubregularmeetingdays() {
        return clubregularmeetingdays;
    }

    public void setClubregularmeetingdays(String clubregularmeetingdays) {
        this.clubregularmeetingdays = clubregularmeetingdays;
    }

    public String getClubregularmeetingtimes() {
        return clubregularmeetingtimes;
    }

    public void setClubregularmeetingtimes(String clubregularmeetingtimes) {
        this.clubregularmeetingtimes = clubregularmeetingtimes;
    }

    public String getClubpresident() {
        return clubpresident;
    }

    public void setClubpresident(String clubpresident) {
        this.clubpresident = clubpresident;
    }

    public int getClubmembercount() {
        return clubmembercount;
    }

    public void setClubmembercount(int clubmembercount) {
        this.clubmembercount = clubmembercount;
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
        hash += (clubid != null ? clubid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Club)) {
            return false;
        }
        Club other = (Club) object;
        if ((this.clubid == null && other.clubid != null) || (this.clubid != null && !this.clubid.equals(other.clubid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return clubid + "-" + clubname;
    }
    
}
