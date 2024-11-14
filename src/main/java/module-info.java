module dk.easv.demogit {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.demogit to javafx.fxml;
    exports dk.easv.demogit;
}