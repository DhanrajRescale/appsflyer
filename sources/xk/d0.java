package xk;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final String f40341e = d0.class.getCanonicalName();

    /* renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f40342a;

    /* renamed from: b, reason: collision with root package name */
    public final JSONObject f40343b;

    /* renamed from: c, reason: collision with root package name */
    public final q f40344c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f40345d;

    public d0(z request, HttpURLConnection httpURLConnection, JSONObject jSONObject, JSONArray jSONArray, q qVar) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f40342a = httpURLConnection;
        this.f40343b = jSONObject;
        this.f40344c = qVar;
        this.f40345d = jSONObject;
    }

    public final String toString() {
        String str;
        int responseCode;
        try {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.f40342a;
            if (httpURLConnection == null) {
                responseCode = 200;
            } else {
                responseCode = httpURLConnection.getResponseCode();
            }
            objArr[0] = Integer.valueOf(responseCode);
            str = String.format(locale, "%d", Arrays.copyOf(objArr, 1));
            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(locale, format, *args)");
        } catch (IOException unused) {
            str = "unknown";
        }
        StringBuilder s7 = da.e.s("{Response:  responseCode: ", str, ", graphObject: ");
        s7.append(this.f40343b);
        s7.append(", error: ");
        s7.append(this.f40344c);
        s7.append(UrlTreeKt.componentParamSuffix);
        String sb2 = s7.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder()\n        .append(\"{Response: \")\n        .append(\" responseCode: \")\n        .append(responseCode)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", error: \")\n        .append(error)\n        .append(\"}\")\n        .toString()");
        return sb2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d0(z request, HttpURLConnection httpURLConnection, String rawResponse, JSONObject jSONObject) {
        this(request, httpURLConnection, jSONObject, null, null);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(rawResponse, "rawResponse");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d0(z request, HttpURLConnection httpURLConnection, q error) {
        this(request, httpURLConnection, null, null, error);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(error, "error");
    }
}
