package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileOpenManagerTest {
    FileOpenManager manager = new FileOpenManager();
    String firstAppValue = "Google";
    String firstAppKey = "html";
    String secondAppValue = "Note";
    String secondAppKey = "txt";
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
    void getRegisterDirectoryAndApps() {
        assertEquals(manager.getRegisterDirectory(thirdAppKey), manager.getRegisterApps(thirdAppValue));

    }

}