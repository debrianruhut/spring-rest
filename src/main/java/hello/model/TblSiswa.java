/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello.model;

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
@Table(name = "tbl_siswa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TblSiswa.findAll", query = "SELECT t FROM TblSiswa t")
    , @NamedQuery(name = "TblSiswa.findByNoInduk", query = "SELECT t FROM TblSiswa t WHERE t.noInduk = :noInduk")
    , @NamedQuery(name = "TblSiswa.findByPassword", query = "SELECT t FROM TblSiswa t WHERE t.password = :password")
    , @NamedQuery(name = "TblSiswa.findByNmSiswa", query = "SELECT t FROM TblSiswa t WHERE t.nmSiswa = :nmSiswa")
    , @NamedQuery(name = "TblSiswa.findByAlamat", query = "SELECT t FROM TblSiswa t WHERE t.alamat = :alamat")
    , @NamedQuery(name = "TblSiswa.findByTempatLahir", query = "SELECT t FROM TblSiswa t WHERE t.tempatLahir = :tempatLahir")
    , @NamedQuery(name = "TblSiswa.findByTanggalLahir", query = "SELECT t FROM TblSiswa t WHERE t.tanggalLahir = :tanggalLahir")
    , @NamedQuery(name = "TblSiswa.findByJk", query = "SELECT t FROM TblSiswa t WHERE t.jk = :jk")
    , @NamedQuery(name = "TblSiswa.findByAgama", query = "SELECT t FROM TblSiswa t WHERE t.agama = :agama")
    , @NamedQuery(name = "TblSiswa.findByFoto", query = "SELECT t FROM TblSiswa t WHERE t.foto = :foto")
    , @NamedQuery(name = "TblSiswa.findBySekolahAsal", query = "SELECT t FROM TblSiswa t WHERE t.sekolahAsal = :sekolahAsal")
    , @NamedQuery(name = "TblSiswa.findByNmOrtu", query = "SELECT t FROM TblSiswa t WHERE t.nmOrtu = :nmOrtu")
    , @NamedQuery(name = "TblSiswa.findByPekerjaan", query = "SELECT t FROM TblSiswa t WHERE t.pekerjaan = :pekerjaan")
    , @NamedQuery(name = "TblSiswa.findByKdKelas", query = "SELECT t FROM TblSiswa t WHERE t.kdKelas = :kdKelas")
    , @NamedQuery(name = "TblSiswa.findByLevel", query = "SELECT t FROM TblSiswa t WHERE t.level = :level")})
public class TblSiswa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "no_induk")
    private String noInduk;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nm_siswa")
    private String nmSiswa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "alamat")
    private String alamat;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "tempat_lahir")
    private String tempatLahir;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "tanggal_lahir")
    private String tanggalLahir;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "jk")
    private String jk;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "agama")
    private String agama;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "foto")
    private String foto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "sekolah_asal")
    private String sekolahAsal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nm_ortu")
    private String nmOrtu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "pekerjaan")
    private String pekerjaan;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "kd_kelas")
    private String kdKelas;
    @Size(max = 10)
    @Column(name = "level")
    private String level;

    public TblSiswa() {
    }

    public TblSiswa(String noInduk) {
        this.noInduk = noInduk;
    }

    public TblSiswa(String noInduk, String password, String nmSiswa, String alamat, String tempatLahir, String tanggalLahir, String jk, String agama, String foto, String sekolahAsal, String nmOrtu, String pekerjaan, String kdKelas) {
        this.noInduk = noInduk;
        this.password = password;
        this.nmSiswa = nmSiswa;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.jk = jk;
        this.agama = agama;
        this.foto = foto;
        this.sekolahAsal = sekolahAsal;
        this.nmOrtu = nmOrtu;
        this.pekerjaan = pekerjaan;
        this.kdKelas = kdKelas;
    }

    public String getNoInduk() {
        return noInduk;
    }

    public void setNoInduk(String noInduk) {
        this.noInduk = noInduk;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNmSiswa() {
        return nmSiswa;
    }

    public void setNmSiswa(String nmSiswa) {
        this.nmSiswa = nmSiswa;
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

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getSekolahAsal() {
        return sekolahAsal;
    }

    public void setSekolahAsal(String sekolahAsal) {
        this.sekolahAsal = sekolahAsal;
    }

    public String getNmOrtu() {
        return nmOrtu;
    }

    public void setNmOrtu(String nmOrtu) {
        this.nmOrtu = nmOrtu;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getKdKelas() {
        return kdKelas;
    }

    public void setKdKelas(String kdKelas) {
        this.kdKelas = kdKelas;
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
        hash += (noInduk != null ? noInduk.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblSiswa)) {
            return false;
        }
        TblSiswa other = (TblSiswa) object;
        if ((this.noInduk == null && other.noInduk != null) || (this.noInduk != null && !this.noInduk.equals(other.noInduk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hello.TblSiswa[ noInduk=" + noInduk + " ]";
    }
    
}
