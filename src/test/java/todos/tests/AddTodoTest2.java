package todos.tests;

import java.io.IOException;

import org.testng.annotations.Test;

import todos.pages.TodoPage2;
import todos.utils.Setup;

// Cette classe de test vérifie la fonctionnalité d'ajout de tâches à faire (todos).
public class AddTodoTest2 extends Setup {

	TodoPage2 todoPage2;

	public AddTodoTest2() throws IOException, InterruptedException {
		super();
		todoPage2 = new TodoPage2();
	}

	@Test()
	public void ICanAddTodo() throws IOException {
		todoPage2.submitTodo(prop.getProperty("Email1"));

	}
}
