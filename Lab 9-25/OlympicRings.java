// write a java FX application that displays the olympic logo

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class OlympicRings extends Application{

    public void start(Stage primaryStage) {
    
        Circle circle1 = new Circle();
        circle1.setCenterX(100); 
        circle1.setCenterY(100); 
        circle1.setRadius(50); 
        circle1.setStroke(Color.BLUE); 
        circle1.setStrokeWidth(10);
        circle1.setFill(null); 

        Circle circle2 = new Circle(); 
        circle2.setCenterX(160);
        circle2.setCenterY(150);
        circle2.setRadius(50);
        circle2.setStroke(Color.YELLOW);
        circle2.setStrokeWidth(10);
        circle2.setFill(null);

        Circle circle3 = new Circle();
        circle3.setCenterX(220);
        circle3.setCenterY(100);
        circle3.setRadius(50);
        circle3.setStroke(Color.BLACK);
        circle3.setStrokeWidth(10);
        circle3.setFill(null);

        Circle circle4 = new Circle();
        circle4.setCenterX(280);
        circle4.setCenterY(150);
        circle4.setRadius(50);
        circle4.setStroke(Color.GREEN);
        circle4.setStrokeWidth(10);
        circle4.setFill(null);

        Circle circle5 = new Circle();
        circle5.setCenterX(340);
        circle5.setCenterY(100);
        circle5.setRadius(50);
        circle5.setStroke(Color.RED);
        circle5.setStrokeWidth(10);
        circle5.setFill(null);

        Group root = new Group(circle1, circle2, circle3, circle4, circle5);
        Scene scene = new Scene(root, 400, 200);

        primaryStage.setTitle("Einstein");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
     public static void main(String[] args)
    {
           launch(args);
       }
}

