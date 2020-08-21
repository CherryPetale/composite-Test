import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class UserFactory {
    
    private static final UserFactory singleton = new UserFactory();

    private final ConcurrentMap<String, Future<User>> pool = new ConcurrentHashMap<>();

    public static UserFactory getInstance(){
        return singleton;
    }

    public User get(final String name){
        // マルチスレッドに対応させる
        Future<User> fu = pool.get(name);

        if(fu == null){
            final FutureTask<User> ft = new FutureTask<User>(() -> new User(name));
            fu = pool.putIfAbsent(name, ft);
            if(fu == null){
                fu = ft;
                ft.run();
            }
        }
        try {
            return f.get();
        } catch (final InterruptedException e) {
            throw new RuntimeException(e);
        } catch (final ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}