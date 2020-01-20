class Twofer {
    String twofer(String name) {
        return String.format("One for %s, one for me.",
                getHowToCallThemFrom(name));
    }

    private String getHowToCallThemFrom(final String yourName) {
        return isAName(yourName)
                ? yourName.trim()
                : "you";
    }

    private boolean isAName(final String yourName) {
        return yourName != null && !yourName.isBlank();
    }
}
