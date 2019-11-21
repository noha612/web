/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entities.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nguyenthang
 */
public class AccountDAO {

    Connection con = ConnectDB.openConnect();

    public boolean checkAccount(Account a) {
        try {
            String sql = "select * from account where username = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, a.getUsername());
            ResultSet rs = ps.executeQuery();
            rs.first();
            String pw = rs.getString("password");
            if (pw.equalsIgnoreCase(a.getPassword())) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
  public boolean checkUsername(String username) {
        try {
            String sql = "select * from account where username = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public Account getAccByUsername(String username) {
        try {
            String sql = "select * from account where username = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Account a=new Account(username, rs.getString("password"), rs.getString("hoten"), rs.getString("email"), rs.getString("sodienthoai"),rs.getString("avatar"));
                return a;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public void insertAccount(Account a) {
        try {
            System.out.println(a.toString());
            String sql = "insert into account(password,id,username,hoten,email,sodienthoai) values(?,?,?,?,?,?);";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(3, a.getUsername());
            ps.setInt(2, Integer.parseInt((System.currentTimeMillis() + "").substring(8)));
            ps.setString(1, a.getPassword());
            ps.setString(4, a.getHoten());
            ps.setString(5, a.getEmail());
            ps.setString(6, a.getSdt());
            int rs = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
