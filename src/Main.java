import JGamePlay.Window;
import JGamePlay.Animation;
import JGamePlay.GameImage;
import JGamePlay.Keyboard;
import JGamePlay.Mouse;

public class Main {
	
	public static void main(String[] args) {
		Window janela = new Window(800,600);
		Keyboard keyboard = janela.getKeyboard();
		Mouse mouse = janela.getMouse();
		
		GameImage backGround = new GameImage("src\\TelaInicial.png");

		Animation botaoIniciar = new Animation("src\\iniciar.png",3);
		Animation botaoOpcoes = new Animation("src\\opcoes.png",3);
		
		botaoIniciar.setPosition(375, 200);
		botaoIniciar.setTimeChangeFrame(100);
		botaoIniciar.setDimension(325, 139);
		
		botaoOpcoes.setPosition(375,375);
		botaoOpcoes.setTimeChangeFrame(100);
		botaoOpcoes.setDimension(325, 139);
		
		boolean executando = true;
		boolean clicouNobotaoIniciar = false;
		boolean clicouNobotaoOpcoes = false;
		
		while(executando){
			
			backGround.draw();
			botaoIniciar.draw();
			botaoOpcoes.draw();
			janela.display();
			
			if (mouse.isOverObject(botaoIniciar) && mouse.isLeftButtonPressed())
				clicouNobotaoIniciar = true;
			
			if(clicouNobotaoIniciar)
				botaoIniciar.runAnimation();
			
			if(botaoIniciar.isAnimationFinished()) {
				clicouNobotaoIniciar = false;
				botaoIniciar.reset();
			}
			
			if (mouse.isOverObject(botaoOpcoes) && mouse.isLeftButtonPressed())
				clicouNobotaoOpcoes = true;
			
			if(clicouNobotaoOpcoes)
				botaoOpcoes.runAnimation();
			
			if(botaoOpcoes.isAnimationFinished()) {
				clicouNobotaoIniciar = false;
				botaoOpcoes.reset();
			}
				
			if (keyboard.keyDown(Keyboard.ESCAPE_KEY) )
				executando = false;
		}
		janela.exit();
	}
}
	
