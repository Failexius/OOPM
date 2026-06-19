public class KreisTest {
    public void Kreis_Kleiner_Als_Null_Test(){
        Kreis test = new Kreis();
        test.setRadius(1);
        try {
            if (test.getRadius() == 0){
                System.out.println("Radius is zero");
            }
        } catch (KreisException e) {
            throw new KreisException("Fehler: " + e.getMessage());
        }
    }
}
