package seminar1.hw.impl;

public enum EPackage {
    PLASTIC("пластик"), GLASS("стекло");

    private final String material;

    EPackage(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
