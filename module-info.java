module AP.Project {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;

    opens Game to javafx.graphics;
    opens Main_menu;
    opens Pause_Menu;
    exports Game;
    exports practice;
}