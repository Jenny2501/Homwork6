package Lesson6;

public class Start6<http, params, pass, format, data> {
    http://api.occueWeather.org/data/2.5/find?q=Petersburg&type=like&APPID=AM7BS94IlNE2yuTvVnBHkp1VNJq171ac
            sun.net.www.protocol.http.AuthenticationInfo.requests.get("http://api.occueWeather.org/data/2.5/find",
    params={'q':Object s_city;
        s_city, 'type': 'like', 'units': 'metric', 'APPID': appid})

            try:
    res = requests.get("http://api.occueWeather.org/data/2.5/forecast",
    params={'id': city_id, 'units': 'metric', 'lang': 'ru', 'APPID': appid})
    data = res.json()
            for i in data['list']:
    <i> print(i['dt_txt'], '{0:+3.0f}'.format(i['main']['temp']), i['weather'][0]['description'] )
    except Exception as e:
    print("Exception (forecast):", e)
    pass
}
