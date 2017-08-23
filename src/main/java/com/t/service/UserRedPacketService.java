package com.t.service;

import com.t.entity.UserRedPacket;

/**
 * @author 0502  T  2017年8月23日
 */
public interface UserRedPacketService {
	/**
	 * 保存抢红包的信息
	 * @param userId
	 * @param RedPacketId
	 * @return 影响记录数
	 */
	int grapRedPacket(Long userId, Long redPacketId);
}
