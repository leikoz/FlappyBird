package States;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.flappybird.FlappyBird;

public class MenuState extends State{

    private Texture background;
    private Texture playButton;

    public MenuState(GameStateManager gsm){
        super(gsm);
        background = new Texture("background-day.png");
        playButton = new Texture("playbtn.png");
    }

    @Override
    public void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch spriteBatch) {
        spriteBatch.begin();

        spriteBatch.draw(background,0,0, FlappyBird.WIDHT,FlappyBird.HEIGHT);

        spriteBatch.draw(playButton, (FlappyBird.WIDHT/2) - (playButton.getWidth()/2),(FlappyBird.HEIGHT/2)-(playButton.getHeight()/2));

        spriteBatch.end();

    }
}
