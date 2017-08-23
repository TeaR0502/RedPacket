package com.t.dao;

import com.t.entity.UserRedPacket;

/**
 * @author 0502  T  2017年8月23日
 */
public interface UserRedPacketDao {
	/**
	 * 插入抢红包的信息
	 * @param userRedPacket
	 * @return 影响记录条数
	 */
	int grapRedPacket(UserRedPacket userRedPacket);
}
