package com.t.service;

import com.t.entity.RedPacket;

/**
 * @author 0502  T  2017��8��23��
 */
public interface RedPacketService {
	/**
	 * ��ȡ�������Ϣ
	 * @param id
	 * @return �����Ϣ
	 */
	RedPacket getRedPacket(Long id);
	
	/**
	 * ���������������
	 * @param id
	 * @return Ӱ������
	 */
	int decreaseRedPacket(Long id);
}