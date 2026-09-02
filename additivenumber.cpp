class Solution {
public:
    bool isAdditiveNumber(string num) {
        int len=num.size();
        for(int flen=1;flen<=len/2;flen++){
            string fnum=num.substr(0,flen);
            if(fnum[0]=='0'&&flen>1){
                break;
            }
            for(int slen=1;len-flen-slen>=max(flen,slen);slen++){
                
                string snum=num.substr(flen,slen);
                if(snum[0]=='0'&&slen>1){
                    break;
                }
                long long fn=stoll(fnum);
                long long sn=stoll(snum);
                //check whether fn+sn is present in num string or not
                int k=flen+slen;
                long long tn=fn+sn;
                //this is the index where 3rd number begins 
                string sum=to_string(tn);
        while(k<len&&num.substr(k,sum.length())==sum){
                
                    k+=sum.length();
                        fn=sn;
                        sn=tn;
                        tn=fn+sn;
                        sum=to_string(tn);
                        
                        
                    
                }
                
                if(k==len){
                    return true;
                }

            }
            }
        
        
    
    return false;
}
    
};
