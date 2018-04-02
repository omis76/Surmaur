package com.onkar.surmaur;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

public class ExcursionsActivity extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excursions);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

    }

    private void openDetailDialog(String detail, Drawable img, String title){
        LayoutInflater inflater= LayoutInflater.from(this);
        View view=inflater.inflate(R.layout.excursions_detail_sheet, null);
        ((ImageView) view.findViewById(R.id.img)).setBackground(img);
        TextView textView = ((TextView) view.findViewById(R.id.text_detail));
        textView.setText(detail);
        textView.setMovementMethod(new ScrollingMovementMethod());
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setView(view);
        alertDialog.setTitle(title);
        alertDialog.setPositiveButton("Ok", null);
        AlertDialog alert = alertDialog.create();
        alert.show();
    }

    public void onRelSevenClick(View view) {
        openDetailDialog("Renuka is another place of religious and tourist interest in Sirmaur. It is nearly 40 kilometres (25 mi) from Nahan via a motorable metalled road. Boating is available for visitors at Renuka Lake, an oval-shaped lake with a circumference of 2.4 kilometres (1.5 mi). The lake is visited by thousands of pilgrims every year on Kartiki Ekadashi. There is a 1.6 kilometres (0.99 mi) patch between the Giri and humming camp where visitors often stay for a couple of days. Nightlong festivities including Kirtans are held by various groups. The place reaches full capacity during the days of the fair and offers a variety of activities. At the entrance to the fairground there is a notice board put up by the Wild Life Wing of the Forest Department warning, Hold Your Gun-- Game Sanctuary Starts;. To this fair, the brass idol of Parasu Rama is brought from the village Jamu, his permanent abode, in a silver palki accompanied by musical instruments. The deity remains in the temple for three days i.e. sudi, dashmi to dwadashi (from 10th to 12th of the bright half). The hill people pray to pujari with questions during the night when he goes into a trance and turns into an oracle, answering questions and sometimes asking of the questioner some offering or sacrifice to the deity of some other act as a condition precedent to the fulfillment of the favourable prophecy, such as deliverance from a problem or recovery of health from some disease. On Dwadashi, generally, the people offer alms after the holy dip in the Renuka lake.",
                ContextCompat.getDrawable(this, R.drawable.renukaji),
                "Shri Renuka Ji Temple");
    }
    public void onRelSixClick(View view) {
        openDetailDialog("Bhureshwar Mahadev is another religious and tourist destination in district Sirmaur. It is situated on a peak nearer to Saraha on the Nahan – Solan state highway. Spiritual seekers point to the fact that Bhureshwar Mahadev was the place from where Lord Shiva and Goddess Parvati watched the historic Mahabharata war. There were only few devotees at the temple and the tingling bells made me feel as if I was in a spiritual land. The temple located on a rock cliff is indeed a worth visit and offers a glimpse of the surrounding valleys. There is a rock cliff on the backside of the temple where entry is prohibited during most part of the year. Only during the local fair does the temple priest perform a dance on this rock invoking the holy Gods. Strange are the ways of God and he intends to keep an eye on us from high grounds. The divine essence of spiritualism is redefined at Bhureshwar Mahadev. Come here and seek the divine blessings from the lord himself.",
                ContextCompat.getDrawable(this, R.drawable.bhureswar),
                ((TextView)view).getText().toString());
    }
    public void onRelFiveClick(View view) {
        openDetailDialog("It is said that once Lord Shiv Shankar on Lankapati Ravan's immense austerity granted him the wish to become Amar(immortal) on condition if he could make 5 swarg ki seedhi in one day. So he started making from the Har Ki Pauri at Haridwar which was the first swarg ki sidi. Then he made this second swarg ki seedhi which is called as Pauri Wala. The 3rd was Chureshwar Mahadev and the 4th Kinner Kailash. After this he slept and could not complete the fifth on the same day and remained deprived of Amarta. It is believed that in this Lord Shiva is present in the Shivling of Pauri Wala and who so ever wishes with a true heart for something in front of this Shivling, the wish gets fulfilled. Amazingly the residents around and the tapaspis are observing this Shivling to grow by the size of just a rice grain by every Shivratri. However the saakshaat darshan of this great Shivling is a mesmarizing experiance for the believers above all. There is mela organised at the time of Shivratri and rush at a few other times in the year, though otherwise a temple in isolation.",
                ContextCompat.getDrawable(this, R.drawable.paudiwala),
                ((TextView)view).getText().toString());
    }
    public void onRelFourClick(View view) {
        openDetailDialog("The Chur Peak in district Sirmaur rises to an elevation of 3647 m above the sea level. The mountain is an important religious place for all Sirmauries. It is one of the Shivalik ranges at a height of 11965 feet, and is the highest peak in southern Himachal Pradesh. Churdhar, also known as Churchandni (Bangle of Snow), is known for its spectacular landscapes. The view from the summit offers a panorama of lowland tracts towards the south and snow-capped ranges, including the peaks of Badrinath and Kedarnath in the Garhwal region, towards the north. It is believed that this is the very place where Hanuman discovered the life-restoring Sanjivini booti, which revived Lakshmana, Lord Rama’s younger brother. Ruins of an ancient town have been discovered at the nearby dundi Devi. Herbs and alpine flora cover these Himalayan slopes, and fauna include the monal, Himachal’s state bird, along with koklassand kaleej pheasants. Trekkers tread over small glaciers on their way to Churdhar summit, which has moderate to heavy snowfall (average of 33 feet snow). Often the Shirgul temple gets buried under it. On clear sunny days, the Badrinath and Kedarnath shrines, Gangetic plains, the Sutlej river and hills of Shimla and Chakrata can be seen. Atop the Churdhar summit there are lingams of Shiva and Kali, where goat and sheep were formerly sacrificed. Devotees hoist flags and make offerings here. The peak can be approached from Dadahu, headquarter of Renuka tehsil, via Sangrah, Bhawai, Gandhuri and Naura, at a distance of about 48 kilometres (30 mi) by bridle path. Another approach to the peak is by the Solan Rajgarh Menus road.",
                ContextCompat.getDrawable(this, R.drawable.churdhar),
                ((TextView)view).getText().toString());
    }
    public void onRelThreeClick(View view) {
        openDetailDialog("This place is at an elevation of 2687 m. Maa Bhangayani Temple, Haripurdhar, is a well known temple in Sirmaur. Haripur is the name applied to a mountain called Haripur Dhar. A fort on a peak of this hillwas built on this range of mountain by the rulers of erstwhile Sirmur State. It was primarily meant to guard the state frontiers with the neighbouring Jubbal State as there were constant boundary disputes between the two states and there was an unusual encroachment into each other's territory. It has fallen into disuse and the part which is still habitable is used by the Forest Department as forester’s headquarters. The fort reminds the visitor of the historical period when to hold or capture such forts used to be the chief aim of the contending hill states. At a distance of about 106 kilometres from Nahan, Haripurdhar can be approached by a regular bus service covering 40 kilometres up to Dadahu, wherefrom Andheri can be reached by jeep for about 44 kilometres. The remaining portion is about 22 kilometres. Another way to approach is from Solan via Rajgarh. Kharotiyon, a place from where the site of the fort remains about 2 kilometres on the hill top.",
                ContextCompat.getDrawable(this, R.drawable.bhagyani),
                ((TextView)view).getText().toString());
    }
    public void onRelTwoClick(View view) {
        openDetailDialog("As per legend Maa Balasundari Jee had appeared in the year 1573 at Trilokpur in a bag of salt brought from Devban (UP) by a local shopkeeper Sh Ram Dass. The said shopkeeper kept on selling salt from the bag through out the day but the commodity did not exhaust and the bag remained filled as if nothing had been taken out there from . He was taken aback from the miracle and while in asleep in the night Goddess appeared in his dream narrated the incidence of her disappearance from Devban(UP) and directed to construct a Temple to establish her PINDI swaroop ,which was already existing inside the bag of salt and also directed to worship in the name of &quot;MAHAMAYA BALASUNDARI&quot; – an infant state of Goddess Veshno Devi. Lala Ram Dass was not rich enough to construct the temple ,thus he decided to approach the then ruler of Sirmour state Sh.Pradeep Prakash who inheritently agreed and got constructed a temple for the incapture of the Divine PINDI.of Mata Balasundari jee at Trilokpur. Two Navratra Fairs are celebrated at Trilokpur i.e. one in the month of Chaitra( March/April) and another in the month of Aashwin( Sept/Oct.) .Lacs of pilgrims visits from Northern States like as Haryana,Delhi,UP,HP and other states to get the blessings of Mahmaya Balasundari Jee.",
                ContextCompat.getDrawable(this, R.drawable.mahamaya),
                ((TextView)view).getText().toString());
    }
    public void onRelOneClick(View view) {
        openDetailDialog("This Gurdwara was built in memory of Guru Gobind Singh ji, the tenth guru of sikhs . The Dasam Granth was written here by Guru Gobind Singh Ji. Hence, the Gurdwara enjoys a high historic and religious importance among the followers of the Sikh religion world over.The Gurudwara have a palanquin &quot;Palki&quot; made of pure gold, donated by devotees. Shri Talab Asthan and Shri Dastar Asthan are the vital places inside the Sikh shrine.Shri Talab Asthan is used for disbursing salaries and Shri Dastar Asthan is used for organizing the turban tying competitions. A legendary temple is also attached to the Gurudwara which is rebuilt recently in the vicinity of Gurudwara compound. The temple is devoted to Goddess Yamuna. Kavi Darbar, a prominent place near the Gurudwara is the venue for holding the poetry competitions. The weapons and pens used by Guru Gobind Singh Ji are displayed in a museum near the Paonta Sahib Gurudwara. The Gurudwara is visited by tourists from different states.The site is situated on the bank of River Yamuna.This gurudwara serves langar (parshada)for all.The pure beauty of gurudwara signifies that God is one and we all are its children.",
                ContextCompat.getDrawable(this, R.drawable.paonta),
                ((TextView)view).getText().toString());
    }

    public void onOtherFourClick(View view) {
        openDetailDialog("Jaitak Fort, situated in the Jaitak Hills, is believed to have been built using the material recovered from the destroyed Nahan Fort. The Jaitak Fort was built by the Gurkha leader, Ranjor Singh Thapa, and his brave men in 1810, after attacking and ransacking the Nahan Fort and Palace. It was here that the most important battle was fought between the British forces and the Gurkhas. From the Gurkhas, Kaji Amar Singh Thapa led the Nepali Army. The battle fought between 26 December 1814 to 15 May 1815. As a result the Nepali Army defeated the British and Sirmour joint army under the leadership of Amar Singh Thapa. 600 soldiers were reported to die in this war. It is about 15 km to the north of Nahan, Jamta falls on the Nahan-Dadahu motorable road. An ascent of about 3 km has to be negotiated form Jamta to gain Jaitak. A hill fortress one crowned the Jaitak hill which is a steep ridge of slate and which rises above the Kayarda Dun, 30-36’ north and 77-24’ east, in the Nahan tehsil. The elevation above the sea level is about 1479 m.",
                ContextCompat.getDrawable(this, R.drawable.sirmour_1),
                ((TextView)view).getText().toString());
    }
    public void onOtherThreeClick(View view) {
        openDetailDialog("Shivalik Fossil Park, also known as the Suketi Fossil Park  is a notified National Geo- heritage Monument fossil park in the Sirmaur district in the Indian state of Himachal Pradesh. It has a collection of prehistoric vertebrate fossils and skeletons recovered from the upper and middle Siwaliks geological formations of sandstones and clay at Suketi. The park has a display of the fossil finds and an open-air exhibition of six life-sized fiberglass models of extinct mammals in a recreation of the Sivalik Hills environment of the Plio-Pleistocene era (circa 2.5 million years). A museum, within the precincts of the park curated and exhibits the fossils. Shivalik is Asia&#39;s biggest fossil park. The exhibits in the park are used to generate scientific interest among the public, and facilitate special international studies by visiting research scholars from all over the world. The park is named after the Suketi village where it is located, at the site where the fossils were found, in the Markanda River valley, at the foot of the Himalayas. It is 22 kilometres southwest of Nahan, the district headquarters of Sirmaur district. Kala Amb, a small industrial town, is 5 kilometres away on the Kala Amb-Bikramabad road. The park, extensively forested, is spread out over an area of 1.5 square kilometres at Suketi. A tourism information desk is maintained at the park. It is 70 km from Chandigarh, 48 km from Yamunanagar, 48 km from Ambala and 250 km from Delhi. There is narrow side lane to reach the park. Preferable use small vehicle to reach there.",
                ContextCompat.getDrawable(this, R.drawable.shivalik),
                ((TextView)view).getText().toString());
    }
    public void onOtherTwoClick(View view) {
        openDetailDialog("The Chur Peak in district Sirmaur rises to an elevation of 3647 m above the sea level. The mountain is an important religious place for all Sirmauries. It is one of the Shivalik ranges at a height of 11965 feet, and is the highest peak in southern Himachal Pradesh. Churdhar, also known as Churchandni (Bangle of Snow), is known for its spectacular landscapes. The view from the summit offers a panorama of lowland tracts towards the south and snow-capped ranges, including the peaks of Badrinath and Kedarnath in the Garhwal region, towards the north. It is believed that this is the very place where Hanuman discovered the life-restoring Sanjivini booti, which revived Lakshmana, Lord Rama’s younger brother. Ruins of an ancient town have been discovered at the nearby dundi Devi. Herbs and alpine flora cover these Himalayan slopes, and fauna include the monal, Himachal’s state bird, along with koklassand kaleej pheasants. Trekkers tread over small glaciers on their way to Churdhar summit, which has moderate to heavy snowfall (average of 33 feet snow). Often the Shirgul temple gets buried under it. On clear sunny days, the Badrinath and Kedarnath shrines, Gangetic plains, the Sutlej river and hills of Shimla and Chakrata can be seen. Atop the Churdhar summit there are lingams of Shiva and Kali, where goat and sheep were formerly sacrificed. Devotees hoist flags and make offerings here. The peak can be approached from Dadahu, headquarter of Renuka tehsil, via Sangrah, Bhawai, Gandhuri and Naura, at a distance of about 48 kilometres (30 mi) by bridle path. Another approach to the peak is by the Solan Rajgarh Menus road.",
                ContextCompat.getDrawable(this, R.drawable.churdhar),
                ((TextView)view).getText().toString());
    }
    public void onOtherOneClick(View view) {
        openDetailDialog("Renuka is another place of religious and tourist interest in Sirmaur. It is nearly 40 kilometres (25 mi) from Nahan via a motorable metalled road. Boating is available for visitors at Renuka Lake, an oval-shaped lake with a circumference of 2.4 kilometres (1.5 mi). The lake is visited by thousands of pilgrims every year on Kartiki Ekadashi. There is a 1.6 kilometres (0.99 mi) patch between the Giri and humming camp where visitors often stay for a couple of days. Nightlong festivities including Kirtans are held by various groups. The place reaches full capacity during the days of the fair and offers a variety of activities. At the entrance to the fairground there is a notice board put up by the Wild Life Wing of the Forest Department warning, Hold Your Gun-- Game Sanctuary Starts;. To this fair, the brass idol of Parasu Rama is brought from the village Jamu, his permanent abode, in a silver palki accompanied by musical instruments. The deity remains in the temple for three days i.e. sudi, dashmi to dwadashi (from 10th to 12th of the bright half). The hill people pray to pujari with questions during the night when he goes into a trance and turns into an oracle, answering questions and sometimes asking of the questioner some offering or sacrifice to the deity of some other act as a condition precedent to the fulfillment of the favourable prophecy, such as deliverance from a problem or recovery of health from some disease. On Dwadashi, generally, the people offer alms after the holy dip in the Renuka lake.",
                ContextCompat.getDrawable(this, R.drawable.renukaji),
                ((TextView)view).getText().toString());
    }

    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }
        public static PlaceholderFragment newInstance() {
            PlaceholderFragment fragment = new PlaceholderFragment();
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_excursions, container, false);
            return rootView;
        }
    }

    public static class PlaceholderFragment1 extends Fragment {

        public PlaceholderFragment1() {
        }
        public static PlaceholderFragment1 newInstance() {
            PlaceholderFragment1 fragment = new PlaceholderFragment1();
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_excursions_others, container, false);
            return rootView;
        }
    }
    public static class PlaceholderFragment2 extends Fragment {

        public PlaceholderFragment2() {
        }
        public static PlaceholderFragment2 newInstance() {
            PlaceholderFragment2 fragment = new PlaceholderFragment2();
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_excursion_hist, container, false);
            return rootView;
        }
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return PlaceholderFragment.newInstance();
                case 1:
                    return PlaceholderFragment1.newInstance();
                case 2:
                    return PlaceholderFragment2.newInstance();
                default:
                    return PlaceholderFragment.newInstance();
            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }
    }
}
