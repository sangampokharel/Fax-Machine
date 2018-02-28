
package fax.machine;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import net.webservicex.Fax;
import net.webservicex.FaxSoap;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextField fromemail;
    
    @FXML
    private TextField subject;
    
    @FXML
    private TextField faxnumber;
    
    @FXML
    private TextField toname;
    
    @FXML
    private TextArea faxmessage;
    
    
    Fax fax=new Fax();
    FaxSoap sendFax=fax.getFaxSoap();
    
    @FXML
    private void sendFax(ActionEvent event){
        String fe=fromemail.getText();
        String sb=subject.getText();
        String fn=faxnumber.getText();
        String tn=toname.getText();
        String fm=faxmessage.getText();
        
        sendFax.sendTextToFax(fe, sb, fn, tn, fm);
       
    
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
