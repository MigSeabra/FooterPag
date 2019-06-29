import Exceptions.InvalidPaginationArguments;
import org.junit.Assert;
import org.junit.Test;

public class PaginationService {

    private Services.PaginationService pagService = new Services.PaginationService();

    @Test
    public void varags1Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(4, 45, 10, 1, 0);

        System.out.println("- Expectation: 1 \u2026 4 5");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1 \u2026 4 5", result);
    }

    @Test
    public void varags2Success() throws InvalidPaginationArguments {
        String result = pagService.footerPagination(5, 45, 10, 1, 0);

        System.out.println("- Expectation: 1 \u2026 5");
        System.out.println("- Result: " + result);

        Assert.assertEquals("1 \u2026 5", result);
    }
}
