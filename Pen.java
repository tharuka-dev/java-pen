public class Pen {

    String brand;
    String inkColor;
    double inkLevelMl;
    double currentInkLevelMl;
    boolean isCapOff;

    public Pen(String brand, String inkColor, double inkLevel, double currentInkLevelMl) {
        this.brand = brand;
        this.inkColor = inkColor;
        this.inkLevelMl = 0.25;
        this.currentInkLevelMl = currentInkLevelMl;
    }

    void capOn() {
        isCapOff = true;
    }

    void capOff() {
        isCapOff = false;
    }

    void write(String word) {
        // Assuming 150000 characters per 0.25ml (Total Capacity)        
        double inkPerChar = (inkLevelMl / 150000.0);
        int numChars = word.length();
        double inkPerWord = (inkPerChar * numChars);

        if (isCapOff && currentInkLevelMl >= (inkPerChar)) {
            if (currentInkLevelMl >= inkPerWord) {
                currentInkLevelMl -= inkPerWord;
                System.out.println("Successfully written: " + word);
            } else {
                int canWrittenChars = (int) (currentInkLevelMl / inkPerChar);
                String canWrittenPart = word.substring(0, canWrittenChars);
                String cantWrittenPart = word.substring(canWrittenChars);

                System.out.println("Successfully written: " + canWrittenPart);
                System.out.println("Unwritten due to low ink: " + cantWrittenPart);

                currentInkLevelMl -= (canWrittenChars * inkPerChar);
            }
        } else {
            if (!isCapOff) {
                System.out.println("Can't Write: The cap is on. Please remove the cap first.");
            } else {
                System.out.println("Can't Write: Out of ink!");
            }
        }
    }

}

class Test {

    public static void main(String[] args) {
        Pen blackPen = new Pen("Atles", "Black", 0.25, 0.000005);
        blackPen.capOn();
        blackPen.write("Hello, World!");
        blackPen.capOff();

        Pen redPen = new Pen("Atles", "Red", 0.25, 0.25);
        redPen.capOn();
        redPen.write("My Self");
        redPen.capOff();
    }
}
