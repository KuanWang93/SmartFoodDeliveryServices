package com.chris.vo.orderDetailVOs;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetailVO {
    private Long orderId;
    private String clientPhone;        // 下单人手机号
    private List<OrderItemVO> items;   // 菜品 + 单价 + 数量 + 小计 + 备注
    private AddressBookVO address;     // 地址 + 联系人 + 手机号
    private BigDecimal totalAmount;
    private BigDecimal deliveryFee;
    private String paymentMethod;
    private LocalDateTime paidAt;
    private Short status;
    private String remark;
    private String riderPhone;
    private List<OrderStatusLogVO> statusLogs; // 旧状态 + 新状态 + 改变人("角色：角色ID") + 改变时间 + 备注
}
