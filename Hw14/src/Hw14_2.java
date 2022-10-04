import java.util.ArrayList;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseButton;


public class Hw14_2 extends Application{
	int i=0;
	@Override // Override the start method in the Application class 
	public void start(Stage primaryStage) {
		
		ArrayList<Circle> circle=new ArrayList<Circle>();
		Pane pane=new Pane();
		
		Scene scene = new Scene(pane, 250, 300); 
		pane.setOnMouseClicked(e->{
			Circle c1=new Circle(10);
			c1.setCenterX(e.getX());
			c1.setCenterY(e.getY());
			c1.setStroke(Color. BLACK);
			c1.setFill(null);
			if (e.getButton() == MouseButton.PRIMARY) {
				circle.add(c1);
				pane.getChildren().add(circle.get(i));
				i++;
			}
			
			
			else if (e.getButton() == MouseButton.SECONDARY) {
				
				
				for(int i=0;i<circle.size();i++) {
					if(inCircle(e.getX(),e.getY(),circle.get(i).getCenterX(),circle.get(i).getCenterY()))
						pane.getChildren().remove(circle.get(i));
				}
					
				
			}
			
			
		});
		
		primaryStage.setTitle("Add Remove"); // Set the stage title 
		primaryStage.setScene(scene); // Place the scene in the stage 
		primaryStage.show(); // Display the stage
		
	}
	public boolean inCircle(double ex, double ey,double x, double y) {
		if((x-ex)*(x-ex)+(y-ey)*(y-ey)<=100)
		return true;
		return false;
	}
	public static void main(String[] args) {
		launch(args);

	}

}
