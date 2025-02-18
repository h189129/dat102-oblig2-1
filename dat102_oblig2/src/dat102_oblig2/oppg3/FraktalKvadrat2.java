package dat102_oblig2.oppg3;

public class FraktalKvadrat2 extends Fraktal {

	public FraktalKvadrat2(int depth, int delay, Tegneflate canvas) {
		super(depth, delay, canvas);
	}

	@Override
	public void tegn() {
		drawSquare(depth, 20, 20, 800, 800);
	}
	
	private void drawSquare(int level, int p1X, int p1Y, int p2X, int p2Y) {
		
		canvas.tegnFirkant(p1X, p1Y, p2X, p2Y);
		ventMillis(delay);
	    
		if (level > 0) {
	        // Finner midtpunktene for å dele kvadratet i fire mindre kvadrater
	        int midX = (p1X + p2X) / 2;
	        int midY = (p1Y + p2Y) / 2;

	        // Tegner kvadrat i øvre venstre hjørne rekursivt
	        drawSquare(level - 1, p1X, p1Y, midX, midY);

	        // Tegner kvadrat i nedre høyre hjørne rekursivt
	        drawSquare(level - 1, midX, midY, p2X, p2Y);
	    }
	}
}
