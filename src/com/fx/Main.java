package com.fx;
	
import java.util.List;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;


public class Main extends Application {
	@Override
	public void start(Stage ikkuna) {
		Label teksti = new Label("Vuoro: X");
		Label ilmoitus = new Label();
		Button n1 = new Button(" ");
		n1.setFont(Font.font("Monospaced", 40));
		Button n2 = new Button(" ");
		n2.setFont(Font.font("Monospaced", 40));
		Button n3 = new Button(" ");
		n3.setFont(Font.font("Monospaced", 40));
		Button n4 = new Button(" ");
		n4.setFont(Font.font("Monospaced", 40));
		Button n5 = new Button(" ");
		n5.setFont(Font.font("Monospaced", 40));
		Button n6 = new Button(" ");
		n6.setFont(Font.font("Monospaced", 40));
		Button n7 = new Button(" ");
		n7.setFont(Font.font("Monospaced", 40));
		Button n8 = new Button(" ");
		n8.setFont(Font.font("Monospaced", 40));
		Button n9 = new Button(" ");
		n9.setFont(Font.font("Monospaced", 40));
		
		GridPane napit = new GridPane();
		napit.add(n1, 0, 0);
		napit.add(n2, 1, 0);
		napit.add(n3, 2, 0);
		napit.add(n4, 0, 1);
		napit.add(n5, 1, 1);
		napit.add(n6, 2, 1);
		napit.add(n7, 0, 2);
		napit.add(n8, 1, 2);
		napit.add(n9, 2, 2);
		
		BorderPane asettelu = new BorderPane();
		asettelu.setTop(teksti);
		asettelu.setCenter(napit);
		asettelu.setBottom(ilmoitus);
		
		ikkuna.setScene(new Scene(asettelu, 300, 300));
		ikkuna.setTitle("Ristinolla");
		ikkuna.show();
				
		n1.setOnAction((e) -> {
			ilmoitus.setText("");
			if (teksti.getText().equals("Loppu!")){
				ilmoitus.setText("Peli on loppu, ei siirtoja");
			}
			if (n1.getText().contentEquals(" ")) {
				if (teksti.getText().equals("Vuoro: X")) {
					n1.setText("X");
					teksti.setText("Vuoro: O");
				} else if (teksti.getText().equals("Vuoro: O")){
					n1.setText("O");
					teksti.setText("Vuoro: X");
				} 
			} else {
				if (!ilmoitus.getText().equals("Peli on loppu, ei siirtoja")) {
					ilmoitus.setText("Ruutu on jo varattu, valitse toinen ruutu");
				}
			}
			if (onRatkennut(n1, n2, n3, n4, n5, n6, n7, n8, n9)) {
				teksti.setText("Loppu!");
			}	
			if (!onRatkennut(n1, n2, n3, n4, n5, n6, n7, n8, n9) && kaikkiVarattu(n1, n2, n3, n4, n5, n6, n7, n8, n9)) {
				teksti.setText("Tasapeli!");
			}
		});
		
		n2.setOnAction((e) -> {
			ilmoitus.setText("");
			if (teksti.getText().equals("Loppu!")){
				ilmoitus.setText("Peli on loppu, ei siirtoja");
			}
			if (n2.getText().contentEquals(" ")) {
				if (teksti.getText().equals("Vuoro: X")) {
					n2.setText("X");
					teksti.setText("Vuoro: O");
				} else if (teksti.getText().equals("Vuoro: O")){
					n2.setText("O");
					teksti.setText("Vuoro: X");
				} 
			} else {
				if (!ilmoitus.getText().equals("Peli on loppu, ei siirtoja")) {
					ilmoitus.setText("Ruutu on jo varattu, valitse toinen ruutu");
				}
			}
			if (onRatkennut(n1, n2, n3, n4, n5, n6, n7, n8, n9)) {
				teksti.setText("Loppu!");
			}
			if (!onRatkennut(n1, n2, n3, n4, n5, n6, n7, n8, n9) && kaikkiVarattu(n1, n2, n3, n4, n5, n6, n7, n8, n9)) {
				teksti.setText("Tasapeli!");
			}
		});
		
		n3.setOnAction((e) -> {
			ilmoitus.setText("");
			if (teksti.getText().equals("Loppu!")){
				ilmoitus.setText("Peli on loppu, ei siirtoja");
			}
			if (n3.getText().contentEquals(" ")) {
				if (teksti.getText().equals("Vuoro: X")) {
					n3.setText("X");
					teksti.setText("Vuoro: O");
				} else if (teksti.getText().equals("Vuoro: O")){
					n3.setText("O");
					teksti.setText("Vuoro: X");
				} 
			} else {
				if (!ilmoitus.getText().equals("Peli on loppu, ei siirtoja")) {
					ilmoitus.setText("Ruutu on jo varattu, valitse toinen ruutu");
				}
			}
			if (onRatkennut(n1, n2, n3, n4, n5, n6, n7, n8, n9)) {
				teksti.setText("Loppu!");
			}	
			if (!onRatkennut(n1, n2, n3, n4, n5, n6, n7, n8, n9) && kaikkiVarattu(n1, n2, n3, n4, n5, n6, n7, n8, n9)) {
				teksti.setText("Tasapeli!");
			}
		});
		
		n4.setOnAction((e) -> {
			ilmoitus.setText("");
			if (teksti.getText().equals("Loppu!")){
				ilmoitus.setText("Peli on loppu, ei siirtoja");
			}
			if (n4.getText().contentEquals(" ")) {
				if (teksti.getText().equals("Vuoro: X")) {
					n4.setText("X");
					teksti.setText("Vuoro: O");
				} else if (teksti.getText().equals("Vuoro: O")){
					n4.setText("O");
					teksti.setText("Vuoro: X");
				} 
			} else {
				if (!ilmoitus.getText().equals("Peli on loppu, ei siirtoja")) {
					ilmoitus.setText("Ruutu on jo varattu, valitse toinen ruutu");
				}
			}
			if (onRatkennut(n1, n2, n3, n4, n5, n6, n7, n8, n9)) {
				teksti.setText("Loppu!");
			}
			if (!onRatkennut(n1, n2, n3, n4, n5, n6, n7, n8, n9) && kaikkiVarattu(n1, n2, n3, n4, n5, n6, n7, n8, n9)) {
				teksti.setText("Tasapeli!");
			}
		});
		
		n5.setOnAction((e) -> {
			ilmoitus.setText("");
			if (teksti.getText().equals("Loppu!")){
				ilmoitus.setText("Peli on loppu, ei siirtoja");
			}
			if (n5.getText().contentEquals(" ")) {
				if (teksti.getText().equals("Vuoro: X")) {
					n5.setText("X");
					teksti.setText("Vuoro: O");
				} else if (teksti.getText().equals("Vuoro: O")){
					n5.setText("O");
					teksti.setText("Vuoro: X");
				} 
			} else {
				if (!ilmoitus.getText().equals("Peli on loppu, ei siirtoja")) {
					ilmoitus.setText("Ruutu on jo varattu, valitse toinen ruutu");
				}
			}
			if (onRatkennut(n1, n2, n3, n4, n5, n6, n7, n8, n9)) {
				teksti.setText("Loppu!");
			}
			if (!onRatkennut(n1, n2, n3, n4, n5, n6, n7, n8, n9) && kaikkiVarattu(n1, n2, n3, n4, n5, n6, n7, n8, n9)) {
				teksti.setText("Tasapeli!");
			}
		});		
		
		n6.setOnAction((e) -> {
			ilmoitus.setText("");
			if (teksti.getText().equals("Loppu!")){
				ilmoitus.setText("Peli on loppu, ei siirtoja");
			}
			if (n6.getText().contentEquals(" ")) {
				if (teksti.getText().equals("Vuoro: X")) {
					n6.setText("X");
					teksti.setText("Vuoro: O");
				} else if (teksti.getText().equals("Vuoro: O")){
					n6.setText("O");
					teksti.setText("Vuoro: X");
				} 
			} else {
				if (!ilmoitus.getText().equals("Peli on loppu, ei siirtoja")) {
					ilmoitus.setText("Ruutu on jo varattu, valitse toinen ruutu");
				}
			}
			if (onRatkennut(n1, n2, n3, n4, n5, n6, n7, n8, n9)) {
				teksti.setText("Loppu!");
			}
			if (!onRatkennut(n1, n2, n3, n4, n5, n6, n7, n8, n9) && kaikkiVarattu(n1, n2, n3, n4, n5, n6, n7, n8, n9)) {
				teksti.setText("Tasapeli!");
			}
		});
		
		n7.setOnAction((e) -> {
			ilmoitus.setText("");
			if (teksti.getText().equals("Loppu!")){
				ilmoitus.setText("Peli on loppu, ei siirtoja");
			}
			if (n7.getText().contentEquals(" ")) {
				if (teksti.getText().equals("Vuoro: X")) {
					n7.setText("X");
					teksti.setText("Vuoro: O");
				} else if (teksti.getText().equals("Vuoro: O")){
					n7.setText("O");
					teksti.setText("Vuoro: X");
				} 
			} else {
				if (!ilmoitus.getText().equals("Peli on loppu, ei siirtoja")) {
					ilmoitus.setText("Ruutu on jo varattu, valitse toinen ruutu");
				}
			}
			if (onRatkennut(n1, n2, n3, n4, n5, n6, n7, n8, n9)) {
				teksti.setText("Loppu!");
			}
			if (!onRatkennut(n1, n2, n3, n4, n5, n6, n7, n8, n9) && kaikkiVarattu(n1, n2, n3, n4, n5, n6, n7, n8, n9)) {
				teksti.setText("Tasapeli!");
			}
		});
		
		n8.setOnAction((e) -> {
			ilmoitus.setText("");
			if (teksti.getText().equals("Loppu!")){
				ilmoitus.setText("Peli on loppu, ei siirtoja");
			}
			if (n8.getText().contentEquals(" ")) {
				if (teksti.getText().equals("Vuoro: X")) {
					n8.setText("X");
					teksti.setText("Vuoro: O");
				} else if (teksti.getText().equals("Vuoro: O")){
					n8.setText("O");
					teksti.setText("Vuoro: X");
				} 
			} else {
				if (!ilmoitus.getText().equals("Peli on loppu, ei siirtoja")) {
					ilmoitus.setText("Ruutu on jo varattu, valitse toinen ruutu");
				}
			}	
			if (onRatkennut(n1, n2, n3, n4, n5, n6, n7, n8, n9)) {
				teksti.setText("Loppu!");
			}
			if (!onRatkennut(n1, n2, n3, n4, n5, n6, n7, n8, n9) && kaikkiVarattu(n1, n2, n3, n4, n5, n6, n7, n8, n9)) {
				teksti.setText("Tasapeli!");
			}
		});
		
		n9.setOnAction((e) -> {
			ilmoitus.setText("");
			if (teksti.getText().equals("Loppu!")){
				ilmoitus.setText("Peli on loppu, ei siirtoja");
			}
			if (n9.getText().contentEquals(" ")) {
				if (teksti.getText().equals("Vuoro: X")) {
					n9.setText("X");
					teksti.setText("Vuoro: O");
				} else if (teksti.getText().equals("Vuoro: O")){
					n9.setText("O");
					teksti.setText("Vuoro: X");
				} 
			} else {
				if (!ilmoitus.getText().equals("Peli on loppu, ei siirtoja")) {
					ilmoitus.setText("Ruutu on jo varattu, valitse toinen ruutu");
				}
			}
			if (onRatkennut(n1, n2, n3, n4, n5, n6, n7, n8, n9)) {
				teksti.setText("Loppu!");
			}
			if (!onRatkennut(n1, n2, n3, n4, n5, n6, n7, n8, n9) && kaikkiVarattu(n1, n2, n3, n4, n5, n6, n7, n8, n9)) {
				teksti.setText("Tasapeli!");
			}
		});			
	}
	
