/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appone;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author This PC
 */
@Entity
@Table(name = "course", catalog = "civesystem", schema = "")
@NamedQueries({
    @NamedQuery(name = "Course.findAll", query = "SELECT c FROM Course c")
    , @NamedQuery(name = "Course.findByCoid", query = "SELECT c FROM Course c WHERE c.coid = :coid")
    , @NamedQuery(name = "Course.findByConame", query = "SELECT c FROM Course c WHERE c.coname = :coname")
    , @NamedQuery(name = "Course.findByCocre", query = "SELECT c FROM Course c WHERE c.cocre = :cocre")
    , @NamedQuery(name = "Course.findByDeptid", query = "SELECT c FROM Course c WHERE c.deptid = :deptid")})
public class Course implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COID")
    private String coid;
    @Basic(optional = false)
    @Column(name = "CONAME")
    private String coname;
    @Basic(optional = false)
    @Column(name = "COCRE")
    private String cocre;
    @Basic(optional = false)
    @Column(name = "DEPTID")
    private String deptid;

    public Course() {
    }

    public Course(String coid) {
        this.coid = coid;
    }

    public Course(String coid, String coname, String cocre, String deptid) {
        this.coid = coid;
        this.coname = coname;
        this.cocre = cocre;
        this.deptid = deptid;
    }

    public String getCoid() {
        return coid;
    }

    public void setCoid(String coid) {
        String oldCoid = this.coid;
        this.coid = coid;
        changeSupport.firePropertyChange("coid", oldCoid, coid);
    }

    public String getConame() {
        return coname;
    }

    public void setConame(String coname) {
        String oldConame = this.coname;
        this.coname = coname;
        changeSupport.firePropertyChange("coname", oldConame, coname);
    }

    public String getCocre() {
        return cocre;
    }

    public void setCocre(String cocre) {
        String oldCocre = this.cocre;
        this.cocre = cocre;
        changeSupport.firePropertyChange("cocre", oldCocre, cocre);
    }

    public String getDeptid() {
        return deptid;
    }

    public void setDeptid(String deptid) {
        String oldDeptid = this.deptid;
        this.deptid = deptid;
        changeSupport.firePropertyChange("deptid", oldDeptid, deptid);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coid != null ? coid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Course)) {
            return false;
        }
        Course other = (Course) object;
        if ((this.coid == null && other.coid != null) || (this.coid != null && !this.coid.equals(other.coid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "appone.Course[ coid=" + coid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
