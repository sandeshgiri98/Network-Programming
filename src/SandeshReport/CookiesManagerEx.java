package SandeshReport;

import java.net.*;
import java.util.*;

class CookiesManagerEx {
    public static void main(String[] a) {
        System.out.println("Sandesh Giri Network Programming Practical 19");
        CookieManager cookieManager = new CookieManager();
        CookieStore cookieStore = cookieManager.getCookieStore();

        HttpCookie c1 = new HttpCookie("c1", "smartphone");
        HttpCookie c2 = new HttpCookie("c2", "Apple");
        HttpCookie c3 = new HttpCookie("c3", "Iphone16");
        URI uri1 = URI.create("https://test1.com/");
        URI uri2 = URI.create("https://test2.com/");
        cookieStore.add(uri1, c1);
        cookieStore.add(uri2, c2);
        cookieStore.add(null, c3);

        List cookieList = cookieStore.getCookies();
        System.out.println("Cookies list in CookieStore: " + cookieList + "\n");
        cookieStore.remove(uri1, c1);
        List remainingCookieList = cookieStore.getCookies();
        System.out.println("Remaining Cookies: " + cookieList + "\n");
        List EmptyCookieList = cookieStore.getCookies();
        System.out.println("Empty CookieStore:" + cookieList);
    }
}
