package org.launchcode.enumerableplanets.data;

public enum Planets {

    MERCURY("Mercury", "88", "36 Million Miles"),
    VENUS("Venus", "225", "67.2 Million Miles"),
    EARTH("Earth", "365", "93 Million Miles"),
    MARS("Mars", "687", "141.6 Million Miles"),
    JUPITER("Jupiter", "4333", "483.6 Million Miles"),
    SATURN("Saturn", "10759", "886.7 Million Miles"),
    URANUS("Uranus", "30687", "1.784 Billion Miles"),
    NEPTUNE("Neptune", "60200", "2.794 Billion Miles");

    private final String planetName;
    private final String yearLength;
    private final String distanceFromSun;

    Planets(String planetName, String yearLength, String distanceFromSun) {
        this.planetName = planetName;
        this.yearLength = yearLength;
        this.distanceFromSun = distanceFromSun;
    }

    public String getPlanetName() {
        return planetName;
    }
    public String getYearLength() {
        return yearLength;
    }

    public String getDistanceFromSun() {
        return distanceFromSun;
    }
}

