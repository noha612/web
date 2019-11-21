/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ABC
 */
@Entity
@Table(name = "phan", catalog = "web", schema = "")
@NamedQueries({
    @NamedQuery(name = "Phan.findAll", query = "SELECT p FROM Phan p")})
public class Phan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Ma")
    private String ma;
    @Lob
    @Column(name = "Ten")
    private String ten;
    @Column(name = "So_Thu_Tu")
    private Integer soThuTu;
    @JoinColumn(name = "Ma_Bai_Hoc", referencedColumnName = "Ma_Khoa_Hoc")
    @ManyToOne
    private BaiHoc maBaiHoc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "phan")
    private List<NoiDung> noiDungList;

    public Phan() {
    }

    public Phan(String ma) {
        this.ma = ma;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getSoThuTu() {
        return soThuTu;
    }

    public void setSoThuTu(Integer soThuTu) {
        this.soThuTu = soThuTu;
    }

    public BaiHoc getMaBaiHoc() {
        return maBaiHoc;
    }

    public void setMaBaiHoc(BaiHoc maBaiHoc) {
        this.maBaiHoc = maBaiHoc;
    }

    public List<NoiDung> getNoiDungList() {
        return noiDungList;
    }

    public void setNoiDungList(List<NoiDung> noiDungList) {
        this.noiDungList = noiDungList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ma != null ? ma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Phan)) {
            return false;
        }
        Phan other = (Phan) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Phan{" + "ma=" + ma + ", ten=" + ten + ", soThuTu=" + soThuTu + ", maBaiHoc=" + maBaiHoc + ", noiDungList=" + noiDungList + '}';
    }
    
    
}
