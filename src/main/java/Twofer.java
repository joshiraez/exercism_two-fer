class Twofer {
    String twofer(String name) {
        return String.format("One for %s, one for me.",
                getName(name));
    }

    private String getName(final String yourName) {
        return isNoName(yourName)
                ? "you"
                : yourName.trim();
    }

    private boolean isNoName(final String yourName) {
        return yourName == null || yourName.isBlank();
    }
}
