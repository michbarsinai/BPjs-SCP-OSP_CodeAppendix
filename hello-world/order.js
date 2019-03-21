/* global bp */

bp.registerBThread("ImposeOrder", function(){
    bp.sync({waitFor:HELLO,
               block:WORLD});
})