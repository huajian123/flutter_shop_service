package com.example.flutter_shop_service.service;

import com.example.flutter_shop_service.service.VO.DataVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataService {

    public List<DataVO> getServiceData() {
        DataVO dataVO1 = new DataVO();
        dataVO1.setAge("1");
        dataVO1.setName("ceshi");
        DataVO dataVO2 = new DataVO();
        dataVO2.setAge("2");
        dataVO2.setName("ceshi2");
        List<DataVO> dataList = new ArrayList<DataVO>();
        dataList.add(dataVO1);
        dataList.add(dataVO2);
        return dataList;
    }
}
