# autojudge

# compile
javac -cp jbse-0.10.0-SNAPSHOT-shaded.jar -d classes $(find src -name "*.java")

# run
java -cp jbse-0.10.0-SNAPSHOT-shaded.jar:classes autojudge.grade.Grader
