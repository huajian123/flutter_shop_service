package com.example.flutter_shop_service.dao.mapper;

import com.example.flutter_shop_service.dao.entity.BillPaymentDo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BillPaymentMapper {

    List<BillPaymentDo> selectLtList();
}
