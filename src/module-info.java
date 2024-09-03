module WebBrowser {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.web;
	requires javafx.base;
	
	opens application to javafx.graphics, javafx.fxml;
}
