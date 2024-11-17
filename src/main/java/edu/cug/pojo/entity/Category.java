package edu.cug.pojo.entity;

/**
 * (Category)
 *
 * @author zh
 * @since 2024-11-16 23:59:16
 */
public class Category {
    /**
     * category id
     */
    private Integer id;
    /**
     * category name
     */
    private String name;
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

    public Integer getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Integer protocolId) {
        this.protocolId = protocolId;
    }

}

