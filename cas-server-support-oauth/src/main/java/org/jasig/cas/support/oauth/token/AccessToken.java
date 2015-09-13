/*
 * Licensed to Apereo under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Apereo licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jasig.cas.support.oauth.token;

import org.jasig.cas.authentication.principal.Service;
        import org.jasig.cas.ticket.ServiceTicket;
        import org.jasig.cas.ticket.TicketGrantingTicket;

/**
 * Access Token.
 *
 * @author Michael Haselton
 * @since 4.1.0
 */
public interface AccessToken extends Token {

    /** Prefix generally applied to unique ids generated
     * by {@link org.jasig.cas.util.UniqueTicketIdGenerator}.
     **/
    String PREFIX = "AT";

    /**
     * Retrieves the ticket granting ticket.
     *
     * @return the requested ticket granting ticket.
     */
    TicketGrantingTicket getTicketGrantingTicket();

    /**
     * Retrieves the service.
     *
     * @return the requested service.
     */
    Service getService();

    /**
     * Retrieves the service ticket.
     *
     * @return the requested service ticket.
     */
    ServiceTicket getServiceTicket();
}
