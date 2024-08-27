package ek;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.airbnb.deeplinkdispatch.UrlTreeKt;
import com.facebook.FacebookSdk;
import com.firebase.ui.auth.FirebaseUiException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.RecaptchaActivity;
import d4.d3;
import d4.n1;
import d4.w0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class u implements xj.c, x, i0, lk.i, Continuation, mo.d0, qo.a, OnFailureListener, et.d, nv.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15626a;

    /* renamed from: b, reason: collision with root package name */
    public Object f15627b;

    public u(aq.g0 g0Var) {
        this.f15626a = 14;
        Preconditions.checkNotNull(g0Var);
        this.f15627b = g0Var;
    }

    public static void A(Object... objArr) {
        for (u uVar : qv.a.f32311a) {
            uVar.getClass();
            A(objArr);
        }
    }

    public static boolean B(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    public static String G(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    public static void H(Object... objArr) {
        for (u uVar : qv.a.f32311a) {
            uVar.getClass();
            H(objArr);
        }
    }

    public static void j(ArrayList arrayList, String str, boolean z10) {
        if (arrayList.remove(str)) {
            if (z10) {
                arrayList.add(0, str);
            } else {
                arrayList.add(str);
            }
        }
    }

    public static void k(Object... objArr) {
        for (u uVar : qv.a.f32311a) {
            uVar.getClass();
            k(objArr);
        }
    }

    public static void l(Object... objArr) {
        for (u uVar : qv.a.f32311a) {
            uVar.getClass();
            l(objArr);
        }
    }

    public final synchronized Set C() {
        Set keySet;
        keySet = ((HashMap) this.f15627b).keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "stateMap.keys");
        return keySet;
    }

    public final Bundle D() {
        Bundle bundle = new Bundle((Bundle) this.f15627b);
        for (String str : ((Bundle) this.f15627b).keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public final void E(Exception exc) {
        cq.g gVar = (cq.g) this.f15627b;
        int i10 = cq.g.f13055i;
        gVar.getClass();
        if (a3.i.f154f.r(gVar, null, new a3.d(exc))) {
            a3.i.d(gVar);
        }
    }

    public final Task F(Task task) {
        boolean z10;
        boolean z11;
        int i10 = 0;
        switch (this.f15626a) {
            case 5:
                zp.e eVar = (zp.e) task.getResult();
                aq.g0 g0Var = ((aq.d0) eVar).f2698a;
                String str = g0Var.f2717b.f2704c;
                Uri photoUrl = g0Var.getPhotoUrl();
                if (!TextUtils.isEmpty(str) && photoUrl != null) {
                    return Tasks.forResult(eVar);
                }
                am.e eVar2 = ((zl.d) this.f15627b).f42563a;
                if (TextUtils.isEmpty(str)) {
                    str = eVar2.f767d;
                }
                if (photoUrl == null) {
                    photoUrl = eVar2.f768e;
                }
                String str2 = null;
                if (str == null) {
                    z10 = true;
                    str = null;
                } else {
                    z10 = false;
                }
                if (photoUrl == null) {
                    z11 = true;
                    photoUrl = null;
                } else {
                    z11 = false;
                }
                if (photoUrl != null) {
                    str2 = photoUrl.toString();
                }
                zp.x xVar = new zp.x(str, str2, z10, z11);
                Preconditions.checkNotNull(xVar);
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(pp.g.e(g0Var.f2718c));
                firebaseAuth.getClass();
                Preconditions.checkNotNull(g0Var);
                Preconditions.checkNotNull(xVar);
                return firebaseAuth.f11631e.zzN(firebaseAuth.f11627a, g0Var, xVar, new zp.z(firebaseAuth, i10)).addOnFailureListener(new m5.t("ProfileMerger", "Error updating profile", 1)).continueWithTask(new bm.e(eVar, i10));
            default:
                List list = ((aq.e) task.getResult()).f2701a;
                if (list == null) {
                    list = new ArrayList();
                }
                ArrayList arrayList = new ArrayList(((am.b) this.f15627b).f742b.size());
                Iterator it = ((am.b) this.f15627b).f742b.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zl.b) it.next()).f42555a);
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    String N0 = el.l.N0((String) it2.next());
                    if (arrayList.contains(N0)) {
                        arrayList2.add(0, N0);
                    }
                }
                if (arrayList.contains("emailLink") && list.contains("password") && !list.contains("emailLink")) {
                    arrayList2.add(0, el.l.N0("emailLink"));
                }
                if (task.isSuccessful() && arrayList2.isEmpty() && !list.isEmpty()) {
                    return Tasks.forException(new FirebaseUiException(3));
                }
                j(arrayList2, "password", true);
                j(arrayList2, "google.com", true);
                j(arrayList2, "emailLink", false);
                return Tasks.forResult(arrayList2);
        }
    }

    @Override // nv.j
    public final Object a(nv.c0 c0Var) {
        nv.l lVar = new nv.l(c0Var);
        c0Var.v(new ep.m(0, this, lVar));
        return lVar;
    }

    @Override // et.d
    public final Object apply(Object obj) {
        Object apply = ((et.d) ((lt.i) this.f15627b).f25394b).apply(new Object[]{obj});
        gt.e.a(apply, "The zipper returned a null value");
        return apply;
    }

    @Override // qo.a
    public final void b(Typeface typeface) {
        mo.b bVar = (mo.b) this.f15627b;
        if (bVar.m(typeface)) {
            bVar.i(false);
        }
    }

    @Override // nv.j
    public final Type d() {
        return (Type) this.f15627b;
    }

    public final synchronized void e(yk.t tVar) {
        Set<Map.Entry> set = null;
        if (!sl.a.b(tVar)) {
            try {
                Set entrySet = tVar.f41725a.entrySet();
                Intrinsics.checkNotNullExpressionValue(entrySet, "events.entries");
                set = entrySet;
            } catch (Throwable th2) {
                sl.a.a(tVar, th2);
            }
        }
        for (Map.Entry entry : set) {
            yk.u x10 = x((yk.b) entry.getKey());
            if (x10 != null) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    x10.a((yk.e) it.next());
                }
            }
        }
    }

    @Override // ek.x
    public final w f(c0 c0Var) {
        return new j0(this);
    }

    @Override // mo.d0
    public final d3 g(View view, d3 d3Var, v5.i iVar) {
        int i10;
        iVar.f37740d = d3Var.a() + iVar.f37740d;
        WeakHashMap weakHashMap = n1.f13788a;
        boolean z10 = true;
        if (w0.d(view) != 1) {
            z10 = false;
        }
        int b10 = d3Var.b();
        int c10 = d3Var.c();
        int i11 = iVar.f37737a;
        if (z10) {
            i10 = c10;
        } else {
            i10 = b10;
        }
        int i12 = i11 + i10;
        iVar.f37737a = i12;
        int i13 = iVar.f37739c;
        if (!z10) {
            b10 = c10;
        }
        int i14 = i13 + b10;
        iVar.f37739c = i14;
        w0.k(view, i12, iVar.f37738b, i14, iVar.f37740d);
        return d3Var;
    }

    @Override // xj.c
    public final boolean h(Object obj, File file, xj.k kVar) {
        InputStream inputStream = (InputStream) obj;
        byte[] bArr = (byte[]) ((bk.h) this.f15627b).c(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    } catch (IOException e10) {
                        e = e10;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        ((bk.h) this.f15627b).g(bArr);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        ((bk.h) this.f15627b).g(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                ((bk.h) this.f15627b).g(bArr);
                return true;
            } catch (IOException e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // ek.i0
    public final yj.e i(Uri uri) {
        return new yj.b((ContentResolver) this.f15627b, uri, 1);
    }

    public final synchronized yk.u m(yk.b accessTokenAppIdPair) {
        Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
        return (yk.u) ((HashMap) this.f15627b).get(accessTokenAppIdPair);
    }

    public final boolean n(String str) {
        String y10 = y(str);
        if (!"1".equals(y10) && !Boolean.parseBoolean(y10)) {
            return false;
        }
        return true;
    }

    public final ArrayList o() {
        aq.o oVar = ((aq.g0) this.f15627b).f2727l;
        if (oVar != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = oVar.f2746a.iterator();
            while (it.hasNext()) {
                arrayList.add((zp.t) it.next());
            }
            Iterator it2 = oVar.f2747b.iterator();
            while (it2.hasNext()) {
                arrayList.add((zp.c0) it2.next());
            }
            return arrayList;
        }
        return new ArrayList();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Log.e("x", String.format("Failed to get reCAPTCHA token with error [%s]- calling backend without app verification", exc.getMessage()));
        ((TaskCompletionSource) this.f15627b).setResult(new aq.w(null, null));
    }

    public final synchronized int p() {
        int i10;
        int size;
        i10 = 0;
        for (yk.u uVar : ((HashMap) this.f15627b).values()) {
            synchronized (uVar) {
                if (!sl.a.b(uVar)) {
                    try {
                        size = uVar.f41729c.size();
                    } catch (Throwable th2) {
                        sl.a.a(uVar, th2);
                    }
                }
                size = 0;
            }
            i10 += size;
        }
        return i10;
    }

    public final Integer q(String str) {
        String y10 = y(str);
        if (!TextUtils.isEmpty(y10)) {
            try {
                return Integer.valueOf(Integer.parseInt(y10));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + G(str) + "(" + y10 + ") into an int");
                return null;
            }
        }
        return null;
    }

    public final JSONArray r(String str) {
        String y10 = y(str);
        if (!TextUtils.isEmpty(y10)) {
            try {
                return new JSONArray(y10);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + G(str) + ": " + y10 + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    public final int[] s() {
        JSONArray r10 = r("gcm.n.light_settings");
        if (r10 == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (r10.length() == 3) {
                int parseColor = Color.parseColor(r10.optString(0));
                if (parseColor != -16777216) {
                    iArr[0] = parseColor;
                    iArr[1] = r10.optInt(1);
                    iArr[2] = r10.optInt(2);
                    return iArr;
                }
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (IllegalArgumentException e10) {
            Log.w("NotificationParams", "LightSettings is invalid: " + r10 + ". " + e10.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + r10 + ". Skipping setting LightSettings");
            return null;
        }
    }

    public final Object[] t(String str) {
        JSONArray r10 = r(str.concat("_loc_args"));
        if (r10 == null) {
            return null;
        }
        int length = r10.length();
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            strArr[i10] = r10.optString(i10);
        }
        return strArr;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        switch (this.f15626a) {
            case 5:
                return F(task);
            case 6:
                return F(task);
            default:
                Uri uri = (Uri) this.f15627b;
                aq.v vVar = RecaptchaActivity.f11658c;
                Uri.Builder buildUpon = uri.buildUpon();
                if (!task.isSuccessful()) {
                    Log.e("RecaptchaActivity", "Unexpected error getting App Check token: ".concat(String.valueOf(task.getException().getMessage())));
                    return buildUpon.build();
                }
                a3.a.u(task.getResult());
                throw null;
        }
    }

    public final String toString() {
        switch (this.f15626a) {
            case 3:
                return super.toString() + "{fragment=" + ((lk.j) this.f15627b) + UrlTreeKt.componentParamSuffix;
            case 19:
                return ((URL) this.f15627b).toString();
            default:
                return super.toString();
        }
    }

    public final String u(String str) {
        return y(str.concat("_loc_key"));
    }

    public final Long v() {
        String y10 = y("gcm.n.event_time");
        if (!TextUtils.isEmpty(y10)) {
            try {
                return Long.valueOf(Long.parseLong(y10));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + G("gcm.n.event_time") + "(" + y10 + ") into a long");
                return null;
            }
        }
        return null;
    }

    public final String w(String str, Resources resources, String str2) {
        String y10 = y(str2);
        if (!TextUtils.isEmpty(y10)) {
            return y10;
        }
        String u10 = u(str2);
        if (TextUtils.isEmpty(u10)) {
            return null;
        }
        int identifier = resources.getIdentifier(u10, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", G(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] t10 = t(str2);
        if (t10 == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, t10);
        } catch (MissingFormatArgumentException e10) {
            Log.w("NotificationParams", "Missing format argument for " + G(str2) + ": " + Arrays.toString(t10) + " Default value will be used.", e10);
            return null;
        }
    }

    public final synchronized yk.u x(yk.b bVar) {
        yk.u uVar = (yk.u) ((HashMap) this.f15627b).get(bVar);
        if (uVar == null) {
            Context applicationContext = FacebookSdk.getApplicationContext();
            String str = nl.c.f28837f;
            nl.c h10 = ll.e.h(applicationContext);
            if (h10 != null) {
                uVar = new yk.u(h10, yk.l.f41701b.p(applicationContext));
            }
        }
        if (uVar == null) {
            return null;
        }
        ((HashMap) this.f15627b).put(bVar, uVar);
        return uVar;
    }

    public final String y(String str) {
        String replace;
        Bundle bundle = (Bundle) this.f15627b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                replace = str;
            } else {
                replace = str.replace("gcm.n.", "gcm.notification.");
            }
            if (((Bundle) this.f15627b).containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public final long[] z() {
        JSONArray r10 = r("gcm.n.vibrate_timings");
        if (r10 == null) {
            return null;
        }
        try {
            if (r10.length() > 1) {
                int length = r10.length();
                long[] jArr = new long[length];
                for (int i10 = 0; i10 < length; i10++) {
                    jArr[i10] = r10.optLong(i10);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + r10 + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    public u(TaskCompletionSource taskCompletionSource) {
        this.f15626a = 16;
        this.f15627b = taskCompletionSource;
    }

    public /* synthetic */ u(Object obj, int i10) {
        this.f15626a = i10;
        this.f15627b = obj;
    }

    public u(int i10) {
        this.f15626a = i10;
        if (i10 != 23) {
            this.f15627b = new HashMap();
        } else {
            this.f15627b = new ThreadLocal();
        }
    }

    public u() {
        this.f15626a = 0;
        this.f15627b = new ck.f(this);
    }

    public u(Bundle bundle) {
        this.f15626a = 18;
        if (bundle != null) {
            this.f15627b = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    public u(SwipeDismissBehavior swipeDismissBehavior) {
        this.f15626a = 12;
        swipeDismissBehavior.getClass();
        swipeDismissBehavior.f11165g = Math.min(Math.max(s0.g.f34069a, 0.1f), 1.0f);
        swipeDismissBehavior.f11166h = Math.min(Math.max(s0.g.f34069a, 0.6f), 1.0f);
        swipeDismissBehavior.f11163e = 0;
    }
}
