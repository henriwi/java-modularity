mkdir -p mlib
mkdir -p mods

rm -rf mlib/*
rm -rf mods/*

javac -d mods -modulesourcepath src $(find src -name "*.java")
jar --create --file mlib/no.bekk.api.jar -C mods/no.bekk.api .
jar --create --file mlib/no.bekk.mod1.jar -C mods/no.bekk.mod1 .
jar --create --file mlib/no.bekk.main.jar --main-class=no.bekk.main.Main -C mods/no.bekk.main .
java -mp mlib -m no.bekk.main
