if [[ -z $CP_vraptor4 ]]; then
  cd ../vraptor4/vraptor-core
  export CP_vraptor4=$(pwd)/target/classes:$(pwd)/target/test-classes:$(mvn dependency:build-classpath | grep -A1 "\[INFO\] Dependencies classpath:" | tail -1)
  cd -
fi

echo $CP_vraptor4
mkdir -p logs/vraptor4
SECONDS=0
#69
for n in main{1..69}; do
  timeout 30s java -cp jbse-0.10.0-SNAPSHOT-shaded.jar:classes Luke Driver_vraptor4 $n $CP_vraptor4 >& logs/vraptor4/log-$n 

  if [ $? = 124 ] ; then
    printf "TIMEOUT\nMAY_BE_POLLUTER\nMAY_BE_VICTIM" >> logs/vraptor4/log-$n 
  fi
done

duration=$SECONDS
echo "$(($duration / 60)) minutes and $(($duration % 60)) seconds elapsed."
  #echo "Cheking for static fields"
  #java -verbose:class -cp $CP_Bukkit:jbse-0.10.0-SNAPSHOT-shaded.jar:classes Driver_Bukkit $n >& java_loaded_class 
  #grep bukkit java_loaded_class | cut -f2 -d' ' | rev | cut -f1 -d. | rev | while read n; do grep "static" $(find -name $n.java); done
