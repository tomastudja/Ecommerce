package com.nohit.jira_project.model;

import java.util.*;

import javax.persistence.*;

import lombok.*;

import static javax.persistence.FetchType.*;

@Entity(name = "gio_hang")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GioHang {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "tong_so_luong")
    private int tongSoLuong;

    @Column(name = "giam_gia")
    private int giamGia;

    @Column(name = "tong_gio_hang")
    private int tongGioHang;

    @OneToOne(fetch = LAZY)
    @JoinColumn(name = "id", referencedColumnName = "id", insertable = false, updatable = false)
    private KhachHang khachHang;

    @OneToMany(mappedBy = "gioHang")
    private List<ChiTietGioHang> dsChiTietGioHang;
}
