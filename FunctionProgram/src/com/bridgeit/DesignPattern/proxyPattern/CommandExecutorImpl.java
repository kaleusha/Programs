package com.bridgeit.DesignPattern.proxyPattern;

public class CommandExecutorImpl implements CommandExecutor
{

	@Override
	public void runCommand(String cmd) throws Exception
	{
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "' command executed.");
		
	}
	

}
