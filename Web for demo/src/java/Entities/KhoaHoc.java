/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ABC
 */
@Entity
@Table(name = "khoa_hoc", catalog = "web", schema = "")
@NamedQueries({
    @NamedQuery(name = "KhoaHoc.findAll", query = "SELECT k FROM KhoaHoc k")})
public class KhoaHoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Ma")
    private String ma;
    @Column(name = "Ten")
    private String ten;
    @Lob
    @Column(name = "Mo_Ta")
    private String moTa;
    @Column(name = "So_Thu_Tu")
    private Integer soThuTu;
    @Lob
    @Column(name = "Url_Anh")
    private String urlAnh;
    @OneToMany(mappedBy = "maKhoaHoc")
    private List<BaiHoc> baiHocList;

    public KhoaHoc() {
    }

    public KhoaHoc(String ma) {
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

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Integer getSoThuTu() {
        return soThuTu;
    }

    public void setSoThuTu(Integer soThuTu) {
        this.soThuTu = soThuTu;
    }

    public String getUrlAnh() {
        return urlAnh;
    }

    public void setUrlAnh(String urlAnh) {
        this.urlAnh = urlAnh;
    }

    public List<BaiHoc> getBaiHocList() {
        return baiHocList;
    }

    public void setBaiHocList(List<BaiHoc> baiHocList) {
        this.baiHocList = baiHocList;
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
        if (!(object instanceof KhoaHoc)) {
            return false;
        }
        KhoaHoc other = (KhoaHoc) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.KhoaHoc[ ma=" + ma + " ]";
    }
    
}
