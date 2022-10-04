import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;



public class Lab14_3 extends Application{
		
			@Override
			public void start(Stage primaryStage){
				Circle c=new Circle();
				c.setRadius(50);
				c.setCenterX(100);
				c.setCenterY(60);
				c.setStroke(Color. BLACK);
				c.setFill(null);

				Text text=new Text("Mouse Point is outside the circle");
				text.setOnMouseMoved(e -> {
					text.setX(e.getX());
					text.setY(e.getY());
					if(Math.pow(e.getX()-100, 2)+Math.pow(e.getY()-60, 2)<2500) 
						text.setText("Mouse Point is inside the circle");
					else 
						text.setText("Mouse Point is outside the circle");
				});
				Pane p=new Pane();
				p.getChildren().add(c);
				p.getChildren().add(text);
				Scene s=new Scene(p,400,150);
				primaryStage.setTitle("Mouse Circle");
				primaryStage.setScene(s);
				primaryStage.show();//要記得
			}
			
	
			public static void main(String[] args){
				launch(args);
			}//如果用command line寫就不用這個

}
