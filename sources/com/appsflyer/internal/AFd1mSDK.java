package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import vt.g0;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\n\u001a\u00020\f\u0012\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u0006\u001a\u00020\u0002*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0006\u0010\u000bR\u0012\u0010\u0006\u001a\u00020\fX\u0087\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012X\u0087\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0097D¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0006\u0010\u0004R\u0011\u0010\r\u001a\u00020\u0016X\u0007¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0018"}, d2 = {"Lcom/appsflyer/internal/AFd1mSDK;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "AFKeystoreWrapper", "()Z", HttpUrl.FRAGMENT_ENCODE_SET, "AFInAppEventType", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/net/HttpURLConnection;", HttpUrl.FRAGMENT_ENCODE_SET, "p0", "(Ljava/net/HttpURLConnection;J)Z", HttpUrl.FRAGMENT_ENCODE_SET, "AFInAppEventParameterName", "[B", "Lcom/appsflyer/internal/AFe1uSDK;", "values", "()Lcom/appsflyer/internal/AFe1uSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "valueOf", "Ljava/util/Map;", "Z", HttpUrl.FRAGMENT_ENCODE_SET, "I", "()Ljava/lang/String;", "AFLogger", "p1", "p2", "<init>", "([BLjava/util/Map;I)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AFd1mSDK {

    /* renamed from: AFInAppEventParameterName, reason: from kotlin metadata */
    @NotNull
    public byte[] AFInAppEventType;

    /* renamed from: AFInAppEventType, reason: from kotlin metadata */
    private final boolean AFKeystoreWrapper;
    public Map<String, String> valueOf;

    /* renamed from: values, reason: from kotlin metadata */
    public int AFInAppEventParameterName;

    public AFd1mSDK(@NotNull byte[] bArr, Map<String, String> map, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "");
        this.AFInAppEventType = bArr;
        this.valueOf = map;
        this.AFInAppEventParameterName = i10;
        this.AFKeystoreWrapper = true;
    }

    @NotNull
    public abstract String AFInAppEventParameterName();

    @NotNull
    public abstract String AFInAppEventType(@NotNull String str);

    /* renamed from: AFInAppEventType, reason: from getter */
    public boolean getAFKeystoreWrapper() {
        return this.AFKeystoreWrapper;
    }

    public final boolean AFKeystoreWrapper() {
        HttpURLConnection httpURLConnection;
        Throwable th2;
        int i10;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            String AFInAppEventParameterName = AFInAppEventParameterName();
            Intrinsics.checkNotNullParameter(AFInAppEventParameterName, "");
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(AFInAppEventParameterName).openConnection());
            if (uRLConnection != null) {
                httpURLConnection = (HttpURLConnection) uRLConnection;
                try {
                    boolean AFInAppEventType = AFInAppEventType(httpURLConnection, currentTimeMillis);
                    httpURLConnection.disconnect();
                    return AFInAppEventType;
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                        StringBuilder sb2 = new StringBuilder("error: ");
                        sb2.append(th2);
                        sb2.append("\n\ttook ");
                        sb2.append(currentTimeMillis2);
                        sb2.append("ms\n\t");
                        sb2.append(th2.getMessage());
                        String obj = sb2.toString();
                        StringBuilder sb3 = new StringBuilder("HTTP: [");
                        if (httpURLConnection != null) {
                            i10 = httpURLConnection.hashCode();
                        } else {
                            i10 = 0;
                        }
                        sb3.append(i10);
                        sb3.append("] ");
                        sb3.append(obj);
                        String AFInAppEventType2 = AFInAppEventType(sb3.toString());
                        if (getAFKeystoreWrapper()) {
                            AFLogger.afRDLog(AFInAppEventType2);
                        } else {
                            AFLogger.afVerboseLog(AFInAppEventType2);
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        return false;
                    } catch (Throwable th4) {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        throw th4;
                    }
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        } catch (Throwable th5) {
            httpURLConnection = null;
            th2 = th5;
        }
    }

    @NotNull
    public abstract AFe1uSDK values();

    private final boolean AFInAppEventType(HttpURLConnection httpURLConnection, long j10) {
        InputStream errorStream;
        httpURLConnection.setRequestMethod("POST");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(httpURLConnection.getRequestMethod());
        sb2.append(':');
        sb2.append(httpURLConnection.getURL());
        StringBuilder sb3 = new StringBuilder(sb2.toString());
        sb3.append("\n length: ");
        sb3.append(new String(this.AFInAppEventType, Charsets.UTF_8).length());
        Map<String, String> map = this.valueOf;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb3.append("\n ");
                sb3.append(entry.getKey());
                sb3.append(": ");
                sb3.append(entry.getValue());
            }
        }
        StringBuilder sb4 = new StringBuilder("HTTP: [");
        sb4.append(httpURLConnection.hashCode());
        sb4.append("] ");
        sb4.append((Object) sb3);
        String AFInAppEventType = AFInAppEventType(sb4.toString());
        if (getAFKeystoreWrapper()) {
            AFLogger.afRDLog(AFInAppEventType);
        } else {
            AFLogger.afVerboseLog(AFInAppEventType);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(this.AFInAppEventParameterName);
        httpURLConnection.setConnectTimeout(this.AFInAppEventParameterName);
        httpURLConnection.addRequestProperty("Content-Type", values().AFInAppEventType);
        Map<String, String> map2 = this.valueOf;
        if (map2 != null) {
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                httpURLConnection.addRequestProperty(entry2.getKey(), entry2.getValue());
            }
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(this.AFInAppEventType.length));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        Intrinsics.checkNotNullExpressionValue(outputStream, "");
        BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, UserMetadata.MAX_INTERNAL_KEY_SIZE);
        bufferedOutputStream.write(this.AFInAppEventType);
        bufferedOutputStream.close();
        if (AFd1eSDK.values(httpURLConnection)) {
            errorStream = httpURLConnection.getInputStream();
        } else {
            errorStream = httpURLConnection.getErrorStream();
        }
        if (errorStream != null) {
            Intrinsics.checkNotNullExpressionValue(errorStream, "");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, Charsets.UTF_8), UserMetadata.MAX_INTERNAL_KEY_SIZE);
            String B = g0.B(fu.n.a(bufferedReader), null, null, null, null, 63);
            bufferedReader.close();
            if (B != null) {
                str = B;
            }
        }
        long currentTimeMillis = System.currentTimeMillis() - j10;
        StringBuilder sb5 = new StringBuilder("response code:");
        sb5.append(httpURLConnection.getResponseCode());
        sb5.append(' ');
        sb5.append(httpURLConnection.getResponseMessage());
        sb5.append("\n\tbody:");
        sb5.append(str);
        sb5.append("\n\ttook ");
        sb5.append(currentTimeMillis);
        sb5.append("ms");
        String obj = sb5.toString();
        StringBuilder sb6 = new StringBuilder("HTTP: [");
        sb6.append(httpURLConnection.hashCode());
        sb6.append("] ");
        sb6.append(obj);
        String AFInAppEventType2 = AFInAppEventType(sb6.toString());
        if (getAFKeystoreWrapper()) {
            AFLogger.afRDLog(AFInAppEventType2);
        } else {
            AFLogger.afVerboseLog(AFInAppEventType2);
        }
        return AFd1eSDK.values(httpURLConnection);
    }
}
