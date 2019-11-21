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
@Table(name = "bai_hoc", catalog = "web", schema = "")
@NamedQueries({
    @NamedQuery(name = "BaiHoc.findAll", query = "SELECT b FROM BaiHoc b")})
public class BaiHoc implements Serializable {

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
    @OneToMany(mappedBy = "maBaiHoc")
    private List<Phan> phanList;
    @JoinColumn(name = "Ma_Khoa_Hoc", referencedColumnName = "Ma")
    @ManyToOne
    private KhoaHoc maKhoaHoc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "baiHoc")
    private List<NhiemVuCuoiBai> nhiemVuCuoiBaiList;

    public BaiHoc() {
    }

    public BaiHoc(String ma) {
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

    public List<Phan> getPhanList() {
        return phanList;
    }

    public void setPhanList(List<Phan> phanList) {
        this.phanList = phanList;
    }

    public KhoaHoc getMaKhoaHoc() {
        return maKhoaHoc;
    }

    public void setMaKhoaHoc(KhoaHoc maKhoaHoc) {
        this.maKhoaHoc = maKhoaHoc;
    }

    public List<NhiemVuCuoiBai> getNhiemVuCuoiBaiList() {
        return nhiemVuCuoiBaiList;
    }

    public void setNhiemVuCuoiBaiList(List<NhiemVuCuoiBai> nhiemVuCuoiBaiList) {
        this.nhiemVuCuoiBaiList = nhiemVuCuoiBaiList;
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
        if (!(object instanceof BaiHoc)) {
            return false;
        }
        BaiHoc other = (BaiHoc) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BaiHoc{" + "ma=" + ma + ", ten=" + ten + ", soThuTu=" + soThuTu + ", phanList=" + phanList + ", maKhoaHoc=" + maKhoaHoc + ", nhiemVuCuoiBaiList=" + nhiemVuCuoiBaiList + '}';
    }


    
}
