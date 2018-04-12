package com.lecture48.encapsulation;

public final class Printer {

    public double getTonerLevel() {
        return this.tonerLevel;
    }

    private double tonerLevel = 100;
    private int pagesPrinted;
    private int paperCount = 500;
    private boolean duplexPrinter;

    public int getPaperCount() {
        return this.paperCount;
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }


    public Printer(double tonerLevel, int pagesPrinted, int paperCount, boolean duplexPrinter) {
        if(tonerLevel >0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = pagesPrinted;
        this.paperCount = paperCount;
        this.duplexPrinter = duplexPrinter;
    }


    public void reduceToneLevelWhenPageIsPrinted() {
        double tonerConsumed = tonerLevel - (pagesPrinted*0.01);
        if(tonerConsumed <=0)
            throw new IllegalArgumentException("Ran out of Toner");
        else tonerLevel = tonerConsumed;
    }

    public void fillToner(double amountToFill) {
        double tonerFilled = tonerLevel + amountToFill;
        if(tonerFilled >100)
            throw new IllegalArgumentException("Overfilled");
        else tonerLevel = tonerFilled;
    }

    public void increaseNumberOfPagesPrinted() {
        pagesPrinted =+pagesPrinted;
    }

    public void paperLevelReduces() {
        if(!duplexPrinter)
            paperCount = paperCount - pagesPrinted;
        else
            paperCount = paperCount - (pagesPrinted/2);

        if(paperCount < 0)
            throw new IllegalArgumentException("Tray is Out of paper");
    }
}
