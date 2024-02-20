package com.sky.mapper;

import com.sky.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * ClassName: UserMapper
 * Package: com.sky.mapper
 * Description:
 *
 * @Author Submerge--WangDong
 * @Create 2024-02-20 17:11
 * @Version 1.0
 */
@Mapper
public interface UserMapper {

    /**
     * 根据openid查询用户
     * @param openid
     * @return
     */
    @Select("select * from user where openid = #{openid}")
    User getOpenId(String openid);


    /**
     * 插入数据
     * @param user
     */
    void insert(User user);
}
