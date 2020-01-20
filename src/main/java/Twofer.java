class Twofer {
    String twofer(String name) {
        return String.format("One for %s, one for me.",
                getName(name));
    }

    private String getName(final String yourName) {
        return isAName(yourName)
                ? yourName.trim()
                : "you";
    }

    private boolean isAName(final String yourName) {
        return yourName != null && !yourName.isBlank();
    }
}
