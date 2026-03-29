package org.levimc.launcher.core.curseforge;
public class CurseForgeClient {
    private static CurseForgeClient instance;
    public static synchronized CurseForgeClient getInstance() {
        if (instance == null) instance = new CurseForgeClient();
        return instance;
    }
}
