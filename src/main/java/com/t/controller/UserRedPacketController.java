package com.t.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.t.service.UserRedPacketService;

/**
 * @author 0502  T  2017年8月23日
 */
@Controller
@RequestMapping("/userRedPacket")
public class UserRedPacketController {
	@Autowired
	private UserRedPacketService userRedPacketService;
	
	@RequestMapping("/grabRedPacket")
	@ResponseBody
	public Map<String, Object> grabRedPacket(Long userId, Long redPacketId){
		int result = userRedPacketService.grapRedPacket(userId, redPacketId);
		boolean flag = result >0;
		Map<String, Object> map = new  HashMap<String, Object>();
		map.put("success", flag);
		map.put("message", flag ? "抢红包成功" : "抢红包失败");
		return map;
	}
	
}
