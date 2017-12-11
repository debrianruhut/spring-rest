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
@Table(name = "tbl_guru")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblGuru.findAll", query = "SELECT t FROM TblGuru t")
    , @NamedQuery(name = "TblGuru.findByNip", query = "SELECT t FROM TblGuru t WHERE t.nip = :nip")
    , @NamedQuery(name = "TblGuru.findByPassword", query = "SELECT t FROM TblGuru t WHERE t.password = :password")
    , @NamedQuery(name = "TblGuru.findByNmGuru", query = "SELECT t FROM TblGuru t WHERE t.nmGuru = :nmGuru")
    , @NamedQuery(name = "TblGuru.findByAlamat", query = "SELECT t FROM TblGuru t WHERE t.alamat = :alamat")
    , @NamedQuery(name = "TblGuru.findByTempatLahir", query = "SELECT t FROM TblGuru t WHERE t.tempatLahir = :tempatLahir")
    , @NamedQuery(name = "TblGuru.findByTanggalLahir", query = "SELECT t FROM TblGuru t WHERE t.tanggalLahir = :tanggalLahir")
    , @NamedQuery(name = "TblGuru.findByJenisKelamin", query = "SELECT t FROM TblGuru t WHERE t.jenisKelamin = :jenisKelamin")
    , @NamedQuery(name = "TblGuru.findByFoto", query = "SELECT t FROM TblGuru t WHERE t.foto = :foto")
    , @NamedQuery(name = "TblGuru.findByTelpon", query = "SELECT t FROM TblGuru t WHERE t.telpon = :telpon")
    , @NamedQuery(name = "TblGuru.findByAgama", query = "SELECT t FROM TblGuru t WHERE t.agama = :agama")
    , @NamedQuery(name = "TblGuru.findByJabatan", query = "SELECT t FROM TblGuru t WHERE t.jabatan = :jabatan")
    , @NamedQuery(name = "TblGuru.findByGol", query = "SELECT t FROM TblGuru t WHERE t.gol = :gol")
    , @NamedQuery(name = "TblGuru.findByTamatan", query = "SELECT t FROM TblGuru t WHERE t.tamatan = :tamatan")
    , @NamedQuery(name = "TblGuru.findByLevel", query = "SELECT t FROM TblGuru t WHERE t.level = :level")})
public class TblGuru implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nip")
    private String nip;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "nm_guru")
    private String nmGuru;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "alamat")
    private String alamat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "tempat_lahir")
    private String tempatLahir;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 13)
    @Column(name = "tanggal_lahir")
    private String tanggalLahir;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "jenis_kelamin")
    private String jenisKelamin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "foto")
    private String foto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "telpon")
    private String telpon;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "agama")
    private String agama;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "jabatan")
    private String jabatan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 7)
    @Column(name = "gol")
    private String gol;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "tamatan")
    private String tamatan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "level")
    private String level;

    public TblGuru() {
    }

    public TblGuru(String nip) {
        this.nip = nip;
    }

    public TblGuru(String nip, String password, String nmGuru, String alamat, String tempatLahir, String tanggalLahir, String jenisKelamin, String foto, String telpon, String agama, String jabatan, String gol, String tamatan, String level) {
        this.nip = nip;
        this.password = password;
        this.nmGuru = nmGuru;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.foto = foto;
        this.telpon = telpon;
        this.agama = agama;
        this.jabatan = jabatan;
        this.gol = gol;
        this.tamatan = tamatan;
        this.level = level;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNmGuru() {
        return nmGuru;
    }

    public void setNmGuru(String nmGuru) {
        this.nmGuru = nmGuru;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getTelpon() {
        return telpon;
    }

    public void setTelpon(String telpon) {
        this.telpon = telpon;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getGol() {
        return gol;
    }

    public void setGol(String gol) {
        this.gol = gol;
    }

    public String getTamatan() {
        return tamatan;
    }

    public void setTamatan(String tamatan) {
        this.tamatan = tamatan;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nip != null ? nip.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblGuru)) {
            return false;
        }
        TblGuru other = (TblGuru) object;
        if ((this.nip == null && other.nip != null) || (this.nip != null && !this.nip.equals(other.nip))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hello.TblGuru[ nip=" + nip + " ]";
    }
    
}
