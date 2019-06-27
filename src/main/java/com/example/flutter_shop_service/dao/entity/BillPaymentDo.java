package com.example.flutter_shop_service.dao.entity;

public class BillPaymentDo {

    /**
     * 主键ID
     */
    private String id;
    /**
     * 缴费单编号
     */
    private String billNo;
    /**
     * 缴费项目ID
     */
    private String paymentProjectId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getPaymentProjectId() {
        return paymentProjectId;
    }

    public void setPaymentProjectId(String paymentProjectId) {
        this.paymentProjectId = paymentProjectId;
    }
}
