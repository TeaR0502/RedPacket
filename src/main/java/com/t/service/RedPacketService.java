package com.t.service;

import com.t.entity.RedPacket;

/**
 * @author 0502  T  2017年8月23日
 */
public interface RedPacketService {
	/**
	 * 获取红包的信息
	 * @param id
	 * @return 红包信息
	 */
	RedPacket getRedPacket(Long id);
	
	/**
	 * 减少抢红包的数量
	 * @param id
	 * @return 影响条数
	 */
	int decreaseRedPacket(Long id);
}
