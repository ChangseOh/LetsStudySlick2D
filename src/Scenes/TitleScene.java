package Scenes;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import Main.ProjectMain;

public class TitleScene extends BasicGameState {

	StateBasedGame game;
	GameContainer gc;
	
	protected int ID; 

	public TitleScene() {
		// TODO Auto-generated constructor stub
	}

	public TitleScene(int id) {
		// TODO Auto-generated constructor stub
		
		this.ID = id;
	}
	
	@Override
	public void init(GameContainer arg0, StateBasedGame arg1)
			throws SlickException {
		// TODO Auto-generated method stub
		
		game = arg1;
		gc = arg0;

	}

	@Override
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics g)
			throws SlickException {
		// TODO Auto-generated method stub

		
		g.setColor(Color.white);
		g.drawString("push [1] to Game Scene", 10, 100);
	}

	@Override
	public void update(GameContainer arg0, StateBasedGame arg1, int arg2)
			throws SlickException {
		// TODO Auto-generated method stub

	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return ID;
	}

	@Override
	public void keyReleased(int key, char c) {
		// TODO Auto-generated method stub
		
		switch(key){
		case Input.KEY_1:
			game.enterState(ProjectMain.STATE_GAME);
			break;
		}
	}

}
