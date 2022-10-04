public class TestGraphicsObject {
    public static void main(String[] args) {
      GraphicsObject[] go = new GraphicsObject[3];
      go[0] = new Rectangle(1,2);
      go[1] = new Box(2,3,4);
      go[2] = new Rectangle(3,4);
      for (int i=0; i<go.length; i++) {
        System.out.println(go[i]);
} }
}