	public boolean kaikkiVarattu(Button n1, Button  n2, Button n3, Button n4, Button n5, 
			Button n6, Button n7, Button n8, Button n9) {
		if (!n1.getText().contentEquals(" ") && !n2.getText().contentEquals(" ")
				&& !n3.getText().contentEquals(" ") && !n4.getText().contentEquals(" ")
				&& !n5.getText().contentEquals(" ") && !n6.getText().contentEquals(" ")
				&& !n7.getText().contentEquals(" ") && !n8.getText().contentEquals(" ")
				&& !n9.getText().contentEquals(" ")) {
			return true;
		} else {
			return false;
			
		}
	}
	
	public boolean onRatkennut(Button n1, Button  n2, Button n3, Button n4, Button n5, 
			Button n6, Button n7, Button n8, Button n9) {
		if ((n1.getText().equals("X") && n2.getText().equals("X") && n3.getText().equals("X")) ||
				(n1.getText().equals("O") && n2.getText().equals("O") && n3.getText().equals("O"))) {
			return true;
		}
		if ((n4.getText().equals("X") && n5.getText().equals("X") && n6.getText().equals("X")) ||
				(n4.getText().equals("O") && n5.getText().equals("O") && n6.getText().equals("O"))) {
			return true;
		}
		if ((n7.getText().equals("X") && n8.getText().equals("X") && n9.getText().equals("X")) ||
				(n7.getText().equals("O") && n8.getText().equals("O") && n9.getText().equals("O"))) {
			return true;
		}
		if ((n1.getText().equals("X") && n4.getText().equals("X") && n7.getText().equals("X")) ||
				(n1.getText().equals("O") && n4.getText().equals("O") && n7.getText().equals("O"))) {
			return true;
		}
		if ((n2.getText().equals("X") && n5.getText().equals("X") && n8.getText().equals("X")) ||
				(n2.getText().equals("O") && n5.getText().equals("O") && n8.getText().equals("O"))) {
			return true;
		}
		if ((n3.getText().equals("X") && n6.getText().equals("X") && n9.getText().equals("X")) ||
				(n3.getText().equals("O") && n6.getText().equals("O") && n9.getText().equals("O"))) {
			return true;
		}
		if ((n1.getText().equals("X") && n5.getText().equals("X") && n9.getText().equals("X")) ||
				(n1.getText().equals("O") && n5.getText().equals("O") && n9.getText().equals("O"))) {
			return true;
		}
		if ((n3.getText().equals("X") && n5.getText().equals("X") && n7.getText().equals("X")) ||
				(n3.getText().equals("O") && n5.getText().equals("O") && n7.getText().equals("O"))) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
