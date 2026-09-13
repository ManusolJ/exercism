public class LogLine {

    private final String logLine;

    public LogLine(String logLine) {
        this.logLine = logLine;
    }

    public LogLevel getLogLevel() {
        String level = getLevelFromLog();

        return switch (level) {
            case "[INF]"  -> LogLevel.INFO;
            case "[TRC]"  -> LogLevel.TRACE;
            case "[DBG]"  -> LogLevel.DEBUG;
            case "[ERR]"  -> LogLevel.ERROR;
            case "[FTL]"  -> LogLevel.FATAL;
            case "[WRN]"  -> LogLevel.WARNING;
            default       -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        int shortLevel = getLogLevel().getShortLevel();
        return String.valueOf(shortLevel) + getMessageFromLog();
    }

    private String getLevelFromLog() {
        return this.logLine.substring(this.logLine.indexOf("["), this.logLine.indexOf("]") + 1);
    }

    private String getMessageFromLog() {
        return  this.logLine.substring(this.logLine.indexOf("]") + 1).replaceFirst(" ", "");
    }
}
