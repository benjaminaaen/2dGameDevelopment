package game;

import game.net.packets.Packet01Disconnect;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowHandler implements WindowListener
{
	private final Game game;

	public WindowHandler(Game game)
	{
		this.game = game;
		this.game.frame.addWindowListener(this);
	}
	
	@Override
	public void windowActivated(WindowEvent arg0)
	{
	}

	@Override
	public void windowClosed(WindowEvent arg0)
	{
	}

	@Override
	public void windowClosing(WindowEvent arg0)
	{
		Packet01Disconnect packet = new Packet01Disconnect(this.game.player.getUsername());
		packet.writeData(this.game.socketClient);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0)
	{
	}

	@Override
	public void windowDeiconified(WindowEvent arg0)
	{
	}

	@Override
	public void windowIconified(WindowEvent arg0)
	{
	}

	@Override
	public void windowOpened(WindowEvent arg0)
	{
	}

}
