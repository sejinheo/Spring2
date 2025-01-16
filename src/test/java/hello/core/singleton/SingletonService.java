package hello.core.singleton;

public class SingletonService {

    // 자기 자신을 생성해서 인스턴스에 참조를 넣어 놓는다.
    private static final SingletonService instance = new SingletonService();
    public static SingletonService getInstance() {
        return instance;
    }
    private SingletonService() {

    }
   public void logic(){
       System.out.println("싱글톤 객체 로직 호출");
   }
}
