package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: SetmealDishMapper
 * Package: com.sky.mapper
 * Description:
 *
 * @Author Submerge--WangDong
 * @Create 2024-02-07 9:56
 * @Version 1.0
 */
@Mapper
public interface SetmealDishMapper {

    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);
}
