package site.metacoding.blogv3.util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class UtilPost {

    //  책임 : content 내부 이미지 태그 제거
    public static String getContentWithoutImg(String content) {

        Document doc = Jsoup.parse(content);

        Elements els = doc.select("img");

        for (Element el : els) {
            el.remove();
        }
        
        return doc.select("body").html();
    }
    
}
