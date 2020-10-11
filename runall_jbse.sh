bash README.md
rm summary
for f in $(ls *_script.sh); do
    echo $f |& tee -a summary
    bash $f |& tee -a summary
done

echo "Everything done"
egrep ".*sh$|.*elapsed" summary |& tee simplified_summary
