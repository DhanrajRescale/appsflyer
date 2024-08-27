package in.juspay.hypersdk.utils.network;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class JuspayHttpsResponse {
    private static final String LOG_TAG = "JuspayHttpsResponse";
    public final Map<String, List<String>> headers;
    public final int responseCode;
    public final byte[] responsePayload;

    public JuspayHttpsResponse(int i10, @NonNull byte[] bArr, Map<String, List<String>> map) {
        this.responseCode = i10;
        this.responsePayload = bArr;
        this.headers = map;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("responseCode", this.responseCode);
            jSONObject.put("responsePayload", this.responsePayload);
            jSONObject.put("headers", this.headers);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    /* JADX WARN: Finally extract failed */
    public JuspayHttpsResponse(HttpsURLConnection httpsURLConnection) {
        int responseCode = httpsURLConnection.getResponseCode();
        this.responseCode = responseCode;
        this.headers = httpsURLConnection.getHeaderFields();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(((responseCode < 200 || responseCode >= 300) && responseCode != 302) ? httpsURLConnection.getErrorStream() : httpsURLConnection.getInputStream());
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                String contentEncoding = httpsURLConnection.getContentEncoding();
                if (contentEncoding == null || !contentEncoding.equals("gzip")) {
                    byte[] bArr = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
                    while (true) {
                        int read = bufferedInputStream.read(bArr, 0, UserMetadata.MAX_ATTRIBUTE_SIZE);
                        if (read == -1) {
                            break;
                        } else {
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                    }
                    this.responsePayload = byteArrayOutputStream.toByteArray();
                } else {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(bufferedInputStream);
                    try {
                        byte[] bArr2 = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
                        while (true) {
                            int read2 = gZIPInputStream.read(bArr2);
                            if (read2 < 0) {
                                break;
                            } else {
                                byteArrayOutputStream.write(bArr2, 0, read2);
                            }
                        }
                        this.responsePayload = byteArrayOutputStream.toByteArray();
                        gZIPInputStream.close();
                    } catch (Throwable th2) {
                        try {
                            gZIPInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                bufferedInputStream.close();
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th7) {
                th6.addSuppressed(th7);
            }
            throw th6;
        }
    }
}
