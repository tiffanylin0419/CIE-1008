import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;



public class Hw14_3 extends Application{
		
		@Override
		public void start(Stage primaryStage){
			
			Rectangle r=new Rectangle(100,40);
			r.setX(50);
			r.setY(40);
			r.setStroke(Color. BLACK);
			r.setFill(null);
			
			Text text=new Text("Mouse Point is outside the rectangle");
			text.setOnMouseMoved(e -> {
				text.setX(e.getX());
				text.setY(e.getY());
				Node n=new Node(e.getX(),e.getY());
				if(n.contains()) 
					text.setText("Mouse Point is inside the rectangle");
				else 
					text.setText("Mouse Point is outside the rectangle");
			});
			Pane p=new Pane();
			p.getChildren().add(r);
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
class Node{
	double x,y;
	Node(double x, double y){
		this.x=x;
		this.y=y;
	}
	public boolean contains() {
		if(x>=50 && x <=150&&y<=80&&y>=40)
			return true;
		else
			return false;
	}
	
	
}
