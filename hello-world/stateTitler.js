/* global bp */

/**
 * A general b-thread that gives states a title.
 */

bp.registerBThread("stateTitler", function(){
   var soFar = "";
   while ( true ) {
       var evt = bp.sync({waitFor:bp.all}, "[" + soFar + "]");
       soFar = soFar + (soFar.length>0?", ":"") + evt.name
   } 
});