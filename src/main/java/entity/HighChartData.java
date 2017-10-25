package entity;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by  Yu  on  2017/9/28.
 */
public class HighChartData {
    private long x;
    private Double y;
    private static DateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public long getX() {
        return x;
    }

    public void setX(String x) {
        Date d=null;
        try {
            d= df.parse(x);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.x=d.getTime();
    }


    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }
}
