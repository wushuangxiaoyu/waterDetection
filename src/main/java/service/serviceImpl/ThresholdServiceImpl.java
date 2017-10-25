package service.serviceImpl;


import dao.ThresholdMapper;
import entity.Threshold;
import entity.ThresholdExample;
import interceptor.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ThresholdService;

/**
 * Created by  Yu  on  2017/9/28.
 */
@Service
@BaseService
public class ThresholdServiceImpl extends BaseServiceImpl<ThresholdMapper, Threshold, ThresholdExample> implements ThresholdService {

    @Autowired
    private ThresholdMapper thresholdMapper;

}
