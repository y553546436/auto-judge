if [[ -z $CP_android_rss ]]; then
  cd ../android-rss
  export CP_android_rss=$(pwd)/target/classes:$(pwd)/target/test-classes:$(mvn dependency:build-classpath | grep -A1 "\[INFO\] Dependencies classpath:" | tail -1)
  cd -
fi

echo $CP_android_rss
mkdir -p logs/android_rss
SECONDS=0
#20
for n in main{1..20}; do
  timeout 30s java -cp jbse-0.10.0-SNAPSHOT-shaded.jar:classes Luke Driver_android_rss $n $CP_android_rss >& logs/android_rss/log-$n 
  #echo $?
  if [ $? = 124 ] ; then
    printf "TIMEOUT\nMAY_BE_POLLUTER\nMAY_BE_VICTIM" >> logs/android_rss/log-$n
  fi
done

duration=$SECONDS
echo "$(($duration / 60)) minutes and $(($duration % 60)) seconds elapsed."

  #echo "Cheking for static fields"
  #java -verbose:class -cp $CP_android_rss:jbse-0.10.0-SNAPSHOT-shaded.jar:classes Driver_android_rss $n >& java_loaded_class 
  #grep bukkit java_loaded_class | cut -f2 -d' ' | rev | cut -f1 -d. | rev | while read n; do grep "static" $(find -name $n.java); done
