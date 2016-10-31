package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.model.SuccessKilled;

/**
 * Created by youmxia on 2016/10/5.
 */
public interface SucessSeckilledDao {

    /**
     * 插入秒杀明细表 可过滤重复
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSuccessSeckilled(@Param("seckillId") long seckillId,@Param("userPhone")  long userPhone);

    /**
     * 查询出来successSeckilled 带着Seckill
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(@Param("seckillId") long seckillId,@Param("userPhone")long userPhone);
}
