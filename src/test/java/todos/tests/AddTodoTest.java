package todos.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import todos.pages.TodoPage;
import todos.utils.Setup;

// Cette classe de test vérifie la fonctionnalité d'ajout de tâches à faire (todos).
public class AddTodoTest extends Setup {

	// Constructeur de la classe AddTodoTest qui hérite de la classe Setup et gère
	// les exceptions d'entrée/sortie.
	
	public AddTodoTest() throws IOException {
		super();
	}
	TodoPage todoPage;

	@Test()
	public void ICanAddTodo() throws IOException {
		todoPage = new TodoPage();
		todoPage.submitTodo(prop.getProperty("todo1"));
		
	}
}
