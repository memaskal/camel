/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.smpp.SmppSessionGroupsComponent;

/**
 * Camel SMPP support
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface SmppsGrpComponentBuilderFactory {

    /**
     * SMPP-GROUP (camel-smpp)
     * Camel SMPP support
     * 
     * Category: mobile
     * Since: 3.7
     * Maven coordinates: org.apache.camel:camel-smpp
     * 
     * @return the dsl builder
     */
    static SmppsGrpComponentBuilder smppsGrp() {
        return new SmppsGrpComponentBuilderImpl();
    }

    /**
     * Builder for the SMPP-GROUP component.
     */
    interface SmppsGrpComponentBuilder
            extends
                ComponentBuilder<SmppSessionGroupsComponent> {
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * Smpp groups configuration used to generate and initialize smpp
         * session groups.
         * 
         * The option is a:
         * &lt;code&gt;java.util.List&amp;lt;org.apache.camel.component.smpp.SmppSessionGroupConfiguration&amp;gt;&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param groupConfigurations the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder groupConfigurations(
                java.util.List<org.apache.camel.component.smpp.SmppSessionGroupConfiguration> groupConfigurations) {
            doSetProperty("groupConfigurations", groupConfigurations);
            return this;
        }
        /**
         * Defines the initial delay in milliseconds after the consumer/producer
         * tries to reconnect to the SMSC, after the connection was lost.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 5000
         * Group: common
         * 
         * @param initialReconnectDelay the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder initialReconnectDelay(
                long initialReconnectDelay) {
            doSetProperty("initialReconnectDelay", initialReconnectDelay);
            return this;
        }
        /**
         * Defines the maximum number of attempts to reconnect to the SMSC, if
         * SMSC returns a negative bind response.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 2147483647
         * Group: common
         * 
         * @param maxReconnect the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder maxReconnect(int maxReconnect) {
            doSetProperty("maxReconnect", maxReconnect);
            return this;
        }
        /**
         * Defines the interval in milliseconds between the reconnect attempts,
         * if the connection to the SMSC was lost and the previous was not
         * succeed.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 5000
         * Group: common
         * 
         * @param reconnectDelay the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder reconnectDelay(long reconnectDelay) {
            doSetProperty("reconnectDelay", reconnectDelay);
            return this;
        }
        /**
         * You can specify a policy for handling long messages: ALLOW - the
         * default, long messages are split to 140 bytes per message TRUNCATE -
         * long messages are split and only the first fragment will be sent to
         * the SMSC. Some carriers drop subsequent fragments so this reduces
         * load on the SMPP connection sending parts of a message that will
         * never be delivered. REJECT - if a message would need to be split, it
         * is rejected with an SMPP NegativeResponseException and the reason
         * code signifying the message is too long.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.smpp.SmppSplittingPolicy&lt;/code&gt; type.
         * 
         * Default: ALLOW
         * Group: common
         * 
         * @param splittingPolicy the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder splittingPolicy(
                org.apache.camel.component.smpp.SmppSplittingPolicy splittingPolicy) {
            doSetProperty("splittingPolicy", splittingPolicy);
            return this;
        }
        /**
         * This parameter is used to categorize the type of ESME (External Short
         * Message Entity) that is binding to the SMSC (max. 13 characters).
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param systemType the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder systemType(java.lang.String systemType) {
            doSetProperty("systemType", systemType);
            return this;
        }
        /**
         * You can specify the address range for the SmppConsumer as defined in
         * section 5.2.7 of the SMPP 3.4 specification. The SmppConsumer will
         * receive messages only from SMSC's which target an address (MSISDN or
         * IP address) within this range.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param addressRange the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder addressRange(
                java.lang.String addressRange) {
            doSetProperty("addressRange", addressRange);
            return this;
        }
        /**
         * Defines the destination SME address. For mobile terminated messages,
         * this is the directory number of the recipient MS. Only for SubmitSm,
         * SubmitMulti, CancelSm and DataSm.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: 1717
         * Group: producer
         * 
         * @param destAddr the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder destAddr(java.lang.String destAddr) {
            doSetProperty("destAddr", destAddr);
            return this;
        }
        /**
         * Defines the type of number (TON) to be used in the SME destination
         * address parameters. Only for SubmitSm, SubmitMulti, CancelSm and
         * DataSm. The following NPI values are defined: 0: Unknown 1: ISDN
         * (E163/E164) 2: Data (X.121) 3: Telex (F.69) 6: Land Mobile (E.212) 8:
         * National 9: Private 10: ERMES 13: Internet (IP) 18: WAP Client Id (to
         * be defined by WAP Forum).
         * 
         * The option is a: &lt;code&gt;byte&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param destAddrNpi the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder destAddrNpi(byte destAddrNpi) {
            doSetProperty("destAddrNpi", destAddrNpi);
            return this;
        }
        /**
         * Defines the type of number (TON) to be used in the SME destination
         * address parameters. Only for SubmitSm, SubmitMulti, CancelSm and
         * DataSm. The following TON values are defined: 0: Unknown 1:
         * International 2: National 3: Network Specific 4: Subscriber Number 5:
         * Alphanumeric 6: Abbreviated.
         * 
         * The option is a: &lt;code&gt;byte&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param destAddrTon the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder destAddrTon(byte destAddrTon) {
            doSetProperty("destAddrTon", destAddrTon);
            return this;
        }
        /**
         * Sessions can be lazily created to avoid exceptions, if the SMSC is
         * not available when the Camel producer is started. Camel will check
         * the in message headers 'CamelSmppSystemId' and 'CamelSmppPassword' of
         * the first exchange. If they are present, Camel will use these data to
         * connect to the SMSC.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazySessionCreation the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder lazySessionCreation(
                boolean lazySessionCreation) {
            doSetProperty("lazySessionCreation", lazySessionCreation);
            return this;
        }
        /**
         * Defines the numeric plan indicator (NPI) to be used in the SME. The
         * following NPI values are defined: 0: Unknown 1: ISDN (E163/E164) 2:
         * Data (X.121) 3: Telex (F.69) 6: Land Mobile (E.212) 8: National 9:
         * Private 10: ERMES 13: Internet (IP) 18: WAP Client Id (to be defined
         * by WAP Forum).
         * 
         * The option is a: &lt;code&gt;byte&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param numberingPlanIndicator the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder numberingPlanIndicator(
                byte numberingPlanIndicator) {
            doSetProperty("numberingPlanIndicator", numberingPlanIndicator);
            return this;
        }
        /**
         * Allows the originating SME to assign a priority level to the short
         * message. Only for SubmitSm and SubmitMulti. Four Priority Levels are
         * supported: 0: Level 0 (lowest) priority 1: Level 1 priority 2: Level
         * 2 priority 3: Level 3 (highest) priority.
         * 
         * The option is a: &lt;code&gt;byte&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param priorityFlag the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder priorityFlag(byte priorityFlag) {
            doSetProperty("priorityFlag", priorityFlag);
            return this;
        }
        /**
         * The protocol id.
         * 
         * The option is a: &lt;code&gt;byte&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param protocolId the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder protocolId(byte protocolId) {
            doSetProperty("protocolId", protocolId);
            return this;
        }
        /**
         * Is used to request an SMSC delivery receipt and/or SME originated
         * acknowledgements. The following values are defined: 0: No SMSC
         * delivery receipt requested. 1: SMSC delivery receipt requested where
         * final delivery outcome is success or failure. 2: SMSC delivery
         * receipt requested where the final delivery outcome is delivery
         * failure.
         * 
         * The option is a: &lt;code&gt;byte&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param registeredDelivery the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder registeredDelivery(
                byte registeredDelivery) {
            doSetProperty("registeredDelivery", registeredDelivery);
            return this;
        }
        /**
         * Used to request the SMSC to replace a previously submitted message,
         * that is still pending delivery. The SMSC will replace an existing
         * message provided that the source address, destination address and
         * service type match the same fields in the new message. The following
         * replace if present flag values are defined: 0: Don't replace 1:
         * Replace.
         * 
         * The option is a: &lt;code&gt;byte&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param replaceIfPresentFlag the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder replaceIfPresentFlag(
                byte replaceIfPresentFlag) {
            doSetProperty("replaceIfPresentFlag", replaceIfPresentFlag);
            return this;
        }
        /**
         * The service type parameter can be used to indicate the SMS
         * Application service associated with the message. The following
         * generic service_types are defined: CMT: Cellular Messaging CPT:
         * Cellular Paging VMN: Voice Mail Notification VMA: Voice Mail Alerting
         * WAP: Wireless Application Protocol USSD: Unstructured Supplementary
         * Services Data.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param serviceType the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder serviceType(
                java.lang.String serviceType) {
            doSetProperty("serviceType", serviceType);
            return this;
        }
        /**
         * Defines the address of SME (Short Message Entity) which originated
         * this message.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: 1616
         * Group: producer
         * 
         * @param sourceAddr the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder sourceAddr(java.lang.String sourceAddr) {
            doSetProperty("sourceAddr", sourceAddr);
            return this;
        }
        /**
         * Defines the numeric plan indicator (NPI) to be used in the SME
         * originator address parameters. The following NPI values are defined:
         * 0: Unknown 1: ISDN (E163/E164) 2: Data (X.121) 3: Telex (F.69) 6:
         * Land Mobile (E.212) 8: National 9: Private 10: ERMES 13: Internet
         * (IP) 18: WAP Client Id (to be defined by WAP Forum).
         * 
         * The option is a: &lt;code&gt;byte&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param sourceAddrNpi the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder sourceAddrNpi(byte sourceAddrNpi) {
            doSetProperty("sourceAddrNpi", sourceAddrNpi);
            return this;
        }
        /**
         * Defines the type of number (TON) to be used in the SME originator
         * address parameters. The following TON values are defined: 0: Unknown
         * 1: International 2: National 3: Network Specific 4: Subscriber Number
         * 5: Alphanumeric 6: Abbreviated.
         * 
         * The option is a: &lt;code&gt;byte&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param sourceAddrTon the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder sourceAddrTon(byte sourceAddrTon) {
            doSetProperty("sourceAddrTon", sourceAddrTon);
            return this;
        }
        /**
         * Defines the type of number (TON) to be used in the SME. The following
         * TON values are defined: 0: Unknown 1: International 2: National 3:
         * Network Specific 4: Subscriber Number 5: Alphanumeric 6: Abbreviated.
         * 
         * The option is a: &lt;code&gt;byte&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param typeOfNumber the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder typeOfNumber(byte typeOfNumber) {
            doSetProperty("typeOfNumber", typeOfNumber);
            return this;
        }
        /**
         * To use the shared SmppConfiguration as configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.smpp.SmppConfiguration&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder configuration(
                org.apache.camel.component.smpp.SmppConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Defines the interval in milliseconds between the confidence checks.
         * The confidence check is used to test the communication path between
         * an ESME and an SMSC.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 5000
         * Group: advanced
         * 
         * @param enquireLinkTimer the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder enquireLinkTimer(
                java.lang.Integer enquireLinkTimer) {
            doSetProperty("enquireLinkTimer", enquireLinkTimer);
            return this;
        }
        /**
         * You can refer to a org.jsmpp.session.SessionStateListener in the
         * Registry to receive callbacks when the session state changed.
         * 
         * The option is a:
         * &lt;code&gt;org.jsmpp.session.SessionStateListener&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param sessionStateListener the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder sessionStateListener(
                org.jsmpp.session.SessionStateListener sessionStateListener) {
            doSetProperty("sessionStateListener", sessionStateListener);
            return this;
        }
        /**
         * Defines the maximum period of inactivity allowed after a transaction,
         * after which an SMPP entity may assume that the session is no longer
         * active. This timer may be active on either communicating SMPP entity
         * (i.e. SMSC or ESME).
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 10000
         * Group: advanced
         * 
         * @param transactionTimer the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder transactionTimer(
                java.lang.Integer transactionTimer) {
            doSetProperty("transactionTimer", transactionTimer);
            return this;
        }
        /**
         * Defines encoding of data according the SMPP 3.4 specification,
         * section 5.2.19. 0: SMSC Default Alphabet 4: 8 bit Alphabet 8: UCS2
         * Alphabet.
         * 
         * The option is a: &lt;code&gt;byte&lt;/code&gt; type.
         * 
         * Group: codec
         * 
         * @param alphabet the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder alphabet(byte alphabet) {
            doSetProperty("alphabet", alphabet);
            return this;
        }
        /**
         * Defines the data coding according the SMPP 3.4 specification, section
         * 5.2.19. Example data encodings are: 0: SMSC Default Alphabet 3: Latin
         * 1 (ISO-8859-1) 4: Octet unspecified (8-bit binary) 8: UCS2
         * (ISO/IEC-10646) 13: Extended Kanji JIS(X 0212-1990).
         * 
         * The option is a: &lt;code&gt;byte&lt;/code&gt; type.
         * 
         * Group: codec
         * 
         * @param dataCoding the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder dataCoding(byte dataCoding) {
            doSetProperty("dataCoding", dataCoding);
            return this;
        }
        /**
         * Defines the encoding scheme of the short message user data. Only for
         * SubmitSm, ReplaceSm and SubmitMulti.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: ISO-8859-1
         * Group: codec
         * 
         * @param encoding the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder encoding(java.lang.String encoding) {
            doSetProperty("encoding", encoding);
            return this;
        }
        /**
         * If you need to tunnel SMPP through a HTTP proxy, set this attribute
         * to the hostname or ip address of your HTTP proxy.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param httpProxyHost the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder httpProxyHost(
                java.lang.String httpProxyHost) {
            doSetProperty("httpProxyHost", httpProxyHost);
            return this;
        }
        /**
         * If your HTTP proxy requires basic authentication, set this attribute
         * to the password required for your HTTP proxy.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param httpProxyPassword the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder httpProxyPassword(
                java.lang.String httpProxyPassword) {
            doSetProperty("httpProxyPassword", httpProxyPassword);
            return this;
        }
        /**
         * If you need to tunnel SMPP through a HTTP proxy, set this attribute
         * to the port of your HTTP proxy.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 3128
         * Group: proxy
         * 
         * @param httpProxyPort the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder httpProxyPort(
                java.lang.Integer httpProxyPort) {
            doSetProperty("httpProxyPort", httpProxyPort);
            return this;
        }
        /**
         * If your HTTP proxy requires basic authentication, set this attribute
         * to the username required for your HTTP proxy.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param httpProxyUsername the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder httpProxyUsername(
                java.lang.String httpProxyUsername) {
            doSetProperty("httpProxyUsername", httpProxyUsername);
            return this;
        }
        /**
         * These headers will be passed to the proxy server while establishing
         * the connection.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.String&amp;gt;&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyHeaders the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder proxyHeaders(
                java.util.Map<java.lang.String, java.lang.String> proxyHeaders) {
            doSetProperty("proxyHeaders", proxyHeaders);
            return this;
        }
        /**
         * The password for connecting to SMSC server.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder password(java.lang.String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * The system id (username) for connecting to SMSC server.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: smppclient
         * Group: security
         * 
         * @param systemId the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder systemId(java.lang.String systemId) {
            doSetProperty("systemId", systemId);
            return this;
        }
        /**
         * Whether using SSL with the smpps protocol.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param usingSSL the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder usingSSL(boolean usingSSL) {
            doSetProperty("usingSSL", usingSSL);
            return this;
        }
        /**
         * Session group id this endpoint will belong. Endpoints belonging to
         * the same group share the same PDU task executor. In order for this
         * parameter to take effect use the 'smpp(s)-grp' prefix in the uri.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: sessionGroupId
         * 
         * @param sessionGroupId the value to set
         * @return the dsl builder
         */
        default SmppsGrpComponentBuilder sessionGroupId(
                java.lang.String sessionGroupId) {
            doSetProperty("sessionGroupId", sessionGroupId);
            return this;
        }
    }

    class SmppsGrpComponentBuilderImpl
            extends
                AbstractComponentBuilder<SmppSessionGroupsComponent>
            implements
                SmppsGrpComponentBuilder {
        @Override
        protected SmppSessionGroupsComponent buildConcreteComponent() {
            return new SmppSessionGroupsComponent();
        }
        private org.apache.camel.component.smpp.SmppConfiguration getOrCreateConfiguration(
                org.apache.camel.component.smpp.SmppSessionGroupsComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.smpp.SmppConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "bridgeErrorHandler": ((SmppSessionGroupsComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((SmppSessionGroupsComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((SmppSessionGroupsComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "groupConfigurations": ((SmppSessionGroupsComponent) component).setGroupConfigurations((java.util.List) value); return true;
            case "initialReconnectDelay": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setInitialReconnectDelay((long) value); return true;
            case "maxReconnect": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setMaxReconnect((int) value); return true;
            case "reconnectDelay": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setReconnectDelay((long) value); return true;
            case "splittingPolicy": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setSplittingPolicy((org.apache.camel.component.smpp.SmppSplittingPolicy) value); return true;
            case "systemType": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setSystemType((java.lang.String) value); return true;
            case "addressRange": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setAddressRange((java.lang.String) value); return true;
            case "destAddr": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setDestAddr((java.lang.String) value); return true;
            case "destAddrNpi": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setDestAddrNpi((byte) value); return true;
            case "destAddrTon": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setDestAddrTon((byte) value); return true;
            case "lazySessionCreation": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setLazySessionCreation((boolean) value); return true;
            case "numberingPlanIndicator": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setNumberingPlanIndicator((byte) value); return true;
            case "priorityFlag": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setPriorityFlag((byte) value); return true;
            case "protocolId": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setProtocolId((byte) value); return true;
            case "registeredDelivery": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setRegisteredDelivery((byte) value); return true;
            case "replaceIfPresentFlag": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setReplaceIfPresentFlag((byte) value); return true;
            case "serviceType": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setServiceType((java.lang.String) value); return true;
            case "sourceAddr": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setSourceAddr((java.lang.String) value); return true;
            case "sourceAddrNpi": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setSourceAddrNpi((byte) value); return true;
            case "sourceAddrTon": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setSourceAddrTon((byte) value); return true;
            case "typeOfNumber": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setTypeOfNumber((byte) value); return true;
            case "configuration": ((SmppSessionGroupsComponent) component).setConfiguration((org.apache.camel.component.smpp.SmppConfiguration) value); return true;
            case "enquireLinkTimer": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setEnquireLinkTimer((java.lang.Integer) value); return true;
            case "sessionStateListener": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setSessionStateListener((org.jsmpp.session.SessionStateListener) value); return true;
            case "transactionTimer": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setTransactionTimer((java.lang.Integer) value); return true;
            case "alphabet": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setAlphabet((byte) value); return true;
            case "dataCoding": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setDataCoding((byte) value); return true;
            case "encoding": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setEncoding((java.lang.String) value); return true;
            case "httpProxyHost": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setHttpProxyHost((java.lang.String) value); return true;
            case "httpProxyPassword": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setHttpProxyPassword((java.lang.String) value); return true;
            case "httpProxyPort": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setHttpProxyPort((java.lang.Integer) value); return true;
            case "httpProxyUsername": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setHttpProxyUsername((java.lang.String) value); return true;
            case "proxyHeaders": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setProxyHeaders((java.util.Map) value); return true;
            case "password": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setPassword((java.lang.String) value); return true;
            case "systemId": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setSystemId((java.lang.String) value); return true;
            case "usingSSL": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setUsingSSL((boolean) value); return true;
            case "sessionGroupId": getOrCreateConfiguration((SmppSessionGroupsComponent) component).setSessionGroupId((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}