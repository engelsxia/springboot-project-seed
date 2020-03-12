package com.company.project.model;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_order")
public class TOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")//页面写入数据库时格式化
    @JSONField(format="yyyy-MM-dd hh:mm:ss")//数据库导出页面时json格式化
    @Column(name = "create_time")
    private Date createTime;

    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")//页面写入数据库时格式化
    @JSONField(format="yyyy-MM-dd hh:mm:ss")//数据库导出页面时json格式化
    @Column(name = "update_time")
    private Date updateTime;

    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")//页面写入数据库时格式化
    @JSONField(format="yyyy-MM-dd hh:mm:ss")//数据库导出页面时json格式化
    @Column(name = "delete_time")
    private Date deleteTime;

    /**
     * 下单用户ID
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 产品ID
     */
    @Column(name = "product_id")
    private Long productId;

    /**
     * 实际支付金额
     */
    private Integer price;

    /**
     * 订单状态, 0为支付中, 1为交易完成, 2为全部资源已被撤销, 3为资源确认冲突
     */
    private Byte status;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return delete_time
     */
    public Date getDeleteTime() {
        return deleteTime;
    }

    /**
     * @param deleteTime
     */
    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * 获取下单用户ID
     *
     * @return user_id - 下单用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置下单用户ID
     *
     * @param userId 下单用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取产品ID
     *
     * @return product_id - 产品ID
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 设置产品ID
     *
     * @param productId 产品ID
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 获取实际支付金额
     *
     * @return price - 实际支付金额
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 设置实际支付金额
     *
     * @param price 实际支付金额
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 获取订单状态, 0为支付中, 1为交易完成, 2为全部资源已被撤销, 3为资源确认冲突
     *
     * @return status - 订单状态, 0为支付中, 1为交易完成, 2为全部资源已被撤销, 3为资源确认冲突
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置订单状态, 0为支付中, 1为交易完成, 2为全部资源已被撤销, 3为资源确认冲突
     *
     * @param status 订单状态, 0为支付中, 1为交易完成, 2为全部资源已被撤销, 3为资源确认冲突
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}