/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpa.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import jpa.entities.Club;

/**
 *
 * @author turta
 */
@Stateless
public class ClubFacade extends AbstractFacade<Club> {

    @PersistenceContext(unitName = "WebApplicationClubPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClubFacade() {
        super(Club.class);
    }
    
}
