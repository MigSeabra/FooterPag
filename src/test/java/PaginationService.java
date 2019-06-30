import Exceptions.InvalidPaginationArguments;
import org.junit.Assert;
import org.junit.Test;

public class PaginationService {

    private Services.PaginationService pagService = new Services.PaginationService();

    @Test
    public void varags1Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(4, 45, 10, 1, 0);

        System.out.println("varags1Success test:");
        System.out.println("- Expectation: 1 \u2026 4 5");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1 \u2026 4 5", result);
    }

    @Test
    public void varags2Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(4, 91, 10, 2, 2);

        System.out.println("varags2Success test:");
        System.out.println("- Expectation: 1 2 3 4 5 6 \u2026 9 10");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1 2 3 4 5 6 \u2026 9 10", result);
    }

    @Test
    public void varags3Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(5, 100, 24, 1, 2);

        System.out.println("varags3Success test:");
        System.out.println("- Expectation: 1 \u2026 3 4 5");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1 \u2026 3 4 5", result);
    }

    @Test
    public void varags4Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(1, 100, 24, 1, 0);

        System.out.println("varags4Success test:");
        System.out.println("- Expectation: 1 \u2026 5");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1 \u2026 5", result);
    }

    @Test
    public void varags5Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(1, 1, 10, 1, 0);

        System.out.println("varags5Success test:");
        System.out.println("- Expectation: 1");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1", result);
    }

    @Test
    public void varags6Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(7, 100, 5, 2, 3);

        System.out.println("varags6Success test:");
        System.out.println("- Expectation: 1 2 \u2026 4 5 6 7 8 9 10 \u2026 19 20");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1 2 \u2026 4 5 6 7 8 9 10 \u2026 19 20", result);
    }

    @Test
    public void varags7Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(7, 100, 5, 4, 0);

        System.out.println("varags7Success test:");
        System.out.println("- Expectation: 1 2 3 4 \u2026 7 \u2026 17 18 19 20");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1 2 3 4 \u2026 7 \u2026 17 18 19 20", result);
    }

    @Test
    public void varags8Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(1, 100, 10, 20, 0);

        System.out.println("varags8Success test:");
        System.out.println("- Expectation: 1 2 3 4 5 6 7 8 9 10");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1 2 3 4 5 6 7 8 9 10", result);
    }

    @Test
    public void varags9Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(10, 100, 10, 1, 10);

        System.out.println("varags9Success test:");
        System.out.println("- Expectation: 1 2 3 4 5 6 7 8 9 10");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1 2 3 4 5 6 7 8 9 10", result);
    }

    @Test
    public void varags10Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(10, 100, 10, 1, 7);

        System.out.println("varags10Success test:");
        System.out.println("- Expectation: 1 \u2026 3 4 5 6 7 8 9 10");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1 \u2026 3 4 5 6 7 8 9 10", result);
    }

    @Test
    public void varags11Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(10, 100, 10, 1, 8);

        System.out.println("varags11Success test:");
        System.out.println("- Expectation: 1 2 3 4 5 6 7 8 9 10");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1 2 3 4 5 6 7 8 9 10", result);
    }

    @Test
    public void varags12Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(2, 100, 10, 4, 1);

        System.out.println("varags12Success test:");
        System.out.println("- Expectation: 1 2 3 4 \u2026 7 8 9 10");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1 2 3 4 \u2026 7 8 9 10", result);
    }

    @Test
    public void varags13Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(1, 79, 10, 3, 1);

        System.out.println("varags13Success test:");
        System.out.println("- Expectation: 1 2 3 \u2026 6 7 8");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1 2 3 \u2026 6 7 8", result);
    }

    @Test
    public void varags14Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(1, 79, 10, 3, 1);

        System.out.println("varags14Success test:");
        System.out.println("- Expectation: 1 2 3 \u2026 6 7 8");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1 2 3 \u2026 6 7 8", result);
    }

    @Test
    public void varags15Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(1, 69, 10, 4, 1);

        System.out.println("varags15Success test:");
        System.out.println("- Expectation: 1 2 3 4 5 6 7");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1 2 3 4 5 6 7", result);
    }

    @Test
    public void varags16Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(1, 100, 10, 4, 1);

        System.out.println("varags16Success test:");
        System.out.println("- Expectation: 1 2 3 4 \u2026 7 8 9 10");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1 2 3 4 \u2026 7 8 9 10", result);
    }

    @Test
    public void varags17Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(1, 40, 10, 4, 7);

        System.out.println("varags17Success test:");
        System.out.println("- Expectation: 1 2 3 4");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1 2 3 4", result);
    }

    @Test
    public void varags18Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(5, 90, 10, 4, 1);

        System.out.println("varags18Success test:");
        System.out.println("- Expectation: 1 2 3 4 5 6 7 8 9");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1 2 3 4 5 6 7 8 9", result);
    }

    @Test
    public void varags19Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(7, 90, 10, 1, 4);

        System.out.println("varags19Success test:");
        System.out.println("- Expectation: 1 \u2026 3 4 5 6 7 8 9");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1 \u2026 3 4 5 6 7 8 9", result);
    }

    @Test
    public void varags20Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(9, 90, 10, 4, 1);

        System.out.println("varags20Success test:");
        System.out.println("- Expectation: 1 2 3 4 \u2026 6 7 8 9");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1 2 3 4 \u2026 6 7 8 9", result);
    }

    @Test
    public void varags21Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(8, 80, 10, 4, 1);

        System.out.println("varags21Success test:");
        System.out.println("- Expectation: 1 2 3 4 5 6 7 8");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1 2 3 4 5 6 7 8", result);
    }

    @Test
    public void varags22Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(6, 60, 10, 4, 1);

        System.out.println("varags22Success test:");
        System.out.println("- Expectation: 1 2 3 4 5 6");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1 2 3 4 5 6", result);
    }

    @Test
    public void varags23Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(6, 90, 10, 4, 0);

        System.out.println("varags23Success test:");
        System.out.println("- Expectation: 1 2 3 4 \u2026 6 7 8 9");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1 2 3 4 \u2026 6 7 8 9", result);
    }

    @Test
    public void varags24Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(7, 90, 10, 4, 1);

        System.out.println("varags24Success test:");
        System.out.println("- Expectation: 1 2 3 4 \u2026 6 7 8 9");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1 2 3 4 \u2026 6 7 8 9", result);
    }

    @Test
    public void varags25Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(6, 110, 10, 4, 0);

        System.out.println("varags25Success test:");
        System.out.println("- Expectation: 1 2 3 4 \u2026 6 \u2026 8 9 10 11");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1 2 3 4 \u2026 6 \u2026 8 9 10 11", result);
    }

    @Test
    public void varags26Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(5, 90, 10, 4, 0);

        System.out.println("varags26Success test:");
        System.out.println("- Expectation: 1 2 3 4 5 6 7 8 9");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1 2 3 4 5 6 7 8 9", result);
    }
}
