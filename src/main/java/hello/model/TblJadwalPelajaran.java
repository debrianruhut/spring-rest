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
@Table(name = "tbl_jadwal_pelajaran")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblJadwalPelajaran.findAll", query = "SELECT t FROM TblJadwalPelajaran t")
    , @NamedQuery(name = "TblJadwalPelajaran.findByIdJadwalPelajaran", query = "SELECT t FROM TblJadwalPelajaran t WHERE t.idJadwalPelajaran = :idJadwalPelajaran")
    , @NamedQuery(name = "TblJadwalPelajaran.findByKdKelas", query = "SELECT t FROM TblJadwalPelajaran t WHERE t.kdKelas = :kdKelas")
    , @NamedQuery(name = "TblJadwalPelajaran.findByKdPelajaran", query = "SELECT t FROM TblJadwalPelajaran t WHERE t.kdPelajaran = :kdPelajaran")
    , @NamedQuery(name = "TblJadwalPelajaran.findByNip", query = "SELECT t FROM TblJadwalPelajaran t WHERE t.nip = :nip")
    , @NamedQuery(name = "TblJadwalPelajaran.findByHari", query = "SELECT t FROM TblJadwalPelajaran t WHERE t.hari = :hari")
    , @NamedQuery(name = "TblJadwalPelajaran.findByJamMulai", query = "SELECT t FROM TblJadwalPelajaran t WHERE t.jamMulai = :jamMulai")
    , @NamedQuery(name = "TblJadwalPelajaran.findByJamSelesai", query = "SELECT t FROM TblJadwalPelajaran t WHERE t.jamSelesai = :jamSelesai")})
public class TblJadwalPelajaran implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_jadwal_pelajaran")
    private Integer idJadwalPelajaran;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "kd_kelas")
    private String kdKelas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "kd_pelajaran")
    private String kdPelajaran;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nip")
    private String nip;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "hari")
    private String hari;
    @Basic(optional = false)
    @NotNull
    @Column(name = "jam_mulai")
    @Temporal(TemporalType.TIME)
    private Date jamMulai;
    @Basic(optional = false)
    @NotNull
    @Column(name = "jam_selesai")
    @Temporal(TemporalType.TIME)
    private Date jamSelesai;

    public TblJadwalPelajaran() {
    }

    public TblJadwalPelajaran(Integer idJadwalPelajaran) {
        this.idJadwalPelajaran = idJadwalPelajaran;
    }

    public TblJadwalPelajaran(Integer idJadwalPelajaran, String kdKelas, String kdPelajaran, String nip, String hari, Date jamMulai, Date jamSelesai) {
        this.idJadwalPelajaran = idJadwalPelajaran;
        this.kdKelas = kdKelas;
        this.kdPelajaran = kdPelajaran;
        this.nip = nip;
        this.hari = hari;
        this.jamMulai = jamMulai;
        this.jamSelesai = jamSelesai;
    }

    public Integer getIdJadwalPelajaran() {
        return idJadwalPelajaran;
    }

    public void setIdJadwalPelajaran(Integer idJadwalPelajaran) {
        this.idJadwalPelajaran = idJadwalPelajaran;
    }

    public String getKdKelas() {
        return kdKelas;
    }

    public void setKdKelas(String kdKelas) {
        this.kdKelas = kdKelas;
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

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public Date getJamMulai() {
        return jamMulai;
    }

    public void setJamMulai(Date jamMulai) {
        this.jamMulai = jamMulai;
    }

    public Date getJamSelesai() {
        return jamSelesai;
    }

    public void setJamSelesai(Date jamSelesai) {
        this.jamSelesai = jamSelesai;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJadwalPelajaran != null ? idJadwalPelajaran.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblJadwalPelajaran)) {
            return false;
        }
        TblJadwalPelajaran other = (TblJadwalPelajaran) object;
        if ((this.idJadwalPelajaran == null && other.idJadwalPelajaran != null) || (this.idJadwalPelajaran != null && !this.idJadwalPelajaran.equals(other.idJadwalPelajaran))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hello.TblJadwalPelajaran[ idJadwalPelajaran=" + idJadwalPelajaran + " ]";
    }
    
}
