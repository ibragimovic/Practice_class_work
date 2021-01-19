package com.company.library;

public class Book {
    private String author;
    private String title;
    private int pageCount;
    private String giftedBy;
    private String pressmark;
    private boolean needsRepair;

    public Book() {}

    public Book(String author, String title, int pageCount, String giftedBy, String pressmark, boolean needsRepair) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
        this.giftedBy = giftedBy;
        this.pressmark = pressmark;
        this.needsRepair = needsRepair;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
        refreshPressmark();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        refreshPressmark();

    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
        refreshPressmark();
    }

    public String getPressmark() {
        return pressmark;
    }

    private void refreshPressmark(){
        pressmark = author + "." + title + "." + pageCount;
    }

    void setGiftedBy(String giftedBy){
        this.giftedBy = giftedBy;
    }

    String getGiftedBy(){
        return giftedBy;
    }

    protected void setNeedsRepair(boolean needsRepair){
        this.needsRepair = needsRepair;
    }

    protected boolean getNeedRepair(){
        return needsRepair;
    }


}
