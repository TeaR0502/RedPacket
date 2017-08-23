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
 * @author 0502  T  2017��8��23��
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
		//��ȡ�����ĺ������Ϣ
		RedPacket redPacket = redPacketDao.getRedPacket(redPacketId);
		System.out.println(redPacket);
		//��������������
		if (redPacket.getStock() > 0){
			redPacketDao.decreaseRedPacket(redPacketId);
			UserRedPacket userRedPacket = new UserRedPacket();
			userRedPacket.setRedPacketId(redPacketId);
			userRedPacket.setUserId(userId);
			userRedPacket.setAmount(redPacket.getUnitAmount());
			userRedPacket.setNote("�����:"+redPacketId);
			//�����������¼
			int result = userRedPacketDao.grapRedPacket(userRedPacket);
			return result;
		}
		return 0;//ʧ��
	}

}