package com.example.progettospringbase.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.progettospringbase.Model.contatto;


    @RestController
    public class ContattoAPIController {
    private static final String url = "jdbc:mysql://localhost:3306/springbase?serverTimezone=UTC";
    private static final String username = "root";
    private static final String password = "Reddino24";

    
    @GetMapping("/contatti")
    public List<contatto> getContatti() {
        List<contatto> contatti = new ArrayList<>();
        String query = "SELECT * FROM rubrica";
        
        try (Connection conn = DriverManager.getConnection(url, username, password);
        PreparedStatement stmt = conn.prepareStatement(query);
       ResultSet rs = stmt.executeQuery(query))  {

            while (rs.next()) {
                Long id = rs.getLong("id");
                String nome = rs.getString("nome"); 
                String cognome = rs.getString("cognome");
                String telefono = rs.getString("telefono");
                String email = rs.getString("email");
                String note = rs.getString("note");
                
                contatti.add(new contatto(id, nome, cognome, email,telefono, note));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contatti;
    }

   

      public void insertContatto (contatto contatto) {
        String query = "INSERT INTO rubrica (nome, cognome, email, telefono, note) VALUES ('" + contatto.getNome() + "', '" + contatto.getCognome() + "', '" + contatto.getTelefono() + "', '" + contatto.getEmail() + "')";
        
        try (Connection conn = DriverManager.getConnection(url, username, password);
        PreparedStatement stmt = conn.prepareStatement(query)) {
            
            
            stmt.setString(1, contatto.getNome());
            stmt.setString(2, contatto.getCognome());
            stmt.setString(3, contatto.getEmail());
            stmt.setString(4, contatto.getTelefono());
            stmt.setString(5, contatto.getNote());

        
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
        
    public void  deleteContatto (Long id) {
        String query = "DELETE FROM rubrica WHERE id = " + id;
        
        try (Connection conn = DriverManager.getConnection(url, username, password);
        PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    
    } 
}
                        