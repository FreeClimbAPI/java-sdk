package com.vailsys.persephony.api.queue.member;

import com.vailsys.persephony.api.PersyException;
import com.vailsys.persephony.api.PersyList;

/**
 * Represents a paginated list of Persephony Member instances. This object will
 * be automatically created by a
 * {@link com.vailsys.persephony.api.queue.member.MembersRequester} inside a
 * {@link com.vailsys.persephony.api.PersyClient} instance and its creation
 * should not be a concern of the SDK user.
 *
 * @see com.vailsys.persephony.api.PersyList
 */
public class MemberList extends PersyList<Member> {

    /**
     * Creates a new MemberList.
     *
     * @param accountId the accountId to use in requests for subsequent pages.
     * @param authToken the authToken to use in requests for subsequent pages.
     * @param rawPage the raw JSON string representing a page of a member list from the Persephony API.
     * @throws PersyException when the page is not valid JSON.
     */
    public MemberList(String accountId, String authToken, String rawPage) throws PersyException {
        super(accountId, authToken, rawPage, "queueMembers", Member.class);
    }
}
