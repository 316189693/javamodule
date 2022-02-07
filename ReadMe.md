编译生成module：
d:/programfiles/Java/jdk14/bin/javac.exe -d mods --module-source-path src --module-version 1.0 src\org.htjymodule\module-info.java  src\org.htjymodule\org\main\Hello.java

列出可用的module：
d:/programfiles/Java/jdk14/bin/java.exe --module-path mods --list-modules

执行：
d:/programfiles/Java/jdk14/bin/java.exe -p mods -m org.htjymodule/org.main.Hello

打包模块：
d:/programfiles/Java/jdk14/bin/jar.exe -c -v -f lib/org.cimodule-2.0.jar --module-version 2.0 -C mods/org.htjymodule .

执行模块包：

d:/programfiles/Java/jdk14/bin/java.exe -p lib -m org.htjymodule/org.main.Hello


