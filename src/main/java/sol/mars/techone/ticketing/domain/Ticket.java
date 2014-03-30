/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sol.mars.techone.ticketing.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import sol.mars.techone.common.domain.AbstractEntity;

/**
 *
 * @author murdoc
 */
@Entity
@Table(name = "TC_TICKET")
public class Ticket extends AbstractEntity implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private String subject;
    private String description;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
