# Shape Assignment
## Create and edit a list of shapes assignment utilizing object oriented principles
#### **Created By: GeneJackett & crawlive**

### **Strategy:** 
  - Shape Class where Circle and Rectangle extended


### **Command:**
  - Command Inerface
  - Commands Class implements Command
  - Create Sub-Class extends Commands
  - Select Sub-Class extends Commands
  - Move Sub-Class extends Commands
  - Color Sub-Class extends Commands
  - Draw Sub-Class extends Commands
  - DrawScene Sub-Class extends Commands
  - Undo Sub-Class extends Commands

### **Memento:**
  - Memento Class that holds Commands object and a previous object
  - CareTaker Class that holds a stack of Mementos
  - Originator happens in the EventHandler class where CareTaker's saveCommand(Commands, Object)
    method is called to save the recently called command and the previous state as a Memento

### **UML:**
[a relative link](Assignment3UML.png)
