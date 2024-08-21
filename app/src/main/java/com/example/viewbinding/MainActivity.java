package com.example.viewbinding;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.viewbinding.databinding.ActivityMainBinding;
/*
la7 ne7ke l youm 3ala mawdo3 jdeed w mohem nezel ba3d android 3.6 le howe mawdo3 l viewBinding

ViewBinding:
l fekra eno badel ma 2a3mel inflate lal commponenet w kel 3onsour b 3onsro 2a3mlo inflate b2ede finviewbyid() momken esta5dem tare2a badele w tare2a ashal
la nest3mel l viewbinding lezem nzeed code la fa3ela lal viewbinding b2lab l bulid.gradle bel tag ta3el l android
sho howe l code le bade zedo b tag l android bel buld.gradle:
buildFeatures{
        viewBinding=true
    }

bhay tare2a bt5ale l build system yfa3el 5asyet l viewbinding l2no 5asyet l viewbinding btenshe2lak malafet files m5feye enta ma btshofa heye la7ala bta3mel inflate lal 3anser findviewbyid
hala2 heek l 3amlye tamet benaje7 l 3anser kola n3mala inflate la7ala

hala2 keef best5dem 5asyet l viewbinding:
ana malsn hala2 3ande b2lb shshe textview bel xml l id ta3ela maintextview
w 3ande button kamen l id ta3elo mainbtn
hala2 sar 3ande bel shshe textview,w button
lama bade ed8at 3al button bade 2e3red kelmet "ok" bel textview

sho bade 2a3mel:
zamen keen lezm 3aref l 3anser bel main class textview,Button w ba3den 2a3meloun inflate findviewbyid ba3den 2a3mel btn.setonclicklistner

hala2 bel viewbinding sar l mawdo3 ashal w mobasharatn mn doun ma t3ref l view w ta3melo findviewbyid ya3ne sar feeek testa5dmo mobasharatan lal 3onsour le 3andak mndoun este3mel aye she mn resources keef:

bteje btjeeb esm tasmem taba3 l activity le sha8al feha sho esma:actitvity_main

fa 2awl she badak t3ref she esmo ActivityMainBinding deymn badak t5ale 2awal ma3lome bel nesbe lal viewbinding eno sho esm malaf l xml esmo:activitymain  fa bt3ref nafs esmo l malaf l xml zyede 3lee binding ya3ne esmo lal file ahamd malsn fa mn3ref AhmadBinding nafs l esm bas capital
bta3refo global esm hala2 file l xml activitymain fa bt3ref global:ActivityMainBinding esm l file khaled bt3ref KhaledBinding heek
fa mn3rfo 2aawl she mnsame msln binding ana bade 3arfo mara wa7de w seer est5dmo ween ma keen fa 3arfto global
ActivityMainBinding binding;:heda be3aber 3an malaf l xml kolo ya3ne be3ber 3an kel malaf l xml activitymain ya3ne be3ber 3an kel layout le mawjoud de5el l activitymain kel l views l mawjoude l activitymain ya3ne kel layout l mawjoude b file l xml bel button le feha w l textview
ba3den bade eje 2a3mela intillize bel onreate:
binding=esmmalaf l xml dot inflate() w ba3te lal inflate b2lab l consturctor getlayoutinflater l2no l activity le mawjoud feha ana feha layoutinflater l getlayoutinflater() btrje3le l class l mas2ol 3an 3amlyet l inflater le mawjoude bel activity hay le ana feha fa bjebo w be3to la method l inflate()
binding=ActivitymainBinding.inflate(getLayoutInflater()):heda satr fe3layn k2ono 7awale kel l activity 2aw kel file l xml le howe l activity_main 7awale yeh la object  mno3 ActivityMainBinding
binding=ActivitymainBinding.inflate(getLayoutInflater()):ya3ne heda l class ActivitymainBinding 5ale ya3mel inflate w ye5od layout inflater heda taba3 l activity lesh 3ashn joweto berou7 la7alo bya3mel inflate la kel l 3anser le btsamem b2lab l binding b7ota badel ma enta ta3mel inflate la kel wa7ad la wa7do
fa hala2 bkel sohole brou7 3ala l setcontent()w bshel l R.layout.activity_main w b7ot badela binding.getroot())
ya3ne setcontentView(binding.getroot()):getroot() btjeblak root element le mawjoude bel binding ya3ne iza da8t controle 3al activityBinding la7 te5dak 3ala malaf l xml sho root howe l layout nafsa le howe linearlayout bhay l 7ale  le enta mawjoud feha le heye nafsa le kenet abl shway R.layout.activity_main
 setContentView:heye bade 2a3teha root ta3el l xml le bade yeh ybyen 3ala l screen lezm na3te l setcontentview hayde l rooot 3ashn n2olo eno hay l activity teb3a la heda l xml ya3ne bas efta7 hay l activity bade shof heda layout le howe l getroot() 2aw feek t2olo main le howe nafso zeto root
ya3ne enta 3am t7ot l contentview le l user le bado yshofo taba3 heda l activity

fa bel viewbinding lezm badel ma t7ot bel setcontentview(R.layout.activity_main) bt7ot setcontentview(binding.getroot()) fa heek mnseer 3am net3mal ma3 root element le mawjoud bel binding lesh l2no l binding nafso be3ber 3an malf l xml le howe t7awal la object java  ya3ne ka2no ra7 mesek malaf l xml bel mo7tawa le feha w 7awalo la object java

bas ne7na abl kona na3mel inflate malsn la button fa trj3lk t7awelak object mn no3 button,textview la object textview bas l binding be7welak kel layout la object kemel ya3ne be7wel layout  bel feha mara wa7de 3asehn heek bery7na


masln hala2 keef bade 2osal lal button 2aw textview:
iza 7atyna binding dot btjeblak kel l view le b2lab hyde layout l btn textview kel she views







 */

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.mainbtn.setOnClickListener(v->{
            binding.maintext.setText("ok");
        });

    }
}