package pl.klimas7.spring.db;

import pl.klimas7.spring.db.model.User;

import java.util.List;

public class HibernateUserRepository implements UserRepository {
    @Override
    public Long count() {
        return 0L;
    }

    @Override
    public List<User> findRecent() {
        return null;
    }

    @Override
    public List<User> findRecent(int count) {
        return null;
    }

    @Override
    public User findOne(long id) {
        return null;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public void delete(long id) {
    }
}
