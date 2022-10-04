import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;



public class Lab12_2 extends Application{
	@Override
	public void start(Stage primaryStage){
		Button b=new Button("OK");
		Circle c=new Circle();
		c.setCenterX(200);
		c.setCenterY(200);
		c.setRadius(50);
		c.setStroke(Color. BLACK);
		c.setFill(null);
		StackPane p=new StackPane();
		p.setMinSize(200, 200);
		p.getChildren().addAll(c,b);
		Scene s=new Scene(p);
		primaryStage.setTitle("Circle and Button");
		primaryStage.setScene(s);
		primaryStage.show();
	}
	public static void main(String[] args){
		launch(args);
	}
}
