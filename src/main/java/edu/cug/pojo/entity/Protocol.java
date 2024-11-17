package edu.cug.pojo.entity;

/**
 * (Protocol)
 *
 * @author zh
 * @since 2024-11-17 12:54:46
 */
public class Protocol {
    /**
     * protocol id
     */
    private Integer id;
    /**
     * protocol name
     */
    private String name;
    /**
     * function code for instruction
     */
    private Integer functionCode;
    /**
     * register first address
     */
    private Integer registerAddress;
    /**
     * the number of registers
     */
    private Integer registerNum;
    /**
     * CRC generator polynomial
     */
    private Integer crc;


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

    public Integer getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(Integer functionCode) {
        this.functionCode = functionCode;
    }

    public Integer getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(Integer registerAddress) {
        this.registerAddress = registerAddress;
    }

    public Integer getRegisterNum() {
        return registerNum;
    }

    public void setRegisterNum(Integer registerNum) {
        this.registerNum = registerNum;
    }

    public Integer getCrc() {
        return crc;
    }

    public void setCrc(Integer crc) {
        this.crc = crc;
    }

}

