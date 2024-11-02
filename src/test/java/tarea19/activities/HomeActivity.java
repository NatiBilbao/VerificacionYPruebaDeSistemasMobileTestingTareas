package tarea19.activities;

import org.openqa.selenium.By;
import tarea19.controls.Button;

public class HomeActivity {
    public Button addTask = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));

    public Button taskItem(String taskName){
        return new Button(By.xpath("//android.widget.TextView[@text='"+taskName+"']"));
    }

    public Button expandMenuOrder = new Button(By.xpath("//android.widget.ImageView[@content-desc=\"Expand\"]"));

    public Button optionAlphabetic = new Button(By.xpath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Alphabetic\"]\n"));
}
