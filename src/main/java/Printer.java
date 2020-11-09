public class Printer {

    private int paperLeft;
    private int tonerLeft;

    public Printer(int paperLeft, int tonerLeft) {
        this.paperLeft = paperLeft;
        this.tonerLeft = tonerLeft;
    }

    public int getPaperLeft() {
        return paperLeft;
    }

    public int getTonerLeft() {
        return tonerLeft;
    }

    public void print(int copies, int pages) {
        int totalSheets = copies * pages;
        if (this.paperLeft >= totalSheets && this.tonerLeft >= totalSheets) {
            this.paperLeft -= totalSheets;
            this.tonerLeft -= totalSheets;
        }
    }
}
