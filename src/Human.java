public class Human {
    int yearOfBirth;
    String name;
    String town;
    String job;

    public Human(String name, String town, int yearOfBirth, String job) {
        if (name != name || name == null || name == "") {
            this.name = null;
        }else{
            this.name = name;
        }
        if (yearOfBirth < 0){
            this.yearOfBirth = Math.abs(yearOfBirth);
        }else {
            this.yearOfBirth = yearOfBirth;
        }
        if (town != town || town == null || town == ""){
            this.town = null;
        }else{
            this.town = town;
        }
        if (job != job || job == null || job == ""){
            this.job = null;
        }else{
            this.job = job;
        }
    }

    public void human(){
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town +
                ". Мне " +  yearOfBirth + " лет. Я работаю на должности " + job + ". Будем знакомы!");
    }
}

