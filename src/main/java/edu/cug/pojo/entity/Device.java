package edu.cug.pojo.entity;

/**
 * the table of devices(Device)
 *
 * @author zh
 * @since 2024-11-16 23:59:16
 */
public class Device {
    /**
     * device id
     */
    private Integer id;
    /**
     * device name
     */
    private String name;
    /**
     * device status
     */
    private Integer status;
    /**
     * the serial port server host address
     */
    private String host;
    /**
     * the serial port server port number
     */
    private Integer port;
    /**
     * location id
     */
    private Integer locationId;
    /**
     * location name
     */
    private String locationName;
    /**
     * category id
     */
    private Integer categoryId;
    /**
     * category name
     */
    private String categoryName;
    /**
     * protocol id
     */
    private Integer protocolId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Integer protocolId) {
        this.protocolId = protocolId;
    }

}

