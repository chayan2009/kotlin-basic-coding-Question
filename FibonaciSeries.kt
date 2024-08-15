fun main(){
    var t1=0
    var t2=1
    var n=10
    var i=0
    print("First $n terms ")
    while(i<=n){
        print("$t1+ ")
        var sum=t1+t2
        t1=t2
        t2=sum
        i++
    }
}