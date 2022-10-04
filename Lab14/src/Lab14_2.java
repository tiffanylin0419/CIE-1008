import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;

public class Lab14_2 extends Application{
	public static int i=0;
		@Override
		public void start(Stage primaryStage){
			Text text=new Text("Learning JavaFX");
			
			GridPane pane=new GridPane();
			pane.getChildren().add(text);
			pane.setAlignment(Pos.CENTER);
			pane.setOnMouseClicked(e -> {
				i++;
				if(i/2==0) 
					text.setText("JavaFX is cool");
				else 
					text.setText("Learning JavaFX");
		    });

			Scene s=new Scene(pane,200,250);//Scene s=new Scene(pane);
			primaryStage.setTitle("Mouse Click");
			primaryStage.setScene(s);
			primaryStage.show();//要記得
		}
		public static void main(String[] args){
			launch(args);
		}//如果用command line寫就不用這個
	}

