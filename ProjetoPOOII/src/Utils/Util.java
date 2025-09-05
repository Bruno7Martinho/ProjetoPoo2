/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.net.URL;
import javax.swing.ImageIcon;
import java.awt.Image;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;




public class Util {
    public static Image getIcone(){
        URL caminhoImagem = Util.class.getResource("/images/403024_avatar_boy_male_user_young_icon.png");
        
        ImageIcon icon = new ImageIcon(caminhoImagem);
        
        return icon.getImage();
}
    
    public static Date converterStringToDate(String texto){
        
        //construo o formato que quero transformar o texto
        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
        
        //crio minha variável data que será o retorno do método
        Date data = null;
        
        try{
            //tenta converter a String em Date baseado no formato
            //construido anteriormente
            data = formato.parse(texto);
        }catch(ParseException ex){
            JOptionPane.showMessageDialog(null, "Erro ao converter a data");
        }
        
        //retorna a data convertida
        return data;    
        
    }
    
    public static String calcularHash(String senha){
        String hashSHA1 = "";
        try{
            //crie uma instância do MessageDigest
            //com o algoritmo SHA1
            MessageDigest sha1 = MessageDigest.getInstance("SHA1");
            
            //Atualize o digest com os bytes do teste
            sha1.update(senha.getBytes());
            
            //calcule o hash SHA1
            byte[] digest = sha1.digest();
            
            //converta o hash de bytes para uma representação hexadecimal
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b));
            }
            hashSHA1 = sb.toString();
        }
        catch (NoSuchAlgorithmException e) {
            System.err.println("Algoritmo não encontrado !!!");
        }
        return hashSHA1;
        
    }
    
    public static String converterDateToStrig(Date data){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
         String texto = "";   
         
         try{
             //irá formatar a data para o formato dd/MM/yyyy
             texto = formato.format(data);
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Erro ao formatar a data");
         }
            
    return texto;
 
    }    
    
    
    
}