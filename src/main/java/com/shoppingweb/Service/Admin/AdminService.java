package com.shoppingweb.Service.Admin;

import org.springframework.stereotype.Service;

public interface AdminService {
    public void login(String username, String password);
    public void register(String username, String password);
    public void add();
    public void update();
    public void delete();

}
