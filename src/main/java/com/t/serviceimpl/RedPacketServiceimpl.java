package com.t.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.t.dao.RedPacketDao;
import com.t.entity.RedPacket;
import com.t.service.RedPacketService;

/**
 * @author 0502  T  2017年8月23日
 */
@Service
public class RedPacketServiceimpl implements RedPacketService {

	@Autowired
	private RedPacketDao redPacketDao;
	
	//事物注解
	//isolation=Isolation.READ_COMMITTED >> 读写隔离级别
	//propagation=Propagation.REQUIRED >> 传播行为 没有事物创建事物,存在事物沿用事物
	@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
	public RedPacket getRedPacket(Long id) {
		// TODO Auto-generated method stub
		return redPacketDao.getRedPacket(id);
	}
	
	@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
	public int decreaseRedPacket(Long id) {
		// TODO Auto-generated method stub
		return redPacketDao.decreaseRedPacket(id);
	}

}
