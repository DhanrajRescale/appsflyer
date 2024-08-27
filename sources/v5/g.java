package v5;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import e5.x;
import java.util.HashMap;
import java.util.Locale;
import lp.j1;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f37712a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f37713b;

    /* renamed from: c, reason: collision with root package name */
    public final int f37714c;

    /* renamed from: d, reason: collision with root package name */
    public final e5.r f37715d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f37716e;

    public g(Context context) {
        Context applicationContext;
        String Q1;
        TelephonyManager telephonyManager;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.f37712a = applicationContext;
        int i10 = x.f15050a;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                Q1 = dp.b.Q1(networkCountryIso);
                int[] a10 = h.a(Q1);
                HashMap hashMap = new HashMap(8);
                hashMap.put(0, 1000000L);
                j1 j1Var = h.f37717n;
                hashMap.put(2, (Long) j1Var.get(a10[0]));
                hashMap.put(3, (Long) h.f37718o.get(a10[1]));
                hashMap.put(4, (Long) h.f37719p.get(a10[2]));
                hashMap.put(5, (Long) h.f37720q.get(a10[3]));
                hashMap.put(10, (Long) h.f37721r.get(a10[4]));
                hashMap.put(9, (Long) h.f37722s.get(a10[5]));
                hashMap.put(7, (Long) j1Var.get(a10[0]));
                this.f37713b = hashMap;
                this.f37714c = CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
                this.f37715d = e5.b.f15001a;
                this.f37716e = true;
            }
        }
        Q1 = dp.b.Q1(Locale.getDefault().getCountry());
        int[] a102 = h.a(Q1);
        HashMap hashMap2 = new HashMap(8);
        hashMap2.put(0, 1000000L);
        j1 j1Var2 = h.f37717n;
        hashMap2.put(2, (Long) j1Var2.get(a102[0]));
        hashMap2.put(3, (Long) h.f37718o.get(a102[1]));
        hashMap2.put(4, (Long) h.f37719p.get(a102[2]));
        hashMap2.put(5, (Long) h.f37720q.get(a102[3]));
        hashMap2.put(10, (Long) h.f37721r.get(a102[4]));
        hashMap2.put(9, (Long) h.f37722s.get(a102[5]));
        hashMap2.put(7, (Long) j1Var2.get(a102[0]));
        this.f37713b = hashMap2;
        this.f37714c = CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE;
        this.f37715d = e5.b.f15001a;
        this.f37716e = true;
    }
}
