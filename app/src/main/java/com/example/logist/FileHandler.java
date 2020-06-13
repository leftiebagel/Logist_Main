package com.example.logist;

import android.content.SharedPreferences
import java.util.Map

public class FileHandler {
    private SharedPreferences storage;

    public static void save(SharedPreferences storage, String toJson, String name) {
        storage.edit().putString(name, toJson).apply();
    }
    public void delete(SharedPreferences storage, String key) {
        storage.edit().remove(key).apply();
    }

    public Map<String, ?> allStrings(SharedPreferences storage) {
        return storage.getAll();
    }
}
