package com.developerdiindy.momopartner.presentation.transfer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.developerdiindy.momopartner.R;
import com.developerdiindy.momopartner.api.ApplicationController;
import com.developerdiindy.momopartner.business.model.Transfer;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class TransferDetailsActivity extends AppCompatActivity {

    Button btnTransfer;
    EditText etExternalId, etAmount, etPartyId, etMyMessage, etPayeeNote;

    Transfer transfer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transfer_details);

        getUserInput();
        setupButtons();
    }

    private void getUserInput() {
        setupInputViews();
        // ToDo
    }

    private void setupInputViews() {
        etExternalId = findViewById(R.id.et_transfer_externalId);
        etAmount = findViewById(R.id.et_transfer_amount);
        etPartyId = findViewById(R.id.et_transfer_payeePartyID);
        etMyMessage = findViewById(R.id.et_transfer_payerMessage);
        etPayeeNote = findViewById(R.id.et_transfer_payeeNote);
    }

    private void setupButtons() {
        btnTransfer = findViewById(R.id.btn_transfer_transfer);
        btnTransfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // toDo
                //doTransfer();
                startActivity(new Intent(TransferDetailsActivity.this, TransferStatusActivity.class));
            }
        });
    }

    private void doTransfer() {
        doCreateAccessToken_POST();
        doTransfer_POST();
        doGetTransferStatus_GET();

        // ToDo goToStatus page with Status from GET
        startActivity(new Intent(TransferDetailsActivity.this, TransferStatusActivity.class));
    }

    private void doSpotifyPlaylist_GET() {
        // ToDo
        // Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://" + "api.spotify.com" + "/v1/playlists/playlist_id HTTP/1.1";

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // inside on response method we are
                        // hiding our progress bar  -> loadingPB.setVisibility(View.GONE);
                        // and setting data to edit text as empty

                        // on below line we are displaying a success toast message.
                        Toast.makeText(TransferDetailsActivity.this, "Data added to API", Toast.LENGTH_SHORT).show();
                        try {
                            // on below line we are parsing the response
                            // to json object to extract data from it.
                            JSONObject respObj = new JSONObject(response);

                            // below are the strings which we
                            // extract from our json object.
                            String name = respObj.getString("name");
                            String job = respObj.getString("job");

                            // on below line we are setting this string s to our text view.
                            //responseTV.setText("Name : " + name + "\n" + "Job : " + job);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "That didn't work!", Toast.LENGTH_LONG).show();
            }
        });

        // Add the request to the RequestQueue.
        queue.add(stringRequest);
    }

    private void doGetTransferStatus_GET() {
        // ToDo
        // Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://www.google.com";

        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // inside on response method we are
                        // hiding our progress bar  -> loadingPB.setVisibility(View.GONE);
                        // and setting data to edit text as empty

                        // on below line we are displaying a success toast message.
                        Toast.makeText(TransferDetailsActivity.this, "Data added to API", Toast.LENGTH_SHORT).show();
                        try {
                            // on below line we are parsing the response
                            // to json object to extract data from it.
                            JSONObject respObj = new JSONObject(response);

                            // below are the strings which we
                            // extract from our json object.
                            String name = respObj.getString("name");
                            String job = respObj.getString("job");

                            // on below line we are setting this string s to our text view.
                            //responseTV.setText("Name : " + name + "\n" + "Job : " + job);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "That didn't work!", Toast.LENGTH_LONG).show();
            }
        });

        // Add the request to the RequestQueue.
        queue.add(stringRequest);
    }

    private void doTransfer_POST() {
        // ToDo
        // url to post our data
        String url = "https://sandbox.momodeveloper.mtn.com/remittance/v1_0/transfer";

        //loadingPB.setVisibility(View.VISIBLE);

        // creating a new variable for our request queue
        RequestQueue queue = Volley.newRequestQueue(TransferDetailsActivity.this);

        // on below line we are calling a string
        // request method to post the data to our API
        // in this we are calling a post method.
        StringRequest request = new StringRequest(Request.Method.POST, url, new com.android.volley.Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                // inside on response method we are
                // hiding our progress bar  -> loadingPB.setVisibility(View.GONE);
                // and setting data to edit text as empty

                // on below line we are displaying a success toast message.
                Toast.makeText(TransferDetailsActivity.this, "Data added to API", Toast.LENGTH_SHORT).show();
                try {
                    // on below line we are parsing the response
                    // to json object to extract data from it.
                    JSONObject respObj = new JSONObject(response);

                    // below are the strings which we
                    // extract from our json object.
                    String name = respObj.getString("name");
                    String job = respObj.getString("job");

                    // on below line we are setting this string s to our text view.
                    //responseTV.setText("Name : " + name + "\n" + "Job : " + job);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                // method to handle errors.
                Toast.makeText(TransferDetailsActivity.this, "Fail to get response = " + error, Toast.LENGTH_SHORT).show();
            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                // below line we are creating a map for
                // storing our values in key and value pair.
                Map<String, String> params = new HashMap<String, String>();

                // on below line we are passing our key
                // and value pair to our parameters.

                // ToDo { All Strings }

                params.put("amount", String.valueOf(transfer.getAmount()));
                params.put("currency", transfer.getCurrency());
                params.put("externalId", String.valueOf(transfer.getTransferId()));
                //params.put("payee", transfer.getPayee());
                params.put("payerMessage", transfer.getPayerMessage());
                params.put("payeeNote", transfer.getPayeeNote());

                // at last we are
                // returning our params.
                return params;
            }
        };
        // below line is to make
        // a json object request.
        queue.add(request);
    }

    private void doCreateAccessToken_POST() {
        // ToDo
        // url to post our data
        final String URL = "https://sandbox.momodeveloper.mtn.com/collection/token";

        //loadingPB.setVisibility(View.VISIBLE);

        // creating a new variable for our request queue
        //final String URL = "/volley/resource/12";
        // Post params to be sent to the server
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("token", "AbCdEfGh123456");

        JsonObjectRequest req = new JsonObjectRequest(URL, new JSONObject(params),
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            VolleyLog.v("Response:%n %s", response.toString(4));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.e("Error: ", error.getMessage());
            }
        });

        // add the request object to the queue to be executed
        ApplicationController.getInstance().addToRequestQueue(req);
    }
}

