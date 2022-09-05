const fs = require('fs');
const path = require('path');
   
/*fs.mkdir(path.join(__dirname, 'TrainingDetails'), (err) => {
    if (err) {
        return console.error(err);
    }
    console.log('Directory created successfully!');
});*/
/*
fs.writeFile(path.join(__dirname,'/TrainingDetails','/details.txt')
   ,'sai kiran'
   ,(err)=>{
    if(err) throw err;
    console.log('File written to...');
}
)*/

/*
fs.readFile(path.join(__dirname,'/TrainingDetails','/details.txt'),'utf8',(err,data)=>{
    if(err)throw err;
    console.log(data);
});
*/

/*
fs.readFile('C:\demo', 'utf8', (err, data) => {
  if (err) {
    console.error(err);
    return;
  }
  console.log(data);
});
*/

fs.readFile((__dirname,'/demo.java'),'utf8',(err,data)=>{
  if(err)throw err;
  console.log(data);
});