class Car{

  //attributes
  String name;
  String color;
  int speed;
  def steps;
  boolean on;

  //default constructor
  
  Car(def steps){
    this.steps=steps;
  }

  Car(String name,String color,int speed,def steps) {
    this.name=name;
    this.color=color;
    this.speed=speed;
    this.steps=steps;
  }

  //methods
  void start(){
    if(this.on==true){
      steps.echo "Car has already started!";
    }else{
      steps.echo "Car started!";
      this.on=true;
    }
  }

  void stop(){
    if(this.on==true){
      steps.echo "Car stoped!";
      this.on=false;
    }else{
      steps.echo "Car has not started yet!";
    }
  }

  void horn(){
    if(this.on==true){
      steps.echo "Horned!";
    }else{
      steps.echo "Car is stopped!";
    }
  }
}
  
}
