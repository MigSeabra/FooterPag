package Services;

import Exceptions.InvalidPaginationArguments;

import java.util.List;

public class PaginationService {

    /**
     * Computes a pagination String to be presented at front-end, allowing user to navigate
     * through a list of records, according to input parameters
     * @param currentPage: user current page
     * @param totalRecords: total records on list
     * @param pageSize: records per page
     * @param boundaryPages: number of pages after the first page and before the last one
     * @param aroundPages: number of pages before and after current page
     * @return a String to be displayed on front-end page footer
     * @throws InvalidPaginationArguments in case of invalid input arguments combination
     */
    public String footerPagination(Integer currentPage,
                                   Integer totalRecords,
                                   Integer pageSize,
                                   Integer boundaryPages,
                                   Integer aroundPages) throws InvalidPaginationArguments {

        if (currentPage == null
                || totalRecords == null
                || pageSize == null
                || boundaryPages == null
                || aroundPages == null) {
            throw new InvalidPaginationArguments("one argument is null");
        }

        Integer totalPages = totalRecords % pageSize;



        return null;
    }

}
