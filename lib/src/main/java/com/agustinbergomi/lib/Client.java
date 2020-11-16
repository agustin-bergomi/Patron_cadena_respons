package com.agustinbergomi.lib;

public class Client {
    public static void main(String[] args) {
        DocumentHandler chain = new SpreadSheetHandler(new SlideShowHandler(new TextDocumentHandler (null)));

        chain.openDocument("ppt");
        chain.openDocument("txt");
    }
}
