package ru.netology;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class FileOpenManager {
    private final Map<String, String> openManager;

    {
        openManager = new HashMap<>();
    }

    public void registerNewApp(String key, String value) {
        openManager.put(key, value);
    }

    public String getNameAppToOpenThisDirectory(String fileExtension) {
        return openManager.get(fileExtension);
    }

    public void deleteDirectoryApp(String fileExtension) {
        openManager.remove(fileExtension);
    }

    public Set<String> getRegisterDirectory() {
        return new TreeSet<>(openManager.keySet());
    }


    public Set<String> getRegisterApps() {
        return new TreeSet<>(openManager.values());
    }
}








