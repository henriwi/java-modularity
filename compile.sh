mkdir -p mlib
mkdir -p mods

rm -rf mlib/*
rm -rf mods/*

javac -d mods -modulesourcepath src $(find src -name "*.java")
jar --create --file mlib/no.bekk.mod2.jar -C mods/no.bekk.mod2 .
jar --create --file mlib/no.bekk.mod1.jar --main-class=no.bekk.mod1.Mod1 -C mods/no.bekk.mod1 .

