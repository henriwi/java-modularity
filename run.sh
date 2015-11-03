mkdir -p mods
rm -rf mods/*

mkdir -p mods/no.bekk.mod1
mkdir -p mods/no.bekk.mod2

javac -d mods/no.bekk.mod1 src/no.bekk.mod1/module-info.java src/no.bekk.mod1/no/bekk/mod1/Mod1.java
javac -modulepath mods -d mods/no.bekk.mod2 src/no.bekk.mod2/module-info.java src/no.bekk.mod2/no/bekk/mod2/Mod2.java

java -modulepath mods -m no.bekk.mod2/no.bekk.mod2.Mod2
