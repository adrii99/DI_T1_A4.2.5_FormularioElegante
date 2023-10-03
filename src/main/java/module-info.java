module es.ieslosmontecillos.formularioelegante {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.formularioelegante to javafx.fxml;
    exports es.ieslosmontecillos.formularioelegante;
}