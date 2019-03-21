/* global bp */

/** 
 * Sample hello-world program for introducing BPjs.
 */

var HELLO = bp.Event("hello");
var WORLD = bp.Event("world");

bp.registerBThread("SayHello", function(){
    bp.sync({request:HELLO});
});

bp.registerBThread("SayWorld", function(){
    bp.sync({request:WORLD});
});
