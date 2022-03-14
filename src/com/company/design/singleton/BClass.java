package com.company.design.singleton;

public class BClass {

    private SocketClient socketClient;

    public BClass(){
        this.socketClient = SocketClient.getInstance();
    }
    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
