import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import java.util.ArrayList;
import javafx.scene.layout.VBox;

import javafx.event.EventHandler;
import javafx.event.ActionEvent;


	 public class Lab14_1 extends Application{	
		public void start(Stage primaryStage) {
			ArrayList<Image> cards = new ArrayList<>();
			for (int i = 0; i < 55; i++) {
				cards.add(new Image("http://homepage.ntu.edu.tw/~albertchen/image/card/" +( i+1 )+ ".png"));			
			} 
			GridPane pane = new GridPane();
	        pane.setAlignment(Pos.CENTER);
	        pane.setPadding(new Insets(5));
	        pane.setHgap(0);
	        pane.setVgap(0);
			int[] five = new int[5];
			
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
		

			Button button=new Button("Refresh");
			button.setOnAction(new WashHandler(pane));
			VBox vb=new VBox();
			vb.setAlignment(Pos.CENTER);
			vb.getChildren().add(pane);
			vb.getChildren().add(button);
			
			Scene scene = new Scene(vb,360,140);
	        primaryStage.setTitle("ImageView");
	        primaryStage.setScene(scene);
	        primaryStage.show();
			
			
		}
		public static void main(String[] args) {
		launch(args);
		}
		
	}
	 class WashHandler implements EventHandler<ActionEvent> {
		  
		  GridPane pane;
		    WashHandler(GridPane pane){
		  this.pane = pane;
		  }
		    @Override // Override the handle method
		  public void handle(ActionEvent e) {
		    	ArrayList<Image> cards = new ArrayList<>();
				for (int i = 0; i < 55; i++) {
					cards.add(new Image("http://homepage.ntu.edu.tw/~albertchen/image/card/" +( i+1 )+ ".png"));			
				} 
		    	int[] five = new int[5];
				
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
		  }