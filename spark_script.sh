if [[ -z $CP_spark ]]; then
  cd ../spark
  export CP_spark=$(pwd)/target/classes:$(pwd)/target/test-classes:$(mvn dependency:build-classpath | grep -A1 "\[INFO\] Dependencies classpath:" | tail -1)
  cd -
fi

echo $CP_spark
mkdir -p logs/spark
SECONDS=0
#53
for n in main{1..53}; do
  timeout 30s java -cp jbse-0.10.0-SNAPSHOT-shaded.jar:classes Luke Driver_spark $n $CP_spark >& logs/spark/log-$n

  if [ $? = 124 ] ; then 
  printf "TIMEOUT\nMAY_BE_POLLUTER\nMAY_BE_VICTIM" >> logs/spark/log-$n 
  fi
done
 
duration=$SECONDS
echo "$(($duration / 60)) minutes and $(($duration % 60)) seconds elapsed."

  #echo "Cheking for static fields"
  #java -verbose:class -cp $CP_spark:jbse-0.10.0-SNAPSHOT-shaded.jar:classes Driver_spark $n >& java_loaded_class 
  #grep bukkit java_loaded_class | cut -f2 -d' ' | rev | cut -f1 -d. | rev | while read n; do grep "static" $(find -name $n.java); done
