if [[ -z $CP_spring_test_mvc ]]; then
  cd ../spring-test-mvc
  export CP_spring_test_mvc=$(pwd)/target/classes:$(pwd)/target/test-classes:$(mvn dependency:build-classpath | grep -A1 "\[INFO\] Dependencies classpath:" | tail -1)
  cd -
fi

echo $CP_spring_test_mvc

SECONDS=0
#53
for n in main{1..53}; do
  timeout 30s java -cp jbse-0.10.0-SNAPSHOT-shaded.jar:classes Luke Driver_spring_test_mvc $n $CP_spring_test_mvc >& logs/spring_test_mvc-log-$n 

  if [ $? = 124 ] ; then
    printf "TIMEOUT\nMAY_BE_POLLUTER\nMAY_BE_VICTIM" >> logs/spring_test_mvc-log-$n 
  fi
done
 
duration=$SECONDS
echo "$(($duration / 60)) minutes and $(($duration % 60)) seconds elapsed."

  #echo "Cheking for static fields"
  #java -verbose:class -cp $CP_spring_test_mvc:jbse-0.10.0-SNAPSHOT-shaded.jar:classes Driver_spring_test_mvc $n >& java_loaded_class 
  #grep bukkit java_loaded_class | cut -f2 -d' ' | rev | cut -f1 -d. | rev | while read n; do grep "static" $(find -name $n.java); done
