/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author debrian
 */
@Entity
@Table(name = "tbl_pertanyaan_objektif")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblPertanyaanObjektif.findAll", query = "SELECT t FROM TblPertanyaanObjektif t")
    , @NamedQuery(name = "TblPertanyaanObjektif.findByIdPertanyaanObjektif", query = "SELECT t FROM TblPertanyaanObjektif t WHERE t.idPertanyaanObjektif = :idPertanyaanObjektif")
    , @NamedQuery(name = "TblPertanyaanObjektif.findByIdTugas", query = "SELECT t FROM TblPertanyaanObjektif t WHERE t.idTugas = :idTugas")
    , @NamedQuery(name = "TblPertanyaanObjektif.findByJawabA", query = "SELECT t FROM TblPertanyaanObjektif t WHERE t.jawabA = :jawabA")
    , @NamedQuery(name = "TblPertanyaanObjektif.findByJawabB", query = "SELECT t FROM TblPertanyaanObjektif t WHERE t.jawabB = :jawabB")
    , @NamedQuery(name = "TblPertanyaanObjektif.findByJawabC", query = "SELECT t FROM TblPertanyaanObjektif t WHERE t.jawabC = :jawabC")
    , @NamedQuery(name = "TblPertanyaanObjektif.findByJawabD", query = "SELECT t FROM TblPertanyaanObjektif t WHERE t.jawabD = :jawabD")
    , @NamedQuery(name = "TblPertanyaanObjektif.findByJawabE", query = "SELECT t FROM TblPertanyaanObjektif t WHERE t.jawabE = :jawabE")
    , @NamedQuery(name = "TblPertanyaanObjektif.findByKunciJawaban", query = "SELECT t FROM TblPertanyaanObjektif t WHERE t.kunciJawaban = :kunciJawaban")})
public class TblPertanyaanObjektif implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pertanyaan_objektif")
    private Integer idPertanyaanObjektif;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_tugas")
    private int idTugas;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "pertanyaan_objektif")
    private String pertanyaanObjektif;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "jawab_a")
    private String jawabA;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "jawab_b")
    private String jawabB;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "jawab_c")
    private String jawabC;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "jawab_d")
    private String jawabD;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "jawab_e")
    private String jawabE;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "kunci_jawaban")
    private String kunciJawaban;

    public TblPertanyaanObjektif() {
    }

    public TblPertanyaanObjektif(Integer idPertanyaanObjektif) {
        this.idPertanyaanObjektif = idPertanyaanObjektif;
    }

    public TblPertanyaanObjektif(Integer idPertanyaanObjektif, int idTugas, String pertanyaanObjektif, String jawabA, String jawabB, String jawabC, String jawabD, String jawabE, String kunciJawaban) {
        this.idPertanyaanObjektif = idPertanyaanObjektif;
        this.idTugas = idTugas;
        this.pertanyaanObjektif = pertanyaanObjektif;
        this.jawabA = jawabA;
        this.jawabB = jawabB;
        this.jawabC = jawabC;
        this.jawabD = jawabD;
        this.jawabE = jawabE;
        this.kunciJawaban = kunciJawaban;
    }

    public Integer getIdPertanyaanObjektif() {
        return idPertanyaanObjektif;
    }

    public void setIdPertanyaanObjektif(Integer idPertanyaanObjektif) {
        this.idPertanyaanObjektif = idPertanyaanObjektif;
    }

    public int getIdTugas() {
        return idTugas;
    }

    public void setIdTugas(int idTugas) {
        this.idTugas = idTugas;
    }

    public String getPertanyaanObjektif() {
        return pertanyaanObjektif;
    }

    public void setPertanyaanObjektif(String pertanyaanObjektif) {
        this.pertanyaanObjektif = pertanyaanObjektif;
    }

    public String getJawabA() {
        return jawabA;
    }

    public void setJawabA(String jawabA) {
        this.jawabA = jawabA;
    }

    public String getJawabB() {
        return jawabB;
    }

    public void setJawabB(String jawabB) {
        this.jawabB = jawabB;
    }

    public String getJawabC() {
        return jawabC;
    }

    public void setJawabC(String jawabC) {
        this.jawabC = jawabC;
    }

    public String getJawabD() {
        return jawabD;
    }

    public void setJawabD(String jawabD) {
        this.jawabD = jawabD;
    }

    public String getJawabE() {
        return jawabE;
    }

    public void setJawabE(String jawabE) {
        this.jawabE = jawabE;
    }

    public String getKunciJawaban() {
        return kunciJawaban;
    }

    public void setKunciJawaban(String kunciJawaban) {
        this.kunciJawaban = kunciJawaban;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPertanyaanObjektif != null ? idPertanyaanObjektif.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPertanyaanObjektif)) {
            return false;
        }
        TblPertanyaanObjektif other = (TblPertanyaanObjektif) object;
        if ((this.idPertanyaanObjektif == null && other.idPertanyaanObjektif != null) || (this.idPertanyaanObjektif != null && !this.idPertanyaanObjektif.equals(other.idPertanyaanObjektif))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hello.TblPertanyaanObjektif[ idPertanyaanObjektif=" + idPertanyaanObjektif + " ]";
    }
    
}
