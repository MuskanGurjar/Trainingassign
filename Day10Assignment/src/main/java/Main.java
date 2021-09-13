import org.json.JSONObject;

import com.hsbc.web.entity.BookDeatils;

public class Main {
public static void main(String[] arg) {
	BookDeatils emp=new BookDeatils("raven cycle","magie stiefvater",800,101);
	JSONObject obj=new JSONObject(emp);
	System.out.println(obj.toString());
}
}
