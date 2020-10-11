if [[ -z $CP_Bukkit ]]; then
  cd ../Bukkit
  export CP_Bukkit=$(pwd)/target/classes:$(pwd)/target/test-classes:$(mvn dependency:build-classpath | grep -A1 "\[INFO\] Dependencies classpath:" | tail -1)
  cd -
fi

echo $CP_Bukkit
mkdir -p logs/Bukkit
SECONDS=0

for n in main{1..63}; do
  timeout 30s java -cp jbse-0.10.0-SNAPSHOT-shaded.jar:classes Luke Driver_Bukkit $n $CP_Bukkit >& logs/Bukkit/log-$n 
  #echo $?
  if [ $? = 124 ] ; then
    printf "TIMEOUT\nMAY_BE_POLLUTER\nMAY_BE_VICTIM" >> logs/Bukkit/log-$n
  fi
done

duration=$SECONDS
echo "$(($duration / 60)) minutes and $(($duration % 60)) seconds elapsed."
  #echo "Cheking for static fields"
  #java -verbose:class -cp $CP_Bukkit:jbse-0.10.0-SNAPSHOT-shaded.jar:classes Driver_Bukkit $n >& java_loaded_class 
  #grep bukkit java_loaded_class | cut -f2 -d' ' | rev | cut -f1 -d. | rev | while read n; do grep "static" $(find -name $n.java); done
