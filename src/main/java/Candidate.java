public class Candidate {
    String fio;
    String gender;
    String age;
    Integer relevanceOfResume;
    Integer rating;

    public Candidate(String fio, String gender, String age, Integer relevanceOfResume, Integer rating) {
        this.fio = fio;
        this.gender = gender;
        this.age = age;
        this.relevanceOfResume = relevanceOfResume;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "ФИО: " + fio + "\n" +
                "Релевантность резюме: " + relevanceOfResume + "\n" +
                "Оценка на собеседовании: " + rating + "\n";
    }

}
