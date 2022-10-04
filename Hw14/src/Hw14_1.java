import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class Hw14_1 extends Application{	
	@Override
	public void start(Stage primaryStage) {
		
		Label l1=new Label("Annual Interest Rate:");
		Label l2=new Label("Number of Years:");
		Label l3=new Label("Loan Amount:");
		Label l4=new Label("Monthly Payment:");
		Label l5=new Label("Total Payment:");
		
		
		TextField t1 = new TextField ();
		TextField t2 = new TextField ();
		TextField t3 = new TextField ();
		TextField t4 = new TextField ();
		TextField t5 = new TextField ();
		
		Button b=new Button("Calculate");
		
		
		GridPane pane=new GridPane();
		pane.setPadding(new Insets(10,10,10,10));
	
		pane.setHgap(10);
		pane.setVgap(10);
		pane.add(l1,0,0);
		pane.add(l2,0,1);
		pane.add(l3,0,2);
		pane.add(l4,0,3);
		pane.add(l5,0,4);
		
		pane.add(t1,1,0);
		pane.add(t2,1,1);
		pane.add(t3,1,2);
		pane.add(t4,1,3);
		pane.add(t5,1,4);
		
		pane.add(b,1,5);
		b.setOnAction(new CountHandler(t1,t2,t3,t4,t5));
		
		Scene scene = new Scene(pane,360,240);
        primaryStage.setTitle("ImageView");
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	public static void main(String[] args){
		launch(args);
	}//如果用command line寫就不用這個

}
class CountHandler implements EventHandler<ActionEvent> {
	double n1,n2,n3;
	String s1,s2,s3;
	TextField t1,t2,t3,t4,t5;
	CountHandler(TextField t1,TextField t2,TextField t3,TextField t4,TextField t5){
		this.t1=t1;
		this.t2=t2;
		this.t3=t3;
		this.t4=t4;
		this.t5=t5;
		
	}
	@Override // Override the handle method
	public void handle(ActionEvent e) {
		s1=t1.getText();
		s2=t2.getText();
		s3=t3.getText();
		n1=Double.parseDouble(s1);
		n2=Double.parseDouble(s2);
		n3=Double.parseDouble(s3);
		double num1=(n1*n3*Math.pow(1+n1/1200, 12*n2))/(1200*(Math.pow(1+n1/1200, 12*n2)-1));
	    t4.setText(String.format("%.2f", num1));
	    double num2=num1*12*n2;
	    t5.setText(String.format("%.2f", num2));
	}
}