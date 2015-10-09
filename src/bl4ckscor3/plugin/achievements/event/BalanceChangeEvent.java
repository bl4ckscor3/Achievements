package bl4ckscor3.plugin.achievements.event;

import java.math.BigDecimal;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.earth2me.essentials.User;

public class BalanceChangeEvent extends Event
{
	private static final HandlerList handlers = new HandlerList();
	private User user;
	private BigDecimal previousMoney;
	private BigDecimal currentMoney;
	
	public BalanceChangeEvent(User u, BigDecimal previous, BigDecimal current)
	{
		user = u;
		previousMoney = previous;
		currentMoney = current;
	}
	
	public User getUser()
	{
		return user;
	}
	
	public BigDecimal getPreviousMoney()
	{
		return previousMoney;
	}
	
	public BigDecimal getCurrentMoney()
	{
		return currentMoney;
	}
	
	@Override
	public HandlerList getHandlers()
	{
		return handlers;
	}
	
	public static HandlerList getHandlerList()
	{
		return handlers;
	}
}
