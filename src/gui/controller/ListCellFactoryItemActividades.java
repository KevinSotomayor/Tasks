package gui.controller;

import Util.Date_solver;
import bussines.Actividad;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class ListCellFactoryItemActividades {
	@FXML
    private ImageView lciMenuContextual;

    @FXML
    private Text lciFechaActividad;

    @FXML
    private CheckBox lciTituloActividad;

    @FXML
    private HBox lciHbox;
    
    public void setInformacion(Actividad actividad){
 
    	lciTituloActividad.setSelected(actividad.isFinalizada());
    	lciTituloActividad.setText(actividad.getTitulo());
    	lciFechaActividad.setText( Date_solver.obtenerFechaParaActividades(actividad.getFechafinalizacion()) );
    	
    	lciMenuContextual.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				//crear el menú contextual en cada click 
				ContextMenu contextMenu = new ContextMenu();

				MenuItem editar = new MenuItem("Editar");
				editar.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						System.out.println("Ha seleccionado editar");
					}
				});
				
				MenuItem borrar = new MenuItem("Borrar");
				borrar.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						System.out.println("Ha seleccionado borrar");
					}
				});
				
				MenuItem marcar = new MenuItem("Marcar como hecho");
				marcar.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						System.out.println("Ha seleccionado marcar como hecho");
					}
				});

				
				contextMenu.getItems().addAll(editar, borrar, marcar);
				contextMenu.show(lciMenuContextual, event.getScreenX(), event.getScreenY());
				
			}
		});
    	
    	
    }

}
