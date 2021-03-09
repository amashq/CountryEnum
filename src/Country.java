public enum Country {
    BELGIUM("Бельгия", true),
    RUSSIA("Россия", true),
    JAPAN("Япония", false),
    GEORGIA("Грузия", true),
    BRAZIL("Бразилия", false);

    private final String ruName;
    private final boolean isOpen;

    Country(final String ruName, final boolean isOpen) {
        this.ruName = ruName;
        this.isOpen = isOpen;
    }

    @Override
    public String toString() {
        return name() + " (" + ruName + ")";
    }

    public String getRuName() {
        return ruName;
    }

    public boolean getIsOpen() {
        return isOpen;
    }

    public static Country getByRuName(final String rusName) throws NoSuchCountryException {
        for (Country country : Country.values()) {
            if (country.getRuName().equals(rusName)) {
                return country;
            }
        }
        throw new NoSuchCountryException(rusName, "getByRuName");
    }
}

