package wl;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.assetgro.stockgro.prod.R;
import com.facebook.CustomTabMainActivity;
import com.facebook.FacebookException;
import in.juspay.hyper.constants.Labels;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;
import nl.n0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class t implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<t> CREATOR = new zi.j(15);

    /* renamed from: a, reason: collision with root package name */
    public c0[] f39276a;

    /* renamed from: b, reason: collision with root package name */
    public int f39277b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.fragment.app.g0 f39278c;

    /* renamed from: d, reason: collision with root package name */
    public dj.e f39279d;

    /* renamed from: e, reason: collision with root package name */
    public v f39280e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f39281f;

    /* renamed from: g, reason: collision with root package name */
    public q f39282g;

    /* renamed from: h, reason: collision with root package name */
    public Map f39283h;

    /* renamed from: i, reason: collision with root package name */
    public LinkedHashMap f39284i;

    /* renamed from: j, reason: collision with root package name */
    public x f39285j;

    /* renamed from: k, reason: collision with root package name */
    public int f39286k;

    /* renamed from: l, reason: collision with root package name */
    public int f39287l;

    public final void a(String str, String str2, boolean z10) {
        Map map = this.f39283h;
        if (map == null) {
            map = new HashMap();
        }
        if (this.f39283h == null) {
            this.f39283h = map;
        }
        if (map.containsKey(str) && z10) {
            str2 = map.get(str) + ',' + str2;
        }
        map.put(str, str2);
    }

    public final boolean b() {
        String string;
        String string2;
        if (this.f39281f) {
            return true;
        }
        Intrinsics.checkNotNullParameter("android.permission.INTERNET", Labels.System.PERMISSION);
        androidx.fragment.app.j0 e10 = e();
        if (e10 == null || e10.checkCallingOrSelfPermission("android.permission.INTERNET") != 0) {
            androidx.fragment.app.j0 e11 = e();
            if (e11 == null) {
                string = null;
            } else {
                string = e11.getString(R.string.com_facebook_internet_permission_error_title);
            }
            if (e11 == null) {
                string2 = null;
            } else {
                string2 = e11.getString(R.string.com_facebook_internet_permission_error_message);
            }
            Parcelable.Creator<s> creator = s.CREATOR;
            c(ll.e.f(this.f39282g, string, string2, null));
            return false;
        }
        this.f39281f = true;
        return true;
    }

    public final void c(s outcome) {
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        c0 f10 = f();
        if (f10 != null) {
            i(f10.e(), outcome.f39268a.f39267a, outcome.f39271d, outcome.f39272e, f10.f39161a);
        }
        Map map = this.f39283h;
        if (map != null) {
            outcome.f39274g = map;
        }
        LinkedHashMap linkedHashMap = this.f39284i;
        if (linkedHashMap != null) {
            outcome.f39275h = linkedHashMap;
        }
        this.f39276a = null;
        int i10 = -1;
        this.f39277b = -1;
        this.f39282g = null;
        this.f39283h = null;
        this.f39286k = 0;
        this.f39287l = 0;
        dj.e eVar = this.f39279d;
        if (eVar != null) {
            w this$0 = (w) eVar.f14394b;
            int i11 = w.f39292f;
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(outcome, "outcome");
            this$0.f39294b = null;
            if (outcome.f39268a == r.CANCEL) {
                i10 = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.facebook.LoginFragment:Result", outcome);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            androidx.fragment.app.j0 activity = this$0.getActivity();
            if (this$0.isAdded() && activity != null) {
                activity.setResult(i10, intent);
                activity.finish();
            }
        }
    }

    public final void d(s pendingResult) {
        s sVar;
        Intrinsics.checkNotNullParameter(pendingResult, "outcome");
        if (pendingResult.f39269b != null) {
            Date date = xk.a.f40309l;
            if (ek.h.x()) {
                Intrinsics.checkNotNullParameter(pendingResult, "pendingResult");
                xk.a aVar = pendingResult.f39269b;
                if (aVar != null) {
                    xk.a q10 = ek.h.q();
                    if (q10 != null) {
                        try {
                            if (Intrinsics.a(q10.f40320i, aVar.f40320i)) {
                                Parcelable.Creator<s> creator = s.CREATOR;
                                sVar = new s(this.f39282g, r.SUCCESS, aVar, pendingResult.f39270c, null, null);
                                c(sVar);
                                return;
                            }
                        } catch (Exception e10) {
                            Parcelable.Creator<s> creator2 = s.CREATOR;
                            c(ll.e.f(this.f39282g, "Caught exception", e10.getMessage(), null));
                            return;
                        }
                    }
                    Parcelable.Creator<s> creator3 = s.CREATOR;
                    sVar = ll.e.f(this.f39282g, "User logged in as different Facebook user.", null, null);
                    c(sVar);
                    return;
                }
                throw new FacebookException("Can't validate without a token");
            }
        }
        c(pendingResult);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final androidx.fragment.app.j0 e() {
        androidx.fragment.app.g0 g0Var = this.f39278c;
        if (g0Var == null) {
            return null;
        }
        return g0Var.getActivity();
    }

    public final c0 f() {
        c0[] c0VarArr;
        int i10 = this.f39277b;
        if (i10 < 0 || (c0VarArr = this.f39276a) == null) {
            return null;
        }
        return c0VarArr[i10];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r1, r2) != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final wl.x h() {
        /*
            r4 = this;
            wl.x r0 = r4.f39285j
            if (r0 == 0) goto L22
            boolean r1 = sl.a.b(r0)
            r2 = 0
            if (r1 == 0) goto Ld
        Lb:
            r1 = r2
            goto L15
        Ld:
            java.lang.String r1 = r0.f39299a     // Catch: java.lang.Throwable -> L10
            goto L15
        L10:
            r1 = move-exception
            sl.a.a(r0, r1)
            goto Lb
        L15:
            wl.q r3 = r4.f39282g
            if (r3 != 0) goto L1a
            goto L1c
        L1a:
            java.lang.String r2 = r3.f39248d
        L1c:
            boolean r1 = kotlin.jvm.internal.Intrinsics.a(r1, r2)
            if (r1 != 0) goto L3e
        L22:
            wl.x r0 = new wl.x
            androidx.fragment.app.j0 r1 = r4.e()
            if (r1 != 0) goto L2e
            android.content.Context r1 = com.facebook.FacebookSdk.getApplicationContext()
        L2e:
            wl.q r2 = r4.f39282g
            if (r2 != 0) goto L37
            java.lang.String r2 = com.facebook.FacebookSdk.getApplicationId()
            goto L39
        L37:
            java.lang.String r2 = r2.f39248d
        L39:
            r0.<init>(r1, r2)
            r4.f39285j = r0
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wl.t.h():wl.x");
    }

    public final void i(String str, String str2, String str3, String str4, HashMap hashMap) {
        q qVar = this.f39282g;
        String str5 = "fb_mobile_login_method_complete";
        if (qVar == null) {
            h().a("fb_mobile_login_method_complete", str);
            return;
        }
        x h10 = h();
        String str6 = qVar.f39249e;
        if (qVar.f39257m) {
            str5 = "foa_mobile_login_method_complete";
        }
        if (!sl.a.b(h10)) {
            try {
                ScheduledExecutorService scheduledExecutorService = x.f39298d;
                Bundle a10 = ll.e.a(str6);
                if (str2 != null) {
                    a10.putString("2_result", str2);
                }
                if (str3 != null) {
                    a10.putString("5_error_message", str3);
                }
                if (str4 != null) {
                    a10.putString("4_error_code", str4);
                }
                if (hashMap != null && (!hashMap.isEmpty())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        if (((String) entry.getKey()) != null) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    a10.putString("6_extras", new JSONObject(linkedHashMap).toString());
                }
                a10.putString("3_method", str);
                h10.f39300b.a(a10, str5);
            } catch (Throwable th2) {
                sl.a.a(h10, th2);
            }
        }
    }

    public final void j(int i10, int i11, Intent intent) {
        this.f39286k++;
        if (this.f39282g != null) {
            if (intent != null && intent.getBooleanExtra(CustomTabMainActivity.f10872i, false)) {
                k();
                return;
            }
            c0 f10 = f();
            if (f10 != null) {
                if (!(f10 instanceof o) || intent != null || this.f39286k >= this.f39287l) {
                    f10.i(i10, i11, intent);
                }
            }
        }
    }

    public final void k() {
        String str;
        String str2;
        c0 f10 = f();
        if (f10 != null) {
            i(f10.e(), "skipped", null, null, f10.f39161a);
        }
        c0[] c0VarArr = this.f39276a;
        while (c0VarArr != null) {
            int i10 = this.f39277b;
            if (i10 >= c0VarArr.length - 1) {
                break;
            }
            this.f39277b = i10 + 1;
            c0 f11 = f();
            if (f11 != null) {
                if ((f11 instanceof j0) && !b()) {
                    a("no_internet_permission", "1", false);
                } else {
                    q qVar = this.f39282g;
                    if (qVar == null) {
                        continue;
                    } else {
                        int l10 = f11.l(qVar);
                        this.f39286k = 0;
                        String str3 = qVar.f39249e;
                        if (l10 > 0) {
                            x h10 = h();
                            String e10 = f11.e();
                            if (qVar.f39257m) {
                                str2 = "foa_mobile_login_method_start";
                            } else {
                                str2 = "fb_mobile_login_method_start";
                            }
                            if (!sl.a.b(h10)) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService = x.f39298d;
                                    Bundle a10 = ll.e.a(str3);
                                    a10.putString("3_method", e10);
                                    h10.f39300b.a(a10, str2);
                                } catch (Throwable th2) {
                                    sl.a.a(h10, th2);
                                }
                            }
                            this.f39287l = l10;
                        } else {
                            x h11 = h();
                            String e11 = f11.e();
                            if (qVar.f39257m) {
                                str = "foa_mobile_login_method_not_tried";
                            } else {
                                str = "fb_mobile_login_method_not_tried";
                            }
                            if (!sl.a.b(h11)) {
                                try {
                                    ScheduledExecutorService scheduledExecutorService2 = x.f39298d;
                                    Bundle a11 = ll.e.a(str3);
                                    a11.putString("3_method", e11);
                                    h11.f39300b.a(a11, str);
                                } catch (Throwable th3) {
                                    sl.a.a(h11, th3);
                                }
                            }
                            a("not_tried", f11.e(), true);
                        }
                        if (l10 > 0) {
                            return;
                        }
                    }
                }
            }
        }
        q qVar2 = this.f39282g;
        if (qVar2 != null) {
            Parcelable.Creator<s> creator = s.CREATOR;
            c(ll.e.f(qVar2, "Login attempt failed.", null, null));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelableArray(this.f39276a, i10);
        dest.writeInt(this.f39277b);
        dest.writeParcelable(this.f39282g, i10);
        n0.V(dest, this.f39283h);
        n0.V(dest, this.f39284i);
    }
}
