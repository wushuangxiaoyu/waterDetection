package entity;

import Utils.JsonDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;

/**
 * 数据
 * Created by  Yu  on  2017/9/23.
 */
public class WaterRecord {
    private Integer id;

    @JsonSerialize(using = JsonDateSerializer.class)
    private Date time;

    private Double waterOxy;

    private Double waterTmp;

    private Double waterPh;

    private Double waterHeavy;

    private Double waterChy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getWaterOxy() {
        return waterOxy;
    }

    public void setWaterOxy(Double waterOxy) {
        this.waterOxy = waterOxy;
    }

    public Double getWaterTmp() {
        return waterTmp;
    }

    public void setWaterTmp(Double waterTmp) {
        this.waterTmp = waterTmp;
    }

    public Double getWaterPh() {
        return waterPh;
    }

    public void setWaterPh(Double waterPh) {
        this.waterPh = waterPh;
    }

    public Double getWaterHeavy() {
        return waterHeavy;
    }

    public void setWaterHeavy(Double waterHeavy) {
        this.waterHeavy = waterHeavy;
    }

    public Double getWaterChy() {
        return waterChy;
    }

    public void setWaterChy(Double waterChy) {
        this.waterChy = waterChy;
    }
}