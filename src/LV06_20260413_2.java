public class LV06_20260413_2 {
    static void main(String[] args) {
        Scanable[] myScanables = {
                new Position(),
                new Rechteck(),
                new Position(4,4),
                new Kreis(),
                new Quadrat()
        };
        for (int i = 0; i < myScanables.length; i++) {
            myScanables[i].scan();
        }
    }
}



