if [[ -z $CP_httpcomponents_client ]]; then
  cd ~/httpcomponents-client/httpclient5
  export CP_httpcomponents_client=$(pwd)/target/classes:$(pwd)/target/test-classes:$(mvn dependency:build-classpath | grep -A1 "\[INFO\] Dependencies classpath:" | tail -1)
  cd -
fi

echo $CP_httpcomponents_client

SECONDS=0
#52
for n in main{1..52}; do
  timeout 30s java -cp jbse-0.10.0-SNAPSHOT-shaded.jar:classes Luke Driver_httpcomponents_client $n $CP_httpcomponents_client >& logs/httpcomponents_client-log-$n 
  if [ $? = 124 ] ; then
    printf "TIMEOUT\nMAY_BE_POLLUTER\nMAY_BE_VICTIM" >> logs/httpcomponents_client-log-$n 
  fi
done
 
duration=$SECONDS
echo "$(($duration / 60)) minutes and $(($duration % 60)) seconds elapsed."

  #echo "Cheking for static fields"
  #java -verbose:class -cp $CP_httpcomponents_client:jbse-0.10.0-SNAPSHOT-shaded.jar:classes Driver_httpcomponents_client $n >& java_loaded_class 
  #grep bukkit java_loaded_class | cut -f2 -d' ' | rev | cut -f1 -d. | rev | while read n; do grep "static" $(find -name $n.java); done
