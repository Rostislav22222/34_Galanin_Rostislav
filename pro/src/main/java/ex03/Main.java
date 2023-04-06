package ex03;

import ex02.View;

/**
 * Обчислює і відображає результати<br>
 * Включає реалізацію статичного методу main()
 * 
 * @author xone
 * @version 3.0
 * @see Main#main
 */
public class Main extends ex02.Main {
	/** Ініціалізує поле {@linkplain ex02.Main#view view} */
	public Main(View view) {
		super(view);
	}

	/**
	 * Виконується при запуску програми; викликає метод {@linkplain ex02.Main#menu
	 * menu()}
	 * 
	 * @param args - параметри при запуску програми
	 */
	public static void main(String[] args) {
		Main main = new Main(new ViewableTable().getView());
		main.menu();
	}
}