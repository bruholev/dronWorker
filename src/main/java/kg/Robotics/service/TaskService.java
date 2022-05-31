package kg.Robotics.service;


import kg.Robotics.dao.*;
import org.springframework.stereotype.Service;
@Service
public class TaskService {
    public String ServiceActions(InterfaceAct interfaceAct){return new Dron().action(interfaceAct);  }
}