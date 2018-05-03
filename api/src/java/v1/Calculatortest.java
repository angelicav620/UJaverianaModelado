/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package v1;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author angie
 */
@Entity
@Table(name = "CALCULATORTEST")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Calculatortest.findAll", query = "SELECT c FROM Calculatortest c"),
    @NamedQuery(name = "Calculatortest.findByIdtbl", query = "SELECT c FROM Calculatortest c WHERE c.idtbl = :idtbl"),
    @NamedQuery(name = "Calculatortest.findByOperacion", query = "SELECT c FROM Calculatortest c WHERE c.operacion = :operacion"),
    @NamedQuery(name = "Calculatortest.findByNum1", query = "SELECT c FROM Calculatortest c WHERE c.num1 = :num1"),
    @NamedQuery(name = "Calculatortest.findByNum2", query = "SELECT c FROM Calculatortest c WHERE c.num2 = :num2")})
public class Calculatortest implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDTBL")
    private Integer idtbl;
    @Size(max = 20)
    @Column(name = "OPERACION")
    private String operacion;
    @Column(name = "NUM1")
    private Integer num1;
    @Column(name = "NUM2")
    private Integer num2;

    public Calculatortest() {
    }

    public Calculatortest(Integer idtbl) {
        this.idtbl = idtbl;
    }

    public Integer getIdtbl() {
        return idtbl;
    }

    public void setIdtbl(Integer idtbl) {
        this.idtbl = idtbl;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtbl != null ? idtbl.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Calculatortest)) {
            return false;
        }
        Calculatortest other = (Calculatortest) object;
        if ((this.idtbl == null && other.idtbl != null) || (this.idtbl != null && !this.idtbl.equals(other.idtbl))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "v1.Calculatortest[ idtbl=" + idtbl + " ]";
    }
    
}
