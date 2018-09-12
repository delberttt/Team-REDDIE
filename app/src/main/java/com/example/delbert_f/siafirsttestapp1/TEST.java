package com.example.delbert_f.siafirsttestapp1;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

/**
 * Created by Delbert_F on 9/12/2018.
 */

public class TEST {

    public static Context context;

    public TEST(){

    }


    public static void main(String[] args) {

        RequestQueue requestQueue = Volley.newRequestQueue(context);

        String URL = "https://apigw.singaporeair.com/appchallenge/api/flightroutestatus";

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                Request.Method.GET,
                URL,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.e("Rest Reponse: ", response.toString());
                    }
                },
                new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("Rest Error: ", error.toString());
                    }
                }

        );

        requestQueue.add(jsonObjectRequest);

    }
}
