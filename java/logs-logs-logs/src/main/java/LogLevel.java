public enum LogLevel {
    INFO(4),
    TRACE(1),
    DEBUG(2),
    ERROR(6),
    FATAL(42),
    WARNING(5),
    UNKNOWN(0);

    private final int shortLevel;

    LogLevel(int shortLevel) {
        this.shortLevel = shortLevel;
    }

    public int getShortLevel() {
        return this.shortLevel;
    }
}
