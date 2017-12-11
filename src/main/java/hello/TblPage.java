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
@Table(name = "tbl_page")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblPage.findAll", query = "SELECT t FROM TblPage t")
    , @NamedQuery(name = "TblPage.findByIdPage", query = "SELECT t FROM TblPage t WHERE t.idPage = :idPage")
    , @NamedQuery(name = "TblPage.findByJudul", query = "SELECT t FROM TblPage t WHERE t.judul = :judul")})
public class TblPage implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_page")
    private Integer idPage;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "judul")
    private String judul;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "isi")
    private String isi;

    public TblPage() {
    }

    public TblPage(Integer idPage) {
        this.idPage = idPage;
    }

    public TblPage(Integer idPage, String judul, String isi) {
        this.idPage = idPage;
        this.judul = judul;
        this.isi = isi;
    }

    public Integer getIdPage() {
        return idPage;
    }

    public void setIdPage(Integer idPage) {
        this.idPage = idPage;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPage != null ? idPage.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblPage)) {
            return false;
        }
        TblPage other = (TblPage) object;
        if ((this.idPage == null && other.idPage != null) || (this.idPage != null && !this.idPage.equals(other.idPage))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hello.TblPage[ idPage=" + idPage + " ]";
    }
    
}
