package g5;

import android.net.Uri;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import e5.x;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import lp.o1;

/* loaded from: classes.dex */
public final class o extends b {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16598e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16599f;

    /* renamed from: g, reason: collision with root package name */
    public final int f16600g;

    /* renamed from: h, reason: collision with root package name */
    public final String f16601h;

    /* renamed from: i, reason: collision with root package name */
    public final q0.u f16602i;

    /* renamed from: j, reason: collision with root package name */
    public final q0.u f16603j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f16604k;

    /* renamed from: l, reason: collision with root package name */
    public final kp.h f16605l;

    /* renamed from: m, reason: collision with root package name */
    public HttpURLConnection f16606m;

    /* renamed from: n, reason: collision with root package name */
    public InputStream f16607n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f16608o;

    /* renamed from: p, reason: collision with root package name */
    public int f16609p;

    /* renamed from: q, reason: collision with root package name */
    public long f16610q;

    /* renamed from: r, reason: collision with root package name */
    public long f16611r;

    public o(String str, int i10, int i11, q0.u uVar) {
        super(true);
        this.f16601h = str;
        this.f16599f = i10;
        this.f16600g = i11;
        this.f16598e = false;
        this.f16602i = uVar;
        this.f16605l = null;
        this.f16603j = new q0.u(1);
        this.f16604k = false;
    }

    public static void x(HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection != null && (i10 = x.f15050a) >= 19 && i10 <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j10 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j10 <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                    superclass.getClass();
                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // g5.f
    public final void close() {
        try {
            InputStream inputStream = this.f16607n;
            if (inputStream != null) {
                long j10 = this.f16610q;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f16611r;
                }
                x(this.f16606m, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    int i10 = x.f15050a;
                    throw new HttpDataSource$HttpDataSourceException(e10, CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, 3);
                }
            }
        } finally {
            this.f16607n = null;
            t();
            if (this.f16608o) {
                this.f16608o = false;
                q();
            }
        }
    }

    @Override // g5.f
    public final Map h() {
        HttpURLConnection httpURLConnection = this.f16606m;
        if (httpURLConnection == null) {
            return o1.f25026g;
        }
        return new n(httpURLConnection.getHeaderFields());
    }

    @Override // g5.f
    public final Uri l() {
        HttpURLConnection httpURLConnection = this.f16606m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x014d A[Catch: IOException -> 0x0158, TRY_LEAVE, TryCatch #3 {IOException -> 0x0158, blocks: (B:26:0x0145, B:28:0x014d), top: B:25:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01bd  */
    @Override // g5.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long o(g5.i r24) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.o.o(g5.i):long");
    }

    @Override // b5.o
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.f16610q;
            if (j10 != -1) {
                long j11 = j10 - this.f16611r;
                if (j11 != 0) {
                    i11 = (int) Math.min(i11, j11);
                }
                return -1;
            }
            InputStream inputStream = this.f16607n;
            int i12 = x.f15050a;
            int read = inputStream.read(bArr, i10, i11);
            if (read == -1) {
                return -1;
            }
            this.f16611r += read;
            p(read);
            return read;
        } catch (IOException e10) {
            int i13 = x.f15050a;
            throw HttpDataSource$HttpDataSourceException.b(e10, 2);
        }
    }

    public final void t() {
        HttpURLConnection httpURLConnection = this.f16606m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                e5.m.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f16606m = null;
        }
    }

    public final URL u(URL url, String str) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new HttpDataSource$HttpDataSourceException(a3.a.f("Unsupported protocol redirect: ", protocol), 2001);
                }
                if (!this.f16598e && !protocol.equals(url.getProtocol())) {
                    throw new HttpDataSource$HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
                }
                return url2;
            } catch (MalformedURLException e10) {
                throw new HttpDataSource$HttpDataSourceException(e10, 2001, 1);
            }
        }
        throw new HttpDataSource$HttpDataSourceException("Null location redirect", 2001);
    }

    public final HttpURLConnection v(i iVar) {
        boolean z10;
        HttpURLConnection w10;
        i iVar2 = iVar;
        URL url = new URL(iVar2.f16569a.toString());
        int i10 = iVar2.f16571c;
        byte[] bArr = iVar2.f16572d;
        long j10 = iVar2.f16574f;
        long j11 = iVar2.f16575g;
        int i11 = 0;
        if ((iVar2.f16577i & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z11 = this.f16598e;
        boolean z12 = this.f16604k;
        if (!z11 && !z12) {
            return w(url, i10, bArr, j10, j11, z10, true, iVar2.f16573e);
        }
        URL url2 = url;
        int i12 = i10;
        byte[] bArr2 = bArr;
        while (true) {
            int i13 = i11 + 1;
            if (i11 <= 20) {
                Map map = iVar2.f16573e;
                URL url3 = url2;
                int i14 = i12;
                boolean z13 = z12;
                long j12 = j11;
                w10 = w(url2, i12, bArr2, j10, j11, z10, false, map);
                int responseCode = w10.getResponseCode();
                String headerField = w10.getHeaderField("Location");
                if ((i14 != 1 && i14 != 3) || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308)) {
                    if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    w10.disconnect();
                    if (z13 && responseCode == 302) {
                        i12 = i14;
                    } else {
                        bArr2 = null;
                        i12 = 1;
                    }
                    url2 = u(url3, headerField);
                } else {
                    w10.disconnect();
                    url2 = u(url3, headerField);
                    i12 = i14;
                }
                iVar2 = iVar;
                i11 = i13;
                z12 = z13;
                j11 = j12;
            } else {
                throw new HttpDataSource$HttpDataSourceException(new NoRouteToHostException(jr.h.n("Too many redirects: ", i13)), 2001, 1);
            }
        }
        return w10;
    }

    public final HttpURLConnection w(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) {
        String sb2;
        String str;
        boolean z12;
        String str2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        httpURLConnection.setConnectTimeout(this.f16599f);
        httpURLConnection.setReadTimeout(this.f16600g);
        HashMap hashMap = new HashMap();
        q0.u uVar = this.f16602i;
        if (uVar != null) {
            hashMap.putAll(uVar.a());
        }
        hashMap.putAll(this.f16603j.a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = r.f16616a;
        if (j10 == 0 && j11 == -1) {
            sb2 = null;
        } else {
            StringBuilder sb3 = new StringBuilder("bytes=");
            sb3.append(j10);
            sb3.append("-");
            if (j11 != -1) {
                sb3.append((j10 + j11) - 1);
            }
            sb2 = sb3.toString();
        }
        if (sb2 != null) {
            httpURLConnection.setRequestProperty("Range", sb2);
        }
        String str3 = this.f16601h;
        if (str3 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str3);
        }
        if (z10) {
            str = "gzip";
        } else {
            str = "identity";
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", str);
        httpURLConnection.setInstanceFollowRedirects(z11);
        if (bArr != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        httpURLConnection.setDoOutput(z12);
        int i11 = i.f16568k;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    str2 = "HEAD";
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str2 = "POST";
            }
        } else {
            str2 = "GET";
        }
        httpURLConnection.setRequestMethod(str2);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final void y(long j10) {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int min = (int) Math.min(j10, 4096);
            InputStream inputStream = this.f16607n;
            int i10 = x.f15050a;
            int read = inputStream.read(bArr, 0, min);
            if (!Thread.currentThread().isInterrupted()) {
                if (read != -1) {
                    j10 -= read;
                    p(read);
                } else {
                    throw new HttpDataSource$HttpDataSourceException();
                }
            } else {
                throw new HttpDataSource$HttpDataSourceException(new InterruptedIOException(), CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, 1);
            }
        }
    }
}
