package Model;

import View.GameOverMenu;
import javafx.scene.Scene;
import javafx.stage.Stage;

import View.StartingMenu;
import View.CharacterCreationMenu;
import View.GameOverMenu;

public class MainMenuHandler {

    StartingMenu startingMenu;
    CharacterCreationMenu characterCreationMenu;
    GameOverMenu gameOverMenu;
    MusicHandler musicHandler;
    //LoadGameMenu loadGameMenu;
    //SettingsMenu settingsMenu;
    //ExitGame exitGame;

    Scene startingScene;
    Scene mainScene;
    Stage mainStage;

    public MainMenuHandler(Player player, SaveGame saveGame, LoadGame loadGame, Stage mainStage, Scene mainScene, RunGame _run, GameState _state, MusicHandler musicHandler)
    {
        this.mainStage = mainStage;
        this.mainScene = mainScene;

        startingMenu = new StartingMenu(this, _run);
        characterCreationMenu = new CharacterCreationMenu(this, player, _state);
        this.musicHandler = musicHandler;
        gameOverMenu = new GameOverMenu(this);

        changeMenu(0); // Sets scene to starting scene
    }

    public void changeMenu(int menuNumber) {

        if(menuNumber == 0) { // Starting Scene (Main Menu)
            mainStage.setScene(startingMenu.generateScene());
            musicHandler.playMainMenuMusic();
        }
        else if(menuNumber == 1) { // Main Scene
            musicHandler.stopMainMenuMusic();
            mainStage.setScene(mainScene);
            //musicHandler.playVillageMusic();
        }
        else if(menuNumber == 2) // New Game (Character Creation)
            mainStage.setScene(characterCreationMenu.generateScene());
        else if(menuNumber == 3) { // Exits Game
            //musicHandler.stopVillageMusic();
            mainStage.close();
        }
        else if(menuNumber == 4) // GameOver Screen
            mainStage.setScene(gameOverMenu.generateScene());
    }

}
