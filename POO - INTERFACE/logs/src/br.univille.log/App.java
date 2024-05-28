package br.univille.log;

public class App {
    public static void main(String[] args) throws Exception {

        Logger loggerConsole = LoggerFactory.onConsole();
        loggerConsole.log(Level.DEBUG, "Esta é uma mensagem de debug");
        loggerConsole.log(Level.WARNING, "Esta é uma mensagem de aviso");
        loggerConsole.log(Level.ERROR, "Esta é uma mensagem de erro");

        Logger loggerFile = LoggerFactory.onFile("log.txt");
        loggerFile.log(Level.DEBUG, "Esta é uma mensagem de debug");
        loggerFile.log(Level.WARNING, "Esta é uma mensagem de aviso");
        loggerFile.log(Level.ERROR, "Esta é uma mensagem de erro");
        
    }
}
