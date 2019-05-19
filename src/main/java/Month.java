public enum Month {
    January, February, March, April, May, June, July, August, September, October, November, December;

    public static int daysInAMonth(int year, Month month) {

        switch (month) {
            case April:
            case June:
            case September:
            case November:
                return 30;
            case February:
                return daysInFeb(year);
            default:
                return 31;
        }

    }

    private static int daysInFeb(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 != 0) {
                    return 28;
                }
            }
            return 29;
        }
        return 28;
    }
}

