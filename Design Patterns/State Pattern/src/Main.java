public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        System.out.println(document.getState() instanceof Draft);
        document.publish();
        System.out.println(document.getState() instanceof Review);
        document.setApproval(true);
        document.publish();
        System.out.println(document.getState() instanceof Published);
        document.publish();
        System.out.println(document.getState() instanceof Published);
    }
}