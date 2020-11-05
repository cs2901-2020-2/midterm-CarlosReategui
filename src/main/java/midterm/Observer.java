package midterm;

import java.util.logging.Logger;

public abstract class Observer {
    protected Subject subject;
    static final Logger logger = Logger.getLogger(Observer.class.getName());
    public abstract void update();
}
