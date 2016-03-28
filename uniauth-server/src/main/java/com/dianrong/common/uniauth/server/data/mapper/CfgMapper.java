package com.dianrong.common.uniauth.server.data.mapper;

import com.dianrong.common.uniauth.server.data.entity.Cfg;
import com.dianrong.common.uniauth.server.data.entity.CfgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CfgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg
     *
     * @mbggenerated Fri Mar 25 17:14:05 CST 2016
     */
    int countByExample(CfgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg
     *
     * @mbggenerated Fri Mar 25 17:14:05 CST 2016
     */
    int deleteByExample(CfgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg
     *
     * @mbggenerated Fri Mar 25 17:14:05 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg
     *
     * @mbggenerated Fri Mar 25 17:14:05 CST 2016
     */
    int insert(Cfg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg
     *
     * @mbggenerated Fri Mar 25 17:14:05 CST 2016
     */
    int insertSelective(Cfg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg
     *
     * @mbggenerated Fri Mar 25 17:14:05 CST 2016
     */
    List<Cfg> selectByExampleWithBLOBs(CfgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg
     *
     * @mbggenerated Fri Mar 25 17:14:05 CST 2016
     */
    List<Cfg> selectByExample(CfgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg
     *
     * @mbggenerated Fri Mar 25 17:14:05 CST 2016
     */
    Cfg selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg
     *
     * @mbggenerated Fri Mar 25 17:14:05 CST 2016
     */
    int updateByExampleSelective(@Param("record") Cfg record, @Param("example") CfgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg
     *
     * @mbggenerated Fri Mar 25 17:14:05 CST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") Cfg record, @Param("example") CfgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg
     *
     * @mbggenerated Fri Mar 25 17:14:05 CST 2016
     */
    int updateByExample(@Param("record") Cfg record, @Param("example") CfgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg
     *
     * @mbggenerated Fri Mar 25 17:14:05 CST 2016
     */
    int updateByPrimaryKeySelective(Cfg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg
     *
     * @mbggenerated Fri Mar 25 17:14:05 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(Cfg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cfg
     *
     * @mbggenerated Fri Mar 25 17:14:05 CST 2016
     */
    int updateByPrimaryKey(Cfg record);
}