/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sol.mars.techone.common.domain;

import java.io.Serializable;


public interface PersistentEntity <PK extends Serializable> extends Serializable {

    PK getId();

    boolean isNew();
    
}
