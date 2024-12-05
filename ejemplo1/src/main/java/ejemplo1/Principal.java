package ejemplo1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String json ="{ \"nombre\" :\"juanjo\"}";
		ObjectMapper mapper = new ObjectMapper();
		JsonNode nodo = null;
		try {
			nodo = mapper.readTree(json);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(nodo.get("nombre").asText());
		
		
	}

}
