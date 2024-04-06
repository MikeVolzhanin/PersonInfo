import java.time.LocalDate;
import java.time.Period;

public class AgeAndGender {
    public char determineGender(String patronymic) {
        char lastChar = patronymic.charAt(patronymic.length() - 1);
        return (lastChar == 'ч' || lastChar == 'Ш') ? 'М' : 'Ж';
    }

    public int calculateAge(LocalDate birthDate) {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }
}
