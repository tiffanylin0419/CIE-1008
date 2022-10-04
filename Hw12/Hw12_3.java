import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import java.util.ArrayList;

import org.omg.CORBA.portable.InputStream;


	 public class Hw12_3 extends Application{	
		public void start(Stage primaryStage) {
			ArrayList<Image> cards = new ArrayList<Image>();
			for (int i = 0; i < 55; i++) {
				cards.add(new Image("http://homepage.ntu.edu.tw/~albertchen/image/card/" +( i+1 )+ ".png"));			
			} 
			GridPane pane = new GridPane();
	        pane.setAlignment(Pos.CENTER);
	        pane.setPadding(new Insets(5));
	        pane.setHgap(0);
	        pane.setVgap(0);
			int[] five = new int[5];
			
			Scene scene = new Scene(pane,360,96);
	        primaryStage.setTitle("ImageView");
	        primaryStage.setScene(scene);
	        primaryStage.show();
			
			for(int i =0; i<5; i++) {
				five[i] = (int)((Math.random()*54+1));
				for(int j=0; j<i; j++) {
					if(five[i]==five[j]) {
						five[i] = (int)((Math.random()*54+1));
						j=0;
					}
				}
				pane.add(new ImageView(cards.get(five[i])),i,0);
			}
		}
		public static void main(String[] args) {
		launch(args);
		}
		
	}