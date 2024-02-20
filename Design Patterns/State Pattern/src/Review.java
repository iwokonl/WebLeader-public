public class Review implements DocumentState{
    @Override
    public void handleRequest(Document document) {
        if(document.isApproved()) document.setState(new Published());
        else document.setState(new Draft());
    }
}
