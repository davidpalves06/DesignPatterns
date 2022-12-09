package org.example;

public class BinaryStringObserver implements Observer{
    private String binaryString;
    @Override
    public void update(Object o) {
        String message = (String) o;
        StringBuilder sb = new StringBuilder();

        for (char character : message.toCharArray()) {
            sb.append(Integer.toBinaryString(character));
        }
        this.binaryString = sb.toString();
    }

    @Override
    public String toString() {
        return "BinaryStringObserver{" +
                "binaryString='" + binaryString + '\'' +
                '}';
    }
}
