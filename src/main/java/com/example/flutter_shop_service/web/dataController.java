package com.example.flutter_shop_service.web;

import com.example.flutter_shop_service.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/BillPayment")
public class dataController {

    @Autowired
    DataService dataService;

    @GetMapping(value = "/queryOrder")
    public Object queryOrder(String orderNo) throws Exception {
        return dataService.getServiceData();
    }
}
