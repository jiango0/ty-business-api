package com.toonyoo.business.order.biz.entity;


import common.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "teambuying_transaction_record")
public class TeamBuyingTransactionRecord extends BaseEntity {
    /**
     * 渠道
     */
    @Column(name = "code")
    private Integer code;

    /**
     * 商户名称
     */
    @Column(name = "partner_sign")
    private String partnerSign;

    /**
     * 产品id
     */
    @Column(name = "product_id")
    private String productId;

    /**
     * 商品出币数
     */
    @Column(name = "product_coin_num")
    private Integer productCoinNum;

    /**
     * 门店id
     */
    @Column(name = "shop_id")
    private String shopId;

    /**
     * 第三方产品id
     */
    @Column(name = "item_id")
    private String itemId;

    /**
     * 凭证码
     */
    @Column(name = "ticket_code")
    private String ticketCode;

    /**
     * 第三方交易流水
     */
    @Column(name = "ticket_trans_id")
    private String ticketTransId;

    /**
     * 外部请求id
     */
    @Column(name = "request_id")
    private String requestId;

    /**
     * 商品金额
     */
    @Column(name = "original_price")
    private BigDecimal originalPrice;

    /**
     * 商品现价
     */
    @Column(name = "current_price")
    private BigDecimal currentPrice;

    /**
     * 实际支付金额
     */
    @Column(name = "buyer_pay_amount")
    private BigDecimal buyerPayAmount;

    /**
     * 商家实收金额
     */
    @Column(name = "receipt_amount")
    private BigDecimal receiptAmount;

    /**
     * 商家优惠金额
     */
    @Column(name = "discount_amount")
    private BigDecimal discountAmount;

    /**
     * 第三方补贴金额
     */
    @Column(name = "subsidy_amount")
    private BigDecimal subsidyAmount;

    /**
     * 开具发票的金额
     */
    @Column(name = "invoice_amount")
    private BigDecimal invoiceAmount;

    /**
     * 数量
     */
    @Column(name = "quantity")
    private Integer quantity;

    /**
     * 交易状态（1:已发码 2:已核销 3:已退款）
     */
    @Column(name = "status")
    private Integer status;

    /**
     * 订单code
     */
    @Column(name = "order_code")
    private String orderCode;

    /**
     * 核码渠道 1:一体机
     */
    @Column(name = "take_point_type")
    private Integer takePointType;

    /**
     * 核码机器id
     */
    @Column(name = "take_point")
    private String takePoint;

    @Column(name = "customer_id")
    private String customerId;

    /**
     * 获取渠道
     *
     * @return code - 渠道
     */
    public Integer getCode() {
        return code;
    }

    /**
     * 设置渠道
     *
     * @param code 渠道
     */
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * 获取商户名称
     *
     * @return partner_sign - 商户名称
     */
    public String getPartnerSign() {
        return partnerSign;
    }

    /**
     * 设置商户名称
     *
     * @param partnerSign 商户名称
     */
    public void setPartnerSign(String partnerSign) {
        this.partnerSign = partnerSign == null ? null : partnerSign.trim();
    }

    /**
     * 获取产品id
     *
     * @return product_id - 产品id
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置产品id
     *
     * @param productId 产品id
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    /**
     * 获取商品出币数
     *
     * @return product_coin_num - 商品出币数
     */
    public Integer getProductCoinNum() {
        return productCoinNum;
    }

    /**
     * 设置商品出币数
     *
     * @param productCoinNum 商品出币数
     */
    public void setProductCoinNum(Integer productCoinNum) {
        this.productCoinNum = productCoinNum;
    }

    /**
     * 获取门店id
     *
     * @return shop_id - 门店id
     */
    public String getShopId() {
        return shopId;
    }

    /**
     * 设置门店id
     *
     * @param shopId 门店id
     */
    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    /**
     * 获取第三方产品id
     *
     * @return item_id - 第三方产品id
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置第三方产品id
     *
     * @param itemId 第三方产品id
     */
    public void setItemId(String itemId) {
        this.itemId = itemId == null ? null : itemId.trim();
    }

    /**
     * 获取凭证码
     *
     * @return ticket_code - 凭证码
     */
    public String getTicketCode() {
        return ticketCode;
    }

