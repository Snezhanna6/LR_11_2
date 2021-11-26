package Main;


public class Main {

    public static void main(String[] args) {

        //Выбираем язык и создаем компилятор
        Сreature creature = new Сreature();
        Compilator myCompilator = creature.createCompilator();

        //Ввод кода
        InputCode inputCode = new InputCode();
        inputCode.entryCode(myCompilator);

        //Компиляция
        Compilation compilation = new Compilation();
        compilation.go(myCompilator);

        //Вывод промежуточных результатов
        Dialog dialog = new Dialog();
        dialog.result(myCompilator);


    }
}
