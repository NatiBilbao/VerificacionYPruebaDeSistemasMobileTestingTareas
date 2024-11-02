package tarea19.activities;

import org.openqa.selenium.By;
import tarea19.controls.Button;

public class DeleteConfirmDialog {
    public Button deleteTask = new Button(By.xpath("//android.widget.Button[@text='DELETE']"));
}
