class IPodRunner
{
public static void main(String[] args)
{
IPod ipod=new IPod();
ipod.name="nnnn";
ipod.price=2000.0f;
ipod.color=IPodcolor.Blue;
ipod.weight=20;
ipod.size="20inch";
ipod.Communication();

IPod ipod1=new IPod();
ipod1.name="pppp";
ipod1.price=4000.0f;
ipod1.color=IPodcolor.Red;
ipod1.weight=30;
ipod1.size="30inch";
ipod1.videoplayer();

IPod ipod2=new IPod();
ipod2.name="ssss";
ipod2.price=5000.0f;
ipod2.color=IPodcolor.Black;
ipod2.weight=40;
ipod2.size="40inch";
ipod2.videoplayer();
}
}