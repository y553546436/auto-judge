if [[ -z $CP_spring_data_jdbc_repository ]]; then
  cd ../spring-data-jdbc-repository
  export CP_spring_data_jdbc_repository=$(pwd)/target/classes:$(pwd)/target/test-classes:$(mvn dependency:build-classpath | grep -A1 "\[INFO\] Dependencies classpath:" | tail -1)
  cd -
fi

echo $CP_spring_data_jdbc_repository

SECONDS=0
mkdir -p logs/spring-data-jdbc-repository
for n in main{1..13}; do
  timeout 30s java -cp jbse-0.10.0-SNAPSHOT-shaded.jar:classes Luke Driver_spring_data_jdbc_repository $n $CP_spring_data_jdbc_repository >& logs/spring-data-jdbc-repository/log-$n 

  if [ $? = 124 ] ; then
    printf "TIMEOUT\nMAY_BE_POLLUTER\nMAY_BE_VICTIM" >> logs/spring-data-jdbc-repository/log-$n 
  fi
done
 
duration=$SECONDS
echo "$(($duration / 60)) minutes and $(($duration % 60)) seconds elapsed."

  #echo "Cheking for static fields"
  #java -verbose:class -cp $CP_spring_data_jdbc_repository:jbse-0.10.0-SNAPSHOT-shaded.jar:classes Driver_spring_data_jdbc_repository $n >& java_loaded_class 
  #grep bukkit java_loaded_class | cut -f2 -d' ' | rev | cut -f1 -d. | rev | while read n; do grep "static" $(find -name $n.java); done
