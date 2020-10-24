package Core;

import com.sun.istack.internal.NotNull;
import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.Set;

/**
 * @author Nime Iji
 *         Created by nima on 10/24/2020 AD.
 */

public class UXCore {

    //Settings


    private static UXCore instance = null;

    private UXCore() {

    }

    public static UXCore getUXCore() {
        if (instance == null)
            instance = new UXCore();
        return instance;
    }

    public Set<Class <? extends UXTool>> getTools(){
        Reflections reflections = new Reflections("Core");
        Set<Class<? extends UXTool>> classes = reflections.getSubTypesOf(UXTool.class);
        return classes;
    }

    static void activeTool(@NotNull UXTool uxTool) {
        try {
            uxTool.active();
        } catch (Exception e) {
            // Todo: manage exception
        }
    }

    static void activeTools(@NotNull UXTool... uxTools) {
        try {
            for (UXTool uxTool : uxTools) {
                uxTool.active();
            }
        } catch (Exception e) {
            // Todo: manage exception
        }
    }

}
