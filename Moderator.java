package Main;

import java.util.Scanner;

/**
 * Класс создания компилятора
 */
class Сreature {

    public Compilator createCompilator(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер одного из предложенных " +
                "языков программирования:\n" +
                "1.Java\n" +
                "2.Ruby\n" +
                "3.Delphi");

        System.out.print("Ввод: ");
        String choice = in.nextLine();

        switch (choice){
            case "1":
                System.out.println("Выбран язык Джава");
                return new JavaCompilator();
            case "2":
                System.out.println("Выбран язык Руби");
                return new RubyCompilator();
            case "3":
                System.out.println("Выбран язык Делфи");
                return new DelphiCompilator();
            default:
                return null;
        }
    }

}

class InputCode{

    public void entryCode(Compilator compilator){
        System.out.print("Ввод кода: ");
        Scanner in = new Scanner(System.in);
        compilator.setCode(in.nextLine());
    }

}

class Compilation{

    public void go(Compilator compilator){
        compilator.start();
    }

}

class Dialog{

    public void result(Compilator compilator){

        Scanner in = new Scanner(System.in);
        System.out.println("\n\nРЕЖИМ ПРОМЕЖУТОЧНЫХ РЕЗУЛЬТАТОВ.\nДля вывода введите цифру:\n" +
                "1. Таблица лексем\n" +
                "2. Таблица идентификаторов\n" +
                "3. Триады\n" +
                "И любой символ для завершения программы.");
        while (true){
            String vibor = in.nextLine();

            switch (vibor){
                case "1":
                    compilator.lexemTable();
                    break;
                case "2":
                    compilator.identifTable();
                    break;
                case "3":
                    compilator.triad();
                    break;
                default:
                    System.out.println("Выход из режима промежуточных результатов.");
                    return;
            }
        }

    }

}