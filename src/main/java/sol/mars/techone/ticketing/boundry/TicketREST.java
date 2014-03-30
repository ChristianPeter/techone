/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sol.mars.techone.ticketing.boundry;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author murdoc
 */
@Stateless
@Path("ticket")
public class TicketREST {
    
    @GET
    public String demo(){
        return "hello world";
    }
}
