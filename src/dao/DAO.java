/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.Course;

/**
 *
 * @author sanya
 */
public class DAO {
    private static Connection con() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
        return con;
    }
    
    public static int addCourse(Course course){
        try {
            PreparedStatement ps = con().prepareStatement("insert into courses(name,duration,fee) values(?,?,?)");
            ps.setString(1, course.getName());
            ps.setInt(2, course.getDuration());
            ps.setFloat(3, course.getFee());
            int a = ps.executeUpdate();
            if(a>0){
                JFrame f=new JFrame();  
                JOptionPane.showMessageDialog(f,"Successfully Inserted.","Alert",JOptionPane.WARNING_MESSAGE);   
            }
            return a;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    public static List<Course> getAllCourses(){
        List<Course> list = new ArrayList<>();
        try {
            PreparedStatement ps = con().prepareStatement("Select * from courses");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Course c = new Course();
                c.setId(rs.getInt("id"));
                c.setName(rs.getString("name"));
                c.setDuration(rs.getInt("duration"));
                c.setFee(rs.getFloat("fee"));
                list.add(c);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
