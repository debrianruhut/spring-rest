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
@Table(name = "tbl_jawaban_objektif")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblJawabanObjektif.findAll", query = "SELECT t FROM TblJawabanObjektif t")
    , @NamedQuery(name = "TblJawabanObjektif.findByIdJawabanObjektif", query = "SELECT t FROM TblJawabanObjektif t WHERE t.idJawabanObjektif = :idJawabanObjektif")
    , @NamedQuery(name = "TblJawabanObjektif.findByNoInduk", query = "SELECT t FROM TblJawabanObjektif t WHERE t.noInduk = :noInduk")
    , @NamedQuery(name = "TblJawabanObjektif.findByIdPertanyaanObjektif", query = "SELECT t FROM TblJawabanObjektif t WHERE t.idPertanyaanObjektif = :idPertanyaanObjektif")
    , @NamedQuery(name = "TblJawabanObjektif.findByJawaban", query = "SELECT t FROM TblJawabanObjektif t WHERE t.jawaban = :jawaban")
    , @NamedQuery(name = "TblJawabanObjektif.findByWaktuObjektif", query = "SELECT t FROM TblJawabanObjektif t WHERE t.waktuObjektif = :waktuObjektif")})
public class TblJawabanObjektif implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_jawaban_objektif")
    private Integer idJawabanObjektif;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "no_induk")
    private String noInduk;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_pertanyaan_objektif")
    private int idPertanyaanObjektif;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2)
    @Column(name = "jawaban")
    private String jawaban;
    @Basic(optional = false)
    @NotNull
    @Column(name = "waktu_objektif")
    @Temporal(TemporalType.TIMESTAMP)
    private Date waktuObjektif;

    public TblJawabanObjektif() {
    }

    public TblJawabanObjektif(Integer idJawabanObjektif) {
        this.idJawabanObjektif = idJawabanObjektif;
    }

    public TblJawabanObjektif(Integer idJawabanObjektif, String noInduk, int idPertanyaanObjektif, String jawaban, Date waktuObjektif) {
        this.idJawabanObjektif = idJawabanObjektif;
        this.noInduk = noInduk;
        this.idPertanyaanObjektif = idPertanyaanObjektif;
        this.jawaban = jawaban;
        this.waktuObjektif = waktuObjektif;
    }

    public Integer getIdJawabanObjektif() {
        return idJawabanObjektif;
    }

    public void setIdJawabanObjektif(Integer idJawabanObjektif) {
        this.idJawabanObjektif = idJawabanObjektif;
    }

    public String getNoInduk() {
        return noInduk;
    }

    public void setNoInduk(String noInduk) {
        this.noInduk = noInduk;
    }

    public int getIdPertanyaanObjektif() {
        return idPertanyaanObjektif;
    }

    public void setIdPertanyaanObjektif(int idPertanyaanObjektif) {
        this.idPertanyaanObjektif = idPertanyaanObjektif;
    }

    public String getJawaban() {
        return jawaban;
    }

    public void setJawaban(String jawaban) {
        this.jawaban = jawaban;
    }

    public Date getWaktuObjektif() {
        return waktuObjektif;
    }

    public void setWaktuObjektif(Date waktuObjektif) {
        this.waktuObjektif = waktuObjektif;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJawabanObjektif != null ? idJawabanObjektif.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblJawabanObjektif)) {
            return false;
        }
        TblJawabanObjektif other = (TblJawabanObjektif) object;
        if ((this.idJawabanObjektif == null && other.idJawabanObjektif != null) || (this.idJawabanObjektif != null && !this.idJawabanObjektif.equals(other.idJawabanObjektif))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hello.TblJawabanObjektif[ idJawabanObjektif=" + idJawabanObjektif + " ]";
    }
    
}
