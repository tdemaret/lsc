//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.09.13 at 05:56:11 PM CEST 
//


package org.lsc.configuration;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for taskType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taskType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}ID"/>
 *         &lt;element name="bean" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cleanHook" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="syncHook" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="databaseSourceService" type="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}databaseSourceServiceType"/>
 *           &lt;element name="ldapSourceService" type="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}ldapSourceServiceType"/>
 *           &lt;element name="asyncLdapSourceService" type="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}asyncLdapSourceServiceType"/>
 *           &lt;element name="pluginSourceService" type="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}pluginSourceServiceType"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="databaseDestinationService" type="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}databaseDestinationServiceType"/>
 *           &lt;element name="ldapDestinationService" type="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}ldapDestinationServiceType"/>
 *           &lt;element name="jndiExecDstService" type="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}jndiExecDstServiceType"/>
 *           &lt;element name="multiDestinationService" type="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}multiDestinationServiceType"/>
 *           &lt;element name="xaFileDestinationService" type="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}xaFileDestinationServiceType"/>
 *           &lt;element name="pluginDestinationService" type="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}pluginDestinationServiceType"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="propertiesBasedSyncOptions" type="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}propertiesBasedSyncOptionsType"/>
 *           &lt;element name="forceSyncOptions" type="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}forceSyncOptionsType"/>
 *           &lt;element name="pluginSyncOptions" type="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}pluginSyncOptionsType"/>
 *         &lt;/choice>
 *         &lt;element name="customLibrary" type="{http://lsc-project.org/XSD/lsc-core-2.0.xsd}valuesType" minOccurs="0"/>
 *         &lt;element name="auditLog" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="reference" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taskType", propOrder = {
    "name",
    "bean",
    "cleanHook",
    "syncHook",
    "databaseSourceService",
    "ldapSourceService",
    "asyncLdapSourceService",
    "pluginSourceService",
    "databaseDestinationService",
    "ldapDestinationService",
    "jndiExecDstService",
    "multiDestinationService",
    "xaFileDestinationService",
    "pluginDestinationService",
    "propertiesBasedSyncOptions",
    "forceSyncOptions",
    "pluginSyncOptions",
    "customLibrary",
    "auditLog"
})
public class TaskType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String name;
    @XmlElement(required = true, defaultValue = "org.lsc.beans.SimpleBean")
    protected String bean = "org.lsc.beans.SimpleBean";
    protected String cleanHook;
    protected String syncHook;
    protected DatabaseSourceServiceType databaseSourceService;
    protected LdapSourceServiceType ldapSourceService;
    protected AsyncLdapSourceServiceType asyncLdapSourceService;
    protected PluginSourceServiceType pluginSourceService;
    protected DatabaseDestinationServiceType databaseDestinationService;
    protected LdapDestinationServiceType ldapDestinationService;
    protected JndiExecDstServiceType jndiExecDstService;
    protected MultiDestinationServiceType multiDestinationService;
    protected XaFileDestinationServiceType xaFileDestinationService;
    protected PluginDestinationServiceType pluginDestinationService;
    protected PropertiesBasedSyncOptionsType propertiesBasedSyncOptions;
    protected ForceSyncOptionsType forceSyncOptions;
    protected PluginSyncOptionsType pluginSyncOptions;
    protected ValuesType customLibrary;
    protected List<TaskType.AuditLog> auditLog;
    @XmlAttribute
    protected String id;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the bean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBean() {
        return bean;
    }

    /**
     * Sets the value of the bean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBean(String value) {
        this.bean = value;
    }

    /**
     * Gets the value of the cleanHook property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCleanHook() {
        return cleanHook;
    }

    /**
     * Sets the value of the cleanHook property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCleanHook(String value) {
        this.cleanHook = value;
    }

    /**
     * Gets the value of the syncHook property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncHook() {
        return syncHook;
    }

    /**
     * Sets the value of the syncHook property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncHook(String value) {
        this.syncHook = value;
    }

    /**
     * Gets the value of the databaseSourceService property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseSourceServiceType }
     *     
     */
    public DatabaseSourceServiceType getDatabaseSourceService() {
        return databaseSourceService;
    }

    /**
     * Sets the value of the databaseSourceService property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseSourceServiceType }
     *     
     */
    public void setDatabaseSourceService(DatabaseSourceServiceType value) {
        this.databaseSourceService = value;
    }

    /**
     * Gets the value of the ldapSourceService property.
     * 
     * @return
     *     possible object is
     *     {@link LdapSourceServiceType }
     *     
     */
    public LdapSourceServiceType getLdapSourceService() {
        return ldapSourceService;
    }

    /**
     * Sets the value of the ldapSourceService property.
     * 
     * @param value
     *     allowed object is
     *     {@link LdapSourceServiceType }
     *     
     */
    public void setLdapSourceService(LdapSourceServiceType value) {
        this.ldapSourceService = value;
    }

    /**
     * Gets the value of the asyncLdapSourceService property.
     * 
     * @return
     *     possible object is
     *     {@link AsyncLdapSourceServiceType }
     *     
     */
    public AsyncLdapSourceServiceType getAsyncLdapSourceService() {
        return asyncLdapSourceService;
    }

    /**
     * Sets the value of the asyncLdapSourceService property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsyncLdapSourceServiceType }
     *     
     */
    public void setAsyncLdapSourceService(AsyncLdapSourceServiceType value) {
        this.asyncLdapSourceService = value;
    }

    /**
     * Gets the value of the pluginSourceService property.
     * 
     * @return
     *     possible object is
     *     {@link PluginSourceServiceType }
     *     
     */
    public PluginSourceServiceType getPluginSourceService() {
        return pluginSourceService;
    }

    /**
     * Sets the value of the pluginSourceService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PluginSourceServiceType }
     *     
     */
    public void setPluginSourceService(PluginSourceServiceType value) {
        this.pluginSourceService = value;
    }

    /**
     * Gets the value of the databaseDestinationService property.
     * 
     * @return
     *     possible object is
     *     {@link DatabaseDestinationServiceType }
     *     
     */
    public DatabaseDestinationServiceType getDatabaseDestinationService() {
        return databaseDestinationService;
    }

    /**
     * Sets the value of the databaseDestinationService property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatabaseDestinationServiceType }
     *     
     */
    public void setDatabaseDestinationService(DatabaseDestinationServiceType value) {
        this.databaseDestinationService = value;
    }

    /**
     * Gets the value of the ldapDestinationService property.
     * 
     * @return
     *     possible object is
     *     {@link LdapDestinationServiceType }
     *     
     */
    public LdapDestinationServiceType getLdapDestinationService() {
        return ldapDestinationService;
    }

    /**
     * Sets the value of the ldapDestinationService property.
     * 
     * @param value
     *     allowed object is
     *     {@link LdapDestinationServiceType }
     *     
     */
    public void setLdapDestinationService(LdapDestinationServiceType value) {
        this.ldapDestinationService = value;
    }

    /**
     * Gets the value of the jndiExecDstService property.
     * 
     * @return
     *     possible object is
     *     {@link JndiExecDstServiceType }
     *     
     */
    public JndiExecDstServiceType getJndiExecDstService() {
        return jndiExecDstService;
    }

    /**
     * Sets the value of the jndiExecDstService property.
     * 
     * @param value
     *     allowed object is
     *     {@link JndiExecDstServiceType }
     *     
     */
    public void setJndiExecDstService(JndiExecDstServiceType value) {
        this.jndiExecDstService = value;
    }

    /**
     * Gets the value of the multiDestinationService property.
     * 
     * @return
     *     possible object is
     *     {@link MultiDestinationServiceType }
     *     
     */
    public MultiDestinationServiceType getMultiDestinationService() {
        return multiDestinationService;
    }

    /**
     * Sets the value of the multiDestinationService property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiDestinationServiceType }
     *     
     */
    public void setMultiDestinationService(MultiDestinationServiceType value) {
        this.multiDestinationService = value;
    }

    /**
     * Gets the value of the xaFileDestinationService property.
     * 
     * @return
     *     possible object is
     *     {@link XaFileDestinationServiceType }
     *     
     */
    public XaFileDestinationServiceType getXaFileDestinationService() {
        return xaFileDestinationService;
    }

    /**
     * Sets the value of the xaFileDestinationService property.
     * 
     * @param value
     *     allowed object is
     *     {@link XaFileDestinationServiceType }
     *     
     */
    public void setXaFileDestinationService(XaFileDestinationServiceType value) {
        this.xaFileDestinationService = value;
    }

    /**
     * Gets the value of the pluginDestinationService property.
     * 
     * @return
     *     possible object is
     *     {@link PluginDestinationServiceType }
     *     
     */
    public PluginDestinationServiceType getPluginDestinationService() {
        return pluginDestinationService;
    }

    /**
     * Sets the value of the pluginDestinationService property.
     * 
     * @param value
     *     allowed object is
     *     {@link PluginDestinationServiceType }
     *     
     */
    public void setPluginDestinationService(PluginDestinationServiceType value) {
        this.pluginDestinationService = value;
    }

    /**
     * Gets the value of the propertiesBasedSyncOptions property.
     * 
     * @return
     *     possible object is
     *     {@link PropertiesBasedSyncOptionsType }
     *     
     */
    public PropertiesBasedSyncOptionsType getPropertiesBasedSyncOptions() {
        return propertiesBasedSyncOptions;
    }

    /**
     * Sets the value of the propertiesBasedSyncOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesBasedSyncOptionsType }
     *     
     */
    public void setPropertiesBasedSyncOptions(PropertiesBasedSyncOptionsType value) {
        this.propertiesBasedSyncOptions = value;
    }

    /**
     * Gets the value of the forceSyncOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ForceSyncOptionsType }
     *     
     */
    public ForceSyncOptionsType getForceSyncOptions() {
        return forceSyncOptions;
    }

    /**
     * Sets the value of the forceSyncOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForceSyncOptionsType }
     *     
     */
    public void setForceSyncOptions(ForceSyncOptionsType value) {
        this.forceSyncOptions = value;
    }

    /**
     * Gets the value of the pluginSyncOptions property.
     * 
     * @return
     *     possible object is
     *     {@link PluginSyncOptionsType }
     *     
     */
    public PluginSyncOptionsType getPluginSyncOptions() {
        return pluginSyncOptions;
    }

    /**
     * Sets the value of the pluginSyncOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PluginSyncOptionsType }
     *     
     */
    public void setPluginSyncOptions(PluginSyncOptionsType value) {
        this.pluginSyncOptions = value;
    }

    /**
     * Gets the value of the customLibrary property.
     * 
     * @return
     *     possible object is
     *     {@link ValuesType }
     *     
     */
    public ValuesType getCustomLibrary() {
        return customLibrary;
    }

    /**
     * Sets the value of the customLibrary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuesType }
     *     
     */
    public void setCustomLibrary(ValuesType value) {
        this.customLibrary = value;
    }

    /**
     * Gets the value of the auditLog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the auditLog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuditLog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaskType.AuditLog }
     * 
     * 
     */
    public List<TaskType.AuditLog> getAuditLog() {
        if (auditLog == null) {
            auditLog = new ArrayList<TaskType.AuditLog>();
        }
        return this.auditLog;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="reference" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AuditLog {

        @XmlAttribute(required = true)
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected AuditType reference;

        /**
         * Gets the value of the reference property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public AuditType getReference() {
            return reference;
        }

        /**
         * Sets the value of the reference property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setReference(AuditType value) {
            this.reference = value;
        }

    }

}
