import java.util.ArrayList;
import java.util.List;

public class Document implements DocumentPrototype{
    public String content;
    public List<String> images;
    public String formatting;
    public List<String> annotations;

    @Override
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFormatting() {
        return formatting;
    }

    public void setFormatting(String formatting) {
        this.formatting = formatting;
    }

    public Document(String content, List<String> images, String formatting, List<String> annotations){
        this.content = content;
        this.images = new ArrayList<>(images);
        this.formatting = formatting;
        this.annotations = new ArrayList<>(annotations);
    }

    @Override
    public DocumentPrototype cloneDocument() {
        return new Document(this.content,this.images,this.formatting,this.annotations);
    }

    @Override
    public void display() {
        System.out.println("Content: " + content);
        System.out.println("Images: " + images);
        System.out.println("Formatting: " + formatting);
        System.out.println("Annotations: " + annotations);
    }

    public void addImage(String image){
        images.add(image);
    }

    public void addAnnotation(String annotation){
        annotations.add(annotation);
    }

}
