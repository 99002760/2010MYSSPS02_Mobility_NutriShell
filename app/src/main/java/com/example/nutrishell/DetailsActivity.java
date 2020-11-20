package com.example.nutrishell;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

//import com.example.yummy.adapter.MethodViewAdapter;
import com.example.nutrishell.adapter.NutritionViewAdapter;

public class DetailsActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        Intent intent = getIntent();
        String position = intent.getStringExtra("position");


        RecyclerView recyclerViewMethod = findViewById(R.id.nutritionView);
        recyclerViewMethod.setHasFixedSize(true);
        recyclerViewMethod.setLayoutManager(new LinearLayoutManager(this));

        if(position.equals("1"))
        {
            NutritionData[] nutritionData = new NutritionData[]{
                    new NutritionData("BENEFITS"),
                    new NutritionData("Almonds are rich in proteins, fibre and nutrients"),
                    new NutritionData("Almonds reduce your risk of cholesterol"),
                    new NutritionData("Almond can regulate blood sugar"),
                    new NutritionData("Almonds are Good for Your Heart"),
                    new NutritionData("Almonds have High Vitamin E"),
                    new NutritionData("Almonds are Rich in Nutrients"),
                    new NutritionData("RISK"),
                    new NutritionData("Decrease Nutrient Absorption"),
                    new NutritionData("May Cause Weight Gain"),
                    new NutritionData("Can Lead To Allergies"),
                    new NutritionData("May Lead To Vitamin E Overdose"),
                    new NutritionData("May Cause Kidney Stones")
            };
            NutritionViewAdapter myAdapter = new  NutritionViewAdapter(nutritionData,DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }
        else if(position.equals("2"))
        {
            NutritionData[] nutritionData = new NutritionData[]{
                    new NutritionData("BENEFITS"),
                    new NutritionData("Apples Are Nutritious"),
                    new NutritionData("Apples May Be Good for Weight Loss"),
                    new NutritionData("Apples May Be Good for Your Heart"),
                    new NutritionData("They're Linked to a Lower Risk of Diabetes"),
                    new NutritionData("They May Have Prebiotic Effects and Promote Good Gut Bacteria"),
                    new NutritionData("Substances in Apples May Help Prevent Cancer"),
                    new NutritionData("RISK"),
                    new NutritionData("Can Increase Blood Sugar Levels"),
                    new NutritionData("May Encourage Weight Gain"),
                    new NutritionData("Could Lead to Heart Disease"),
                    new NutritionData("Apple Seeds Contain Cyanide"),
                    new NutritionData("May Cause Allergic Reaction"),
                    new NutritionData("Apple Cider Vinegar Weakens Tooth Enamel")
            };
            NutritionViewAdapter myAdapter = new  NutritionViewAdapter(nutritionData,DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }
        else if(position.equals("3"))
        {
            NutritionData[]  nutritionData = new NutritionData[]{
                    new NutritionData("BENEFITS"),
                    new NutritionData("Bananas Contain Many Important Nutrients"),
                    new NutritionData("Bananas Contain Nutrients That Moderate Blood Sugar Levels"),
                    new NutritionData("Bananas May Improve Digestive Health"),
                    new NutritionData("Bananas May Aid Weight Loss"),
                    new NutritionData("Bananas May Support Heart Health"),
                    new NutritionData("Bananas Contain Powerful Antioxidants"),
                    new NutritionData("RISK"),
                    new NutritionData("Weight Gain"),
                    new NutritionData("Migraine"),
                    new NutritionData("Hyperkalemia"),
                    new NutritionData("Hypersensitivity In Patients Allergic To Latex"),
                    new NutritionData("Respiratory Problems"),
                    new NutritionData("Anaphylactic Shock")

            };
            NutritionViewAdapter myAdapter = new  NutritionViewAdapter( nutritionData,DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }
        else if(position.equals("4"))
        {
            NutritionData[]  nutritionData = new NutritionData[]{
                    new NutritionData("BENEFITS"),
                    new NutritionData("Boosts eye health"),
                    new NutritionData("Ensures bowel regularity and helps in digestion"),
                    new NutritionData("Aids Weight Loss"),
                    new NutritionData(" Fights cholesterol and boosts heart health"),
                    new NutritionData("Lowers Blood Pressure"),
                    new NutritionData("Boosts skin health"),
                    new NutritionData("RISK"),
                    new NutritionData("May Cause Carotenemia And Turn Your Skin To Orange In Color"),
                    new NutritionData("Not So Good For Our Digestive System"),
                    new NutritionData("Hinders Absorption Of Nutrients And Lack of Essential Nutrients"),
                    new NutritionData("High In Pesticides"),
                    new NutritionData("High In Sugar Content")

            };
            NutritionViewAdapter myAdapter = new  NutritionViewAdapter( nutritionData,DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }
        else if(position.equals("5"))
        {
            NutritionData[]  nutritionData = new NutritionData[]{
                    new NutritionData("BENEFITS"),
                    new NutritionData("Dates are Highly Nutritious: The nutrition data of dates are really off the charts"),
                    new NutritionData("Aids Healthy Bowel Movements"),
                    new NutritionData("High Concentration of Anti-oxidants:"),
                    new NutritionData("Improves Brain Functionality"),
                    new NutritionData("Facilitates Natural Labour"),
                    new NutritionData("Reduces Risk of Cancer"),
                    new NutritionData("Prevents Microbial Infections"),
                    new NutritionData("Helps Fight Diabetes"),


                    new NutritionData("RISK"),
                    new NutritionData("Might Cause Abdominal Issues"),
                    new NutritionData("Can Cause Skin Rashes"),
                    new NutritionData("Can Cause Asthma Attacks"),
                    new NutritionData("Can Cause Weight Gain"),
                    new NutritionData("Can Lead To Hyperkalemia"),
                    new NutritionData("The Wax Coating Can Have Harmful Effects"),
                    new NutritionData("Can Be Unhealthy For Babies")

            };
            NutritionViewAdapter myAdapter = new  NutritionViewAdapter( nutritionData,DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }
        else if(position.equals("6"))
        {
            NutritionData[]  nutritionData = new NutritionData[]{
                    new NutritionData("BENEFITS"),
                    new NutritionData("Incredibly Nutritio"),
                    new NutritionData("High in Cholesterol"),
                    new NutritionData(" Raise HDL Choleste"),
                    new NutritionData("Reduced Risk of Hea"),
                    new NutritionData("Major Benefits for "),
                    new NutritionData("High in Quality Pro"),
                    new NutritionData(" Disease Prevention"),


                    new NutritionData("RISK"),
                    new NutritionData("Food Poisoning"),
                    new NutritionData("Cholesterol and Saturated Fat"),
                    new NutritionData("Restrictions"),
                    new NutritionData("Diabetes and Eggs")

            };
            NutritionViewAdapter myAdapter = new  NutritionViewAdapter( nutritionData,DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }
        else if(position.equals("7"))
        {
            NutritionData[]  nutritionData = new NutritionData[]{
                    new NutritionData("BENEFITS"),
                    new NutritionData("Kiwi Prevents Blood Clotting"),
                    new NutritionData("Kiwi Can Help Asthma"),
                    new NutritionData("Kiwi Improves Digestion"),
                    new NutritionData("Helps Regulate Blood Pressure"),
                    new NutritionData("Supports Immune Function"),
                    new NutritionData("Reduces DNA Damage"),
                    new NutritionData("Prevents Vision Loss"),
                    new NutritionData("Fights Inflammation"),


                    new NutritionData("RISK"),
                    new NutritionData("Allergic Reactions"),
                    new NutritionData(" Rashes And Swelling"),
                    new NutritionData(" Oral Allergy Syndrome (OAS)"),
                    new NutritionData(" Dermatitis"),
                    new NutritionData(" Pancreatitis Problem"),
                    new NutritionData(" Diarrhea And Collapsing"),
                    new NutritionData(" Latex Allergy"),
                    new NutritionData(" Breast Feeding And Pregnancy"),
                    new NutritionData(" Interaction With Some Specific Types Of Drugs")

            };
            NutritionViewAdapter myAdapter = new  NutritionViewAdapter( nutritionData,DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }
        else if(position.equals("8"))
        {
            NutritionData[]  nutritionData = new NutritionData[]{
                    new NutritionData("BENEFITS"),
                    new NutritionData("It is recommended for growing children"),
                    new NutritionData("It provides calcium, vitamin D, and B12"),
                    new NutritionData("It is recommended for growing children"),
                    new NutritionData("Good For Bones"),
                    new NutritionData("Rich in Protein"),
                    new NutritionData("Reduces Risks of Obesity"),
                    new NutritionData("It Can Be Added to Many Ingredients"),
                    new NutritionData("Prevents Heartburns"),
                    new NutritionData("Fights Multiple Diseases"),
                    new NutritionData("Stress Buster"),
                    new NutritionData("Helps in Strong Teeth"),


                    new NutritionData("RISK"),
                    new NutritionData("Bleeding from the intestines during infancy"),
                    new NutritionData("It contains lactose, which can be harmful"),
                    new NutritionData("It can wreak havoc on your skin, causing acne"),
                    new NutritionData("It has a lot more calories than you would expect")

            };
            NutritionViewAdapter myAdapter = new  NutritionViewAdapter( nutritionData, DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }
        else if(position.equals("9"))
        {
            NutritionData[]  nutritionData = new NutritionData[]{
                    new NutritionData("BENEFITS"),
                    new NutritionData("Mushrooms may help keep you young"),
                    new NutritionData("Mushrooms may boost your memory."),
                    new NutritionData("Mushrooms can protect your brain as you age."),
                    new NutritionData(" Mushrooms can help your heart health."),
                    new NutritionData(" Mushrooms can assist in strengthening your bones"),
                    new NutritionData("Mushrooms will help give you energy"),

                    new NutritionData("RISK"),
                    new NutritionData("Tiredness"),
                    new NutritionData("Stomach Upset"),
                    new NutritionData("Absent Minded"),
                    new NutritionData("Skin Allergies")
            };
            NutritionViewAdapter myAdapter = new  NutritionViewAdapter( nutritionData,DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }
        else if(position.equals("10"))
        {
            NutritionData[]  nutritionData = new NutritionData[]{
                    new NutritionData("BENEFITS"),
                    new NutritionData("High in Vitamin C. Oranges are an excellent source of vitamin C"),
                    new NutritionData("Healthy immune system"),
                    new NutritionData("Prevents skin damage"),
                    new NutritionData("Keeps blood pressure under check"),
                    new NutritionData("Lowers cholesterol"),
                    new NutritionData("Controls blood sugar level"),

                    new NutritionData("RISK"),
                    new NutritionData("Lack of Fat"),
                    new NutritionData("Low in Fiber"),
                    new NutritionData("Low in Protein")

            };
            NutritionViewAdapter myAdapter = new  NutritionViewAdapter( nutritionData,DetailsActivity.this);
            recyclerViewMethod.setAdapter(myAdapter);
        }



    }
}