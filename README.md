**MANUAL - WiniumCTRL**

1. modify local value for projPath variable on **WinCtrl.java**
```
String projPath = "C:\\Users\\{WindowsUser}\\IdeaProjects\\WiniumCTRL\\";
```
2. Run driver on Terminal
```
./src/main/resources/driver/Winium.Desktop.Driver.exe
```
3. Run Test (Set JDK previously)
```
java org.testng.TestNG -testclass x9assist.WinCtrlTest
```

