package dat102_oblig2.oppg3;

public class FraktalTrekant extends Fraktal {

    public FraktalTrekant(int depth, int delay, Tegneflate canvas) {
        super(depth, delay, canvas);
    }

    @Override
    public void tegn() {
        // Starter med å kalle drawTriangle med startkoordinatene
        drawTriangle(depth, 410, 20, 20, 800, 800, 800);
    }

    private void drawTriangle(int level, int x1, int y1, int x2, int y2, int x3, int y3) {
        // Tegner den aktuelle trekanten
        canvas.tegnTrekant(x1, y1, x2, y2, x3, y3);
        ventMillis(delay);

        if (level > 0) {
            // Finner midtpunktene på hver side av trekanten
            int midX1 = (x1 + x2) / 2;
            int midY1 = (y1 + y2) / 2;

            int midX2 = (x2 + x3) / 2;
            int midY2 = (y2 + y3) / 2;

            int midX3 = (x3 + x1) / 2;
            int midY3 = (y3 + y1) / 2;

            // Tegner de tre nye trekantene rekursivt
            drawTriangle(level - 1, x1, y1, midX1, midY1, midX3, midY3); // Trekant 1
            drawTriangle(level - 1, midX1, midY1, x2, y2, midX2, midY2); // Trekant 2
            drawTriangle(level - 1, midX3, midY3, midX2, midY2, x3, y3); // Trekant 3
        }
    }
}