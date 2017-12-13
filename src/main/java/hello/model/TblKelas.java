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
@Table(name = "tbl_kelas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblKelas.findAll", query = "SELECT t FROM TblKelas t")
    , @NamedQuery(name = "TblKelas.findByKdKelas", query = "SELECT t FROM TblKelas t WHERE t.kdKelas = :kdKelas")
    , @NamedQuery(name = "TblKelas.findByNip", query = "SELECT t FROM TblKelas t WHERE t.nip = :nip")
    , @NamedQuery(name = "TblKelas.findByNmKelas", query = "SELECT t FROM TblKelas t WHERE t.nmKelas = :nmKelas")
    , @NamedQuery(name = "TblKelas.findByKapasitas", query = "SELECT t FROM TblKelas t WHERE t.kapasitas = :kapasitas")})
public class TblKelas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "kd_kelas")
    private String kdKelas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nip")
    private String nip;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nm_kelas")
    private String nmKelas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "kapasitas")
    private int kapasitas;

    public TblKelas() {
    }

    public TblKelas(String kdKelas) {
        this.kdKelas = kdKelas;
    }

    public TblKelas(String kdKelas, String nip, String nmKelas, int kapasitas) {
        this.kdKelas = kdKelas;
        this.nip = nip;
        this.nmKelas = nmKelas;
        this.kapasitas = kapasitas;
    }

    public String getKdKelas() {
        return kdKelas;
    }

    public void setKdKelas(String kdKelas) {
        this.kdKelas = kdKelas;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNmKelas() {
        return nmKelas;
    }

    public void setNmKelas(String nmKelas) {
        this.nmKelas = nmKelas;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (kdKelas != null ? kdKelas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblKelas)) {
            return false;
        }
        TblKelas other = (TblKelas) object;
        if ((this.kdKelas == null && other.kdKelas != null) || (this.kdKelas != null && !this.kdKelas.equals(other.kdKelas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hello.TblKelas[ kdKelas=" + kdKelas + " ]";
    }
    
}
