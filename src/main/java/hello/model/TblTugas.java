/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author debrian
 */
@Entity
@Table(name = "tbl_tugas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblTugas.findAll", query = "SELECT t FROM TblTugas t")
    , @NamedQuery(name = "TblTugas.findByIdTugas", query = "SELECT t FROM TblTugas t WHERE t.idTugas = :idTugas")
    , @NamedQuery(name = "TblTugas.findByNip", query = "SELECT t FROM TblTugas t WHERE t.nip = :nip")
    , @NamedQuery(name = "TblTugas.findByKdPelajaran", query = "SELECT t FROM TblTugas t WHERE t.kdPelajaran = :kdPelajaran")
    , @NamedQuery(name = "TblTugas.findByKdKelas", query = "SELECT t FROM TblTugas t WHERE t.kdKelas = :kdKelas")
    , @NamedQuery(name = "TblTugas.findByBatasWaktu", query = "SELECT t FROM TblTugas t WHERE t.batasWaktu = :batasWaktu")})
public class TblTugas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tugas")
    private Integer idTugas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nip")
    private String nip;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "kd_pelajaran")
    private String kdPelajaran;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "kd_kelas")
    private String kdKelas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "batas_waktu")
    @Temporal(TemporalType.TIMESTAMP)
    private Date batasWaktu;

    public TblTugas() {
    }

    public TblTugas(Integer idTugas) {
        this.idTugas = idTugas;
    }

    public TblTugas(Integer idTugas, String nip, String kdPelajaran, String kdKelas, Date batasWaktu) {
        this.idTugas = idTugas;
        this.nip = nip;
        this.kdPelajaran = kdPelajaran;
        this.kdKelas = kdKelas;
        this.batasWaktu = batasWaktu;
    }

    public Integer getIdTugas() {
        return idTugas;
    }

    public void setIdTugas(Integer idTugas) {
        this.idTugas = idTugas;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getKdPelajaran() {
        return kdPelajaran;
    }

    public void setKdPelajaran(String kdPelajaran) {
        this.kdPelajaran = kdPelajaran;
    }

    public String getKdKelas() {
        return kdKelas;
    }

    public void setKdKelas(String kdKelas) {
        this.kdKelas = kdKelas;
    }

    public Date getBatasWaktu() {
        return batasWaktu;
    }

    public void setBatasWaktu(Date batasWaktu) {
        this.batasWaktu = batasWaktu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTugas != null ? idTugas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblTugas)) {
            return false;
        }
        TblTugas other = (TblTugas) object;
        if ((this.idTugas == null && other.idTugas != null) || (this.idTugas != null && !this.idTugas.equals(other.idTugas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hello.TblTugas[ idTugas=" + idTugas + " ]";
    }
    
}
