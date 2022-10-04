
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import java.util.ArrayList;
import javafx.scene.layout.VBox;

import javafx.event.EventHandler;
import javafx.event.ActionEvent;


public class Hw14_4 extends Application{	
	public void start(Stage primaryStage) {
		ArrayList<Image> cards = new ArrayList<>();
		cards.add(new Image("image/albert.jpg"));			
		cards.add(new Image("image/david.jpg"));		
		cards.add(new Image("image/patrick.jpg"));	
		
		BorderPane pane = new BorderPane();
	   
	    pane.setPadding(new Insets(5));
		pane.setCenter(new ImageView(cards.get(0)));
		
	    
		Button b1=new Button("Patrick");
		Button b2=new Button("David");
		Button b3=new Button("Albert");
		HBox hb=new HBox(10);
		
		hb.getChildren().add(b1);
		hb.getChildren().add(b2);
		hb.getChildren().add(b3);
		b3.setOnAction(e->{
			pane.setCenter(new ImageView(cards.get(0)));
	
		});
		
		b2.setOnAction(e->{
			pane.setCenter(new ImageView(cards.get(1)));
	
		});
		b1.setOnAction(e->{
			pane.setCenter(new ImageView(cards.get(2)));
	
		});
		pane.setBottom(hb);
		hb.setAlignment(Pos.CENTER);
		Scene scene = new Scene(pane,300,200);
	    primaryStage.setTitle("Computer Programming Teachers");
	    primaryStage.setScene(scene);
	    primaryStage.show();
			
			
		}
	public static void main(String[] args) {
	launch(args);
	}
		
}
