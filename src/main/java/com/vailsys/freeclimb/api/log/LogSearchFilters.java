package com.vailsys.freeclimb.api.log;

/**
 * Represents the possible fields one can set as filters when searching for
 * logs.
 */
public class LogSearchFilters {
    /**
     * The FreeClimb query language query. This represents a Lucene-like query that
     * will filter the list of logs.
     */
    private String pql;

    /**
     * Retrieve the value of the pql filter.
     *
     * @return The pql filter of the object.
     */
    public String getPql() {
        return pql;
    }

    /**
     * Set the pql filter of the object.
     *
     * @param pql The value to which to set the pql field.
     */
    public void setPql(String pql) {
        this.pql = pql;
    }
}
