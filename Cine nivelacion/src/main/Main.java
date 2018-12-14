
package main;
import models.ModelCine;
import views.ViewCine;
import controllers.ControllerCine;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModelCine modelCine = new ModelCine();
        ViewCine viewCine = new ViewCine();
        ControllerCine controllerCine = new ControllerCine(modelCine, viewCine);
    }
    
}
