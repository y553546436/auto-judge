if [[ -z $CP_slf4j ]]; then
  cd ../slf4j/slf4j-api
  export CP_slf4j=$(pwd)/target/classes:$(pwd)/target/test-classes:$(mvn dependency:build-classpath | grep -A1 "\[INFO\] Dependencies classpath:" | tail -1)
  cd -
fi

echo $CP_slf4j

SECONDS=0
#37
for n in main{1..37}; do
  timeout 30s java -cp jbse-0.10.0-SNAPSHOT-shaded.jar:classes Luke Driver_slf4j $n $CP_slf4j >& logs/slf4j-log-$n 

  if [ $? = 124 ] ; then
  printf "TIMEOUT\nMAY_BE_POLLUTER\nMAY_BE_VICTIM" >> logs/slf4j-log-$n 
  fi
done
 
duration=$SECONDS
echo "$(($duration / 60)) minutes and $(($duration % 60)) seconds elapsed."

  #echo "Cheking for static fields"
  #java -verbose:class -cp $CP_slf4j:jbse-0.10.0-SNAPSHOT-shaded.jar:classes Driver_slf4j $n >& java_loaded_class 
  #grep bukkit java_loaded_class | cut -f2 -d' ' | rev | cut -f1 -d. | rev | while read n; do grep "static" $(find -name $n.java); done
