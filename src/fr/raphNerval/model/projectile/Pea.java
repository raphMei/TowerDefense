package fr.raphNerval.model.projectile;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.IOException;

public class Pea extends Bullet {

    //*****ATTRIBUTS*****//
    private Image image;

    //*****CONSTRUCTEUR*****//
    public Pea() {
        super();
        try {
            this.image= ImageIO.read(getClass().getResource("/images/bullet/pea.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    //*****ACCESSEURS*****//
    public Image getImage() {
        return image;
    }
    public void setImage(Image image) {
        this.image = image;
    }
}

