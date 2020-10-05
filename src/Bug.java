import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
abstract class Bug {                                                                                                                   
    List<String> l = new ArrayList<>();                                                              
    Bug(List<String> a) {                                                                                                    
        l.addAll(a);                                                                                                                   
    }                                                                                                                                  
}                                                                                                                                      
class SubBug extends Bug {                                                                                                             
    static String s = "foobar";                                                                                           
    SubBug() {                                                                                                                         
        super(Arrays.asList(s));                                                                                             
    }                                                                                                                                  
    static void main() {                                                                                                        
        new SubBug();                                                                                                                  
    }                                                                                                                                  
}
