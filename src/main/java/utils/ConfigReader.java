package utils;

import io.github.cdimascio.dotenv.Dotenv;

public class ConfigReader {
    private static Dotenv dotenv = Dotenv.load();

    public static String getUsermail() {
        return dotenv.get("EMAIL");
    }

    public static String getPassword() {
        return dotenv.get("PASSWORD");
    }
}
