package mt;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.method.KeyListener;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.navigation.NavControllerViewModel;
import androidx.navigation.c0;
import androidx.navigation.s0;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.assetgro.stockgro.data.remote.response.Limit;
import com.assetgro.stockgro.prod.R;
import com.facebook.FacebookException;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.search.SearchAuth;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import d2.l3;
import ej.r0;
import g7.a1;
import g7.b1;
import g7.g1;
import g7.u0;
import g7.w4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lp.j1;
import lp.o0;
import nl.m0;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import xk.h0;
import xk.j0;

/* loaded from: classes2.dex */
public class p implements bk.d, u0, AppsFlyerRequestListener, dk.b, u5.r, v5.q, v5.p, i7.c, p.a, m0 {
    public /* synthetic */ p(int i10) {
    }

    public static r0 A(String message, String actionTitle) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(actionTitle, "actionTitle");
        r0 r0Var = new r0();
        r0Var.setArguments(hl.f.y(new Pair("DATA", message), new Pair("TITLE", actionTitle)));
        return r0Var;
    }

    public static void F(View view) {
        try {
            if (!l3.f13502s) {
                l3.f13502s = true;
                if (Build.VERSION.SDK_INT < 28) {
                    l3.f13500q = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                    l3.f13501r = View.class.getDeclaredField("mRecreateDisplayList");
                } else {
                    l3.f13500q = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    l3.f13501r = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                }
                Method method = l3.f13500q;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = l3.f13501r;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = l3.f13501r;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = l3.f13500q;
            if (method2 != null) {
                method2.invoke(view, new Object[0]);
            }
        } catch (Throwable unused) {
            l3.f13503t = true;
        }
    }

    public static ij.p G(Double d10, double d11, String orderType) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        if (d10 != null && d10.doubleValue() > 0.0d) {
            if (d10.doubleValue() > d11 && Intrinsics.a(orderType, "Market")) {
                return new ij.p(R.string.price_too_high, false);
            }
            if (d10.doubleValue() < d11 && Intrinsics.a(orderType, "Limit")) {
                return new ij.p(R.string.error_limit_less_than_market, false);
            }
            return new ij.p();
        }
        return new ij.p(R.string.price_too_low, false);
    }

    public static ij.p H(Double d10, Limit limit, double d11) {
        if (limit != null) {
            if (d10 != null && d10.doubleValue() >= limit.getMin()) {
                if (d10.doubleValue() > d11) {
                    return new ij.p(R.string.amount_greater_than_avaialable_balance, false);
                }
            } else {
                return new ij.p(R.string.amount_too_low, false);
            }
        }
        return new ij.p();
    }

    public static g1 n(List pages, int i10, int i11, a1 sourceLoadStates, a1 a1Var) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
        return new g1(b1.f16663a, pages, i10, i11, sourceLoadStates, a1Var);
    }

    public static float o(float[] fArr) {
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = (((((f12 * f15) + ((f11 * f14) + (f10 * f13))) - (f13 * f14)) - (f11 * f12)) - (f10 * f15)) * 0.5f;
        if (f16 < s0.g.f34069a) {
            return -f16;
        }
        return f16;
    }

    public static s0 p(TypedValue value, s0 s0Var, androidx.navigation.m0 expectedNavType, String str, String foundType) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(expectedNavType, "expectedNavType");
        Intrinsics.checkNotNullParameter(foundType, "foundType");
        if (s0Var != null && s0Var != expectedNavType) {
            StringBuilder l10 = v.e.l("Type is ", str, " but found ", foundType, ": ");
            l10.append(value.data);
            throw new XmlPullParserException(l10.toString());
        }
        if (s0Var == null) {
            return expectedNavType;
        }
        return s0Var;
    }

    public static androidx.navigation.n q(Context context, c0 destination, Bundle bundle, androidx.lifecycle.n hostLifecycleState, NavControllerViewModel navControllerViewModel) {
        String id2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(id2, "randomUUID().toString()");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
        Intrinsics.checkNotNullParameter(id2, "id");
        return new androidx.navigation.n(context, destination, bundle, hostLifecycleState, navControllerViewModel, id2, null);
    }

    public static androidx.lifecycle.r0 r(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new androidx.lifecycle.r0();
            }
            HashMap hashMap = new HashMap();
            for (String key : bundle2.keySet()) {
                Intrinsics.checkNotNullExpressionValue(key, "key");
                hashMap.put(key, bundle2.get(key));
            }
            return new androidx.lifecycle.r0(hashMap);
        }
        ClassLoader classLoader = androidx.lifecycle.r0.class.getClassLoader();
        Intrinsics.c(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(UserMetadata.KEYDATA_FILENAME);
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = parcelableArrayList.get(i10);
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
            }
            return new androidx.lifecycle.r0(linkedHashMap);
        }
        throw new IllegalStateException("Invalid bundle passed as restored state".toString());
    }

    public static float t(float f10, float f11, float f12, float f13) {
        return (f10 * f13) - (f11 * f12);
    }

    public static t9.a u(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new t9.a(httpURLConnection);
    }

    public static h2.f w() {
        return h2.f.f17817c;
    }

    public static Path y(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(f10, f11);
        path.lineTo(f12, f13);
        return path;
    }

    public InputConnection B(InputConnection inputConnection, EditorInfo editorInfo) {
        return inputConnection;
    }

    public void C(boolean z10) {
    }

    public void D(boolean z10) {
    }

    public void E(View view, int i10, int i11) {
    }

    public TransformationMethod I(TransformationMethod transformationMethod) {
        return transformationMethod;
    }

    @Override // bk.d
    public void a(int i10) {
    }

    @Override // p.a
    public Object apply(Object obj) {
        List list = (List) obj;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((j8.j) it.next()).a());
        }
        return arrayList;
    }

    @Override // bk.d
    public void b(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // v5.p
    public void c() {
    }

    @Override // bk.d
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // bk.d
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // nl.m0
    public void f(JSONObject jSONObject) {
        String optString;
        Uri uri;
        Uri uri2 = null;
        if (jSONObject == null) {
            optString = null;
        } else {
            optString = jSONObject.optString("id");
        }
        if (optString == null) {
            Log.w(h0.f40389h, "No user ID returned on Me request");
            return;
        }
        String optString2 = jSONObject.optString("link");
        String optString3 = jSONObject.optString("profile_picture", null);
        String optString4 = jSONObject.optString("first_name");
        String optString5 = jSONObject.optString("middle_name");
        String optString6 = jSONObject.optString("last_name");
        String optString7 = jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
        if (optString2 != null) {
            uri = Uri.parse(optString2);
        } else {
            uri = null;
        }
        if (optString3 != null) {
            uri2 = Uri.parse(optString3);
        }
        j0.f40404d.s().a(new h0(optString, optString4, optString5, optString6, optString7, uri, uri2), true);
    }

    @Override // i7.c
    public void g() {
    }

    @Override // i7.c
    public void h(int i10, Object obj) {
    }

    @Override // v5.q
    public Object i(Uri uri, g5.g gVar) {
        return Long.valueOf(e5.x.I(new BufferedReader(new InputStreamReader(gVar)).readLine()));
    }

    @Override // g7.u0
    public void j(w4 viewportHint) {
        Intrinsics.checkNotNullParameter(viewportHint, "viewportHint");
    }

    @Override // nl.m0
    public void k(FacebookException facebookException) {
        Log.e(h0.f40389h, Intrinsics.i(facebookException, "Got unexpected exception: "));
    }

    @Override // dk.b
    public void l(Throwable th2) {
        if (Log.isLoggable("GlideExecutor", 6)) {
            Log.e("GlideExecutor", "Request threw uncaught throwable", th2);
        }
    }

    @Override // bk.d
    public void m() {
    }

    @Override // com.appsflyer.attribution.AppsFlyerRequestListener
    public void onError(int i10, String p12) {
        Intrinsics.checkNotNullParameter(p12, "p1");
    }

    @Override // com.appsflyer.attribution.AppsFlyerRequestListener
    public void onSuccess() {
    }

    public u5.s[] s(u5.q[] qVarArr, v5.c cVar) {
        u5.s bVar;
        j1 u10 = u5.b.u(qVarArr);
        u5.s[] sVarArr = new u5.s[qVarArr.length];
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            u5.q qVar = qVarArr[i10];
            if (qVar != null) {
                int[] iArr = qVar.f36837b;
                if (iArr.length != 0) {
                    if (iArr.length == 1) {
                        bVar = new u5.t(iArr[0], qVar.f36838c, qVar.f36836a);
                    } else {
                        long j10 = 25000;
                        bVar = new u5.b(qVar.f36836a, iArr, qVar.f36838c, cVar, SearchAuth.StatusCodes.AUTH_DISABLED, j10, j10, 1279, 719, 0.7f, 0.75f, (o0) u10.get(i10), e5.b.f15001a);
                    }
                    sVarArr[i10] = bVar;
                }
            }
        }
        return sVarArr;
    }

    public InputFilter[] v(InputFilter[] inputFilterArr) {
        return inputFilterArr;
    }

    public KeyListener x(KeyListener keyListener) {
        return keyListener;
    }

    public boolean z() {
        return false;
    }

    public /* synthetic */ p(int i10, int i11) {
        if (i10 != 2 && i10 != 24 && i10 != 7 && i10 != 8 && i10 != 9) {
            switch (i10) {
                case 14:
                    return;
                case 15:
                    return;
                case 16:
                    return;
                case 17:
                    return;
                case 18:
                    return;
                case 19:
                    return;
                case 20:
                    return;
                case 21:
                    return;
                case 22:
                    return;
                default:
                    return;
            }
        }
    }
}
