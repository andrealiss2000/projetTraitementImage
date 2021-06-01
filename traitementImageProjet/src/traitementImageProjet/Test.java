package traitementImageProjet;

import fr.unistra.pelican.Image;
import fr.unistra.pelican.algorithms.io.ImageLoader;
import fr.unistra.pelican.algorithms.visualisation.Viewer2D;

public class Test {
	
	//Charger une image en memoire
			Image test= ImageLoader.exec("/home/ckurtz/Images/Webcam/069.jpg"); 

			//Connaitre la hauteur et la largeur d'une image
			int largeur = test.getXDim();
			int hauteur = test.getYDim();
			
			

}
