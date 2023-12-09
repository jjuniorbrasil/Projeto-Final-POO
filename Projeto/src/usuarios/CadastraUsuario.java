/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Júnior
 */
public class CadastraUsuario {
    // Conta quantas contas existem cadastradas.
    File directory = new File("src/usuarios/Users/");
    private int usernumber = directory.list().length;
    private int id;
    private String username;
    private String password;
    boolean admin;
        
        public CadastraUsuario(String username, String password) {
                this.id = ++usernumber;
                this.username = username;
                this.password = password;
                this.admin = false;
                File user = new File("src/usuarios/Users/" + username + ".txt");
            try {
                user.createNewFile();
                FileWriter writeuser = new FileWriter("src/usuarios/Users/" + username + ".txt");
                writeuser.write(username+"\n"+password);
                writeuser.close();
            } catch (IOException e) {
                System.out.println("Impossível cadastrar o usuário.");
            }
        }
}
