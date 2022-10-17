package activity.whenDo;

import appiumControl.Button;
import appiumControl.Label;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class MainScreen {

    public Button addNoteButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));

 public TextBox titleTxtBox= new TextBox(By.id("com.vrproductiveapps.whendo:id/home_list_item_text"));
    public MainScreen(){}


    public boolean isNoteDisplayed(String title){
        Label note= new Label(By.xpath("//android.widget.TextView[@text='"+title+"']"));
        return note.isControlDisplayed();
    }


}
