/**
 * @author Justin "JustBru00" Brubaker
 * 
 * This is licensed under the MPL Version 2.0. See license info in LICENSE.txt
 */ 
package com.gmail.justbru00.epic.rename.utils;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gmail.justbru00.epic.rename.main.Old_RenameRewrite;
import com.gmail.justbru00.epic.rename.utils.v3.VaribleReplacer;


public class Messager {

	public static String color(String uncolored){
		return ChatColor.translateAlternateColorCodes('&', uncolored);		
	}
	
	public static void msgConsole(String msg) {		
		msg = VaribleReplacer.replace(msg);
		
		if (Old_RenameRewrite.clogger != null) {
		Old_RenameRewrite.clogger.sendMessage(Old_RenameRewrite.Prefix + Messager.color(msg));		
		} else {
			Old_RenameRewrite.log.info(ChatColor.stripColor(Messager.color(msg)));
		}
	}
	
	public static void msgPlayer(String msg, Player player) {
		msg = VaribleReplacer.replace(msg);
		player.sendMessage(Old_RenameRewrite.Prefix + Messager.color(msg));
	}	
	
	public static void msgPlayer(Player player, String msg) {
		msg = VaribleReplacer.replace(msg);
		player.sendMessage(Old_RenameRewrite.Prefix + Messager.color(msg));
	}	
	
	public static void msgSender(String msg, CommandSender sender) {
		msg = VaribleReplacer.replace(msg);
		sender.sendMessage(Old_RenameRewrite.Prefix + Messager.color(msg));
	}	
}
