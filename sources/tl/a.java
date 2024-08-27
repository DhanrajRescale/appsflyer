package tl;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import in.juspay.hypersdk.core.PaymentConstants;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f36156a;

    /* renamed from: b, reason: collision with root package name */
    public String f36157b;

    /* renamed from: c, reason: collision with root package name */
    public Long f36158c;

    public a(String str) {
        Long valueOf = Long.valueOf(System.currentTimeMillis() / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT);
        this.f36158c = valueOf;
        this.f36157b = str;
        StringBuffer stringBuffer = new StringBuffer("error_log_");
        if (valueOf != null) {
            stringBuffer.append(valueOf.longValue());
            stringBuffer.append(".json");
            String stringBuffer2 = stringBuffer.toString();
            Intrinsics.checkNotNullExpressionValue(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
            this.f36156a = stringBuffer2;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l10 = this.f36158c;
            if (l10 != null) {
                jSONObject.put(PaymentConstants.TIMESTAMP, l10);
            }
            jSONObject.put("error_message", this.f36157b);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return super.toString();
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "params.toString()");
        return jSONObject2;
    }
}
