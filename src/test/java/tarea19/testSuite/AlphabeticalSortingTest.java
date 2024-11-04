package tarea19.testSuite;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tarea19.session.Session;
import tarea19.activities.CreateTaskActivity;
import tarea19.activities.HomeActivity;


public class AlphabeticalSortingTest {
    private HomeActivity homeActivity = new HomeActivity();
    private CreateTaskActivity createTaskActivity = new CreateTaskActivity();


    @Test
    public void verifySomething() throws InterruptedException {

        //Crear tarea 1
        String taskName1 = "Hacer la tarea de verificacion y prueba de sistemas";

        homeActivity.addTask.click();
        createTaskActivity.titleTask.setText(taskName1);
        createTaskActivity.saveTask.click();

        //Crear tarea 2
        String taskName2 = "Realizar el ejercicio extra";

        homeActivity.addTask.click();
        createTaskActivity.titleTask.setText(taskName2);
        createTaskActivity.saveTask.click();

        //Crear tarea 3
        String taskName3 = "Completar los ejercicios extra";

        homeActivity.addTask.click();
        createTaskActivity.titleTask.setText(taskName3);
        createTaskActivity.saveTask.click();

        //Ordenar las tareas
        homeActivity.expandMenuOrder.click();
        homeActivity.optionAlphabetic.click();
        Thread.sleep(5000);

        Assertions.assertTrue(homeActivity.taskItem(taskName3).isControlDisplayed(), "ERROR las tareas no fueron ordenadas");

    }

    @AfterEach
    public void close(){
        Session.getInstance().closeApp();
    }
}
