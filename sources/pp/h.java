package pp;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;
import in.juspay.hypersdk.core.PaymentConstants;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f31280a;

    /* renamed from: b, reason: collision with root package name */
    public final String f31281b;

    /* renamed from: c, reason: collision with root package name */
    public final String f31282c;

    /* renamed from: d, reason: collision with root package name */
    public final String f31283d;

    /* renamed from: e, reason: collision with root package name */
    public final String f31284e;

    /* renamed from: f, reason: collision with root package name */
    public final String f31285f;

    /* renamed from: g, reason: collision with root package name */
    public final String f31286g;

    public h(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f31281b = str;
        this.f31280a = str2;
        this.f31282c = str3;
        this.f31283d = str4;
        this.f31284e = str5;
        this.f31285f = str6;
        this.f31286g = str7;
    }

    public static h a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new h(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString(PaymentConstants.PROJECT_ID));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!Objects.equal(this.f31281b, hVar.f31281b) || !Objects.equal(this.f31280a, hVar.f31280a) || !Objects.equal(this.f31282c, hVar.f31282c) || !Objects.equal(this.f31283d, hVar.f31283d) || !Objects.equal(this.f31284e, hVar.f31284e) || !Objects.equal(this.f31285f, hVar.f31285f) || !Objects.equal(this.f31286g, hVar.f31286g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f31281b, this.f31280a, this.f31282c, this.f31283d, this.f31284e, this.f31285f, this.f31286g);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f31281b).add("apiKey", this.f31280a).add("databaseUrl", this.f31282c).add("gcmSenderId", this.f31284e).add("storageBucket", this.f31285f).add("projectId", this.f31286g).toString();
    }
}
