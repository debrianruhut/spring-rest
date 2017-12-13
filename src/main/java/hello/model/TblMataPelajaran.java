/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.model;

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
 * @author debrian
 */
@Entity
@Table(name = "tbl_mata_pelajaran")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblMataPelajaran.findAll", query = "SELECT t FROM TblMataPelajaran t")
    , @NamedQuery(name = "TblMataPelajaran.findByKdPelajaran", query = "SELECT t FROM TblMataPelajaran t WHERE t.kdPelajaran = :kdPelajaran")
    , @NamedQuery(name = "TblMataPelajaran.findByNmMapel", query = "SELECT t FROM TblMataPelajaran t WHERE t.nmMapel = :nmMapel")
    , @NamedQuery(name = "TblMataPelajaran.findByNip", query = "SELECT t FROM TblMataPelajaran t WHERE t.nip = :nip")})
public class TblMataPelajaran implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "kd_pelajaran")
    private String kdPelajaran;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "nm_mapel")
    private String nmMapel;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nip")
    private String nip;

    public TblMataPelajaran() {
    }

    public TblMataPelajaran(String kdPelajaran) {
        this.kdPelajaran = kdPelajaran;
    }

    public TblMataPelajaran(String kdPelajaran, String nmMapel, String nip) {
        this.kdPelajaran = kdPelajaran;
        this.nmMapel = nmMapel;
        this.nip = nip;
    }

    public String getKdPelajaran() {
        return kdPelajaran;
    }

    public void setKdPelajaran(String kdPelajaran) {
        this.kdPelajaran = kdPelajaran;
    }

    public String getNmMapel() {
        return nmMapel;
    }

    public void setNmMapel(String nmMapel) {
        this.nmMapel = nmMapel;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kdPelajaran != null ? kdPelajaran.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblMataPelajaran)) {
            return false;
        }
        TblMataPelajaran other = (TblMataPelajaran) object;
        if ((this.kdPelajaran == null && other.kdPelajaran != null) || (this.kdPelajaran != null && !this.kdPelajaran.equals(other.kdPelajaran))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hello.TblMataPelajaran[ kdPelajaran=" + kdPelajaran + " ]";
    }
    
}
