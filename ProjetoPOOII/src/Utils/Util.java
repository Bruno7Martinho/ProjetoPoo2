/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.net.URL;
import javax.swing.ImageIcon;
import java.awt.Image;




public class Util {
    public static Image getIcone(){
        URL caminhoImagem = Util.class.getResource("/images/403024_avatar_boy_male_user_young_icon.png");
        
        ImageIcon icon = new ImageIcon(caminhoImagem);
        
        return icon.getImage();
}
}