package com.t.dao;

import com.t.entity.RedPacket;

/**
 * @author 0502  T  2017年8月23日
 */
public interface RedPacketDao {
	/**
	 * 获取红包的信息
	 * @param id
	 * @return
	 */
	RedPacket getRedPacket(Long id);
	
	/**
	 * 减少抢红包的数量
	 * @param id
	 * @return
	 */
	int decreaseRedPacket(Long id);
}
