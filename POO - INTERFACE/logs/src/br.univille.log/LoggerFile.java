package br.univille.log;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LoggerFile implements Logger{

    private String filename;

    LoggerFile(String filename) {
        this.filename = filename;
    }

    @Override
    public void log(Level level, String message) {
        try (PrintWriter out = new PrintWriter(new FileWriter(filename, true))) {
            out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) + " " + level + " " + message);
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
    
}
