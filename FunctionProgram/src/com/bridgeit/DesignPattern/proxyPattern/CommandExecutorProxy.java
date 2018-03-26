/******************************************************************************
 *  Purpose: Proxy Design Pattern
 *  
 *  @author  Usha Kale
 *  @version 1.0
 *  @since   23-03-2018
 ******************************************************************************/
package com.bridgeit.DesignPattern.proxyPattern;

public class CommandExecutorProxy implements CommandExecutor
{
	private boolean isAdmin;
	private CommandExecutor executor;
	
	public CommandExecutorProxy(String user, String pwd)
	{
		if("Pankaj".equals(user) && "J@urnalD$v".equals(pwd)) isAdmin=true;
		executor = new CommandExecutorImpl();
	}

	@Override
	public void runCommand(String cmd) throws Exception {
		if(isAdmin)
		{
			executor.runCommand(cmd);
		}else{
			if(cmd.trim().startsWith("rm")){
				throw new Exception("rm command is not allowed for non-admin users.");
			}else{
				executor.runCommand(cmd);
			}
		}
		
	}

}
