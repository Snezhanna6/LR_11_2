package Main;

import java.io.File;

//абстрактный класс "компилятор"
public abstract class Compilator {

    private String code;

    /**
     * Пуск компиляции
     */
    public void start(){
        System.out.println("Начата компиляция......");
        lexicalAnalysis();
        syntacticAnalysis();
        optimization();
        codeGeneration();
        System.out.println("КОМПИЛЯЦИЯ ПРОШЛА УСПЕШНО!");
    }

    /**
     * Сеттер кода
     */
    public void setCode(String code){
        this.code = code;
    }

    /**
     * Абстрактный метод лексического анализа
     */
    public abstract void lexicalAnalysis();

    /**
     * Абстрактный метод синтаксического анализа
     */
    public abstract void syntacticAnalysis();

    /**
     * Абстрактный метод оптимизации
     */
    public abstract void optimization();

    /**
     * Абстрактный метод Генерации кода
     */
    public abstract void codeGeneration();

    /**
     * Абстрактный метод вывода лексем
     */
    public abstract void lexemTable();

    /**
     * Абстрактный метод идентификаторов
     */
    public abstract void identifTable();

    /**
     * Абстрактный метод триад
     */
    public abstract void triad();

}
