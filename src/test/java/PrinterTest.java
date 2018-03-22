import org.hamcrest.core.Is;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public final class PrinterTest {
    @Test
    public void ShouldReturnTheDefaultTonerLevel() {
        Printer printer = new Printer(200D, 10, 100, true);
        assertThat(printer.getTonerLevel(), Is.is(100D));
    }

    @Test
    public void ShouldReduceTheTonerLevelWhenAPageIsPrinted() {
        Printer printer = new Printer(100D, 10, 100, true);
        printer.reduceToneLevelWhenPageIsPrinted();
        assertThat(printer.getTonerLevel(), Is.is(99.90D));
    }

    @Test (expected = IllegalArgumentException.class)
    public void ShouldThrowAnErrorWhenThereIsNoTonerLeft() {
        Printer printer = new Printer(1, 2000, 1000, true);
        printer.reduceToneLevelWhenPageIsPrinted();
    }

    @Test
    public void ShouldBeAbleToFillTheToner() {
        Printer printer = new Printer(10D, 20, 100, true);
        printer.fillToner(30D);
        assertThat(printer.getTonerLevel(), Is.is(40D));
    }

    @Test (expected = IllegalArgumentException.class)
    public void ShouldThrowAnErrorWhenTryingToFillMoreThanCapacity() {
        Printer printer = new Printer(80D, 10, 100, true);
        printer.fillToner(30D);
    }

    @Test
    public void ShouldIncreaseTheNumberOfPagesPrinted() {
        Printer printer = new Printer(20D, 30, 100, true);
        printer.increaseNumberOfPagesPrinted();
        assertThat(printer.getPagesPrinted(), Is.is(30));
    }

    @Test
    public void ShouldReduceThePaperInTheTrayWhenPagesArePrinted() {
        Printer printer = new Printer(30D, 50, 100, false);
        printer.paperLevelReduces();
        assertThat(printer.getPaperCount(), Is.is(50));
    }

    @Test
    public void ShouldReduceThePaperInTheTrayByHalfOfPagesPrintedIfItsaDuplexPrinter() {
        Printer printer = new Printer(30D,50, 25, true);
        printer.paperLevelReduces();
        assertThat(printer.getPaperCount(), Is.is(0));
    }

    @Test (expected = IllegalArgumentException.class)
    public void ShouldThrowErrorIfPrintsOutNumberThePaper() {
        Printer printer = new Printer(30, 80, 50, false);
        printer.paperLevelReduces();
    }
}
