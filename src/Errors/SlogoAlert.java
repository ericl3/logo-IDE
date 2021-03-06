package Errors;
import javafx.scene.control.Alert;
/**
 * @author Hsingchih Tang
 * Trigger Alert dialogue boxes when any error/exceptional case occur in the program
 */
public class SlogoAlert {
    private Alert myAlertBox;


    /**
     * Constructor of an SlogoAlert
     * Define information to display in the Alert dialogue box by arguments passed in through constructor
     * @param title title of the pop-up AlertBox for this SlogoAlert object
     * @param header header of the pop-up AlertBox for this SlogoAlert object
     * @param content title of the pop-up AlertBox for this SlogoAlert object
     */
    public SlogoAlert(String title, String header, String content){
        this.myAlertBox = new Alert(Alert.AlertType.ERROR);
        this.myAlertBox.setTitle(title);
        this.myAlertBox.setHeaderText(header);
        this.myAlertBox.setContentText(content);
    }

    /**
     * Empty constructor
     * Initialize nothing but the associated AlertBox as empty
     */
    public SlogoAlert(){
        this.myAlertBox = new Alert(Alert.AlertType.ERROR);
    }


    /**
     * Set up the text to display in the Alert dialogue box
     * @param t title of the AlertBox
     * @param h header of the AlertBox
     * @param c content of  the AlertBox
     */
    public void setText(String t, String h, String c){
        this.myAlertBox.setTitle(t);
        this.myAlertBox.setHeaderText(h);
        this.myAlertBox.setContentText(c);
    }


    /**
     * Display Alert dialogue to notify users about XML file's mal-formatting issues
     * The parsed information will not be adopted for initializing a grid until the other valid file is parsed
     */
    public void showAlert(){
        this.myAlertBox.showAndWait();
    }



}