    /**
     * 设置凭证码
     *
     * @param ticketCode 凭证码
     */
    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode == null ? null : ticketCode.trim();
    }

    /**
     * 获取第三方交易流水
     *
     * @return ticket_trans_id - 第三方交易流水
     */
    public String getTicketTransId() {
        return ticketTransId;
    }

    /**
     * 设置第三方交易流水
     *
     * @param ticketTransId 第三方交易流水
     */
    public void setTicketTransId(String ticketTransId) {
        this.ticketTransId = ticketTransId == null ? null : ticketTransId.trim();
    }

    /**
     * 获取外部请求id
     *
     * @return request_id - 外部请求id
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * 设置外部请求id
     *
     * @param requestId 外部请求id
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId == null ? null : requestId.trim();
    }

    /**
     * 获取商品金额
     *
     * @return original_price - 商品金额
     */
    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    /**
     * 设置商品金额
     *
     * @param originalPrice 商品金额
     */
    public void setOriginalPrice(BigDecimal originalPrice) {
        this.originalPrice = originalPrice;
    }

    /**
     * 获取商品现价
     *
     * @return current_price - 商品现价
     */
    public BigDecimal getCurrentPrice() {
        return currentPrice;
    }

    /**
     * 设置商品现价
     *
     * @param currentPrice 商品现价
     */
    public void setCurrentPrice(BigDecimal currentPrice) {
        this.currentPrice = currentPrice;
    }

    /**
     * 获取实际支付金额
     *
     * @return buyer_pay_amount - 实际支付金额
     */
    public BigDecimal getBuyerPayAmount() {
        return buyerPayAmount;
    }

    /**
     * 设置实际支付金额
     *
     * @param buyerPayAmount 实际支付金额
     */
    public void setBuyerPayAmount(BigDecimal buyerPayAmount) {
        this.buyerPayAmount = buyerPayAmount;
    }

    /**
     * 获取商家实收金额
     *
     * @return receipt_amount - 商家实收金额
     */
    public BigDecimal getReceiptAmount() {
        return receiptAmount;
    }

    /**
     * 设置商家实收金额
     *
     * @param receiptAmount 商家实收金额
     */
    public void setReceiptAmount(BigDecimal receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

    /**
     * 获取商家优惠金额
     *
     * @return discount_amount - 商家优惠金额
     */
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    /**
     * 设置商家优惠金额
     *
     * @param discountAmount 商家优惠金额
     */
    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    /**
     * 获取第三方补贴金额
     *
     * @return subsidy_amount - 第三方补贴金额
     */
    public BigDecimal getSubsidyAmount() {
        return subsidyAmount;
    }

    /**
     * 设置第三方补贴金额
     *
     * @param subsidyAmount 第三方补贴金额
     */
    public void setSubsidyAmount(BigDecimal subsidyAmount) {
        this.subsidyAmount = subsidyAmount;
    }

    /**
     * 获取开具发票的金额
     *
     * @return invoice_amount - 开具发票的金额
     */
    public BigDecimal getInvoiceAmount() {
        return invoiceAmount;
    }

    /**
     * 设置开具发票的金额
     *
     * @param invoiceAmount 开具发票的金额
     */
    public void setInvoiceAmount(BigDecimal invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    /**
     * 获取数量
     *
     * @return quantity - 数量
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 设置数量
     *
     * @param quantity 数量
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * 获取交易状态（1:已发码 2:已核销 3:已退款）
     *
     * @return status - 交易状态（1:已发码 2:已核销 3:已退款）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置交易状态（1:已发码 2:已核销 3:已退款）
     *
     * @param status 交易状态（1:已发码 2:已核销 3:已退款）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取订单code
     *
     * @return order_code - 订单code
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * 设置订单code
     *
     * @param orderCode 订单code
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    /**
     * 获取核码渠道 1:一体机
     *
     * @return take_point_type - 核码渠道 1:一体机
     */
    public Integer getTakePointType() {
        return takePointType;
    }

    /**
     * 设置核码渠道 1:一体机
     *
     * @param takePointType 核码渠道 1:一体机
     */
    public void setTakePointType(Integer takePointType) {
        this.takePointType = takePointType;
    }

    /**
     * 获取核码机器id
     *
     * @return take_point - 核码机器id
     */
    public String getTakePoint() {
        return takePoint;
    }

    /**
     * 设置核码机器id
     *
     * @param takePoint 核码机器id
     */
    public void setTakePoint(String takePoint) {
        this.takePoint = takePoint == null ? null : takePoint.trim();
    }

    /**
     * @return customer_id
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }
}