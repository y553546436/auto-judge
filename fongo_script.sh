if [[ -z $CP_fongo ]]; then
  cd ../fongo
  export CP_fongo=$(pwd)/target/classes:$(pwd)/target/test-classes:$(mvn dependency:build-classpath | grep -A1 "\[INFO\] Dependencies classpath:" | tail -1)
  cd -
fi

echo $CP_fongo
mkdir -p logs/fongo
SECONDS=0

for n in main{1..8}; do
  timeout 30s java -cp jbse-0.10.0-SNAPSHOT-shaded.jar:classes Luke Driver_fongo $n $CP_fongo >& logs/fongo/log-$n 
  
  if [ $? = 124 ] ; then
    printf "TIMEOUT\nMAY_BE_POLLUTER\nMAY_BE_VICTIM" >> logs/fongo/log-$n
  fi
done

duration=$SECONDS
echo "$(($duration / 60)) minutes and $(($duration % 60)) seconds elapsed."
  #echo "Cheking for static fields"
  #java -verbose:class -cp $CP_fongo:jbse-0.10.0-SNAPSHOT-shaded.jar:classes Driver_fongo $n >& java_loaded_class 
  #grep bukkit java_loaded_class | cut -f2 -d' ' | rev | cut -f1 -d. | rev | while read n; do grep "static" $(find -name $n.java); done
