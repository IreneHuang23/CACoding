package entity;

import java.time.LocalDateTime;
class DeleteUser implements User{

    private final String name;
    private final String password;
    private final LocalDateTime deleteTime;

    DeleteUser(String name, String password, LocalDateTime deleteTime) {
        this.name = name;
        this.password = password;
        this.deleteTime = deleteTime;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public LocalDateTime getCreationTime() {
        return null;
    }
}
