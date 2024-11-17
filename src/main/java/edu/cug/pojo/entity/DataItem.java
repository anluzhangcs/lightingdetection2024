package edu.cug.pojo.entity;

/**
 * the table of all data items of protocols(DataItem)
 *
 * @author zh
 * @since 2024-11-16 23:59:16
 */
public class DataItem {
    /**
     * data item id
     */
    private Integer id;
    /**
     * data item name
     */
    private String name;
    /**
     * the first address of the data item
     */
    private Integer address;
    /**
     * the length of the data item
     */
    private Integer length;
    /**
     * the true value = the read value / scale
     */
    private Integer scale;
    /**
     * the unit of the data item
     */
    private String unit;
    /**
     * whether to display
     */
    private Integer isDisplay;
    /**
     * whether to save to database
     */
    private Integer isRecord;
    /**
     * the protocol to which the data item belongs
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

    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getIsDisplay() {
        return isDisplay;
    }

    public void setIsDisplay(Integer isDisplay) {
        this.isDisplay = isDisplay;
    }

    public Integer getIsRecord() {
        return isRecord;
    }

    public void setIsRecord(Integer isRecord) {
        this.isRecord = isRecord;
    }

    public Integer getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Integer protocolId) {
        this.protocolId = protocolId;
    }

}

