package com.tcrush.service.impl;

import com.tcrush.dao.RetirementDao;
import com.tcrush.entity.BackRest;
import com.tcrush.entity.retirement.Retirement;
import com.tcrush.service.RetirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RetirementServiceImpl implements RetirementService {

    @Autowired
    RetirementDao retirementDao;

    BackRest backRest = new BackRest();

    @Override
    public BackRest insertRetireService(Retirement retirement) {
        try {
            retirementDao.insertRetire(retirement);
            backRest.setCode(200);
            backRest.setMassage("增添退休信息成功");
            backRest.setData(null);
        } catch (Exception e) {
            e.printStackTrace();
            backRest.setCode(-1);
            backRest.setMassage("增添退休信息失败");
            backRest.setData(null);
        }
        return backRest;
    }

    @Override
    public BackRest selectRetireService(String number) {
        try {
            List<Retirement> retirements = retirementDao.selectRetire(number);
            backRest.setCode(200);
            backRest.setMassage("查询退休信息成功");
            backRest.setData(retirements);
        } catch (Exception e) {
            e.printStackTrace();
            backRest.setCode(-1);
            backRest.setMassage("查询退休信息失败");
            backRest.setData(null);
        }
        return backRest;
    }
}
