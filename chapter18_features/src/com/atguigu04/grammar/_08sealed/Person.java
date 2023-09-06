package com.atguigu04.grammar._08sealed;

/**
 * ClassName: Person
 * Package: com.atguigu04.grammar._08sealed
 * Description:
 *
 * @Author honghuaijie
 * @Create 2023/9/6 16:04
 * @Version 1.0
 * 不积跬步无以至千里
 */
//Person类是一个密封类，可以被指定的子类所继承，非指定的类不能继承Person类
public sealed class Person permits Stduent,Teacher,Worker{
}

//要求指定的子类必须是final、sealed、non-sealed
final class Stduent extends Person{  //Stduent不能被继承了

}
sealed class Teacher extends Person permits SeniorTearcher{  //Teacher类只能被指定的子类继承

}

non-sealed class SeniorTearcher extends Teacher{

}
non-sealed  class Worker extends Person{  //Worker类在继承时，没有任何的限制


}

class WatchWorker extends  Worker{}
