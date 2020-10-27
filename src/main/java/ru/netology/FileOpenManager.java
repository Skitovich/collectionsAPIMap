package ru.netology;

import java.util.HashMap;
import java.util.Map;

public class FileOpenManager {
    HashMap <String, String> openManager = new HashMap<>();

    public void registerNewApp(String key,String value) {
        openManager.put(key ,value);
    }

    public String getNameAppToOpenThisDirectory (String key) {
       return openManager.get(key);
    }

    public void deleteDirectoryApp (String key) {
        openManager.remove(key);
    }

    public Map<String, String> getRegisterDirectory(String key) {
        Map<String, String> res = new HashMap<>();
        for (Map.Entry<String, String> entry : openManager.entrySet())
            if (entry.getKey().equals(key))
                res.put(entry.getKey(),entry.getValue());

        return res;
    }

    public Map<String,String> getRegisterApps(String value) {
        Map<String,String> res = new HashMap<>();
        for (Map.Entry<String,String> entry : openManager.entrySet())
            if (entry.getValue().equals(value))
                res.put(entry.getKey(),entry.getValue());

        return res;
    }





}






