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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author debrian
 */
@Entity
@Table(name = "tbl_nilai_tugas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblNilaiTugas.findAll", query = "SELECT t FROM TblNilaiTugas t")
    , @NamedQuery(name = "TblNilaiTugas.findByIdNilaiTugas", query = "SELECT t FROM TblNilaiTugas t WHERE t.idNilaiTugas = :idNilaiTugas")
    , @NamedQuery(name = "TblNilaiTugas.findByIdTugas", query = "SELECT t FROM TblNilaiTugas t WHERE t.idTugas = :idTugas")
    , @NamedQuery(name = "TblNilaiTugas.findByNoInduk", query = "SELECT t FROM TblNilaiTugas t WHERE t.noInduk = :noInduk")
    , @NamedQuery(name = "TblNilaiTugas.findByNilaiTugas", query = "SELECT t FROM TblNilaiTugas t WHERE t.nilaiTugas = :nilaiTugas")})
public class TblNilaiTugas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_nilai_tugas")
    private Integer idNilaiTugas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_tugas")
    private int idTugas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "no_induk")
    private int noInduk;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nilai_tugas")
    private int nilaiTugas;

    public TblNilaiTugas() {
    }

    public TblNilaiTugas(Integer idNilaiTugas) {
        this.idNilaiTugas = idNilaiTugas;
    }

    public TblNilaiTugas(Integer idNilaiTugas, int idTugas, int noInduk, int nilaiTugas) {
        this.idNilaiTugas = idNilaiTugas;
        this.idTugas = idTugas;
        this.noInduk = noInduk;
        this.nilaiTugas = nilaiTugas;
    }

    public Integer getIdNilaiTugas() {
        return idNilaiTugas;
    }

    public void setIdNilaiTugas(Integer idNilaiTugas) {
        this.idNilaiTugas = idNilaiTugas;
    }

    public int getIdTugas() {
        return idTugas;
    }

    public void setIdTugas(int idTugas) {
        this.idTugas = idTugas;
    }

    public int getNoInduk() {
        return noInduk;
    }

    public void setNoInduk(int noInduk) {
        this.noInduk = noInduk;
    }

    public int getNilaiTugas() {
        return nilaiTugas;
    }

    public void setNilaiTugas(int nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNilaiTugas != null ? idNilaiTugas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblNilaiTugas)) {
            return false;
        }
        TblNilaiTugas other = (TblNilaiTugas) object;
        if ((this.idNilaiTugas == null && other.idNilaiTugas != null) || (this.idNilaiTugas != null && !this.idNilaiTugas.equals(other.idNilaiTugas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hello.TblNilaiTugas[ idNilaiTugas=" + idNilaiTugas + " ]";
    }
    
}
