package net.minecraft.server.v1_7_R4;
public class BlockLeaves2 extends net.minecraft.block.BlockNewLeaf
{

   public void c(net.minecraft.world.World arg1,int arg2,int arg3,int arg4,int arg5,int arg6){
       super.func_150124_c(arg1,arg2,arg3,arg4,arg5,arg6);
}
   public java.lang.String[] e(){
       return super.func_150125_e();
}
   public int getDropData(int arg1){
       return super.damageDropped(arg1);
}
   public int getDropData(net.minecraft.world.World arg1,int arg2,int arg3,int arg4){
       return super.getDamageValue(arg1,arg2,arg3,arg4);
}
}