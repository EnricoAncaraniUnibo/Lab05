# Esercizio con Git, in locale

Per ogni passo,
si annoti in questo file il comando utilizzato ed il suo output,
per confrontarlo con le soluzioni.

### Si crei una nuova directory
mkdir git
### Si inizializzi un repository Git dentro la cartella suddetta.
cd git
git init
### Si osservi lo stato del repository
git status
### Si scriva un file `HelloWorld.java` contenente un `main` con una stampa a video e si osservi il contenuto del repository
touch HelloWorld.java
git status
### Si aggiunga `HelloWorld.java` allo stage, e si osservi lo stato del repository
git add .
git status
### Si crei il primo commit, con messaggio ragionevole. Se necessario, si configuri nome utente ed email di git usando i dati dell'account istituzionale.
git commit -m 1.0
### Si compili il file Java e si verifichi lo stato del repository
javac HelloWorld.java
git status
### Si noti che c'è un file rigenerabile (`HelloWorld.class`). Si costruisca una lista di file ignorati che ignori tutti i file con estensione `.class`
touch .gitignore
echo '*.class' >> .gitignore
### Si osservi lo stato del repository
git status
### Si crei un nuovo commit che tracci il la ignore list, aggiungendo allo stage i file necessari. Si osservi sempre lo stato del repository dopo l'esecuzione di un comando
git add .gitignore
git status
### Si gestiscano i caratteri di fine linea in modo appropriato, creando un file `.gitattributes`
touch .gitattributes
echo '* text=auto' >> .gitattributes
### Si osservi la storia del repository usando `git log --all --graph`
git log --all --graph
### Da questo punto in poi, prima e dopo ogni comando, ci si assicuri di osservare lo stato del repository con `git status`
git status
### Si crei un file Mistake.java, con contenuto arbitrario, lo si aggiunga al tracker, e si faccia un commit
touch Mistake.java
git add Mistake.java
git commit -m aggiuntoMistake
### Si rinomini `Mistake.java` in `ToDelete.java`, e si faccia un commit che registra la modifica
mv Mistake.java ToDelete.java
git add .
git commit -m rinominato
### Si elimini `ToDelete.java` e si registri la modifica in un commit
rm ToDelete.java
git add ToDelete.java
git commit -m eliminato
### Si osservi la storia del repository e si identifichi il commit dove è stato creato `Mistake.java`. Per una visione compatta, si usi l'opzione `--oneline`
git log --all --graph --oneline
### Si ripristini Mistake.java dal commit identificato al passo precedente
 git checkout 76ccfa6 -- Mistake.java
### Si rimuova il file ripristinato e si ripulisca lo stage
git reset Mistake.java
rm Mistake.java
### Si torni al commit precedente a quello in cui `Mistake.java` è stato creato. Si utilizzi la storia del repository se utile.
git log --all --graph --oneline
git checkout abe7591
### Si crei un nuovo branch di nome `experiment` e si agganci la `HEAD` al nuovo branch
git checkout -b experiment
### Si crei un file README.md con contenuto a piacere, e si faccia un commit che lo includa
touch README.md
echo 'ciao' >> README.md
git add README.md
git commit -m aggiunto il README.md
### Si torni sul branch master e si elenchino i branch disponibili
git checkout master
git branch
### Si unisca il branch experiment al branch master (si faccia un merge in cui experiment viene messo dentro master, e non viceversa)
git merge experiment
### Si osservi la storia del repository
git log --graph --all --oneline