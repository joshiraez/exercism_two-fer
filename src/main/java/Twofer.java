class Twofer {
    String twofer(String name) {

        String yourName;

        if (name == null || name.isBlank())
            yourName = "you";
        else
            yourName = name.trim();

        return "One for "+yourName+", one for me.";
    }
}
