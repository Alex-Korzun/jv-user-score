package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String emailInput) throws UserNotFoundException {
        for (int i = 0; i < records.length; i++) {
            String[] recordsDivided = records[i].split(":", 2);
            if (recordsDivided[0].equals(emailInput)) {
                return Integer.parseInt(recordsDivided[1]);
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
