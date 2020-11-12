package com.hpy.convertfoodemo.convert.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hpy.convertfoodemo.convert.entity.DO.PersonDO;
import com.hpy.convertfoodemo.convert.entity.DTO.PersonInfoDTO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author A51398
 */
@Repository
public interface PersonMapper extends BaseMapper<PersonDO> {

    /**
     * 通过左连接获取对象集合
     * @return 返回对象集合
     */
    public List<PersonInfoDTO> getPersonByJoin();

}
