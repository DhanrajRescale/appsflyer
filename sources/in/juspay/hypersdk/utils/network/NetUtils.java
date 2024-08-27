package in.juspay.hypersdk.utils.network;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import in.juspay.hypersdk.R;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import nn.d;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class NetUtils {
    private static String USER_AGENT;
    private int connectionTimeout;
    private int readTimeout;
    private final boolean sslPinningRequired;
    private SSLSocketFactory sslSocketFactory;

    static {
        String property = System.getProperty("http.agent");
        USER_AGENT = property;
        if (property == null || property.length() == 0) {
            USER_AGENT = "Juspay Express Checkout Android SDK";
        }
    }

    public NetUtils(int i10, int i11) {
        this(i10, i11, false);
    }

    private HttpsURLConnection doGetOrHead(@NonNull String str, Map<String, String> map, Map<String, String> map2, String str2, JSONObject jSONObject) {
        String generateQueryString = generateQueryString(map2);
        StringBuilder sb2 = new StringBuilder(str);
        if (generateQueryString.length() > 0) {
            str = d.o(sb2, "?", generateQueryString);
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpsURLConnection.setRequestMethod(str2);
        setDefaultSDKHeaders(httpsURLConnection);
        setTimeouts(httpsURLConnection, jSONObject);
        if (getSslSocketFactory() != null) {
            httpsURLConnection.setSSLSocketFactory(getSslSocketFactory());
        }
        if (map != null) {
            for (String str3 : map.keySet()) {
                httpsURLConnection.setRequestProperty(str3, map.get(str3));
            }
        }
        httpsURLConnection.connect();
        return httpsURLConnection;
    }

    private HttpsURLConnection initAndGetConnection(URL url) {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        setDefaultSDKHeaders(httpsURLConnection);
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setReadTimeout(this.readTimeout);
        httpsURLConnection.setConnectTimeout(this.connectionTimeout);
        if (getSslSocketFactory() != null) {
            httpsURLConnection.setSSLSocketFactory(getSslSocketFactory());
        }
        return httpsURLConnection;
    }

    private void setDefaultSDKHeaders(@NonNull HttpsURLConnection httpsURLConnection) {
        for (Map.Entry<String, String> entry : getDefaultSDKHeaders().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null && value != null) {
                httpsURLConnection.setRequestProperty(key, value);
            }
        }
    }

    private void setTimeouts(HttpsURLConnection httpsURLConnection, JSONObject jSONObject) {
        int optInt = jSONObject.optInt("connectionTimeout", -1);
        int optInt2 = jSONObject.optInt("readTimeout", -1);
        if (optInt != -1) {
            httpsURLConnection.setConnectTimeout(optInt);
        }
        if (optInt2 != -1) {
            httpsURLConnection.setReadTimeout(optInt2);
        }
    }

    public HttpsURLConnection deleteUrl(URL url, Map<String, String> map, String str, JSONObject jSONObject) {
        return doDelete(url, str.getBytes(), "application/x-www-form-urlencoded", map, jSONObject);
    }

    public HttpsURLConnection doDelete(URL url, byte[] bArr, String str, Map<String, String> map, JSONObject jSONObject) {
        HttpsURLConnection initAndGetConnection = initAndGetConnection(url);
        initAndGetConnection.setRequestMethod("DELETE");
        initAndGetConnection.setRequestProperty("Content-Type", str);
        setTimeouts(initAndGetConnection, jSONObject);
        if (getSslSocketFactory() != null) {
            initAndGetConnection.setSSLSocketFactory(getSslSocketFactory());
        }
        if (map != null) {
            for (String str2 : map.keySet()) {
                initAndGetConnection.setRequestProperty(str2, map.get(str2));
            }
        }
        if (bArr != null) {
            OutputStream outputStream = initAndGetConnection.getOutputStream();
            try {
                outputStream.write(bArr);
                outputStream.flush();
                outputStream.close();
            } catch (Throwable th2) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        initAndGetConnection.connect();
        return initAndGetConnection;
    }

    public HttpsURLConnection doGet(@NonNull String str, Map<String, String> map, Map<String, String> map2, JSONObject jSONObject) {
        return doGetOrHead(str, map, map2, "GET", jSONObject);
    }

    public HttpsURLConnection doHead(@NonNull String str, Map<String, String> map, Map<String, String> map2, JSONObject jSONObject) {
        return doGetOrHead(str, map, map2, "HEAD", jSONObject);
    }

    public HttpsURLConnection doPost(URL url, byte[] bArr, String str, Map<String, String> map, JSONObject jSONObject) {
        HttpsURLConnection initAndGetConnection = initAndGetConnection(url);
        setTimeouts(initAndGetConnection, jSONObject);
        initAndGetConnection.setRequestMethod("POST");
        initAndGetConnection.setRequestProperty("Content-Type", str);
        if (getSslSocketFactory() != null) {
            initAndGetConnection.setSSLSocketFactory(getSslSocketFactory());
        }
        if (map != null) {
            for (String str2 : map.keySet()) {
                initAndGetConnection.setRequestProperty(str2, map.get(str2));
            }
        }
        if (bArr != null) {
            OutputStream outputStream = initAndGetConnection.getOutputStream();
            try {
                outputStream.write(bArr);
                outputStream.flush();
                outputStream.close();
            } catch (Throwable th2) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        initAndGetConnection.connect();
        return initAndGetConnection;
    }

    public HttpsURLConnection doPut(@NonNull Context context, URL url, byte[] bArr, Map<String, String> map, NetUtils netUtils, JSONObject jSONObject) {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        setDefaultSDKHeaders(httpsURLConnection);
        setTimeouts(httpsURLConnection, jSONObject);
        httpsURLConnection.setRequestMethod("PUT");
        httpsURLConnection.setRequestProperty("X-App-Name", context.getString(R.string.godel_app_name));
        if (netUtils.getSslSocketFactory() != null) {
            httpsURLConnection.setSSLSocketFactory(netUtils.getSslSocketFactory());
        }
        if (map != null) {
            for (String str : map.keySet()) {
                httpsURLConnection.setRequestProperty(str, map.get(str));
            }
        }
        if (bArr != null) {
            OutputStream outputStream = httpsURLConnection.getOutputStream();
            try {
                outputStream.write(bArr);
                outputStream.flush();
                outputStream.close();
            } catch (Throwable th2) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        httpsURLConnection.connect();
        return httpsURLConnection;
    }

    public byte[] fetchIfModified(String str, Map<String, String> map) {
        HttpsURLConnection doGet = doGet(str, map, null, new JSONObject());
        if (doGet.getResponseCode() == 200) {
            return new JuspayHttpsResponse(doGet).responsePayload;
        }
        return null;
    }

    @Keep
    public String generateQueryString(Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (sb2.length() > 0) {
                    sb2.append('&');
                }
                sb2.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                sb2.append('=');
                sb2.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
            }
        }
        return sb2.toString();
    }

    public Map<String, String> getDefaultSDKHeaders() {
        HashMap hashMap = new HashMap();
        hashMap.put("User-Agent", USER_AGENT);
        hashMap.put("Accept-Language", "en-US,en;q=0.5");
        hashMap.put("X-Powered-By", "Juspay EC SDK for Android");
        return hashMap;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public HttpsURLConnection postForm(URL url, Map<String, String> map, JSONObject jSONObject) {
        return doPost(url, generateQueryString(map).getBytes(), "application/x-www-form-urlencoded", null, jSONObject);
    }

    public <T> HttpsURLConnection postJson(URL url, T t10, JSONObject jSONObject) {
        return doPost(url, t10.toString().getBytes(), "application/json", null, jSONObject);
    }

    public HttpsURLConnection postUrl(URL url, Map<String, String> map, String str, JSONObject jSONObject) {
        return doPost(url, str.getBytes(), "application/x-www-form-urlencoded", map, jSONObject);
    }

    public void setConnectionTimeout(int i10) {
        this.connectionTimeout = i10;
    }

    public void setReadTimeout(int i10) {
        this.readTimeout = i10;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public NetUtils(int i10, int i11, boolean z10) {
        this.connectionTimeout = i10;
        this.readTimeout = i11;
        this.sslPinningRequired = z10;
        this.sslSocketFactory = new JuspaySSLSocketFactory();
    }

    public HttpsURLConnection deleteUrl(URL url, Map<String, String> map, Map<String, String> map2, JSONObject jSONObject) {
        return doDelete(url, generateQueryString(map2).getBytes(), "application/json", map, jSONObject);
    }

    public HttpsURLConnection postUrl(URL url, Map<String, String> map, Map<String, String> map2, JSONObject jSONObject) {
        return doPost(url, generateQueryString(map2).getBytes(), "application/json", map, jSONObject);
    }

    public HttpsURLConnection deleteUrl(URL url, Map<String, String> map, JSONObject jSONObject) {
        return doDelete(url, generateQueryString(map).getBytes(), "application/x-www-form-urlencoded", null, jSONObject);
    }

    public HttpsURLConnection postUrl(URL url, Map<String, String> map, JSONObject jSONObject) {
        return doPost(url, generateQueryString(map).getBytes(), "application/x-www-form-urlencoded", null, jSONObject);
    }

    public HttpsURLConnection deleteUrl(URL url, JSONObject jSONObject) {
        return doDelete(url, null, "application/x-www-form-urlencoded", null, jSONObject);
    }

    public HttpsURLConnection postUrl(URL url, JSONObject jSONObject) {
        return doPost(url, null, "application/x-www-form-urlencoded", null, jSONObject);
    }
}
