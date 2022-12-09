package org.example;

public class HexaStringObserver implements Observer {
    private String hexaString;

    @Override
    public void update(Object o) {
        String message = (String) o;
        StringBuilder sb = new StringBuilder();

        for (char character : message.toCharArray()) {
            sb.append(Integer.toHexString(character));
        }
        this.hexaString = sb.toString();
    }

    @Override
    public String toString() {
        return "HexaStringObserver{" +
                "hexaString='" + hexaString + '\'' +
                '}';
    }
}
