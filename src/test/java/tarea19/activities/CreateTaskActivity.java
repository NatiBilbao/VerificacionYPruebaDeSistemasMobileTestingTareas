package tarea19.activities;

import org.openqa.selenium.By;
import tarea19.controls.Button;
import tarea19.controls.TextBox;

public class CreateTaskActivity {
    public TextBox titleTask = new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));

    public Button saveTask = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
}
