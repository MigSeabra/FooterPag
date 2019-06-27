import Exceptions.InvalidPaginationArguments;
import Services.PaginationService;

public class Application {

    /**
     * Allows Pagination Service footerPagination to be run
     * as a script by accepting its input parameters
     * @param args Must contain the following input parameters:
     * - currentpage: user current page;
     * - totalrecords: total records on list;
     * - pagesize: records per page
     * - boundaries: number of pages after the first page and before the last one
     * - around: number of pages before and after current page
     */
    public static void main(String ... args) {

        if (args == null || args.length != 5) {
            System.out.println("Invalid input arguments number, please try again");
            System.exit(-1);
        }

        PaginationService pagService = new PaginationService();

        try {
            Integer currentPage = Integer.parseInt(args[0]);
            Integer totalRecords = Integer.parseInt(args[1]);
            Integer pageSize = Integer.parseInt(args[2]);
            Integer boundaryPages = Integer.parseInt(args[3]);
            Integer aroundPages = Integer.parseInt(args[4]);

            String footerPag = pagService.footerPagination(currentPage,
                    totalRecords,
                    pageSize,
                    boundaryPages,
                    aroundPages);

            System.out.println(footerPag);
        } catch (NumberFormatException | InvalidPaginationArguments e) {
            System.out.println("Invalid input argument: " + e.getMessage());
        }
    }
}