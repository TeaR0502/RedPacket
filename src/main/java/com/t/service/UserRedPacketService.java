package com.t.service;

import com.t.entity.UserRedPacket;

/**
 * @author 0502  T  2017��8��23��
 */
public interface UserRedPacketService {
	/**
	 * �������������Ϣ
	 * @param userId
	 * @param RedPacketId
	 * @return Ӱ���¼��
	 */
	int grapRedPacket(Long userId, Long redPacketId);
}