package com.example.flutter_shop_service.service;

import com.example.flutter_shop_service.dao.entity.BillPaymentDo;
import com.example.flutter_shop_service.dao.mapper.BillPaymentMapper;
import com.example.flutter_shop_service.service.VO.DataVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class DataService {

    @Autowired
    BillPaymentMapper billPaymentMapper;

    public List<DataVO> getServiceData() {
        List<DataVO> dataVOList = new ArrayList<>();

        List<BillPaymentDo> billPaymentDo = billPaymentMapper.selectLtList();
        for (BillPaymentDo item : billPaymentDo) {
            DataVO dataVO1 = new DataVO();
            BeanUtils.copyProperties(item, dataVO1);
            dataVOList.add(dataVO1);
        }

        return dataVOList;
    }
}
