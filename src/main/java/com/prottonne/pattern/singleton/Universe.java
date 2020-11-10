package com.prottonne.pattern.singleton;

public final class Universe {

    private static Universe universe;
    private long galaxyCount;

    private Universe() {
    }

    public static Universe getUniverse() {
        if (universe == null) {
            universe = new Universe();
        }
        return universe;
    }

    public long getGalaxyCount() {
        return galaxyCount;
    }

    public void setGalaxyCount(long galaxyCount) {
        this.galaxyCount = galaxyCount;
    }

}
