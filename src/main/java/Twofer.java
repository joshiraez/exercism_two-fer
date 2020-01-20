class Twofer {
    String twofer(String name) {

        String yourName = name;

        if (name == null || name.isBlank())
            yourName = "you";

        return "One for "+yourName+", one for me.";
    }
}
