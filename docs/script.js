var target_target1 = document.getElementById('target');
var layout1 = {
    title: '"All You Need Is Love" - Frequency of occurence per word',
    height: 600,
    width: 800,
};

var trace0 =
{
x: ['love','you','all','need','is','can','be','that','nothing','cant','theres','isnt','its','easy','to','but','do','how','learn','play','no','game','everybody','saved','save','youre','see','nowhere','known','shown','now','where','make','together','meant','in','made','one','say','done','sung','the','know','sing','time'],
y: [41.0, 31.0, 20.0, 19.0, 19.0, 11.0, 7.0, 7.0, 7.0, 4.0, 4.0, 3.0, 3.0, 3.0, 3.0, 2.0, 2.0, 2.0, 2.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0],
orientation: 'v',
xaxis: 'x',
yaxis: 'y',
type: 'bar',
name: '',
};

var data1 = [ trace0];
Plotly.newPlot(target_target1, data1, layout1);
