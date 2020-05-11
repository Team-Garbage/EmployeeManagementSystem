package org.teamgarbage.app.main;

import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.HashMap;

public class ResourceManager {

    private HashMap<String, Scene> sceneMap;
    private static ResourceManager rm = null;
    private Stage mainStage = null;

    private ResourceManager() {
        this.sceneMap = new HashMap<String, Scene>();
    }

    public static ResourceManager getRm() {
        if (rm == null) {
            rm = new ResourceManager();
        }

        return rm;
    }

    public void addScene(String sName, Scene scene) throws Exception {
        if (sceneMap.containsKey(sName.toUpperCase())) {
            throw new Exception("Not happening fam");
        }

        sceneMap.put(sName, scene);
    }

    public void initMainStage(Stage stage) throws Exception {
        if (this.mainStage != null) {
            throw new Exception("Main stage already initialized");
        }

        this.mainStage = stage;
    }
}
