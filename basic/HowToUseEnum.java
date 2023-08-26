package basic;

public enum HowToUseEnum {
    JANUARY("1月") {
        public String setTemperature(int param) { return param + "度" + " cold"; }
    },
    JULY("7月") {
        public String setTemperature(int param) { return param + "度" + " hot"; }
    };

    private final String month;
    HowToUseEnum(String month) {this.month = month;}

    @Override public String toString() { return month; }

    public abstract String setTemperature(int param);
}