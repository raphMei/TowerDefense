package fr.raphNerval.geometrie;

public record IntCoordinates(int x, int y) {

    //*****METHODES******//
    public RealCoordinates toRealCoordinates(double scale) {
        return new RealCoordinates(x * scale, y * scale);
    }
}