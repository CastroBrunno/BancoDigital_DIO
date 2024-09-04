import java.util.HashMap;
import java.util.Map;

public class InterfaceLogin {
    
    private Map<Integer, String> InterfaceLoginMap;

    public InterfaceLogin() {
        InterfaceLoginMap = new HashMap<>();
    }

    public void createAccount(Integer numConta, String nome){
        InterfaceLoginMap.put(numConta, nome);
    }

    public String searchAccount(Integer numConta){
        String nomeConta = null;
        if (!InterfaceLoginMap.isEmpty()) {
            nomeConta = InterfaceLoginMap.get(numConta);
        }
        return nomeConta;
    }

}

