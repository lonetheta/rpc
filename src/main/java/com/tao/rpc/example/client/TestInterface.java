package com.tao.rpc.example.client;

import java.util.List;

import com.tao.rpc.example.CustomObject;

/**
 * 服务器端和客户端统一制定进行交流的接口。
 * @author Tao
 *
 */

public interface TestInterface {
	
	//function
	public String methodWithoutArg();
	public String methodWithArgs(String arg1, String arg2);
	public CustomObject methodWithCustomObject(CustomObject customObject);
	public List<String> methodReturnList(String arg1, String arg2);
	public void methodThrowException();
	public void methodTimeout();
	public void methodReturnVoid();
	public String methodDelayOneSecond();
	
	//multiThread
	public int methodForMultiThread(int threads);
	
	//performance
	public String methodForPerformance();
}
