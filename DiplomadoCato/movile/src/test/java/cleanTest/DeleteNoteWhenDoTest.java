package cleanTest;

import activity.whenDo.CreateNoteForm;
import activity.whenDo.DeleteForm;
import activity.whenDo.MainScreen;
import activity.whenDo.UpdateForm;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import singletonSession.Session;

public class DeleteNoteWhenDoTest {
    MainScreen mainScreen = new MainScreen();
    CreateNoteForm createNoteForm = new CreateNoteForm();
    UpdateForm updateForm= new UpdateForm();
    DeleteForm deleteForm= new DeleteForm();

    @Test
    public void verifyDeleteNewNote(){
        String title="Guis";
        String note="Hola como estas";

        mainScreen.addNoteButton.click();
        createNoteForm.titleTxtBox.setText(title);
        createNoteForm.noteTxtBox.setText(note);
        createNoteForm.saveButton.click();

        mainScreen.titleTxtBox.click();
        updateForm.titleTxtBox.setText("Guis1");
        updateForm.noteTxtBox.setText("Hola como estas okkk");
        updateForm.saveButton.click();

        mainScreen.titleTxtBox.click();
        deleteForm.borrar.click();
        deleteForm.confirmar.click();

        Assertions.assertFalse(mainScreen.isNoteDisplayed("Guis1"),
                "ERROR, the note was not created");

    }

    @AfterEach
    public void closeApp(){
        Session.getInstance().closeApp();
    }



}
