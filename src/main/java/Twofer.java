class Twofer {
    String twofer(String name) {
        return "One for " + yourName(name) + ", one for me.";
    }

    private String yourName(final String yourName) {
        return isAName(yourName)
                ? yourName.trim()
                : "you";
    }

    private boolean isAName(final String yourName) {
        return yourName != null && !yourName.isBlank();
    }
}
