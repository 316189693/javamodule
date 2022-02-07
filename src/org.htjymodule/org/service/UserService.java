package org.service;

import java.util.ServiceLoader;

public interface UserService {
    Integer addUser(String name);
    String getImplName();
    static UserService newInstance(){
        return ServiceLoader.load(UserService.class).findFirst().orElseThrow(()->new IllegalArgumentException("Not found implement of UserService"));
    }
    static UserService newInstance(String providerName) {
        ServiceLoader<UserService> sl = ServiceLoader.load(UserService.class);
        for(UserService us : sl) {
            if (us.getImplName().equals(providerName)) {
                return us;
            }
        }
        throw new IllegalArgumentException(providerName + " of UserService not found");

    }
}
