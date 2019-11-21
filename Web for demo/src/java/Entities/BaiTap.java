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
@Table(name = "bai_tap", catalog = "web", schema = "")
@NamedQueries({
    @NamedQuery(name = "BaiTap.findAll", query = "SELECT b FROM BaiTap b")})
public class BaiTap implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Ma")
    private String ma;
    @Lob
    @Column(name = "Ten")
    private String ten;
    @Lob
    @Column(name = "De_Bai")
    private String deBai;
    @Lob
    @Column(name = "Testcase_Vi_Du")
    private String testcaseViDu;
    @Lob
    @Column(name = "File_Input")
    private String fileInput;
    @Lob
    @Column(name = "File_Output")
    private String fileOutput;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Gioi_Han_Thoi_Gian")
    private Float gioiHanThoiGian;
    @Lob
    @Column(name = "Url_Anh")
    private String urlAnh;
    @OneToMany(mappedBy = "maBaiTap")
    private List<NhiemVuCuoiBai> nhiemVuCuoiBaiList;

    public BaiTap() {
    }

    public BaiTap(String ma) {
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

    public String getDeBai() {
        return deBai;
    }

    public void setDeBai(String deBai) {
        this.deBai = deBai;
    }

    public String getTestcaseViDu() {
        return testcaseViDu;
    }

    public void setTestcaseViDu(String testcaseViDu) {
        this.testcaseViDu = testcaseViDu;
    }

    public String getFileInput() {
        return fileInput;
    }

    public void setFileInput(String fileInput) {
        this.fileInput = fileInput;
    }

    public String getFileOutput() {
        return fileOutput;
    }

    public void setFileOutput(String fileOutput) {
        this.fileOutput = fileOutput;
    }

    public Float getGioiHanThoiGian() {
        return gioiHanThoiGian;
    }

    public void setGioiHanThoiGian(Float gioiHanThoiGian) {
        this.gioiHanThoiGian = gioiHanThoiGian;
    }

    public String getUrlAnh() {
        return urlAnh;
    }

    public void setUrlAnh(String urlAnh) {
        this.urlAnh = urlAnh;
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
        if (!(object instanceof BaiTap)) {
            return false;
        }
        BaiTap other = (BaiTap) object;
        if ((this.ma == null && other.ma != null) || (this.ma != null && !this.ma.equals(other.ma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.BaiTap[ ma=" + ma + " ]";
    }
    
}
