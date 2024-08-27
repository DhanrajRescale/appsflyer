package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class zzabo {
    public static void zza(String str, zzabl zzablVar, Type type, zzaau zzaauVar) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(60000);
            zzaauVar.zza(httpURLConnection);
            zzc(httpURLConnection, zzablVar, type);
        } catch (SocketTimeoutException unused) {
            zzablVar.zza("TIMEOUT");
        } catch (UnknownHostException unused2) {
            zzablVar.zza("<<Network Error>>");
        } catch (IOException e10) {
            zzablVar.zza(e10.getMessage());
        }
    }

    public static void zzb(String str, zzaaq zzaaqVar, zzabl zzablVar, Type type, zzaau zzaauVar) {
        try {
            Preconditions.checkNotNull(zzaaqVar);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = zzaaqVar.zza().getBytes(Charset.defaultCharset());
            int length = bytes.length;
            httpURLConnection.setFixedLengthStreamingMode(length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(60000);
            zzaauVar.zza(httpURLConnection);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), length);
            try {
                bufferedOutputStream.write(bytes, 0, length);
                bufferedOutputStream.close();
                zzc(httpURLConnection, zzablVar, type);
            } catch (Throwable th2) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th3) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                }
                throw th2;
            }
        } catch (NullPointerException e10) {
            e = e10;
            zzablVar.zza(e.getMessage());
        } catch (SocketTimeoutException unused) {
            zzablVar.zza("TIMEOUT");
        } catch (UnknownHostException unused2) {
            zzablVar.zza("<<Network Error>>");
        } catch (IOException e11) {
            e = e11;
            zzablVar.zza(e.getMessage());
        } catch (JSONException e12) {
            e = e12;
            zzablVar.zza(e.getMessage());
        }
    }

    private static void zzc(HttpURLConnection httpURLConnection, zzabl zzablVar, Type type) {
        InputStream errorStream;
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (zzd(responseCode)) {
                    errorStream = httpURLConnection.getInputStream();
                } else {
                    errorStream = httpURLConnection.getErrorStream();
                }
                StringBuilder sb2 = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, "UTF-8"));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        } else {
                            sb2.append(readLine);
                        }
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th3) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                        }
                        throw th2;
                    }
                }
                bufferedReader.close();
                String sb3 = sb2.toString();
                if (!zzd(responseCode)) {
                    zzablVar.zza((String) zzaap.zza(sb3, String.class));
                } else {
                    zzablVar.zzb((zzaar) zzaap.zza(sb3, type));
                }
                httpURLConnection.disconnect();
            } catch (zzyi e10) {
                e = e10;
                zzablVar.zza(e.getMessage());
                httpURLConnection.disconnect();
            } catch (SocketTimeoutException unused) {
                zzablVar.zza("TIMEOUT");
                httpURLConnection.disconnect();
            } catch (IOException e11) {
                e = e11;
                zzablVar.zza(e.getMessage());
                httpURLConnection.disconnect();
            }
        } catch (Throwable th4) {
            httpURLConnection.disconnect();
            throw th4;
        }
    }

    private static final boolean zzd(int i10) {
        return i10 >= 200 && i10 < 300;
    }
}
