package view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application
{
    @Override
    public void start(Stage stage) throws IOException
    {
        VBox root = new VBox();


        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args)
    {
        launch();
    }

    public void mainMenu()
    {

    }


    /*
            Main Menu
            1. Create Character
            2. View Characters

                Create Character Menu
                1. View/Change Name
                    Shows Name
                2. View/Change Description
                    Shows Description
                3. View/Change Starting Skills (Required to add 3 starting skills)
                    Change Starting Skills Menu
                    1. Add Main.Skill     // Lists all Tier 1 skills.
                    2. Remove Main.Skill  // Lists currently chosen skills that can be removed
                    Shows Skills

                View Character Menu
                1. Last Page (only appears if not first page)
                2. Character One // Shows Name, Brief Description, Level
                3. Character Two // Shows Name, Brief Description, Level
                .
                .
                .
                9. Next Page (only appears if there is a next page)

            Character Menu // When Character is chosen
            1. View/Change Name
                    Shows Name
            2. View/Change Description
                Shows Description
            3. View Skills
            4. View Stats
            5. Complete Mission // Will prompt user to enter an amount of experience to add to character
         */
}