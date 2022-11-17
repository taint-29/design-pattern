package proxy;

import java.util.HashSet;
import java.util.Set;

public class NetworkProxy implements NetworkClient{

    NetworkClient networkClient;
    private Set<String> blackList = new HashSet<>();

    public NetworkProxy(NetworkClient networkClient) {
        this.networkClient = networkClient;
    }

    public NetworkProxy addBlackList(String url){
        this.blackList.add(url);
        return this;
    }

    @Override
    public String call(String url) {
        if (blackList.contains(url)){
            return url + " is in black list";
        }
        return networkClient.call(url);
    }
}
