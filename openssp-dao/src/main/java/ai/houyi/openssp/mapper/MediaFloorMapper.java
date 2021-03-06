package ai.houyi.openssp.mapper;

import ai.houyi.openssp.model.MediaFloor;
import ai.houyi.openssp.model.example.MediaFloorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MediaFloorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_floor
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    long countByExample(MediaFloorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_floor
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    int deleteByExample(MediaFloorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_floor
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_floor
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    int insert(MediaFloor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_floor
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    int insertSelective(MediaFloor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_floor
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    MediaFloor selectOneByExample(MediaFloorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_floor
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    List<MediaFloor> selectByExample(MediaFloorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_floor
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    MediaFloor selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_floor
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    int updateByExampleSelective(@Param("record") MediaFloor record, @Param("example") MediaFloorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_floor
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    int updateByExample(@Param("record") MediaFloor record, @Param("example") MediaFloorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_floor
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    int updateByPrimaryKeySelective(MediaFloor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_floor
     *
     * @mbg.generated Tue Dec 04 19:59:17 CST 2018
     */
    int updateByPrimaryKey(MediaFloor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_floor
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsert(@Param("list") List<MediaFloor> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table media_floor
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int batchInsertSelective(@Param("list") List<MediaFloor> list, @Param("selective") MediaFloor.Column ... selective);
}