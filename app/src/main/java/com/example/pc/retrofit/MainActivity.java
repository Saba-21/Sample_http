package com.example.pc.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;
import com.example.pc.retrofit.models.Models;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private TextView cod,name,id,sunset,sunrise,country,message,sys_id,type,dt,all,deg,speed,visibility,
            temp_max,temp_min,humidity,pressure,temp,base,icon,description,main,lon,lat,weather_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        final Call<Models> data = ApiClient.getInstance().getRetrofitApi().getData();

        data.enqueue(new Callback<Models>() {
            @Override
            public void onResponse(Call<Models> call, Response<Models> response) {
                lon.setText(lon.getText().toString()+"\t"+Double.toString(response.body().coord.getLon()));
                lat.setText(lat.getText().toString()+"\t"+Double.toString(response.body().coord.getLat()));
                weather_id.setText(weather_id.getText().toString()+"\t"+Integer.toString(response.body().weather.get(0).getId()));
                main.setText(main.getText().toString()+"\t"+response.body().weather.get(0).getMain());
                description.setText(description.getText().toString()+"\t"+response.body().weather.get(0).getDescription());
                icon.setText(icon.getText().toString()+"\t"+response.body().weather.get(0).getIcon());
                base.setText(base.getText().toString()+"\t"+response.body().getBase());
                temp.setText(temp.getText().toString()+"\t"+response.body().main.getTemp());
                pressure.setText(pressure.getText().toString()+"\t"+response.body().main.getPressure());
                humidity.setText(humidity.getText().toString()+"\t"+response.body().main.getHumidity());
                temp_min.setText(temp_min.getText().toString()+"\t"+Double.toString(response.body().main.getTempMin()));
                temp_max.setText(temp_max.getText().toString()+"\t"+Double.toString(response.body().main.getTempMax()));
                visibility.setText(visibility.getText().toString()+"\t"+Integer.toString(response.body().getVisibility()));
                speed.setText(speed.getText().toString()+"\t"+response.body().wind.getSpeed());
                deg.setText(deg.getText().toString()+"\t"+response.body().wind.getDeg());
                all.setText(all.getText().toString()+"\t"+response.body().clouds.getAll());
                dt.setText(dt.getText().toString()+"\t"+Integer.toString(response.body().getDt()));
                type.setText(type.getText().toString()+"\t"+response.body().sys.getType());
                sys_id.setText(sys_id.getText().toString()+"\t"+response.body().sys.getId());
                message.setText(message.getText().toString()+"\t"+response.body().sys.getMessage());
                country.setText(country.getText().toString()+"\t"+response.body().sys.getCountry());
                sunrise.setText(sunrise.getText().toString()+"\t"+response.body().sys.getSunrise());
                sunset.setText(sunset.getText().toString()+"\t"+response.body().sys.getSunset());
                id.setText(id.getText().toString()+"\t"+Integer.toString(response.body().getId()));
                name.setText(name.getText().toString()+"\t"+response.body().getName());
                cod.setText(cod.getText().toString()+"\t"+Integer.toString(response.body().getCod()));
            }

            @Override
            public void onFailure(Call<Models> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initView() {
        lon = (TextView) findViewById(R.id.lon);
        lat = (TextView) findViewById(R.id.lat);
        weather_id = (TextView) findViewById(R.id.weather_id);
        main = (TextView) findViewById(R.id.main);
        description = (TextView) findViewById(R.id.description);
        icon = (TextView) findViewById(R.id.icon);
        base = (TextView) findViewById(R.id.base);
        temp = (TextView) findViewById(R.id.temp);
        pressure = (TextView) findViewById(R.id.pressure);
        humidity = (TextView) findViewById(R.id.humidity);
        temp_min = (TextView) findViewById(R.id.temp_min);
        temp_max = (TextView) findViewById(R.id.temp_max);
        visibility = (TextView) findViewById(R.id.visibility);
        speed = (TextView) findViewById(R.id.speed);
        deg = (TextView) findViewById(R.id.deg);
        all = (TextView) findViewById(R.id.all);
        dt = (TextView) findViewById(R.id.dt);
        type = (TextView) findViewById(R.id.type);
        sys_id = (TextView) findViewById(R.id.sys_id);
        message = (TextView) findViewById(R.id.message);
        country = (TextView) findViewById(R.id.country);
        sunrise = (TextView) findViewById(R.id.sunrise);
        sunset = (TextView) findViewById(R.id.sunset);
        id = (TextView) findViewById(R.id.id);
        name = (TextView) findViewById(R.id.name);
        cod = (TextView) findViewById(R.id.cod);
    }
}
