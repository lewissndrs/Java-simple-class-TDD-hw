import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {

    Printer epson;

    @Before
    public void before() {
        epson = new Printer(100,80);
    }

    @Test
    public void hasPaper() {
        assertEquals(100,epson.getPaperLeft());
    }

    @Test
    public void hasPrint() {
        epson.print(20,2);
        assertEquals(60,epson.getPaperLeft());
    }

    @Test
    public void willNotPrintTooLargeJob() {
        epson.print(50,3);
        assertEquals(100,epson.getPaperLeft());
    }

    @Test
    public void hasToner() {
        assertEquals(80,epson.getTonerLeft());
    }

    @Test
    public void willReduceTonerPerPage() {
        epson.print(2,3);
        assertEquals(74,epson.getTonerLeft());
    }

    @Test
    public void willNotPrintIfNotEnoughToner() {
        epson.print(30,3);
        assertEquals(80,epson.getTonerLeft());
    }


}
