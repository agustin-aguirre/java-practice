public enum GlobalConfig {
    INSTANCE("v1.0.0");

    private boolean isDebugMode;
    private final String appVersion;

    GlobalConfig(String appVersion) {
        isDebugMode = false;
        this.appVersion = appVersion;
    }

    public boolean isDebugMode() {
        return isDebugMode;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void isDebugMode(boolean isDebugMode) {
        this.isDebugMode = isDebugMode;
    }

    @Override
    public String toString() {
        return String.format("GlobalConfig: {%n\tappVersion: %s,%n\tisDebugMode: %b%n}", appVersion, isDebugMode);
    }
}
