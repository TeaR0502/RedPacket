package com.t.dao;

import com.t.entity.RedPacket;

/**
 * @author 0502  T  2017��8��23��
 */
public interface RedPacketDao {
	/**
	 * ��ȡ�������Ϣ
	 * @param id
	 * @return
	 */
	RedPacket getRedPacket(Long id);
	
	/**
	 * ���������������
	 * @param id
	 * @return
	 */
	int decreaseRedPacket(Long id);
}