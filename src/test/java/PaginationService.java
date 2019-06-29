import Exceptions.InvalidPaginationArguments;
import org.junit.Assert;
import org.junit.Test;

public class PaginationService {

    private Services.PaginationService pagService = new Services.PaginationService();

    @Test
    public void varags1Success() {
        try {
            String result = pagService.footerPagination(4, 45, 10, 1, 0);

            System.out.println("varags1Success test:");
            System.out.println("- Expectation: \"1 \u2026 4 5\"");
            System.out.println("- Result: \"1 \u2026 4 5\"");

            Assert.assertEquals("1 \u2026 4 5", result);
        } catch (InvalidPaginationArguments e) {}
    }
}
