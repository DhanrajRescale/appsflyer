package yj;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/* loaded from: classes.dex */
public final class l implements e {

    /* renamed from: a, reason: collision with root package name */
    public final ek.l f41666a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41667b;

    /* renamed from: c, reason: collision with root package name */
    public HttpURLConnection f41668c;

    /* renamed from: d, reason: collision with root package name */
    public InputStream f41669d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f41670e;

    public l(ek.l lVar, int i10) {
        this.f41666a = lVar;
        this.f41667b = i10;
    }

    @Override // yj.e
    public final Class a() {
        return InputStream.class;
    }

    public final InputStream b(URL url, int i10, URL url2, Map map) {
        if (i10 < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new IOException("In re-direct loop", null);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.f41668c = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            for (Map.Entry entry : map.entrySet()) {
                this.f41668c.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            this.f41668c.setConnectTimeout(this.f41667b);
            this.f41668c.setReadTimeout(this.f41667b);
            this.f41668c.setUseCaches(false);
            this.f41668c.setDoInput(true);
            this.f41668c.setInstanceFollowRedirects(false);
            this.f41668c.connect();
            this.f41669d = this.f41668c.getInputStream();
            if (this.f41670e) {
                return null;
            }
            int responseCode = this.f41668c.getResponseCode();
            int i11 = responseCode / 100;
            if (i11 == 2) {
                HttpURLConnection httpURLConnection = this.f41668c;
                if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                    this.f41669d = new rk.c(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
                } else {
                    if (Log.isLoggable("HttpUrlFetcher", 3)) {
                        Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                    }
                    this.f41669d = httpURLConnection.getInputStream();
                }
                return this.f41669d;
            }
            if (i11 == 3) {
                String headerField = this.f41668c.getHeaderField("Location");
                if (!TextUtils.isEmpty(headerField)) {
                    URL url3 = new URL(url, headerField);
                    c();
                    return b(url3, i10 + 1, url, map);
                }
                throw new IOException("Received empty or null redirect url", null);
            }
            if (responseCode == -1) {
                throw new IOException(jr.h.n("Http request failed with status code: ", responseCode), null);
            }
            throw new IOException(this.f41668c.getResponseMessage(), null);
        }
        throw new IOException("Too many (> 5) redirects!", null);
    }

    @Override // yj.e
    public final void c() {
        InputStream inputStream = this.f41669d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f41668c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f41668c = null;
    }

    @Override // yj.e
    public final void cancel() {
        this.f41670e = true;
    }

    @Override // yj.e
    public final void d(com.bumptech.glide.e eVar, d dVar) {
        StringBuilder sb2;
        ek.l lVar = this.f41666a;
        int i10 = rk.f.f33941b;
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            try {
                dVar.j(b(lVar.d(), 0, null, lVar.f15603b.a()));
            } catch (IOException e10) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e10);
                }
                dVar.e(e10);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    sb2 = new StringBuilder("Finished http url fetcher fetch in ");
                } else {
                    return;
                }
            }
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb2 = new StringBuilder("Finished http url fetcher fetch in ");
                sb2.append(rk.f.a(elapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sb2.toString());
            }
        } catch (Throwable th2) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + rk.f.a(elapsedRealtimeNanos));
            }
            throw th2;
        }
    }

    @Override // yj.e
    public final xj.a f() {
        return xj.a.f40287b;
    }
}
