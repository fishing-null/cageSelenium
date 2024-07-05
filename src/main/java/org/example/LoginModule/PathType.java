package org.example.LoginModule;

public enum PathType {
    XPATH("xpath"),
    CSSSLC("cssslc");
    private String type;

    PathType(String type) {
        this.type = type;
    }
}
