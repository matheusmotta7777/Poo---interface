package br.univille.log;

public class LoggerFactory {
    static Logger onConsole() {
        return new LoggerConsole();
    }

    static Logger onFile(String filename) {
        return new LoggerFile(filename);
    }

}
