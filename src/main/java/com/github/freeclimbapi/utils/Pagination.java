package com.github.freeclimbapi.utils;

public interface Pagination {
    public Integer getTotal();

    public void setTotal(Integer total);

    public Integer getStart();

    public void setStart(Integer start);

    public Integer getEnd();

    public void setEnd(Integer end);

    public Integer getPage();

    public void setPage(Integer page);

    public Integer getNumPages();

    public void setNumPages(Integer numPages);

    public Integer getPageSize();

    public void setPageSize(Integer pageSize);

    public String getNextPageUri();

    public void setNextPageUri(String nextPageUri);
}
