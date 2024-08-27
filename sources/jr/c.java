package jr;

import android.util.Log;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.google.firebase.FirebaseException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Set f21578a;

    /* renamed from: b, reason: collision with root package name */
    public final HttpURLConnection f21579b;

    /* renamed from: c, reason: collision with root package name */
    public final i f21580c;

    /* renamed from: d, reason: collision with root package name */
    public final d f21581d;

    /* renamed from: e, reason: collision with root package name */
    public final m f21582e;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f21583f;

    /* renamed from: g, reason: collision with root package name */
    public final Random f21584g = new Random();

    public c(HttpURLConnection httpURLConnection, i iVar, d dVar, Set set, m mVar, ScheduledExecutorService scheduledExecutorService) {
        this.f21579b = httpURLConnection;
        this.f21580c = iVar;
        this.f21581d = dVar;
        this.f21578a = set;
        this.f21582e = mVar;
        this.f21583f = scheduledExecutorService;
    }

    public final void a(int i10, long j10) {
        if (i10 == 0) {
            new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.");
            d();
            return;
        }
        this.f21583f.schedule(new b(this, i10, j10), this.f21584g.nextInt(4), TimeUnit.SECONDS);
    }

    public final void b(InputStream inputStream) {
        JSONObject jSONObject;
        boolean isEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                break;
            }
            str = h.r(str, readLine);
            if (readLine.contains(UrlTreeKt.componentParamSuffix)) {
                int indexOf = str.indexOf(123);
                int lastIndexOf = str.lastIndexOf(125);
                String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                if (indexOf >= 0 && lastIndexOf >= 0 && indexOf < lastIndexOf) {
                    str2 = str.substring(indexOf, lastIndexOf + 1);
                }
                str = str2;
                if (!str.isEmpty()) {
                    try {
                        jSONObject = new JSONObject(str);
                    } catch (JSONException e10) {
                        new FirebaseException("Unable to parse config update message.", e10.getCause());
                        d();
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e10);
                    }
                    if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                        m mVar = this.f21582e;
                        new FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.");
                        mVar.a();
                        break;
                    }
                    synchronized (this) {
                        isEmpty = this.f21578a.isEmpty();
                    }
                    if (isEmpty) {
                        break;
                    }
                    if (jSONObject.has("latestTemplateVersionNumber")) {
                        long j10 = this.f21580c.f21614h.f21626a.getLong("last_template_version", 0L);
                        long j11 = jSONObject.getLong("latestTemplateVersionNumber");
                        if (j11 > j10) {
                            a(3, j11);
                        }
                    }
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    continue;
                }
            }
        }
        bufferedReader.close();
        inputStream.close();
    }

    public final void c() {
        HttpURLConnection httpURLConnection = this.f21579b;
        try {
            if (httpURLConnection == null) {
                return;
            }
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                b(inputStream);
                inputStream.close();
            } catch (IOException e10) {
                Log.d("FirebaseRemoteConfig", "Stream was cancelled due to an exception. Retrying the connection...", e10);
            }
        } finally {
            httpURLConnection.disconnect();
        }
    }

    public final synchronized void d() {
        Iterator it = this.f21578a.iterator();
        while (it.hasNext()) {
            ((m) it.next()).a();
        }
    }
}
