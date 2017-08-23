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
 * @author 0502  T  2017��8��23��
 */
@Service
public class RedPacketServiceimpl implements RedPacketService {

	@Autowired
	private RedPacketDao redPacketDao;
	
	//����ע��
	//isolation=Isolation.READ_COMMITTED >> ��д���뼶��
	//propagation=Propagation.REQUIRED >> ������Ϊ û�����ﴴ������,����������������
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