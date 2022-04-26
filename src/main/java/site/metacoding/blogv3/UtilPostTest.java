package site.metacoding.blogv3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class UtilPostTest {
    
    // @Test
    public void getContentWithoutImg_테스트() {
        // 1. 가짜데이터 생성
        String html = "Hello <img src=`#`> nice to meet u";
        Document doc = Jsoup.parse(html);
        // System.out.println(doc);
        // 2. 실행
        Elements els = doc.select("img");
        // System.out.println(els.size());

        // Element elImg1 = els.get(0);
        // System.out.println(elImg1);
        // elImg1.prepend("hahahahaha");
        // elImg1.remove();
        for (Element el : els) {
            el.remove();
        }
        // 3. 검증
        // System.out.println(doc.toString());
        Elements elsVerify = doc.select("img");
        // assertTrue(elsVerify.size() == 0);
        // assertEquls(elsVerify.size(), 0);
    }
}
