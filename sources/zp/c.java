package zp;

import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzap;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final zzap f42722d;

    /* renamed from: a, reason: collision with root package name */
    public final String f42723a;

    /* renamed from: b, reason: collision with root package name */
    public final String f42724b;

    /* renamed from: c, reason: collision with root package name */
    public final String f42725c;

    static {
        HashMap hashMap = new HashMap();
        da.e.v(2, hashMap, "recoverEmail", 0, "resetPassword");
        da.e.v(4, hashMap, "signIn", 1, "verifyEmail");
        hashMap.put("verifyBeforeChangeEmail", 5);
        hashMap.put("revertSecondFactorAddition", 6);
        f42722d = zzap.zzc(hashMap.entrySet());
    }

    public c(String str) {
        String a10 = a(str, "apiKey");
        String a11 = a(str, "oobCode");
        String a12 = a(str, "mode");
        if (a10 != null && a11 != null && a12 != null) {
            Preconditions.checkNotEmpty(a10);
            this.f42723a = Preconditions.checkNotEmpty(a11);
            this.f42724b = Preconditions.checkNotEmpty(a12);
            a(str, "continueUrl");
            a(str, "languageCode");
            this.f42725c = a(str, "tenantId");
            return;
        }
        throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", "mode"));
    }

    public static String a(String str, String str2) {
        Uri parse = Uri.parse(str);
        try {
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return parse.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(Preconditions.checkNotEmpty(parse.getQueryParameter("link"))).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }
}
