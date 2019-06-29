package Services;

import Exceptions.InvalidPaginationArguments;

/**
 * Data pagination related service
 */
public class PaginationService {

    /**
     * Computes a pagination String to be presented at front-end, allowing user to navigate
     * through a list of records, according to input parameters
     * @param currentPage user current page
     * @param totalRecords total records on list
     * @param pageSize records per page
     * @param boundaryPages number of pages after the first page and before the last one
     * @param aroundPages number of pages before and after current page
     * @return a String to be displayed on front-end page footer
     * @throws InvalidPaginationArguments in case of invalid input arguments combination
     */
    public String footerPagination(Integer currentPage,
                                   Integer totalRecords,
                                   Integer pageSize,
                                   Integer boundaryPages,
                                   Integer aroundPages) throws InvalidPaginationArguments {

        validatePaginationArgs(currentPage, totalRecords, pageSize, boundaryPages, aroundPages);

        int totalPages = (int)Math.ceil((double)(totalRecords)/pageSize);

        String resp = pagBeforeCurrentPage(currentPage, boundaryPages, aroundPages);
        resp = resp + currentPage.toString() + pagAfterCurrentPage(currentPage, boundaryPages, aroundPages, totalPages);

        return resp;
    }

    /**
     * Validates input pagination arguments combination
     * @param currentPage user current page
     * @param totalRecords total records on list
     * @param pageSize records per page
     * @param boundaryPages number of pages after the first page and before the last one
     * @param aroundPages number of pages before and after current page
     * @throws InvalidPaginationArguments in case of invalid input arguments combination
     */
    private void validatePaginationArgs(Integer currentPage,
                                        Integer totalRecords,
                                        Integer pageSize,
                                        Integer boundaryPages,
                                        Integer aroundPages) throws InvalidPaginationArguments {

        if (currentPage == null || totalRecords == null || pageSize == null || boundaryPages == null || aroundPages == null) {
            throw new InvalidPaginationArguments("one argument is null");
        }

        if (currentPage <= 0 || totalRecords <= 0 || pageSize <= 0 || boundaryPages <= 0 || aroundPages < 0) {
            throw new InvalidPaginationArguments("negative or zero argument");
        }

        int totalPages = (int)Math.ceil((double)(totalRecords)/pageSize);
        if (currentPage > totalPages) {
            throw new InvalidPaginationArguments("currentPage must be lower than total pages number");
        }

        //validate boundaries and around
    }

    /**
     * Computes a footer pagination String before currentPage to be displayed at front-end
     * @param currentPage user current page
     * @param boundaryPages number of pages after the first page and before the last one
     * @param aroundPages number of pages before and after current page
     * @return footer pagination String before currentPage (without currentPage)
     */
    private String pagBeforeCurrentPage(Integer currentPage, Integer boundaryPages, Integer aroundPages) {

        StringBuilder resp = new StringBuilder(boundaryPages + 1 + aroundPages);
        resp.append(1);
        resp.append(" ");

        if (currentPage >= (boundaryPages + aroundPages + 1)) {
            //boundaryPages
            for (int i = 2; i <= boundaryPages; i++) {
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

    /**
     * Computes a footer pagination String after currentPage to be displayed at front-end
     * @param currentPage user current page
     * @param boundaryPages number of pages after the first page and before the last one
     * @param aroundPages number of pages before and after current page
     * @param totalPages total number of pages
     * @return footer pagination String after currentPage (without currentPage)
     */
    private String pagAfterCurrentPage(Integer currentPage, Integer boundaryPages, Integer aroundPages, Integer totalPages) {
        StringBuilder resp = new StringBuilder(boundaryPages + 1 + aroundPages);

        if (currentPage <= (totalPages - boundaryPages - aroundPages)) {
            //aroundPages
            for (int i = (currentPage + 1); i <= (currentPage + aroundPages); i++) {
                resp.append(i);
                resp.append(" ");
            }
            //...
            if (currentPage < (totalPages - boundaryPages - aroundPages)) {
                resp.append("\u2026");
                resp.append(" ");
            }
            //boundaryPages
            for (Integer i = (totalPages - aroundPages + 1); i <= totalPages; i++) {
                resp.append(i);
                resp.append(" ");
            }
        } else {
            //boundaryPages interleaved with aroundPages
            for (Integer i = (currentPage + 1); i <= totalPages; i++) {
                resp.append(i);
                resp.append(" ");
            }
        }

        resp.deleteCharAt(resp.length() - 1);

        return resp.toString();
    }
}