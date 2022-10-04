import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javafx.beans.property.DoubleProperty;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
public class ClockPane extends Pane {
 private int hour;
 private int minute;
 private int second;
 private double w = 250,h = 250;
// Clock pane's width and height

 /** Construct a default clock with the current time*/
 public ClockPane() {
	 setCurrentTime();
 }
 /** Construct a clock with specified hour, minute, and second */
 public ClockPane(int hour, int minute, int second) {
 this.hour = hour;
 this.minute = minute;
 this.second = second;
 	paintClock();
 }
 public int getHour() {
 return hour;
 }
 public void setHour(int hour) {
	 this.hour = hour;
	 paintClock();
	 }
	 public int getMinute() {
	 return minute;
	 }
	 public void setMinute(int minute) {
	 this.minute = minute;
	 paintClock();
	 }
	 public int getSecond() {
	 return second;
	 }
	 public void setSecond(int second) {
	 this.second = second;
	 paintClock();
	 }
	
	  public double getW() { 
		 return w;
	 }
	 public void setW(double w) {
		 this.w = w;
		 paintClock();
	 }


	 public double getH() {
	 return h;
	 }

	 public void setH(double h) {
	 this.h = h;
	 paintClock();
	 }

	 public void setCurrentTime() {
	 // Construct a calendar for the current date and time
	 Calendar calendar = new GregorianCalendar();
	 this.hour = calendar.get(Calendar.HOUR_OF_DAY);
	 this.minute = calendar.get(Calendar.MINUTE);
	 this.second = calendar.get(Calendar.SECOND);

	 paintClock(); // Repaint the clock
	 }

	 private void paintClock() {
		// Initialize clock parameters
		 double clockRadius = Math.min(w, h) * 0.8 * 0.5;
		 double centerX = w / 2;
		 double centerY = h / 2;
		 // Draw circle
		 Circle circle = new Circle(clockRadius);
		 circle.centerXProperty().bind(this.widthProperty().divide(2)); 
		 circle.centerYProperty().bind(this.heightProperty().divide(2)); 
		 circle.setFill(Color.WHITE);
		 circle.setStroke(Color.BLACK);
		
		 // Draw second hand
		 Text t1 = new Text("12");
		 t1.xProperty().bind(circle.centerXProperty().subtract(5)); //幹有夠難
		 t1.yProperty().bind(circle.centerYProperty().add(12 - clockRadius));
		 Text t2 = new Text("9");
		 t2.xProperty().bind(circle.centerXProperty().subtract(clockRadius - 3)); //幹有夠難
		 t2.yProperty().bind(circle.centerYProperty().add(5));
		 Text t3 = new Text("3");
		 t3.xProperty().bind(circle.centerXProperty().subtract(10 - clockRadius)); //幹有夠難
		 t3.yProperty().bind(circle.centerYProperty().add(3));
		 Text t4 = new Text("6"); 
		 t4.xProperty().bind(circle.centerXProperty().subtract(3)); //幹有夠難
		 t4.yProperty().bind(circle.centerYProperty().add(clockRadius - 3));//幹有夠難
		 
		 double sLength = clockRadius * 0.8; 
		 Line sLine = new Line(); 
		 sLine.startXProperty().bind(circle.centerXProperty());//幹有夠難
		 sLine.startYProperty().bind(circle.centerYProperty());//幹有夠難
		 sLine.endXProperty().bind(circle.centerXProperty().add(sLength*Math.sin(second * (2 * Math.PI / 60))));//幹有夠難
		 sLine.endYProperty().bind(circle.centerYProperty().subtract(sLength*Math.cos(second * (2 * Math.PI / 60))));//幹有夠難
		 sLine.setStroke(Color.RED); 
		 
		 double mLength = clockRadius * 0.65; 
		 Line mLine = new Line();
		 mLine.startXProperty().bind(circle.centerXProperty());//幹有夠難
		 mLine.startYProperty().bind(circle.centerYProperty());//幹有夠難
		 mLine.endXProperty().bind(circle.centerXProperty().add(mLength*Math.sin(minute * (2 * Math.PI / 60))));//幹有夠難
		 mLine.endYProperty().bind(circle.centerYProperty().subtract(mLength*Math.cos(minute * (2 * Math.PI / 60))));//幹有夠難
		 mLine.setStroke(Color.BLUE); 
		 
		 double hLength = clockRadius * 0.5; 
		 Line hLine = new Line(); 
		 hLine.startXProperty().bind(circle.centerXProperty());//幹有夠難
		 hLine.startYProperty().bind(circle.centerYProperty());//幹有夠難
		 hLine.endXProperty().bind(circle.centerXProperty().add(hLength*Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12))));//幹有夠難
		 hLine.endYProperty().bind(circle.centerYProperty().subtract(hLength*Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12))));//幹有夠難
		 hLine.setStroke(Color.GREEN); 

		 getChildren().clear();
		 getChildren().addAll(circle, t1, t2, t3, t4, sLine, mLine,
		hLine);
		 
	 }
 }