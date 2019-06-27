package com.example.flutter_shop_service.service;

import com.example.flutter_shop_service.dao.entity.BillPaymentDo;
import com.example.flutter_shop_service.dao.mapper.BillPaymentMapper;
import com.example.flutter_shop_service.service.VO.DataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class DataService {

    @Autowired
    BillPaymentMapper billPaymentMapper;

    public List<BillPaymentDo> getServiceData() {
        DataVO dataVO1 = new DataVO();
        List<BillPaymentDo> billPaymentDo = billPaymentMapper.selectLtList();
        System.out.println(billPaymentDo);
//        dataVO1.setAge("1");
//        dataVO1.setName("ceshi");
//        DataVO dataVO2 = new DataVO();
//        dataVO2.setAge("2");
//        dataVO2.setName("ceshi2");
//        List<DataVO> dataList = new ArrayList<DataVO>();
//        dataList.add(dataVO1);
//        dataList.add(dataVO2);
        return billPaymentDo;
    }
}
