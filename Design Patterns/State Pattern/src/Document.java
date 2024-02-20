public class Document {
    private DocumentState state;
    private boolean isApproved;

    public Document() {
        this.state = new Draft();
        this.isApproved = false;
    }

    public DocumentState getState(){
        return this.state;
    }

    public void setState(DocumentState state){
        this.state = state;
    }

    public void publish(){
        this.state.handleRequest(this);
    }

    public void setApproval(boolean isApproved){
        this.isApproved = isApproved;
    }

    public boolean isApproved(){
        return this.isApproved;
    }
}
