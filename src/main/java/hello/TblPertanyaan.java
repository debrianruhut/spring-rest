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
@Table(name = "tbl_pertanyaan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblPertanyaan.findAll", query = "SELECT t FROM TblPertanyaan t")
    , @NamedQuery(name = "TblPertanyaan.findByIdPertanyaan", query = "SELECT t FROM TblPertanyaan t WHERE t.idPertanyaan = :idPertanyaan")
    , @NamedQuery(name = "TblPertanyaan.findByIdTugas", query = "SELECT t FROM TblPertanyaan t WHERE t.idTugas = :idTugas")})
public class TblPertanyaan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pertanyaan")
    private Integer idPertanyaan;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_tugas")
    private int idTugas;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "pertanyaan")
    private String pertanyaan;

    public TblPertanyaan() {
    }

    public TblPertanyaan(Integer idPertanyaan) {
        this.idPertanyaan = idPertanyaan;
    }

    public TblPertanyaan(Integer idPertanyaan, int idTugas, String pertanyaan) {
        this.idPertanyaan = idPertanyaan;
        this.idTugas = idTugas;
        this.pertanyaan = pertanyaan;
    }

    public Integer getIdPertanyaan() {
        return idPertanyaan;
    }

    public void setIdPertanyaan(Integer idPertanyaan) {
        this.idPertanyaan = idPertanyaan;
    }

    public int getIdTugas() {
        return idTugas;
    }

    public void setIdTugas(int idTugas) {
        this.idTugas = idTugas;
    }

    public String getPertanyaan() {
        return pertanyaan;
    }

    public void setPertanyaan(String pertanyaan) {
        this.pertanyaan = pertanyaan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPertanyaan != null ? idPertanyaan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPertanyaan)) {
            return false;
        }
        TblPertanyaan other = (TblPertanyaan) object;
        if ((this.idPertanyaan == null && other.idPertanyaan != null) || (this.idPertanyaan != null && !this.idPertanyaan.equals(other.idPertanyaan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hello.TblPertanyaan[ idPertanyaan=" + idPertanyaan + " ]";
    }
    
}
