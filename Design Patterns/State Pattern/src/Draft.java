public class Draft implements DocumentState{
    @Override
    public void handleRequest(Document document) {
        document.setState(new Review());
    }
}
