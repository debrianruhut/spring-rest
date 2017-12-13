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
import javax.persistence.Lob;
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
@Table(name = "tbl_materi_ajar")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblMateriAjar.findAll", query = "SELECT t FROM TblMateriAjar t")
    , @NamedQuery(name = "TblMateriAjar.findByIdMateriAjar", query = "SELECT t FROM TblMateriAjar t WHERE t.idMateriAjar = :idMateriAjar")
    , @NamedQuery(name = "TblMateriAjar.findByKdPelajaran", query = "SELECT t FROM TblMateriAjar t WHERE t.kdPelajaran = :kdPelajaran")
    , @NamedQuery(name = "TblMateriAjar.findByNip", query = "SELECT t FROM TblMateriAjar t WHERE t.nip = :nip")
    , @NamedQuery(name = "TblMateriAjar.findByKdKelas", query = "SELECT t FROM TblMateriAjar t WHERE t.kdKelas = :kdKelas")
    , @NamedQuery(name = "TblMateriAjar.findByFileMateriAjar", query = "SELECT t FROM TblMateriAjar t WHERE t.fileMateriAjar = :fileMateriAjar")
    , @NamedQuery(name = "TblMateriAjar.findByTanggal", query = "SELECT t FROM TblMateriAjar t WHERE t.tanggal = :tanggal")})
public class TblMateriAjar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_materi_ajar")
    private Integer idMateriAjar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "kd_pelajaran")
    private String kdPelajaran;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nip")
    private String nip;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "kd_kelas")
    private String kdKelas;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "keterangan")
    private String keterangan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "file_materi_ajar")
    private String fileMateriAjar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tanggal")
    @Temporal(TemporalType.DATE)
    private Date tanggal;

    public TblMateriAjar() {
    }

    public TblMateriAjar(Integer idMateriAjar) {
        this.idMateriAjar = idMateriAjar;
    }

    public TblMateriAjar(Integer idMateriAjar, String kdPelajaran, String nip, String kdKelas, String keterangan, String fileMateriAjar, Date tanggal) {
        this.idMateriAjar = idMateriAjar;
        this.kdPelajaran = kdPelajaran;
        this.nip = nip;
        this.kdKelas = kdKelas;
        this.keterangan = keterangan;
        this.fileMateriAjar = fileMateriAjar;
        this.tanggal = tanggal;
    }

    public Integer getIdMateriAjar() {
        return idMateriAjar;
    }

    public void setIdMateriAjar(Integer idMateriAjar) {
        this.idMateriAjar = idMateriAjar;
    }

    public String getKdPelajaran() {
        return kdPelajaran;
    }

    public void setKdPelajaran(String kdPelajaran) {
        this.kdPelajaran = kdPelajaran;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getKdKelas() {
        return kdKelas;
    }

    public void setKdKelas(String kdKelas) {
        this.kdKelas = kdKelas;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getFileMateriAjar() {
        return fileMateriAjar;
    }

    public void setFileMateriAjar(String fileMateriAjar) {
        this.fileMateriAjar = fileMateriAjar;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMateriAjar != null ? idMateriAjar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblMateriAjar)) {
            return false;
        }
        TblMateriAjar other = (TblMateriAjar) object;
        if ((this.idMateriAjar == null && other.idMateriAjar != null) || (this.idMateriAjar != null && !this.idMateriAjar.equals(other.idMateriAjar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hello.TblMateriAjar[ idMateriAjar=" + idMateriAjar + " ]";
    }
    
}
