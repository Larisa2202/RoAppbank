module com.jmc.roappbanking {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;



    opens com.jmc.roappbanking to javafx.fxml;
    exports com.jmc.roappbanking;
    exports com.jmc.roappbanking.Controllers;
    exports com.jmc.roappbanking.Controllers.Admin;
    exports com.jmc.roappbanking.Controllers.Client;
    exports com.jmc.roappbanking.Models;
    exports com.jmc.roappbanking.Views;


}