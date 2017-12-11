/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

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
@Table(name = "tbl_jawaban_tugas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblJawabanTugas.findAll", query = "SELECT t FROM TblJawabanTugas t")
    , @NamedQuery(name = "TblJawabanTugas.findByIdJawabanTugas", query = "SELECT t FROM TblJawabanTugas t WHERE t.idJawabanTugas = :idJawabanTugas")
    , @NamedQuery(name = "TblJawabanTugas.findByNoInduk", query = "SELECT t FROM TblJawabanTugas t WHERE t.noInduk = :noInduk")
    , @NamedQuery(name = "TblJawabanTugas.findByIdPertanyaan", query = "SELECT t FROM TblJawabanTugas t WHERE t.idPertanyaan = :idPertanyaan")
    , @NamedQuery(name = "TblJawabanTugas.findByWaktuTugas", query = "SELECT t FROM TblJawabanTugas t WHERE t.waktuTugas = :waktuTugas")})
public class TblJawabanTugas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_jawaban_tugas")
    private Integer idJawabanTugas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "no_induk")
    private String noInduk;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_pertanyaan")
    private int idPertanyaan;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "jawaban_tugas")
    private String jawabanTugas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "waktu_tugas")
    @Temporal(TemporalType.TIMESTAMP)
    private Date waktuTugas;

    public TblJawabanTugas() {
    }

    public TblJawabanTugas(Integer idJawabanTugas) {
        this.idJawabanTugas = idJawabanTugas;
    }

    public TblJawabanTugas(Integer idJawabanTugas, String noInduk, int idPertanyaan, String jawabanTugas, Date waktuTugas) {
        this.idJawabanTugas = idJawabanTugas;
        this.noInduk = noInduk;
        this.idPertanyaan = idPertanyaan;
        this.jawabanTugas = jawabanTugas;
        this.waktuTugas = waktuTugas;
    }

    public Integer getIdJawabanTugas() {
        return idJawabanTugas;
    }

    public void setIdJawabanTugas(Integer idJawabanTugas) {
        this.idJawabanTugas = idJawabanTugas;
    }

    public String getNoInduk() {
        return noInduk;
    }

    public void setNoInduk(String noInduk) {
        this.noInduk = noInduk;
    }

    public int getIdPertanyaan() {
        return idPertanyaan;
    }

    public void setIdPertanyaan(int idPertanyaan) {
        this.idPertanyaan = idPertanyaan;
    }

    public String getJawabanTugas() {
        return jawabanTugas;
    }

    public void setJawabanTugas(String jawabanTugas) {
        this.jawabanTugas = jawabanTugas;
    }

    public Date getWaktuTugas() {
        return waktuTugas;
    }

    public void setWaktuTugas(Date waktuTugas) {
        this.waktuTugas = waktuTugas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJawabanTugas != null ? idJawabanTugas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblJawabanTugas)) {
            return false;
        }
        TblJawabanTugas other = (TblJawabanTugas) object;
        if ((this.idJawabanTugas == null && other.idJawabanTugas != null) || (this.idJawabanTugas != null && !this.idJawabanTugas.equals(other.idJawabanTugas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hello.TblJawabanTugas[ idJawabanTugas=" + idJawabanTugas + " ]";
    }
    
}
