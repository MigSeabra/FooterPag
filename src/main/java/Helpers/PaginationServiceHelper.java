package Helpers;

public class PaginationServiceHelper {

    /**
     * Computes a footer pagination String before currentPage to be displayed at front-end
     * @param currentPage user current page
     * @param boundaryPages number of pages after the first page and before the last one
     * @param aroundPages number of pages before and after current page
     * @return footer pagination String before currentPage (without currentPage)
     */
    public static String pagBeforeCurrentPage(Integer currentPage,
                                       Integer boundaryPages,
                                       Integer aroundPages) {

        StringBuilder resp = new StringBuilder(currentPage - 1);
        resp.append(1);
        resp.append(" ");

        //Before current page
        if (currentPage >= (boundaryPages + aroundPages + 1)) {
            //boundaryPages
            for (Integer i = 2; i <= boundaryPages; i++) {
                resp.append(i);
                resp.append(" ");
            }
            //...
            if (currentPage > (boundaryPages + aroundPages + 1)) {
                resp.append("\u2026");
                resp.append(" ");
            }
            //aroundPages
            for (Integer i = (currentPage - aroundPages); i < currentPage; i++) {
                resp.append(i);
                resp.append(" ");
            }
        } else {
            //boundaryPages interleaved with aroundPages
            for (Integer i = 2; i < currentPage; i++) {
                resp.append(i);
                resp.append(" ");
            }
        }

        return resp.toString();
    }
}
