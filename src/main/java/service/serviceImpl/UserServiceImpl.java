package service.serviceImpl;

import dao.WaterUserMapper;
import entity.WaterUser;
import entity.WaterUserExample;
import interceptor.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.UserService;

/**
 * Created by  Yu  on  2017/9/22.
 */
@Service
@BaseService
public class UserServiceImpl extends BaseServiceImpl<WaterUserMapper, WaterUser, WaterUserExample> implements UserService {

    @Autowired
    private WaterUserMapper waterUserMapper;

    public WaterUser selectByUserName(String userName){
        return waterUserMapper.selectByUserName(userName);
    }
}
