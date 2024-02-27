package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.dto.OrdersPageQueryDTO;
import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * ClassName: OrderMapper
 * Package: com.sky.mapper
 * Description:
 *
 * @Author Submerge--WangDong
 * @Create 2024-02-26 10:10
 * @Version 1.0
 */
@Mapper
public interface OrderMapper {
    /**
     * 插入订单数据
     *
     * @param orders
     */
    void insert(Orders orders);

    /**
     * 分页条件查询并按下单时间排序
     *
     * @param ordersPageQueryDTO
     */
    Page<Orders> pageQuery(OrdersPageQueryDTO ordersPageQueryDTO);


    /**
     * 根据id进行查询订单
     *
     * @param id
     * @return
     */
    @Select("select * from orders where id=#{id}")
    Orders getById(Long id);

    /**
     * 更新订单状态
     *
     * @param orders
     */
    @Update("update orders set status=#{status} where id=#{id}")
    void update(Orders orders);

    /**
     * 根据状态统计订单数量
     *
     * @param status
     */
    @Select("select count(id) from orders where status = #{status}")
    Integer countStatus(Integer status);


}

