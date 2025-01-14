/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.linjekoll.persistency.facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import se.linjekoll.persistency.entities.Line;

/**
 *
 * @author jesper
 */
@Stateless
public class LineFacade extends AbstractFacade<Line> {
    @PersistenceContext(unitName = "users_pu")
    private EntityManager em;

    protected EntityManager getEntityManager() {
        return em;
    }

    public LineFacade() {
        super(Line.class);
    }
    
}
