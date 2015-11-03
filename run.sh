mkdir -p mlib
mkdir -p mods

rm -rf mlib/*
rm -rf mods/*

javac -d mods -modulesourcepath src $(find src -name "*.java")
jar --create --file mlib/no.bekk.mod1.jar -C mods/no.bekk.mod1 .
jar --create --file mlib/no.bekk.mod2.jar --main-class=no.bekk.mod2.Mod2 -C mods/no.bekk.mod2 .
java -mp mlib -m no.bekk.mod2
