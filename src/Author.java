public class Author {
    private String authorName;

    public Author(String firstName , String middleName , String lastName) {
        this.authorName = firstName + " " + middleName + " " + lastName;
    }
    public String  getAuthorName() {
        return authorName;
    }
}
