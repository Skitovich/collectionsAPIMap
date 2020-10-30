package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class FileOpenManagerTest {
    FileOpenManager manager = new FileOpenManager();
    String firstAppValue = "Google";
    String firstAppKey = "html";
    String secondAppValue = "Note";
    String secondAppKey = "png";
    String thirdAppValue = "Photoshop";
    String thirdAppKey = "png";

    @BeforeEach
    void setUp() {
        manager.registerNewApp(firstAppKey, firstAppValue);
        manager.registerNewApp(secondAppKey, secondAppValue);
        manager.registerNewApp(thirdAppKey, thirdAppValue);
    }

    @Test
    void getNameAppToOpenThisDirectory() {
        assertEquals(firstAppValue, manager.getNameAppToOpenThisDirectory(firstAppKey));
    }

    @Test
    void deleteDirectoryApp() {
        manager.deleteDirectoryApp(firstAppKey);
        assertNull(manager.getNameAppToOpenThisDirectory(firstAppKey));
    }

    @Test
    void getRegisterDirectory() {
        manager.deleteDirectoryApp(firstAppKey);
        TreeSet<String> expected = new TreeSet<>(Collections.singleton(thirdAppValue));
        assertEquals(expected, manager.getRegisterApps());
    }

    @Test
    void getRegisterApps() {
        manager.deleteDirectoryApp(firstAppKey);
        TreeSet<String> expected = new TreeSet<>(Collections.singleton(thirdAppKey));
        assertEquals(expected, manager.getRegisterDirectory());
    }


}