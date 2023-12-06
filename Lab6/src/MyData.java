class MyData implements Comparable<MyData> {
    private String Title;
    private String Contents;
    private String Date;

    public MyData(String title, String contents, String date) {
        this.Title = title;
        this.Contents = contents;
        this.Date = date;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getContents() {
        return Contents;
    }

    public void setContents(String contents) {
        this.Contents = contents;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        this.Date = date;
    }

    @Override
    public int compareTo(MyData other) {
        return this.Title.compareTo(other.Title);
    }

    @Override
    public String toString() {
        return "MyData{" +
                "Title='" + Title + '\'' +
                ", Contents='" + Contents + '\'' +
                ", Date='" + Date + '\'' +
                '}';
    }
}