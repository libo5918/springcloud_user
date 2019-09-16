import com.google.gson.*;
import com.yidiankt.bean.enodeb.response.EnodebAttachResp;
import com.yidiankt.controller.GenEnodeb.GenEnodebBean;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class GsonTest {
    @Autowired
    private Gson gson;

    public void test1(){
        Gson gson=new Gson();
        EnodebAttachResp enodebAttach = GenEnodebBean.getEnodeb();
        String str = gson.toJson(enodebAttach);
        System.out.println(str);
        JsonParser parser=new JsonParser();
        JsonElement parse = parser.parse(str);
        JsonObject root = parse.getAsJsonObject();
        String spanId = root.get("spanId").getAsString();
        JsonObject attachResult = root.getAsJsonObject("attachResult");
        int delay = attachResult.get("delay").getAsInt();
//        EnodebAttachResp enodebAttachResp = gson.fromJson(str, EnodebAttachResp.class);
//        String spanId = enodebAttachResp.getSpanId();
//        Long delay = enodebAttachResp.getAttachResult().getDelay();
        System.out.println(spanId);
        System.out.println(delay);
    }

    public static void main(String[] args) {
        new GsonTest().test1();


    }
}
