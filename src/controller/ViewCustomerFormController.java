package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Customer;

public class ViewCustomerFormController {
    public TableView tblCustomer;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colAddress;
    public TableColumn colSalary;

    public void btnReloadOnAction(ActionEvent actionEvent) {

        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));

        ObservableList<Customer> customerObservableList = FXCollections.observableArrayList();
        customerObservableList.add(new Customer("001","kamal","gampaha",75000.0));
        customerObservableList.add(new Customer("001","kamal","gampaha",75000.0));
        customerObservableList.add(new Customer("001","kamal","gampaha",75000.0));

        tblCustomer.setItems(customerObservableList);
    }
}
