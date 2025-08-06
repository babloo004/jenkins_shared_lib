class Person{

  //attributes
  String fname;
  String lname;
  int age;
  def weight;
  def height;
  def s;

  //constructor

  //default
  Person(def s){
    this.s = s;
  }

  //coustm
  Person(String fname,String lname,int age,def weight,def height,def s){
    this.fname=fname;
    this.lname=lname;
    this.age=age;
    this.weight=weight;
    this.height=height;
    this.s=s;
  }

  //methods

  //details
  void details(){
    s.echo "First Name : ${this.fname}";
    s.echo "Last Name : ${this.lname}";
    s.echo "Age : ${this.age}";
    s.echo "Weight : ${this.weight}";
    s.echo "Height : ${this.height}";
  }
}
