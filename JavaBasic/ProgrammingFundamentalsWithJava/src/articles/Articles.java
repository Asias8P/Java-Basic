package articles;

public class Articles {
    private String title;
    private String content;
    private String author;

    public Articles (String title,String content,String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

        public void edit (String editContent){
            this.content=editContent;
        }

    public void changeAuthor(String changeAuthor){
        this.author=changeAuthor;
    }

    public void renameTitle(String renameTitle){
        this.title=renameTitle;
    }







    public String getTitle(){
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public String toString(){

        return String.format("%s - %s: %s ",getTitle(),getContent(),getAuthor());
    }
}
