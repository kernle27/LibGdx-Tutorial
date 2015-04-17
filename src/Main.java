import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import de.outcraft.Core;

/**
 * Created by Dante on 16.04.15.
 */
public class Main {

    public static void main(String[] args) {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();

        
        new LwjglApplication(new Core(), cfg);
    }
}
