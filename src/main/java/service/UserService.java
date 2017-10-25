package service;


import entity.WaterUser;
import entity.WaterUserExample;

/**
 * Created by  Yu  on  2017/9/22.
 */
public interface UserService extends BaseService<WaterUser, WaterUserExample> {

    WaterUser selectByUserName(String userName);
}
