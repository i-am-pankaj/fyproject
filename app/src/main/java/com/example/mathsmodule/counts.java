package com.example.mathsmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class counts extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter programAdapter;
    RecyclerView.LayoutManager layoutManager;
    String[] ntitle = { "1","2","3","4","5","6","7","8","9","10",
            "11","12","13","14","15","16","17","18","19","20",
            "21","22","23","24","25","26","27","28","29","30",
            "31","32","33","34","35","36","37","38","39","40",
            "41","42","43","44","45","46","47","48","49","50",
            "51","52","53","54","55","56","57","58","59","60",
            "61","62","63","64","65","66","67","68","69","70",
            "71","72","73","74","75","76","77","78","79","80",
            "81","82","83","84","85","86","87","88","89","90",
            "91","92","93","94","95","96","97","98","99","100"};
    String [] ndes = {"ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN",
            "ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN","TWENTY",
            "TWENTY ONE","TWENTY TWO","TWENTY THREE","TWENTY FOUR","TWENTY FIVE","TWENTY SIX","TWENTY SEVEN","TWENTY EIGHT","TWENTY NINE","THIRTY",
            "THIRTY ONE","THIRTY TWO","THIRTY THREE","THIRTY FOUR","THIRTY FIVE","THIRTY SIX","THIRTY SEVEN","THIRTY EIGHT","THIRTY NINE","FORTY",
            "FORTY ONE","FORTY TWO","FORTY THREE","FORTY FOUR","FORTY FIVE","FORTY SIX","FORTY SEVEN","FORTY EIGHT","FORTY NINE","FIFTY",
            "FIFTY ONE","FIFTY TWO","FIFTY THREE","FIFTY FOUR","FIFTY FIVE","FIFTY SIX","FIFTY SEVEN","FIFTY EIGHT","FIFTY NINE","SIXTY",
            "SIXTY ONE","SIXTY TWO","SIXTY THREE","SIXTY FOUR","SIXTY FIVE","SIXTY SIX","SIXTY SEVEN","SIXTY EIGHT","SIXTY NINE","SEVENTY",
            "SEVENTY ONE","SEVENTY TWO","SEVENTY THREE","SEVENTY FOUR","SEVENTY FIVE","SEVENTY SIX","SEVENTY SEVEN","SEVENTY EIGHT","SEVENTY NINE","EIGHTY",
            "EIGHTY ONE","EIGHTY TWO","EIGHTY THREE","EIGHTY FOUR","EIGHTY FIVE","EIGHTY SIX","EIGHTY SEVEN","EIGHTY EIGHT","EIGHTY NINE","NINETY",
            "NINETY ONE","NINETY TWO","NINETY THREE","NINETY FOUR","NINETY FIVE","NINETY SIX","NINETY SEVEN","NINETY EIGHT","NINETY NINE","HUNDRED"};
    int[] nimg = {R.drawable.d1,R.drawable.d2,R.drawable.d3,R.drawable.d4,R.drawable.d5, R.drawable.d6,R.drawable.d7,R.drawable.d8, R.drawable.d9,R.drawable.d10,
            R.drawable.d11,R.drawable.d12,R.drawable.d13,R.drawable.d14,R.drawable.d15, R.drawable.d16,R.drawable.d17,R.drawable.d18, R.drawable.d19,R.drawable.d20,
            R.drawable.d21,R.drawable.d22,R.drawable.d23,R.drawable.d24,R.drawable.d25, R.drawable.d26,R.drawable.d27,R.drawable.d28, R.drawable.d29,R.drawable.d30,
            R.drawable.d31,R.drawable.d32,R.drawable.d33,R.drawable.d34,R.drawable.d35, R.drawable.d36,R.drawable.d37,R.drawable.d38, R.drawable.d39,R.drawable.d40,
            R.drawable.d41,R.drawable.d42,R.drawable.d43,R.drawable.d44,R.drawable.d45, R.drawable.d46,R.drawable.d47,R.drawable.d48, R.drawable.d49,R.drawable.d50,
            R.drawable.d51,R.drawable.d52,R.drawable.d53,R.drawable.d54,R.drawable.d55, R.drawable.d56,R.drawable.d57,R.drawable.d58, R.drawable.d59,R.drawable.d60,
            R.drawable.d61,R.drawable.d62,R.drawable.d63,R.drawable.d64,R.drawable.d65, R.drawable.d66,R.drawable.d67,R.drawable.d68, R.drawable.d69,R.drawable.d70,
            R.drawable.d71,R.drawable.d72,R.drawable.d73,R.drawable.d74,R.drawable.d75, R.drawable.d76,R.drawable.d77,R.drawable.d78, R.drawable.d79,R.drawable.d80,
            R.drawable.d81,R.drawable.d82,R.drawable.d83,R.drawable.d84,R.drawable.d85, R.drawable.d86,R.drawable.d87,R.drawable.d88, R.drawable.d89,R.drawable.d90,
            R.drawable.d91,R.drawable.d92,R.drawable.d93,R.drawable.d94,R.drawable.d95, R.drawable.d96,R.drawable.d97,R.drawable.d98, R.drawable.d99,R.drawable.d100};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counts);

        recyclerView = findViewById(R.id.nrv);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        programAdapter = new ProgramAdapter(this,ntitle,ndes,nimg);
        recyclerView.setAdapter(programAdapter);
    }
}