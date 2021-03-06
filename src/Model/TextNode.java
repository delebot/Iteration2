package Model;

import java.util.ArrayList;

public class TextNode {

    private ArrayList<TextNode> children;
    private String text;
    private String textType;

    public TextNode(String text, String textType) {
        this.children = new ArrayList<>();
        this.text = text;
        this.textType = textType;
    }

    public void addChild(TextNode textNode) {
        children.add(textNode);
    }

    public TextNode getChild(int index) {
        return children.get(index);
    }

    public String getText() {
        return text;
    }

    public String getTextType() {
        return textType;
    }

    public ArrayList<TextNode> getChildren() {
        return children;
    }
}
