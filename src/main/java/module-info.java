module ies.luisvives.org.interfazdinamicafx {
	requires javafx.controls;
	requires javafx.fxml;
	requires org.jfxtras.styles.jmetro;

	opens ies.luisvives.org.interfazdinamicafx to javafx.fxml;
	exports ies.luisvives.org.interfazdinamicafx;
}