package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String emailInput) throws UserNotFoundException {
        for (int i = 0; i < records.length; i++) {
            String[] recordsDivided = records[i].split(":", 2);
            String email = recordsDivided[0];
            String number = recordsDivided[1];
            if (email.equals(emailInput)) {
                return Integer.parseInt(number);
            }
        }
        throw new UserNotFoundException();
    }
}
