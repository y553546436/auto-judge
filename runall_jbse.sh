bash README.md
for f in $(ls *_script.sh); do
    echo $f
    bash $f
done

echo "Everything done"
