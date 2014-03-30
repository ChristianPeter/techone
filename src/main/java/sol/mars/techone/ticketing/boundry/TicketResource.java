/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sol.mars.techone.ticketing.boundry;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import sol.mars.techone.ticketing.domain.Ticket;

/**
 *
 * @author murdoc
 */
@Stateless
public class TicketResource {
    
    @PersistenceContext
    EntityManager em;
    
    private Ticket findById(long id){
        final Ticket result = em.find(Ticket.class, id);
        return result;
    }
    
    private List<Ticket> findAll(){
        final TypedQuery<Ticket> query = em.createQuery("select t from Ticket t", Ticket.class);
        final List<Ticket> resultList = query.getResultList();
        
        return resultList;
    }
    
    
    public void persistNewTicket(Ticket ticket){
        em.persist(ticket);
    }
    
    
    
}
