package entity;

/**
 * 设备
 * Created by  Yu  on  2017/9/23.
 */
public class WaterEquipment {
    private Integer id;

    private Integer watId;

    private String equipmentName;

    private Integer clearnow;

    private Integer waterCondition;

    private Double xPoint;

    private Double yPoint;

    private Integer flagPh;

    private Integer flagTmpOxy;

    private Integer flagHeavy;

    private Integer flagChy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWatId() {
        return watId;
    }

    public void setWatId(Integer watId) {
        this.watId = watId;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName == null ? null : equipmentName.trim();
    }

    public Integer getClearnow() {
        return clearnow;
    }

    public void setClearnow(Integer clearnow) {
        this.clearnow = clearnow;
    }

    public Integer getWaterCondition() {
        return waterCondition;
    }

    public void setWaterCondition(Integer waterCondition) {
        this.waterCondition = waterCondition;
    }

    public Double getxPoint() {
        return xPoint;
    }

    public void setxPoint(Double xPoint) {
        this.xPoint = xPoint;
    }

    public Double getyPoint() {
        return yPoint;
    }

    public void setyPoint(Double yPoint) {
        this.yPoint = yPoint;
    }

    public Integer getFlagPh() {
        return flagPh;
    }

    public void setFlagPh(Integer flagPh) {
        this.flagPh = flagPh;
    }

    public Integer getFlagTmpOxy() {
        return flagTmpOxy;
    }

    public void setFlagTmpOxy(Integer flagTmpOxy) {
        this.flagTmpOxy = flagTmpOxy;
    }

    public Integer getFlagHeavy() {
        return flagHeavy;
    }

    public void setFlagHeavy(Integer flagHeavy) {
        this.flagHeavy = flagHeavy;
    }

    public Integer getFlagChy() {
        return flagChy;
    }



    public void setFlagChy(Integer flagChy) {
        this.flagChy = flagChy;
    }
}