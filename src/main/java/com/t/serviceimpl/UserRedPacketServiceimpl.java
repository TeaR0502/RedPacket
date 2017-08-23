package com.t.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.t.dao.RedPacketDao;
import com.t.dao.UserRedPacketDao;
import com.t.entity.RedPacket;
import com.t.entity.UserRedPacket;
import com.t.service.UserRedPacketService;

/**
 * @author 0502  T  2017年8月23日
 */
@Service
public class UserRedPacketServiceimpl implements UserRedPacketService {
	@Autowired
	private UserRedPacketDao userRedPacketDao;
	@Autowired
	private RedPacketDao redPacketDao;
	
	@Transactional(isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
	public int grapRedPacket(Long userId, Long redPacketId) {
		System.out.println("userId:"+userId+"||||||"+"redPacketId:"+redPacketId);
		//获取被抢的红包的信息
		RedPacket redPacket = redPacketDao.getRedPacketForUpdate(redPacketId);
		//System.out.println(redPacket);
		//如果还有则抢红包
		if (redPacket.getStock() > 0){
			redPacketDao.decreaseRedPacket(redPacketId);
			UserRedPacket userRedPacket = new UserRedPacket();
			userRedPacket.setRedPacketId(redPacketId);
			userRedPacket.setUserId(userId);
			userRedPacket.setAmount(redPacket.getUnitAmount());
			userRedPacket.setNote("抢红包:"+redPacketId);
			//插入抢红包记录
			int result = userRedPacketDao.grapRedPacket(userRedPacket);
			return result;
		}
		return 0;//失败
	}

}
