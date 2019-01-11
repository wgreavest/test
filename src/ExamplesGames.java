interface IResource {
}

interface IAction {

}

class Denial implements IResource {
  String subject;
  int believability;

  Denial(String subject, int believability) {
    this.subject = subject;
    this.believability = believability;
  }
}

class Bribe implements IResource {
  String target;
  int value;

  Bribe(String target, int value) {
    this.target = target;
    this.value = value;
  }
}

class Apology implements IResource {
  String excuse;
  boolean reusable;

  Apology(String excuse, boolean reusable) {
    this.excuse = excuse;
    this.reusable = reusable;
  }
}

class Purchase implements IAction {
  int cost;
  IResource item;

  Purchase(int cost, IResource item) {
    this.cost = cost;
    this.item = item;
  }
}

class Swap implements IAction {
  IResource consumed;
  IResource received;

  Swap(IResource consumed, IResource received) {
    this.consumed = consumed;
    this.received = received;
  }
}


class ExamplesGame {
  
}