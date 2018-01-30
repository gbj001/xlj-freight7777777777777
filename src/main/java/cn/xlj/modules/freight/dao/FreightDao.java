package cn.xlj.modules.freight.dao;

import cn.xlj.modules.freight.entity.FreightEntity;
import cn.xlj.modules.sys.dao.BaseDao;
import org.springframework.data.repository.query.Param;

/**
 * 运费数据表
 * 
 * @author gengbeijun
 * @email gengbeijun@xinliangjishipin.com
 * @date 2018-01-24 15:44:20
 */
public interface FreightDao extends BaseDao<FreightEntity> {

    FreightEntity queryByRequestId(@Param(value="requestId") String requestId);
	
}
