package com.letian.service.dto;

/**
 * @ Description：
 * @ author：lh
 * @ Date：Created in 10:33 2018/12/12
 * @version: 1.0.0
 */
public class UserDTO {

    private  String name;

    private int aga;

    private Boolean isMan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAga() {
        return aga;
    }

    public void setAga(int aga) {
        this.aga = aga;
    }

    public Boolean getMan() {
        return isMan;
    }

    public void setMan(Boolean man) {
        isMan = man;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", aga=" + aga +
                ", isMan=" + isMan +
                '}';
    }
}
