package gsontest;

import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;

 class People {

private String name;
private Integer age;
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Integer getAge() {
return age;
}

public void setAge(Integer age) {
this.age = age;
}

public Map<String, Object> getAdditionalProperties() {
return this.additionalProperties;
}

public void setAdditionalProperty(String name, Object value) {
this.additionalProperties.put(name, value);
}

}

public class GsonEx02 {

	public static void main(String[] args) {
		String jsonPerson = "{\"이름\":\"홍길동\",\"나이\":25,\"성별\":\"여\",\"주소\":\"서울시 양천구 목동\",\"특기\":[\"농구\",\"도술\"],\"가족관계\":{\"샵\":2,\"아버지\":\"홍판서\",\"어머니\":\"춘섬\"},\"회사\":\"경기 수원시 팔달구 우만동\"}\r\n" + 
				"";
		
		Gson gson = new Gson();
		

	}

}
