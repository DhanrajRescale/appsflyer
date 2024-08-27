package yk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.provider.Settings;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.i1;
import b0.l1;
import b0.o1;
import b0.q1;
import b0.y;
import bv.b0;
import c0.m0;
import c2.h1;
import com.afollestad.materialdialogs.internal.button.DialogActionButtonLayout;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.StockOrderDto;
import com.assetgro.stockgro.feature_market.data.remote.FnoPortfolio;
import com.assetgro.stockgro.feature_social.presentation.feed.home.SocialHomeFeedV2ViewModel;
import com.assetgro.stockgro.prod.R;
import com.facebook.FacebookException;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import d0.n0;
import d2.f1;
import d2.s1;
import d2.w0;
import iu.a0;
import j9.d0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ka.b1;
import ka.d1;
import ka.e1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import m0.b9;
import m0.p3;
import m0.r1;
import m0.s3;
import m0.v0;
import m0.x0;
import m0.z5;
import m0.z7;
import n1.h0;
import n1.r0;
import nl.s0;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import r0.h2;
import r0.j0;
import r0.n3;
import t0.g1;
import t0.l3;
import t0.m2;
import t0.n1;
import t0.o3;
import t0.x1;
import vt.g0;
import vt.i0;
import vt.p0;
import vt.z;
import w.t1;
import x.y0;
import xk.e0;
import xk.x;
import y.o0;

/* loaded from: classes.dex */
public abstract class o implements xs.b {

    /* renamed from: a, reason: collision with root package name */
    public static h0 f41711a;

    /* renamed from: b, reason: collision with root package name */
    public static n1.r f41712b;

    /* renamed from: c, reason: collision with root package name */
    public static p1.c f41713c;

    public static final boolean A(g1 g1Var) {
        return ((Boolean) g1Var.getValue()).booleanValue();
    }

    public static final FnoPortfolio B(g1 g1Var) {
        return (FnoPortfolio) g1Var.getValue();
    }

    public static final boolean C(g1 g1Var) {
        return ((Boolean) g1Var.getValue()).booleanValue();
    }

    public static final boolean D(g1 g1Var) {
        return ((Boolean) g1Var.getValue()).booleanValue();
    }

    public static final boolean E(l3 l3Var) {
        return ((Boolean) l3Var.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object F(android.content.Context r15, n9.r r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, yt.a r21) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.o.F(android.content.Context, n9.r, java.lang.String, java.lang.String, java.lang.String, java.lang.String, yt.a):java.lang.Object");
    }

    public static AnalyticEvent G(String taskId, String set, String status, String taskType, String rewardType, String rewardAmount, String title, String discovery, String eventName) {
        String str;
        Intrinsics.checkNotNullParameter(taskId, "taskId");
        Intrinsics.checkNotNullParameter(set, "set");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(taskType, "taskType");
        Intrinsics.checkNotNullParameter(rewardType, "rewardType");
        Intrinsics.checkNotNullParameter(rewardAmount, "rewardAmount");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(discovery, "discovery");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Pair[] pairArr = new Pair[9];
        pairArr[0] = new Pair("task_id", taskId);
        pairArr[1] = new Pair("set", set);
        if (status.length() == 0) {
            str = "unattempted";
        } else {
            str = status;
        }
        pairArr[2] = new Pair("status", str);
        pairArr[3] = new Pair("task_type", taskType);
        pairArr[4] = new Pair("reward_type", rewardType);
        pairArr[5] = new Pair("reward_amount", rewardAmount);
        pairArr[6] = new Pair("title", title);
        pairArr[7] = new Pair("discovery", discovery);
        pairArr[8] = new Pair("event_name", eventName);
        return new AnalyticEvent("app_missions_card_tapped", p0.f(pairArr));
    }

    public static final n9.b H(j9.i iVar, boolean z10, boolean z11, boolean z12, float f10, int i10, t0.n nVar, int i11) {
        boolean z13;
        boolean z14;
        boolean z15;
        float f11;
        int i12;
        int i13;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(-180607681);
        if ((i11 & 2) != 0) {
            z13 = true;
        } else {
            z13 = z10;
        }
        if ((i11 & 4) != 0) {
            z14 = true;
        } else {
            z14 = z11;
        }
        if ((i11 & 8) != 0) {
            z15 = false;
        } else {
            z15 = z12;
        }
        if ((i11 & 32) != 0) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        if ((i11 & 64) != 0) {
            i12 = 1;
        } else {
            i12 = i10;
        }
        if ((i11 & 128) != 0) {
            i13 = 1;
        } else {
            i13 = 0;
        }
        if (i12 > 0) {
            if (!Float.isInfinite(f11) && !Float.isNaN(f11)) {
                Object g10 = v.e.g(rVar, -610207901, -3687241);
                to.e eVar = t0.m.f35080a;
                if (g10 == eVar) {
                    g10 = new n9.i();
                    rVar.k0(g10);
                }
                rVar.s(false);
                n9.b bVar = (n9.b) g10;
                Object h10 = v.e.h(rVar, false, -3687241);
                if (h10 == eVar) {
                    h10 = t0.t.n0(Boolean.valueOf(z13), o3.f35116a);
                    rVar.k0(h10);
                }
                rVar.s(false);
                g1 g1Var = (g1) h10;
                rVar.b0(-180606834);
                Context context = (Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b);
                f1 f1Var = w9.f.f38892a;
                float f12 = f11 / Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
                rVar.s(false);
                t0.t.f(new Object[]{iVar, Boolean.valueOf(z13), null, Float.valueOf(f12), Integer.valueOf(i12)}, new n9.a(z13, z14, bVar, iVar, i12, z15, f12, i13, false, g1Var, null), rVar);
                rVar.s(false);
                return bVar;
            }
            throw new IllegalArgumentException(("Speed must be a finite number. It is " + f11 + '.').toString());
        }
        throw new IllegalArgumentException(jr.h.o("Iterations must be a positive number (", i12, ").").toString());
    }

    public static r1 I(long j10, long j11, long j12, long j13, t0.n nVar, int i10) {
        long j14;
        long j15;
        float f10;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        t0.r rVar = (t0.r) nVar;
        rVar.b0(-1032127534);
        if ((i10 & 1) != 0) {
            j14 = ((n1.t) ((v0) rVar.m(x0.f27075a)).f26921d.getValue()).f28179a;
        } else {
            j14 = j10;
        }
        if ((i10 & 2) != 0) {
            j15 = j14;
        } else {
            j15 = j11;
        }
        int i11 = i10 & 4;
        float f11 = s0.g.f34069a;
        if (i11 != 0) {
            f10 = 0.54f;
        } else {
            f10 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            j16 = ((v0) rVar.m(x0.f27075a)).d();
        } else {
            j16 = j12;
        }
        if ((i10 & 16) != 0) {
            j17 = ((v0) rVar.m(x0.f27075a)).b();
        } else {
            j17 = j13;
        }
        if ((i10 & 32) != 0) {
            f11 = 0.38f;
        }
        float f12 = f11;
        if ((i10 & 64) != 0) {
            j18 = j14;
            j19 = androidx.compose.ui.graphics.a.n(n1.t.c(j14, vl.b.r(rVar)), ((v0) rVar.m(x0.f27075a)).d());
        } else {
            j18 = j14;
            j19 = 0;
        }
        if ((i10 & 128) != 0) {
            j20 = androidx.compose.ui.graphics.a.n(n1.t.c(j15, vl.b.r(rVar)), ((v0) rVar.m(x0.f27075a)).d());
        } else {
            j20 = 0;
        }
        if ((i10 & 256) != 0) {
            j21 = j16;
            j22 = androidx.compose.ui.graphics.a.n(n1.t.c(j16, vl.b.r(rVar)), ((v0) rVar.m(x0.f27075a)).d());
        } else {
            j21 = j16;
            j22 = 0;
        }
        if ((i10 & 512) != 0) {
            j23 = androidx.compose.ui.graphics.a.n(n1.t.c(j17, vl.b.r(rVar)), ((v0) rVar.m(x0.f27075a)).d());
        } else {
            j23 = 0;
        }
        r1 r1Var = new r1(j18, n1.t.c(j15, f10), j21, n1.t.c(j17, f12), j19, n1.t.c(j20, f10), j22, n1.t.c(j23, f12));
        rVar.s(false);
        return r1Var;
    }

    public static final void J(q8.f fVar, b0 b0Var) {
        try {
            Iterator it = ((ArrayList) fVar.g(b0Var)).iterator();
            IOException iOException = null;
            while (it.hasNext()) {
                b0 path = (b0) it.next();
                try {
                    if (fVar.h(path).f7382b) {
                        J(fVar, path);
                    }
                    Intrinsics.checkNotNullParameter(path, "path");
                    fVar.d(path);
                } catch (IOException e10) {
                    if (iOException == null) {
                        iOException = e10;
                    }
                }
            }
            if (iOException == null) {
            } else {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final float K(View dp2, int i10) {
        Intrinsics.e(dp2, "$this$dp");
        Resources resources = dp2.getResources();
        Intrinsics.b(resources, "resources");
        return TypedValue.applyDimension(1, i10, resources.getDisplayMetrics());
    }

    public static final String L(String str) {
        try {
            Matcher matcher = Pattern.compile("(?<=watch\\?v=|/videos/|embed/|youtu.be/|/v/|/e/|watch\\?v%3D|watch\\?feature=player_embedded&v=|%2Fvideos%2F|embed%\u200c\u200b2F|youtu.be%2F|%2Fv%2F|/shorts/)[^#\\&\\?]*").matcher(str);
            if (!matcher.find()) {
                return null;
            }
            return matcher.group();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v3 */
    public static Method M(Method[] methodArr, String str, Class... clsArr) {
        Method method;
        boolean z10;
        int length = methodArr.length;
        boolean z11 = false;
        int i10 = 0;
        loop0: while (true) {
            if (i10 < length) {
                method = methodArr[i10];
                if (!Intrinsics.a(str, method.getName())) {
                    if (!kotlin.text.s.r(method.getName(), str + '-', z11)) {
                        continue;
                        i10++;
                        z11 = false;
                    }
                }
                Class<?>[] parameterTypes = method.getParameterTypes();
                Class<?>[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length);
                if (parameterTypes.length == clsArr2.length) {
                    ArrayList arrayList = new ArrayList(parameterTypes.length);
                    int length2 = parameterTypes.length;
                    boolean z12 = z11;
                    ?? r12 = z12;
                    for (?? r11 = z12; r11 < length2; r11++) {
                        Class<?> cls = parameterTypes[r11];
                        int i11 = r12 + 1;
                        Class<?> cls2 = clsArr2[r12];
                        Intrinsics.checkNotNullParameter(cls, "<this>");
                        iu.e a10 = a0.a(cls);
                        Intrinsics.checkNotNullParameter(cls2, "<this>");
                        if (!Intrinsics.a(a10, a0.a(cls2)) && !cls.isAssignableFrom(cls2)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        arrayList.add(Boolean.valueOf(z10));
                        r12 = i11;
                    }
                    if (!arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (!((Boolean) it.next()).booleanValue()) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                continue;
                i10++;
                z11 = false;
            } else {
                method = null;
                break;
            }
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(jr.h.r(str, " not found"));
    }

    public static Method N(Class cls, String str, Object... objArr) {
        Method method;
        int ceil;
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        int i10 = 0;
        while (true) {
            method = null;
            Class<?> cls2 = null;
            method = null;
            if (i10 >= length) {
                break;
            }
            Object obj = objArr[i10];
            if (obj != null) {
                cls2 = obj.getClass();
            }
            if (cls2 != null) {
                arrayList.add(cls2);
            }
            i10++;
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int length2 = clsArr.length;
                if (length2 == 0) {
                    ceil = 1;
                } else {
                    ceil = (int) Math.ceil(length2 / 10.0d);
                }
                Class cls3 = Integer.TYPE;
                IntRange k10 = kotlin.ranges.d.k(0, ceil);
                ArrayList arrayList2 = new ArrayList(z.k(k10));
                nu.f it = k10.iterator();
                while (it.f29173c) {
                    it.b();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                ll.o oVar = new ll.o(0);
                oVar.c(clsArr);
                ((ArrayList) oVar.f24937b).add(t0.n.class);
                oVar.c(clsArr2);
                return M(declaredMethods, str, (Class[]) ((ArrayList) oVar.f24937b).toArray(new Class[((ArrayList) oVar.f24937b).size()]));
            } catch (ReflectiveOperationException unused) {
                for (Method method2 : cls.getDeclaredMethods()) {
                    if (!Intrinsics.a(method2.getName(), str)) {
                        if (!kotlin.text.s.r(method2.getName(), str + '-', false)) {
                        }
                    }
                    method = method2;
                    break;
                }
                return method;
            }
        } catch (ReflectiveOperationException unused2) {
            return method;
        }
    }

    public static mi.m O(Bundle bundle) {
        if (da.e.y(bundle, "bundle", mi.m.class, "stock")) {
            if (!Parcelable.class.isAssignableFrom(StockOrderDto.class) && !Serializable.class.isAssignableFrom(StockOrderDto.class)) {
                throw new UnsupportedOperationException(StockOrderDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            StockOrderDto stockOrderDto = (StockOrderDto) bundle.get("stock");
            if (stockOrderDto != null) {
                return new mi.m(stockOrderDto);
            }
            throw new IllegalArgumentException("Argument \"stock\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"stock\" is missing and does not have an android:defaultValue");
    }

    public static final int P(Bitmap bitmap) {
        Bitmap.Config config;
        int i10 = 1;
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config2 = bitmap.getConfig();
                if (config2 != Bitmap.Config.ALPHA_8) {
                    i10 = 2;
                    if (config2 != Bitmap.Config.RGB_565 && config2 != Bitmap.Config.ARGB_4444) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            config = Bitmap.Config.RGBA_F16;
                            if (config2 == config) {
                                i10 = 8;
                            }
                        }
                        i10 = 4;
                    }
                }
                return height * i10;
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public static void Q(String str, String str2, t0.n nVar, Object... objArr) {
        try {
            Class<?> cls = Class.forName(str);
            Method N = N(cls, str2, Arrays.copyOf(objArr, objArr.length));
            if (N != null) {
                N.setAccessible(true);
                if (Modifier.isStatic(N.getModifiers())) {
                    R(N, null, nVar, Arrays.copyOf(objArr, objArr.length));
                    return;
                } else {
                    R(N, cls.getConstructor(new Class[0]).newInstance(new Object[0]), nVar, Arrays.copyOf(objArr, objArr.length));
                    return;
                }
            }
            throw new NoSuchMethodException("Composable " + str + '.' + str2 + " not found");
        } catch (Exception e10) {
            Log.w("PreviewLogger", "Failed to invoke Composable Method '" + str + '.' + str2 + '\'', null);
            throw e10;
        }
    }

    public static void R(Method method, Object obj, t0.n nVar, Object... objArr) {
        int i10;
        int ceil;
        int i11;
        Object obj2;
        Class<?>[] parameterTypes = method.getParameterTypes();
        int i12 = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i13 = length - 1;
                if (Intrinsics.a(parameterTypes[length], t0.n.class)) {
                    i12 = length;
                    break;
                } else if (i13 < 0) {
                    break;
                } else {
                    length = i13;
                }
            }
        }
        if (obj != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (i12 == 0) {
            ceil = 1;
        } else {
            ceil = (int) Math.ceil((i10 + i12) / 10.0d);
        }
        int i14 = i12 + 1;
        int i15 = ceil + i14;
        int length2 = method.getParameterTypes().length;
        if (length2 != i15) {
            i11 = (int) Math.ceil(i12 / 31.0d);
        } else {
            i11 = 0;
        }
        if (i11 + i15 == length2) {
            Object[] objArr2 = new Object[length2];
            for (int i16 = 0; i16 < length2; i16++) {
                if (i16 >= 0 && i16 < i12) {
                    if (i16 >= 0) {
                        Intrinsics.checkNotNullParameter(objArr, "<this>");
                        if (i16 <= objArr.length - 1) {
                            obj2 = objArr[i16];
                        }
                    }
                    String name = method.getParameterTypes()[i16].getName();
                    switch (name.hashCode()) {
                        case -1325958191:
                            if (name.equals("double")) {
                                obj2 = Double.valueOf(0.0d);
                                break;
                            }
                            break;
                        case 104431:
                            if (name.equals("int")) {
                                obj2 = 0;
                                break;
                            }
                            break;
                        case 3039496:
                            if (name.equals("byte")) {
                                obj2 = (byte) 0;
                                break;
                            }
                            break;
                        case 3052374:
                            if (name.equals("char")) {
                                obj2 = (char) 0;
                                break;
                            }
                            break;
                        case 3327612:
                            if (name.equals("long")) {
                                obj2 = 0L;
                                break;
                            }
                            break;
                        case 64711720:
                            if (name.equals("boolean")) {
                                obj2 = Boolean.FALSE;
                                break;
                            }
                            break;
                        case 97526364:
                            if (name.equals("float")) {
                                obj2 = Float.valueOf(s0.g.f34069a);
                                break;
                            }
                            break;
                        case 109413500:
                            if (name.equals("short")) {
                                obj2 = (short) 0;
                                break;
                            }
                            break;
                    }
                    obj2 = null;
                } else if (i16 == i12) {
                    obj2 = nVar;
                } else if (i14 <= i16 && i16 < i15) {
                    obj2 = 0;
                } else if (i15 <= i16 && i16 < length2) {
                    obj2 = 2097151;
                } else {
                    throw new IllegalStateException("Unexpected index".toString());
                }
                objArr2[i16] = obj2;
            }
            method.invoke(obj, Arrays.copyOf(objArr2, length2));
            return;
        }
        throw new IllegalStateException("params don't add up to total params".toString());
    }

    public static final boolean S(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                return true;
            }
        }
        return false;
    }

    public static final d0 T(Context context, n9.r rVar, String str) {
        if (rVar instanceof n9.q) {
            if (Intrinsics.a(str, "__LottieInternalDefaultCacheKey__")) {
                int i10 = ((n9.q) rVar).f28527a;
                return j9.o.e(context, i10, j9.o.j(i10, context));
            }
            return j9.o.e(context, ((n9.q) rVar).f28527a, str);
        }
        if (rVar instanceof n9.p) {
            int i11 = 1;
            if (Intrinsics.a(str, "__LottieInternalDefaultCacheKey__")) {
                String str2 = ((n9.p) rVar).f28526a;
                HashMap hashMap = j9.o.f21198a;
                String f10 = a3.a.f("asset_", str2);
                return j9.o.a(f10, new j9.k(i11, context.getApplicationContext(), str2, f10));
            }
            String str3 = ((n9.p) rVar).f28526a;
            HashMap hashMap2 = j9.o.f21198a;
            return j9.o.a(str, new j9.k(i11, context.getApplicationContext(), str3, str));
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final xk.z U(xk.a aVar, Uri imageUri, s0 s0Var) {
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        String path = imageUri.getPath();
        boolean j10 = kotlin.text.s.j("file", imageUri.getScheme(), true);
        e0 e0Var = e0.f40354b;
        if (j10 && path != null) {
            x xVar = new x(ParcelFileDescriptor.open(new File(path), 268435456));
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", xVar);
            return new xk.z(aVar, "me/staging_resources", bundle, e0Var, s0Var);
        }
        if (kotlin.text.s.j("content", imageUri.getScheme(), true)) {
            x xVar2 = new x(imageUri);
            Bundle bundle2 = new Bundle(1);
            bundle2.putParcelable("file", xVar2);
            return new xk.z(aVar, "me/staging_resources", bundle2, e0Var, s0Var);
        }
        throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
    }

    public static final n9.o V(n9.r spec, t0.n nVar, int i10) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        t0.r rVar = (t0.r) nVar;
        rVar.b0(1388713460);
        o0 o0Var = new o0(4, null);
        Context context = (Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b);
        rVar.b0(-3686930);
        boolean h10 = rVar.h(spec);
        Object Q = rVar.Q();
        to.e eVar = t0.m.f35080a;
        if (h10 || Q == eVar) {
            Q = t0.t.n0(new n9.o(), o3.f35116a);
            rVar.k0(Q);
        }
        rVar.s(false);
        g1 g1Var = (g1) Q;
        rVar.b0(-3686552);
        boolean h11 = rVar.h(spec) | rVar.h("__LottieInternalDefaultCacheKey__");
        Object Q2 = rVar.Q();
        if (h11 || Q2 == eVar) {
            rVar.k0(T(context, spec, "__LottieInternalDefaultCacheKey__"));
        }
        rVar.s(false);
        t0.t.d(spec, "__LottieInternalDefaultCacheKey__", new n9.w(o0Var, context, spec, null, "fonts/", ".ttf", "__LottieInternalDefaultCacheKey__", g1Var, null), rVar);
        n9.o oVar = (n9.o) g1Var.getValue();
        rVar.s(false);
        return oVar;
    }

    public static final boolean W(DialogActionButtonLayout dialogActionButtonLayout) {
        boolean z10;
        if (dialogActionButtonLayout == null) {
            return false;
        }
        if (dialogActionButtonLayout.getVisibleButtons().length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!(!z10) && !bl.j.K(dialogActionButtonLayout.getCheckBoxPrompt())) {
            return false;
        }
        return true;
    }

    public static final List X(List list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return Collections.unmodifiableList(new ArrayList(list));
            }
            return Collections.singletonList(g0.u(list));
        }
        return i0.f38321a;
    }

    public static final Map Y(Map map) {
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return Collections.unmodifiableMap(new LinkedHashMap(map));
            }
            Map.Entry entry = (Map.Entry) g0.t(map.entrySet());
            return Collections.singletonMap(entry.getKey(), entry.getValue());
        }
        return p0.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(g1.o r49, java.lang.String r50, t0.g1 r51, boolean r52, boolean r53, boolean r54, kotlin.jvm.functions.Function1 r55, t0.n r56, int r57, int r58) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.o.a(g1.o, java.lang.String, t0.g1, boolean, boolean, boolean, kotlin.jvm.functions.Function1, t0.n, int, int):void");
    }

    public static final void b(int i10, Function0 hideBottomSheet, t0.n nVar, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(hideBottomSheet, "hideBottomSheet");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-2014702303);
        if ((i11 & 14) == 0) {
            if (rVar.f(i10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i12 = i14 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (rVar.j(hideBottomSheet)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 |= i13;
        }
        int i15 = i12;
        if ((i15 & 91) == 18 && rVar.G()) {
            rVar.V();
        } else {
            g1.l lVar = g1.l.f16404b;
            g1.o t10 = androidx.compose.foundation.layout.a.t(androidx.compose.foundation.layout.d.e(lVar, 1.0f), kp.j.R(16, rVar));
            g1.f fVar = g1.a.f16389k;
            rVar.b0(693286680);
            l1 a10 = o1.a(b0.n.f2935a, fVar, rVar, 48);
            rVar.b0(-1323940314);
            int i16 = rVar.P;
            t0.r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(t10);
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t0.t.v0(rVar, a10, c2.k.f7749e);
                t0.t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i16))) {
                    nn.d.s(i16, rVar, i16, iVar);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                s3.a(w0.u(R.drawable.ic_feed_post_comment_unselected, rVar, 6), null, androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.d.m(lVar, kp.j.R(34, rVar)), s0.g.f34069a, kp.j.R(4, rVar), s0.g.f34069a, s0.g.f34069a, 13), androidx.compose.ui.graphics.a.d(4290225909L), rVar, 3128, 0);
                String o11 = jr.h.o("Comments (", i10, ")");
                o2.v vVar = jh.c.f21380i;
                long S = kp.j.S(25, rVar, 6);
                long e10 = w0.e(R.color.colorPrimarySeparator, rVar);
                if (1.0f > 0.0d) {
                    b9.b(o11, androidx.compose.foundation.layout.a.v(new LayoutWeightElement(kotlin.ranges.d.c(1.0f, Float.MAX_VALUE), true), kp.j.R(8, rVar), s0.g.f34069a, 2), e10, S, null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 1572864, 0, 130992);
                    rVar = rVar;
                    rVar.b0(208287633);
                    if ((i15 & 112) == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    Object Q = rVar.Q();
                    if (z10 || Q == t0.m.f35080a) {
                        Q = v.e.p(hideBottomSheet, 10, rVar);
                    }
                    rVar.s(false);
                    p3.a((Function0) Q, h2.l.a(androidx.compose.foundation.layout.d.m(lVar, kp.j.R(30, rVar)), false, lb.a.f24395m), false, null, lb.p.f24497a, rVar, 24576, 12);
                    v.e.y(rVar, false, true, false, false);
                } else {
                    throw new IllegalArgumentException(jr.h.m("invalid weight ", 1.0f, "; must be greater than zero").toString());
                }
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new ka.b0(i10, i11, hideBottomSheet);
        }
    }

    public static final void c(t0.n nVar, int i10) {
        int i11;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-397125770);
        if (i10 == 0 && rVar.G()) {
            rVar.V();
            i11 = 1;
        } else {
            g1.l lVar = g1.l.f16404b;
            g1.o g10 = androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.a.v(lVar, s0.g.f34069a, kp.j.R(8, rVar), 1), kp.j.R(150, rVar));
            g1.f fVar = g1.a.f16388j;
            rVar.b0(693286680);
            b0.d dVar = b0.n.f2935a;
            l1 a10 = o1.a(dVar, fVar, rVar, 48);
            rVar.b0(-1323940314);
            int i12 = rVar.P;
            t0.r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(g10);
            boolean z10 = rVar.f35166a instanceof t0.f;
            if (z10) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                c2.i iVar = c2.k.f7749e;
                t0.t.v0(rVar, a10, iVar);
                c2.i iVar2 = c2.k.f7748d;
                t0.t.v0(rVar, o10, iVar2);
                c2.i iVar3 = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i12))) {
                    nn.d.s(i12, rVar, i12, iVar3);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                q1.b u10 = w0.u(R.drawable.ic_placeholder_shimmer_user_profile, rVar, 6);
                g1.o m10 = androidx.compose.foundation.layout.d.m(lVar, kp.j.R(34, rVar));
                h0.g gVar = h0.h.f17801a;
                androidx.compose.foundation.a.c(u10, null, el.l.v0(androidx.compose.foundation.a.g(androidx.compose.ui.draw.a.b(m10, gVar), kp.j.R(1, rVar), n1.t.f28173e, gVar), n1.t.f28170b), null, null, s0.g.f34069a, null, rVar, 56, 120);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, kp.j.R(4, rVar)), rVar);
                g1.o q10 = androidx.compose.foundation.layout.d.q(lVar, kp.j.R(288, rVar));
                rVar.b0(-483455358);
                b0.f fVar2 = b0.n.f2937c;
                g1.e eVar = g1.a.f16391m;
                l1 a11 = y.a(fVar2, eVar, rVar, 0);
                rVar.b0(-1323940314);
                int i13 = rVar.P;
                t0.r1 o11 = rVar.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(q10);
                if (z10) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t0.t.v0(rVar, a11, iVar);
                    t0.t.v0(rVar, o11, iVar2);
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i13))) {
                        nn.d.s(i13, rVar, i13, iVar3);
                    }
                    nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                    g1.o t10 = androidx.compose.foundation.layout.a.t(androidx.compose.foundation.a.e(lVar, w0.e(R.color.white_F5F5F5, rVar), h0.h.b(kp.j.R(8, rVar))), kp.j.R(8, rVar));
                    rVar.b0(-483455358);
                    l1 a12 = y.a(fVar2, eVar, rVar, 0);
                    rVar.b0(-1323940314);
                    int i14 = rVar.P;
                    t0.r1 o12 = rVar.o();
                    b1.c j12 = androidx.compose.ui.layout.a.j(t10);
                    if (z10) {
                        rVar.e0();
                        if (rVar.O) {
                            rVar.n(jVar);
                        } else {
                            rVar.n0();
                        }
                        t0.t.v0(rVar, a12, iVar);
                        t0.t.v0(rVar, o12, iVar2);
                        if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i14))) {
                            nn.d.s(i14, rVar, i14, iVar3);
                        }
                        nn.d.q(0, j12, new m2(rVar), rVar, 2058660585);
                        g1.o e10 = androidx.compose.foundation.layout.d.e(lVar, 1.0f);
                        b0.g gVar2 = b0.n.f2941g;
                        g1.f fVar3 = g1.a.f16389k;
                        rVar.b0(693286680);
                        l1 a13 = o1.a(gVar2, fVar3, rVar, 54);
                        rVar.b0(-1323940314);
                        int i15 = rVar.P;
                        t0.r1 o13 = rVar.o();
                        b1.c j13 = androidx.compose.ui.layout.a.j(e10);
                        if (z10) {
                            rVar.e0();
                            if (rVar.O) {
                                rVar.n(jVar);
                            } else {
                                rVar.n0();
                            }
                            t0.t.v0(rVar, a13, iVar);
                            t0.t.v0(rVar, o13, iVar2);
                            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i15))) {
                                nn.d.s(i15, rVar, i15, iVar3);
                            }
                            nn.d.q(0, j13, new m2(rVar), rVar, 2058660585);
                            b0.s.a(androidx.compose.foundation.a.d(da.e.k(8, rVar, androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.d.g(lVar, kp.j.R(13, rVar)), kp.j.R(200, rVar))), j.g0(rVar), null, 6), rVar, 0);
                            b0.s.a(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.m(androidx.compose.foundation.a.d(androidx.compose.ui.draw.a.b(lVar, gVar), j.g0(rVar), null, 6), kp.j.R(21, rVar)), kp.j.R(11, rVar)), rVar, 0);
                            v.e.y(rVar, false, true, false, false);
                            v.e.s(1, rVar, lVar, rVar);
                            b0.s.a(androidx.compose.foundation.a.d(da.e.k(8, rVar, androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.d.g(lVar, kp.j.R(11, rVar)), kp.j.R(80, rVar))), j.g0(rVar), null, 6), rVar, 0);
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, kp.j.R(16, rVar)), rVar);
                            rVar.b0(-483455358);
                            l1 a14 = y.a(fVar2, eVar, rVar, 0);
                            rVar.b0(-1323940314);
                            int i16 = rVar.P;
                            t0.r1 o14 = rVar.o();
                            b1.c j14 = androidx.compose.ui.layout.a.j(lVar);
                            if (z10) {
                                rVar.e0();
                                if (rVar.O) {
                                    rVar.n(jVar);
                                } else {
                                    rVar.n0();
                                }
                                t0.t.v0(rVar, a14, iVar);
                                t0.t.v0(rVar, o14, iVar2);
                                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i16))) {
                                    nn.d.s(i16, rVar, i16, iVar3);
                                }
                                nn.d.q(0, j14, new m2(rVar), rVar, 2058660585);
                                b0.s.a(androidx.compose.foundation.a.d(da.e.k(8, rVar, androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.g(lVar, kp.j.R(13, rVar)), 1.0f)), j.g0(rVar), null, 6), rVar, 0);
                                v.e.s(5, rVar, lVar, rVar);
                                b0.s.a(androidx.compose.foundation.a.d(da.e.k(8, rVar, androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.g(lVar, kp.j.R(13, rVar)), 1.0f)), j.g0(rVar), null, 6), rVar, 0);
                                v.e.s(5, rVar, lVar, rVar);
                                da.e.w(androidx.compose.foundation.a.d(da.e.k(8, rVar, androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.d.g(lVar, kp.j.R(13, rVar)), kp.j.R(90, rVar))), j.g0(rVar), null, 6), rVar, 0, false, true);
                                v.e.y(rVar, false, false, false, true);
                                rVar.s(false);
                                rVar.s(false);
                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, kp.j.R(8, rVar)), rVar);
                                rVar.b0(693286680);
                                l1 a15 = o1.a(dVar, fVar3, rVar, 48);
                                rVar.b0(-1323940314);
                                int i17 = rVar.P;
                                t0.r1 o15 = rVar.o();
                                b1.c j15 = androidx.compose.ui.layout.a.j(lVar);
                                if (z10) {
                                    rVar.e0();
                                    if (rVar.O) {
                                        rVar.n(jVar);
                                    } else {
                                        rVar.n0();
                                    }
                                    t0.t.v0(rVar, a15, iVar);
                                    t0.t.v0(rVar, o15, iVar2);
                                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i17))) {
                                        nn.d.s(i17, rVar, i17, iVar3);
                                    }
                                    nn.d.q(0, j15, new m2(rVar), rVar, 2058660585);
                                    b0.s.a(androidx.compose.foundation.layout.d.m(androidx.compose.foundation.a.d(androidx.compose.ui.draw.a.b(lVar, gVar), j.g0(rVar), null, 6), kp.j.R(21, rVar)), rVar, 0);
                                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, kp.j.R(20, rVar)), rVar);
                                    b0.s.a(androidx.compose.foundation.layout.d.m(androidx.compose.foundation.a.d(androidx.compose.ui.draw.a.b(lVar, gVar), j.g0(rVar), null, 6), kp.j.R(21, rVar)), rVar, 0);
                                    i11 = 1;
                                    v.e.y(rVar, false, true, false, false);
                                    v.e.y(rVar, false, true, false, false);
                                    v.e.y(rVar, false, true, false, false);
                                } else {
                                    al.d.v0();
                                    throw null;
                                }
                            } else {
                                al.d.v0();
                                throw null;
                            }
                        } else {
                            al.d.v0();
                            throw null;
                        }
                    } else {
                        al.d.v0();
                        throw null;
                    }
                } else {
                    al.d.v0();
                    throw null;
                }
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new lb.u(i10, i11);
        }
    }

    public static final void d(String userId, int i10, kb.a aVar, boolean z10, List list, Function0 onListBottomReached, Function0 onRetryClick, Function1 onSubmitComment, Function1 onLikeComment, Function1 onReportComment, Function1 onDeleteComment, Function1 onViewProfile, Function0 hideBottomSheet, t0.n nVar, int i11, int i12, int i13) {
        g1.l lVar;
        boolean z11;
        int i14;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(onListBottomReached, "onListBottomReached");
        Intrinsics.checkNotNullParameter(onRetryClick, "onRetryClick");
        Intrinsics.checkNotNullParameter(onSubmitComment, "onSubmitComment");
        Intrinsics.checkNotNullParameter(onLikeComment, "onLikeComment");
        Intrinsics.checkNotNullParameter(onReportComment, "onReportComment");
        Intrinsics.checkNotNullParameter(onDeleteComment, "onDeleteComment");
        Intrinsics.checkNotNullParameter(onViewProfile, "onViewProfile");
        Intrinsics.checkNotNullParameter(hideBottomSheet, "hideBottomSheet");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(1245780160);
        kb.a aVar2 = (i13 & 4) != 0 ? null : aVar;
        boolean z12 = (i13 & 8) != 0 ? false : z10;
        rVar.b0(-1953407201);
        m0 a10 = c0.p0.a(rVar);
        j.V(a10, onListBottomReached, rVar, (i11 >> 12) & 112);
        rVar.s(false);
        g1.l lVar2 = g1.l.f16404b;
        g1.o o10 = androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.d.c(lVar2, 1.0f)));
        rVar.b0(-483455358);
        l1 a11 = y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
        rVar.b0(-1323940314);
        int i15 = rVar.P;
        t0.r1 o11 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(o10);
        boolean z13 = rVar.f35166a instanceof t0.f;
        if (z13) {
            rVar.e0();
            if (rVar.O) {
                rVar.n(jVar);
            } else {
                rVar.n0();
            }
            c2.i iVar = c2.k.f7749e;
            t0.t.v0(rVar, a11, iVar);
            c2.i iVar2 = c2.k.f7748d;
            t0.t.v0(rVar, o11, iVar2);
            c2.i iVar3 = c2.k.f7750f;
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i15))) {
                nn.d.s(i15, rVar, i15, iVar3);
            }
            nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
            b(i10, hideBottomSheet, rVar, ((i11 >> 3) & 14) | ((i12 >> 3) & 112));
            g1.o e10 = androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.a.v(androidx.compose.foundation.layout.a.o(b0.z.a(lVar2)), kp.j.R(16, rVar), s0.g.f34069a, 2), 1.0f);
            g1.g gVar = g1.a.f16380b;
            rVar.b0(733328855);
            b0.v c10 = b0.s.c(gVar, false, rVar, 6);
            rVar.b0(-1323940314);
            int i16 = rVar.P;
            t0.r1 o12 = rVar.o();
            b1.c j11 = androidx.compose.ui.layout.a.j(e10);
            if (z13) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t0.t.v0(rVar, c10, iVar);
                t0.t.v0(rVar, o12, iVar2);
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i16))) {
                    nn.d.s(i16, rVar, i16, iVar3);
                }
                nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f1281a;
                if (aVar2 == kb.a.f23022c) {
                    rVar.b0(1865133354);
                    i14 = 16;
                    lVar = lVar2;
                    h2.a(h2.l.a(bVar.a(androidx.compose.foundation.layout.d.m(lVar2, kp.j.R(40, rVar)), g1.a.f16383e), false, lb.a.f24396n), 0L, s0.g.f34069a, 0L, 0, rVar, 0, 30);
                    z11 = false;
                    rVar.s(false);
                } else {
                    lVar = lVar2;
                    z11 = false;
                    i14 = 16;
                    if (aVar2 == kb.a.f23021b) {
                        rVar.b0(1865487560);
                        j.j(rVar, 0);
                        rVar.s(false);
                    } else if (z12) {
                        rVar.b0(1865568842);
                        p(null, onRetryClick, rVar, (i11 >> 15) & 112, 1);
                        rVar.s(false);
                        z11 = false;
                    } else if (list != null && !list.isEmpty()) {
                        rVar.b0(1865856801);
                        qu.i0.c(androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.a.n(lVar)), a10, null, false, null, g1.a.f16392n, null, false, new lb.l(list, aVar2, onLikeComment, onReportComment, userId, onDeleteComment, onViewProfile), rVar, 196608, 220);
                        z11 = false;
                        rVar.s(false);
                    } else {
                        z11 = false;
                        rVar.b0(1865691819);
                        j.q0(rVar, 0);
                        rVar.s(false);
                    }
                }
                v.e.y(rVar, z11, true, z11, z11);
                x(null, onSubmitComment, rVar, (i11 >> 18) & 112, 1);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, kp.j.R(i14, rVar)), rVar);
                rVar.s(z11);
                rVar.s(true);
                rVar.s(z11);
                rVar.s(z11);
                x1 w10 = rVar.w();
                if (w10 != null) {
                    w10.f35245d = new lb.m(userId, i10, aVar2, z12, list, onListBottomReached, onRetryClick, onSubmitComment, onLikeComment, onReportComment, onDeleteComment, onViewProfile, hideBottomSheet, i11, i12, i13);
                    return;
                }
                return;
            }
            al.d.v0();
            throw null;
        }
        al.d.v0();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(int r16, g1.o r17, kotlin.jvm.functions.Function0 r18, t0.n r19, int r20, int r21) {
        /*
            r1 = r16
            r5 = r18
            r2 = r20
            java.lang.String r0 = "onMyFavoriteFeedClick"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = r19
            t0.r r0 = (t0.r) r0
            r3 = 1077614608(0x403b1810, float:2.9233437)
            r0.c0(r3)
            r3 = r21 & 1
            if (r3 == 0) goto L1c
            r3 = r2 | 6
            goto L2c
        L1c:
            r3 = r2 & 14
            if (r3 != 0) goto L2b
            boolean r3 = r0.f(r1)
            if (r3 == 0) goto L28
            r3 = 4
            goto L29
        L28:
            r3 = 2
        L29:
            r3 = r3 | r2
            goto L2c
        L2b:
            r3 = r2
        L2c:
            r4 = r21 & 2
            if (r4 == 0) goto L35
            r3 = r3 | 48
        L32:
            r6 = r17
            goto L47
        L35:
            r6 = r2 & 112(0x70, float:1.57E-43)
            if (r6 != 0) goto L32
            r6 = r17
            boolean r7 = r0.h(r6)
            if (r7 == 0) goto L44
            r7 = 32
            goto L46
        L44:
            r7 = 16
        L46:
            r3 = r3 | r7
        L47:
            r7 = r21 & 4
            if (r7 == 0) goto L4e
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L5e
        L4e:
            r7 = r2 & 896(0x380, float:1.256E-42)
            if (r7 != 0) goto L5e
            boolean r7 = r0.j(r5)
            if (r7 == 0) goto L5b
            r7 = 256(0x100, float:3.59E-43)
            goto L5d
        L5b:
            r7 = 128(0x80, float:1.8E-43)
        L5d:
            r3 = r3 | r7
        L5e:
            r3 = r3 & 731(0x2db, float:1.024E-42)
            r7 = 146(0x92, float:2.05E-43)
            if (r3 != r7) goto L70
            boolean r3 = r0.G()
            if (r3 != 0) goto L6b
            goto L70
        L6b:
            r0.V()
            r4 = r6
            goto Lad
        L70:
            if (r4 == 0) goto L75
            g1.l r3 = g1.l.f16404b
            goto L76
        L75:
            r3 = r6
        L76:
            r4 = 1065353216(0x3f800000, float:1.0)
            g1.o r4 = androidx.compose.foundation.layout.d.e(r3, r4)
            r6 = 7
            g1.o r4 = androidx.compose.foundation.a.k(r4, r5, r6)
            pb.a r6 = pb.a.f30815b
            r7 = 0
            g1.o r6 = h2.l.a(r4, r7, r6)
            r4 = 8
            float r4 = kp.j.R(r4, r0)
            h0.g r7 = h0.h.b(r4)
            long r8 = n1.t.f28173e
            r10 = 0
            r11 = 0
            lb.u r4 = new lb.u
            r12 = 3
            r4.<init>(r1, r12)
            r12 = -1255331917(0xffffffffb52d27b3, float:-6.450529E-7)
            b1.c r12 = b1.d.c(r12, r4, r0)
            r14 = 1573248(0x180180, float:2.20459E-39)
            r15 = 56
            r13 = r0
            pp.b.b(r6, r7, r8, r10, r11, r12, r13, r14, r15)
            r4 = r3
        Lad:
            t0.x1 r6 = r0.w()
            if (r6 == 0) goto Lc3
            pb.b r7 = new pb.b
            r0 = r7
            r1 = r16
            r2 = r20
            r3 = r21
            r5 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f35245d = r7
        Lc3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.o.e(int, g1.o, kotlin.jvm.functions.Function0, t0.n, int, int):void");
    }

    public static final void f(g1.o oVar, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        int i12;
        int i13;
        boolean z10;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(335844578);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            oVar2 = oVar;
        } else if ((i10 & 14) == 0) {
            oVar2 = oVar;
            if (rVar.h(oVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            oVar2 = oVar;
            i12 = i10;
        }
        if ((i12 & 11) == 2 && rVar.G()) {
            rVar.V();
        } else {
            g1.l lVar = g1.l.f16404b;
            if (i14 != 0) {
                oVar2 = lVar;
            }
            g1.o e10 = androidx.compose.foundation.layout.d.e(oVar2, 1.0f);
            rVar.b0(-483455358);
            b0.f fVar = b0.n.f2937c;
            g1.e eVar = g1.a.f16391m;
            l1 a10 = y.a(fVar, eVar, rVar, 0);
            rVar.b0(-1323940314);
            int i15 = rVar.P;
            t0.r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(e10);
            boolean z11 = rVar.f35166a instanceof t0.f;
            if (z11) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                c2.i iVar = c2.k.f7749e;
                t0.t.v0(rVar, a10, iVar);
                c2.i iVar2 = c2.k.f7748d;
                t0.t.v0(rVar, o10, iVar2);
                c2.i iVar3 = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i15))) {
                    nn.d.s(i15, rVar, i15, iVar3);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                int i16 = 6;
                b0.s.a(androidx.compose.foundation.a.d(da.e.k(8, rVar, androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.d.g(lVar, kp.j.R(13, rVar)), kp.j.R(190, rVar))), j.g0(rVar), null, 6), rVar, 0);
                v.e.s(5, rVar, lVar, rVar);
                b0.s.a(androidx.compose.foundation.a.d(da.e.k(8, rVar, androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.d.g(lVar, kp.j.R(13, rVar)), kp.j.R(299, rVar))), j.g0(rVar), null, 6), rVar, 0);
                g1.o x10 = androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.d.e(lVar, 1.0f), s0.g.f34069a, kp.j.R(16, rVar), s0.g.f34069a, kp.j.R(24, rVar), 5);
                rVar.b0(-483455358);
                l1 a11 = y.a(fVar, eVar, rVar, 0);
                rVar.b0(-1323940314);
                int i17 = rVar.P;
                t0.r1 o11 = rVar.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(x10);
                if (z11) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t0.t.v0(rVar, a11, iVar);
                    t0.t.v0(rVar, o11, iVar2);
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i17))) {
                        nn.d.s(i17, rVar, i17, iVar3);
                    }
                    j11.b(new m2(rVar), rVar, 0);
                    rVar.b0(2058660585);
                    ArrayList arrayList = new ArrayList();
                    rVar.b0(-1687857540);
                    int i18 = 0;
                    while (true) {
                        q1 q1Var = q1.f2981a;
                        g1.f fVar2 = g1.a.f16388j;
                        if (i18 < i16) {
                            arrayList.add(Integer.valueOf(i18));
                            rVar.b0(-1687854888);
                            if (arrayList.size() == 2) {
                                g1.o e11 = androidx.compose.foundation.layout.d.e(lVar, 1.0f);
                                rVar.b0(693286680);
                                l1 a12 = o1.a(b0.n.f2935a, fVar2, rVar, 0);
                                rVar.b0(-1323940314);
                                int i19 = rVar.P;
                                t0.r1 o12 = rVar.o();
                                c2.l.M.getClass();
                                c2.j jVar2 = c2.k.f7746b;
                                b1.c j12 = androidx.compose.ui.layout.a.j(e11);
                                if (z11) {
                                    rVar.e0();
                                    if (rVar.O) {
                                        rVar.n(jVar2);
                                    } else {
                                        rVar.n0();
                                    }
                                    t0.t.v0(rVar, a12, c2.k.f7749e);
                                    t0.t.v0(rVar, o12, c2.k.f7748d);
                                    c2.i iVar4 = c2.k.f7750f;
                                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i19))) {
                                        nn.d.s(i19, rVar, i19, iVar4);
                                    }
                                    nn.d.q(0, j12, new m2(rVar), rVar, 2058660585);
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        ((Number) it.next()).intValue();
                                        j.D(androidx.compose.foundation.layout.a.t(q1Var.b(lVar, 1.0f, true), kp.j.R(4, rVar)), rVar, 0, 0);
                                    }
                                    z10 = false;
                                    v.e.y(rVar, false, true, false, false);
                                    arrayList.clear();
                                } else {
                                    al.d.v0();
                                    throw null;
                                }
                            } else {
                                z10 = false;
                            }
                            rVar.s(z10);
                            i18++;
                            i16 = 6;
                        } else {
                            boolean z12 = false;
                            rVar.s(false);
                            if (!arrayList.isEmpty()) {
                                g1.o e12 = androidx.compose.foundation.layout.d.e(lVar, 1.0f);
                                rVar.b0(693286680);
                                l1 a13 = o1.a(b0.n.f2935a, fVar2, rVar, 0);
                                rVar.b0(-1323940314);
                                int i20 = rVar.P;
                                t0.r1 o13 = rVar.o();
                                c2.l.M.getClass();
                                c2.j jVar3 = c2.k.f7746b;
                                b1.c j13 = androidx.compose.ui.layout.a.j(e12);
                                if (z11) {
                                    rVar.e0();
                                    if (rVar.O) {
                                        rVar.n(jVar3);
                                    } else {
                                        rVar.n0();
                                    }
                                    t0.t.v0(rVar, a13, c2.k.f7749e);
                                    t0.t.v0(rVar, o13, c2.k.f7748d);
                                    c2.i iVar5 = c2.k.f7750f;
                                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i20))) {
                                        nn.d.s(i20, rVar, i20, iVar5);
                                    }
                                    nn.d.q(0, j13, new m2(rVar), rVar, 2058660585);
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        ((Number) it2.next()).intValue();
                                        j.D(androidx.compose.foundation.layout.a.t(q1Var.b(lVar, 1.0f, true), kp.j.R(4, rVar)), rVar, 0, 0);
                                    }
                                    z12 = false;
                                    v.e.y(rVar, false, true, false, false);
                                } else {
                                    al.d.v0();
                                    throw null;
                                }
                            }
                            v.e.y(rVar, z12, true, z12, z12);
                            v.e.y(rVar, z12, true, z12, z12);
                        }
                    }
                } else {
                    al.d.v0();
                    throw null;
                }
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new i0.c(oVar2, i10, i11, 3);
        }
    }

    public static final void g(t0.n nVar, int i10) {
        t0.r rVar = (t0.r) nVar;
        rVar.c0(317629293);
        if (i10 == 0 && rVar.G()) {
            rVar.V();
        } else {
            g1.l lVar = g1.l.f16404b;
            long j10 = n1.t.f28173e;
            r0 r0Var = n1.s0.f28162a;
            g1.o e10 = androidx.compose.foundation.a.e(lVar, j10, r0Var);
            rVar.b0(733328855);
            g1.g gVar = g1.a.f16379a;
            b0.v c10 = b0.s.c(gVar, false, rVar, 0);
            rVar.b0(-1323940314);
            int i11 = rVar.P;
            t0.r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j11 = androidx.compose.ui.layout.a.j(e10);
            boolean z10 = rVar.f35166a instanceof t0.f;
            if (z10) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                c2.i iVar = c2.k.f7749e;
                t0.t.v0(rVar, c10, iVar);
                c2.i iVar2 = c2.k.f7748d;
                t0.t.v0(rVar, o10, iVar2);
                c2.i iVar3 = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i11))) {
                    nn.d.s(i11, rVar, i11, iVar3);
                }
                nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                g1.o e11 = androidx.compose.foundation.a.e(androidx.compose.foundation.layout.a.v(androidx.compose.foundation.layout.d.e(lVar, 1.0f), kp.j.R(16, rVar), s0.g.f34069a, 2), j10, r0Var);
                b0.g gVar2 = b0.n.f2939e;
                rVar.b0(-483455358);
                g1.e eVar = g1.a.f16391m;
                l1 a10 = y.a(gVar2, eVar, rVar, 6);
                rVar.b0(-1323940314);
                int i12 = rVar.P;
                t0.r1 o11 = rVar.o();
                b1.c j12 = androidx.compose.ui.layout.a.j(e11);
                if (z10) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t0.t.v0(rVar, a10, iVar);
                    t0.t.v0(rVar, o11, iVar2);
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i12))) {
                        nn.d.s(i12, rVar, i12, iVar3);
                    }
                    nn.d.q(0, j12, new m2(rVar), rVar, 2058660585);
                    g1.f fVar = g1.a.f16389k;
                    rVar.b0(693286680);
                    l1 a11 = o1.a(gVar2, fVar, rVar, 54);
                    rVar.b0(-1323940314);
                    int i13 = rVar.P;
                    t0.r1 o12 = rVar.o();
                    b1.c j13 = androidx.compose.ui.layout.a.j(lVar);
                    if (z10) {
                        rVar.e0();
                        if (rVar.O) {
                            rVar.n(jVar);
                        } else {
                            rVar.n0();
                        }
                        t0.t.v0(rVar, a11, iVar);
                        t0.t.v0(rVar, o12, iVar2);
                        if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i13))) {
                            nn.d.s(i13, rVar, i13, iVar3);
                        }
                        nn.d.q(0, j13, new m2(rVar), rVar, 2058660585);
                        if (1.0f > 0.0d) {
                            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(kotlin.ranges.d.c(1.0f, Float.MAX_VALUE), true);
                            rVar.b0(-483455358);
                            l1 a12 = y.a(b0.n.f2937c, eVar, rVar, 0);
                            rVar.b0(-1323940314);
                            int i14 = rVar.P;
                            t0.r1 o13 = rVar.o();
                            b1.c j14 = androidx.compose.ui.layout.a.j(layoutWeightElement);
                            if (z10) {
                                rVar.e0();
                                if (rVar.O) {
                                    rVar.n(jVar);
                                } else {
                                    rVar.n0();
                                }
                                t0.t.v0(rVar, a12, iVar);
                                t0.t.v0(rVar, o13, iVar2);
                                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i14))) {
                                    nn.d.s(i14, rVar, i14, iVar3);
                                }
                                nn.d.q(0, j14, new m2(rVar), rVar, 2058660585);
                                b0.s.a(androidx.compose.foundation.a.d(da.e.k(8, rVar, androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.d.g(lVar, kp.j.R(13, rVar)), kp.j.R(299, rVar))), j.g0(rVar), null, 6), rVar, 0);
                                v.e.s(5, rVar, lVar, rVar);
                                da.e.w(androidx.compose.foundation.a.d(da.e.k(8, rVar, androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.d.g(lVar, kp.j.R(13, rVar)), kp.j.R(190, rVar))), j.g0(rVar), null, 6), rVar, 0, false, true);
                                rVar.s(false);
                                rVar.s(false);
                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, kp.j.R(12, rVar)), rVar);
                                g1.o h10 = androidx.compose.foundation.a.h(kp.j.R(2, rVar), androidx.compose.foundation.a.e(da.e.k(20, rVar, androidx.compose.foundation.layout.d.n(androidx.compose.foundation.layout.a.x(lVar, kp.j.R(8, rVar), s0.g.f34069a, kp.j.R(8, rVar), s0.g.f34069a, 10), kp.j.R(64, rVar), kp.j.R(26, rVar))), j10, r0Var), kq.e.K(vt.y.g(new n1.t(androidx.compose.ui.graphics.a.d(4292796126L)), new n1.t(androidx.compose.ui.graphics.a.d(4290361785L))), t0.t.g(s0.g.f34069a, s0.g.f34069a), t0.t.g(kj.f.i(64), s0.g.f34069a)), h0.h.b(kp.j.R(16, rVar)));
                                rVar.b0(733328855);
                                b0.v c11 = b0.s.c(gVar, false, rVar, 0);
                                rVar.b0(-1323940314);
                                int i15 = rVar.P;
                                t0.r1 o14 = rVar.o();
                                b1.c j15 = androidx.compose.ui.layout.a.j(h10);
                                if (z10) {
                                    rVar.e0();
                                    if (rVar.O) {
                                        rVar.n(jVar);
                                    } else {
                                        rVar.n0();
                                    }
                                    t0.t.v0(rVar, c11, iVar);
                                    t0.t.v0(rVar, o14, iVar2);
                                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i15))) {
                                        nn.d.s(i15, rVar, i15, iVar3);
                                    }
                                    nn.d.q(0, j15, new m2(rVar), rVar, 2058660585);
                                    da.e.w(androidx.compose.foundation.layout.b.f1281a.a(androidx.compose.foundation.layout.d.n(androidx.compose.foundation.a.d(androidx.compose.ui.draw.a.b(lVar, h0.h.b(kp.j.R(8, rVar))), j.g0(rVar), null, 6), kp.j.R(48, rVar), kp.j.R(13, rVar)), g1.a.f16383e), rVar, 0, false, true);
                                    v.e.y(rVar, false, false, false, true);
                                    rVar.s(false);
                                    rVar.s(false);
                                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, kp.j.R(5, rVar)), rVar);
                                    b0.s.a(androidx.compose.foundation.a.d(da.e.k(8, rVar, androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.d.g(lVar, kp.j.R(13, rVar)), kp.j.R(130, rVar))), j.g0(rVar), null, 6), rVar, 0);
                                    v.e.s(8, rVar, lVar, rVar);
                                    pp.b.c(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.g(lVar, (float) 0.5d), j.g0(rVar), null, 6), 0L, s0.g.f34069a, s0.g.f34069a, rVar, 0, 14);
                                    v.e.y(rVar, false, true, false, false);
                                    v.e.y(rVar, false, true, false, false);
                                } else {
                                    al.d.v0();
                                    throw null;
                                }
                            } else {
                                al.d.v0();
                                throw null;
                            }
                        } else {
                            throw new IllegalArgumentException(jr.h.m("invalid weight ", 1.0f, "; must be greater than zero").toString());
                        }
                    } else {
                        al.d.v0();
                        throw null;
                    }
                } else {
                    al.d.v0();
                    throw null;
                }
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new lb.u(i10, 6);
        }
    }

    public static final void h(hb.k media, l3 l3Var, Function2 function2, t0.n nVar, int i10) {
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        boolean z12;
        String str;
        String str2;
        String str3;
        int i13;
        int i14;
        int i15;
        Intrinsics.checkNotNullParameter(media, "media");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-699928914);
        if ((i10 & 14) == 0) {
            if (rVar.h(media)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar.h(l3Var)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 896) == 0) {
            if (rVar.j(function2)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i11 & 731) == 146 && rVar.G()) {
            rVar.V();
        } else {
            Context context = (Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b);
            rVar.b0(-672629425);
            Object Q = rVar.Q();
            to.e eVar = t0.m.f35080a;
            if (Q == eVar) {
                Q = t0.t.n0(null, o3.f35116a);
                rVar.k0(Q);
            }
            g1 g1Var = (g1) Q;
            rVar.s(false);
            rVar.b0(-672626115);
            if ((i11 & 14) == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object Q2 = rVar.Q();
            if (z10 || Q2 == eVar) {
                Q2 = new wb.b(media, g1Var, null);
                rVar.k0(Q2);
            }
            rVar.s(false);
            t0.t.e(media, (Function2) Q2, rVar);
            g1.l lVar = g1.l.f16404b;
            g1.o v10 = androidx.compose.foundation.layout.a.v(androidx.compose.foundation.layout.d.e(lVar, 1.0f), s0.g.f34069a, kp.j.R(8, rVar), 1);
            rVar.b0(-483455358);
            l1 a10 = y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
            rVar.b0(-1323940314);
            int i16 = rVar.P;
            t0.r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(v10);
            boolean z13 = rVar.f35166a instanceof t0.f;
            if (z13) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                c2.i iVar = c2.k.f7749e;
                t0.t.v0(rVar, a10, iVar);
                c2.i iVar2 = c2.k.f7748d;
                t0.t.v0(rVar, o10, iVar2);
                c2.i iVar3 = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i16))) {
                    nn.d.s(i16, rVar, i16, iVar3);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                wb.d dVar = (wb.d) g1Var.getValue();
                if (dVar == null) {
                    i12 = -1;
                } else {
                    i12 = wb.c.f38926a[dVar.ordinal()];
                }
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                if (i12 != 5) {
                                    rVar.b0(1911938625);
                                    rVar.s(false);
                                    Unit unit = Unit.f23355a;
                                    z11 = true;
                                } else {
                                    rVar.b0(-859853037);
                                    String str4 = media.f18197a;
                                    if (str4 == null) {
                                        z11 = true;
                                    } else {
                                        hb.l lVar2 = media.f18202f;
                                        if (lVar2 != null) {
                                            str3 = lVar2.f18203a;
                                        } else {
                                            str3 = null;
                                        }
                                        int i17 = i11 << 6;
                                        z11 = true;
                                        y(str4, str3, false, l3Var, function2, rVar, (i17 & 7168) | 384 | (i17 & 57344), 0);
                                        Unit unit2 = Unit.f23355a;
                                    }
                                    rVar.s(false);
                                    Unit unit3 = Unit.f23355a;
                                }
                            } else {
                                z11 = true;
                                rVar.b0(-860297453);
                                String str5 = media.f18197a;
                                if (str5 != null) {
                                    hb.l lVar3 = media.f18202f;
                                    if (lVar3 != null) {
                                        str2 = lVar3.f18203a;
                                    } else {
                                        str2 = null;
                                    }
                                    int i18 = i11 << 6;
                                    y(str5, str2, false, l3Var, function2, rVar, (i18 & 7168) | 384 | (i18 & 57344), 0);
                                    Unit unit4 = Unit.f23355a;
                                }
                                rVar.s(false);
                                Unit unit5 = Unit.f23355a;
                            }
                        } else {
                            z11 = true;
                            rVar.b0(-860689758);
                            String str6 = media.f18197a;
                            if (str6 != null) {
                                hb.l lVar4 = media.f18202f;
                                if (lVar4 != null) {
                                    str = lVar4.f18203a;
                                } else {
                                    str = null;
                                }
                                int i19 = i11 << 3;
                                j.p0(str6, str, l3Var, function2, rVar, (i19 & 896) | (i19 & 7168), 0);
                                Unit unit6 = Unit.f23355a;
                            }
                            rVar.s(false);
                            Unit unit7 = Unit.f23355a;
                        }
                    } else {
                        z11 = true;
                        rVar.b0(-861137243);
                        String str7 = media.f18197a;
                        if (str7 != null && str7.length() != 0) {
                            String str8 = media.f18199c;
                            String str9 = media.f18197a;
                            Intrinsics.c(str9);
                            j.p(str8, str9, media.f18198b, androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.e(lVar, 1.0f), kp.j.R(88, rVar)), rVar, 0, 0);
                        }
                        rVar.s(false);
                        Unit unit8 = Unit.f23355a;
                    }
                    z12 = false;
                } else {
                    z11 = true;
                    rVar.b0(-862669604);
                    String str10 = media.f18197a;
                    rVar.b0(1911835118);
                    boolean h10 = rVar.h(str10);
                    Object Q3 = rVar.Q();
                    if (h10 || Q3 == eVar) {
                        Q3 = new vb.k(media, context, 2);
                        rVar.k0(Q3);
                    }
                    rVar.s(false);
                    g1.o a11 = h2.l.a(androidx.compose.foundation.a.k(lVar, (Function0) Q3, 7), false, wb.a.f38914d);
                    rVar.b0(733328855);
                    b0.v c10 = b0.s.c(g1.a.f16379a, false, rVar, 0);
                    rVar.b0(-1323940314);
                    int i20 = rVar.P;
                    t0.r1 o11 = rVar.o();
                    b1.c j11 = androidx.compose.ui.layout.a.j(a11);
                    if (z13) {
                        rVar.e0();
                        if (rVar.O) {
                            rVar.n(jVar);
                        } else {
                            rVar.n0();
                        }
                        t0.t.v0(rVar, c10, iVar);
                        t0.t.v0(rVar, o11, iVar2);
                        if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i20))) {
                            nn.d.s(i20, rVar, i20, iVar3);
                        }
                        nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                        q6.l.d(media.f18197a, null, h2.l.a(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.e(lVar, 1.0f), kp.j.R(230, rVar)), false, wb.a.f38915e), a2.k.f96a, rVar, 1572912, 4024);
                        z12 = false;
                        v.e.y(rVar, false, true, false, false);
                        rVar.s(false);
                        Unit unit9 = Unit.f23355a;
                    } else {
                        al.d.v0();
                        throw null;
                    }
                }
                v.e.y(rVar, z12, z11, z12, z12);
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new n0(media, l3Var, function2, i10, 8);
        }
    }

    public static final void i(String title, boolean z10, hb.y followCTAInteraction, boolean z11, Function1 onHeaderActionClick, t0.n nVar, int i10) {
        int i11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i12;
        boolean z15;
        boolean z16;
        g1.l lVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(followCTAInteraction, "followCTAInteraction");
        Intrinsics.checkNotNullParameter(onHeaderActionClick, "onHeaderActionClick");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-1441968228);
        if ((i10 & 14) == 0) {
            if (rVar.h(title)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i11 = i18 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar.i(z10)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i11 |= i17;
        }
        if ((i10 & 896) == 0) {
            if (rVar.h(followCTAInteraction)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i11 |= i16;
        }
        if ((i10 & 7168) == 0) {
            if (rVar.i(z11)) {
                i15 = 2048;
            } else {
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i15;
        }
        if ((i10 & 57344) == 0) {
            if (rVar.j(onHeaderActionClick)) {
                i14 = 16384;
            } else {
                i14 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i14;
        }
        int i19 = i11;
        if ((46811 & i19) == 9362 && rVar.G()) {
            rVar.V();
        } else {
            rVar.b0(-986392284);
            if ((i19 & 14) == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            Object Q = rVar.Q();
            to.e eVar = t0.m.f35080a;
            if (z12 || Q == eVar) {
                Q = jh.b.b(title, jh.c.f21380i, jh.c.f21377f);
                rVar.k0(Q);
            }
            j2.e eVar2 = (j2.e) Q;
            rVar.s(false);
            rVar.b0(-986385218);
            int i20 = 57344 & i19;
            if (i20 == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            Object Q2 = rVar.Q();
            if (z13 || Q2 == eVar) {
                Q2 = new h1(6, onHeaderActionClick);
                rVar.k0(Q2);
            }
            Function0 function0 = (Function0) Q2;
            rVar.s(false);
            rVar.b0(-986381266);
            if ((i19 & 896) == 256) {
                i12 = Http2.INITIAL_MAX_FRAME_SIZE;
                z14 = true;
            } else {
                z14 = false;
                i12 = Http2.INITIAL_MAX_FRAME_SIZE;
            }
            if (i20 == i12) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z17 = z15 | z14;
            Object Q3 = rVar.Q();
            if (z17 || Q3 == eVar) {
                Q3 = new y0(25, onHeaderActionClick, followCTAInteraction);
                rVar.k0(Q3);
            }
            Function0 function02 = (Function0) Q3;
            rVar.s(false);
            g1.l lVar2 = g1.l.f16404b;
            g1.o v10 = androidx.compose.foundation.layout.a.v(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.a.k(lVar2, function0, 7), 1.0f), kp.j.R(16, rVar), s0.g.f34069a, 2);
            long j10 = n1.t.f28173e;
            r0 r0Var = n1.s0.f28162a;
            g1.o e10 = androidx.compose.foundation.a.e(v10, j10, r0Var);
            rVar.b0(-483455358);
            l1 a10 = y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
            rVar.b0(-1323940314);
            int i21 = rVar.P;
            t0.r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j11 = androidx.compose.ui.layout.a.j(e10);
            boolean z18 = rVar.f35166a instanceof t0.f;
            if (z18) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                c2.i iVar = c2.k.f7749e;
                t0.t.v0(rVar, a10, iVar);
                c2.i iVar2 = c2.k.f7748d;
                t0.t.v0(rVar, o10, iVar2);
                c2.i iVar3 = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i21))) {
                    nn.d.s(i21, rVar, i21, iVar3);
                }
                nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                g1.f fVar = g1.a.f16388j;
                rVar.b0(693286680);
                b0.d dVar = b0.n.f2935a;
                l1 a11 = o1.a(dVar, fVar, rVar, 48);
                rVar.b0(-1323940314);
                int i22 = rVar.P;
                t0.r1 o11 = rVar.o();
                b1.c j12 = androidx.compose.ui.layout.a.j(lVar2);
                if (z18) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t0.t.v0(rVar, a11, iVar);
                    t0.t.v0(rVar, o11, iVar2);
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i22))) {
                        nn.d.s(i22, rVar, i22, iVar3);
                    }
                    nn.d.q(0, j12, new m2(rVar), rVar, 2058660585);
                    if (1.0f > 0.0d) {
                        b9.c(eVar2, h2.l.a(androidx.compose.foundation.layout.a.x(new LayoutWeightElement(kotlin.ranges.d.c(1.0f, Float.MAX_VALUE), true), s0.g.f34069a, s0.g.f34069a, kp.j.R(8, rVar), s0.g.f34069a, 11), false, vb.a.f37842o), 0L, kp.j.S(15, rVar, 6), null, null, jh.c.f21377f, 0L, null, null, 0L, 2, false, 3, 0, null, null, null, rVar, 1572864, 3120, 251828);
                        o(z10, function02, rVar, (i19 >> 3) & 14);
                        v.e.y(rVar, false, true, false, false);
                        rVar.b0(-959666347);
                        if (z11) {
                            v.e.s(2, rVar, lVar2, rVar);
                            g1.o a12 = h2.l.a(lVar2, false, vb.a.f37843p);
                            rVar.b0(693286680);
                            l1 a13 = o1.a(dVar, fVar, rVar, 0);
                            rVar.b0(-1323940314);
                            int i23 = rVar.P;
                            t0.r1 o12 = rVar.o();
                            b1.c j13 = androidx.compose.ui.layout.a.j(a12);
                            if (z18) {
                                rVar.e0();
                                if (rVar.O) {
                                    rVar.n(jVar);
                                } else {
                                    rVar.n0();
                                }
                                t0.t.v0(rVar, a13, iVar);
                                t0.t.v0(rVar, o12, iVar2);
                                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i23))) {
                                    nn.d.s(i23, rVar, i23, iVar3);
                                }
                                nn.d.q(0, j13, new m2(rVar), rVar, 2058660585);
                                lVar = lVar2;
                                androidx.compose.foundation.a.c(w0.u(R.drawable.ic_verified, rVar, 6), null, androidx.compose.foundation.layout.d.m(lVar2, kp.j.R(14, rVar)).g(new VerticalAlignElement(g1.a.f16389k)), null, null, s0.g.f34069a, null, rVar, 56, 120);
                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.m(lVar, kp.j.R(4, rVar)), rVar);
                                i13 = 4;
                                b9.b("SEBI Registered", h2.l.a(androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, kp.j.R(2, rVar), 7), false, vb.a.f37844q), androidx.compose.ui.graphics.a.d(4284524032L), kp.j.S(14, rVar, 6), null, null, jh.c.f21379h, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 1573254, 0, 130992);
                                z16 = false;
                                v.e.y(rVar, false, true, false, false);
                            } else {
                                al.d.v0();
                                throw null;
                            }
                        } else {
                            z16 = false;
                            lVar = lVar2;
                            i13 = 4;
                        }
                        rVar.s(z16);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, kp.j.R(i13, rVar)), rVar);
                        pp.b.c(androidx.compose.foundation.a.e(androidx.compose.foundation.layout.d.g(lVar, (float) 0.5d), androidx.compose.ui.graphics.a.d(4289965485L), r0Var), 0L, s0.g.f34069a, s0.g.f34069a, rVar, 6, 14);
                        v.e.y(rVar, false, true, false, false);
                    } else {
                        throw new IllegalArgumentException(jr.h.m("invalid weight ", 1.0f, "; must be greater than zero").toString());
                    }
                } else {
                    al.d.v0();
                    throw null;
                }
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new vb.g(title, z10, followCTAInteraction, z11, onHeaderActionClick, i10);
        }
    }

    public static final void j(xb.g type, t0.n nVar, int i10) {
        int i11;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(type, "type");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(1777392111);
        if ((i10 & 14) == 0) {
            if (rVar.h(type)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && rVar.G()) {
            rVar.V();
            i12 = 1;
        } else {
            g1.l lVar = g1.l.f16404b;
            g1.o a10 = h2.l.a(lVar, false, xb.e.f40160b);
            rVar.b0(733328855);
            b0.v c10 = b0.s.c(g1.a.f16379a, false, rVar, 0);
            rVar.b0(-1323940314);
            int i14 = rVar.P;
            t0.r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(a10);
            boolean z10 = rVar.f35166a instanceof t0.f;
            if (z10) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                c2.i iVar = c2.k.f7749e;
                t0.t.v0(rVar, c10, iVar);
                c2.i iVar2 = c2.k.f7748d;
                t0.t.v0(rVar, o10, iVar2);
                c2.i iVar3 = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i14))) {
                    nn.d.s(i14, rVar, i14, iVar3);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                g1.o u10 = androidx.compose.foundation.layout.a.u(androidx.compose.foundation.layout.d.e(lVar, 1.0f), kp.j.R(16, rVar), kp.j.R(20, rVar));
                float R = kp.j.R(2, rVar);
                long j11 = n1.t.f28173e;
                pp.b.b(u10, h0.h.b(kp.j.R(20, rVar)), j11, null, R, b1.d.c(-1222424538, new androidx.compose.foundation.layout.e(type, 18), rVar), rVar, 1573248, 24);
                rVar.b0(693286680);
                l1 a11 = o1.a(b0.n.f2935a, g1.a.f16388j, rVar, 0);
                rVar.b0(-1323940314);
                int i15 = rVar.P;
                t0.r1 o11 = rVar.o();
                b1.c j12 = androidx.compose.ui.layout.a.j(lVar);
                if (z10) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t0.t.v0(rVar, a11, iVar);
                    t0.t.v0(rVar, o11, iVar2);
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i15))) {
                        nn.d.s(i15, rVar, i15, iVar3);
                    }
                    nn.d.q(0, j12, new m2(rVar), rVar, 2058660585);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.m(lVar, kp.j.R(30, rVar)), rVar);
                    q1.b u11 = w0.u(R.drawable.ic_placeholder_shimmer_user_profile, rVar, 6);
                    g1.o m10 = androidx.compose.foundation.layout.d.m(lVar, kp.j.R(40, rVar));
                    h0.g gVar = h0.h.f17801a;
                    androidx.compose.foundation.a.c(u11, null, el.l.v0(androidx.compose.foundation.a.g(androidx.compose.ui.draw.a.b(m10, gVar), kp.j.R(3, rVar), j11, gVar), n1.t.f28170b), null, null, s0.g.f34069a, null, rVar, 56, 120);
                    i12 = 1;
                    v.e.y(rVar, false, true, false, false);
                    v.e.y(rVar, false, true, false, false);
                } else {
                    al.d.v0();
                    throw null;
                }
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new xb.d(type, i10, i12);
        }
    }

    public static final void k(String str, String str2, List list, hb.k kVar, l3 l3Var, Function2 function2, t0.n nVar, int i10, int i11) {
        hb.k kVar2;
        boolean z10;
        boolean z11;
        boolean z12;
        hb.k kVar3;
        boolean z13;
        boolean z14;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(426509779);
        if ((i11 & 8) != 0) {
            kVar2 = null;
        } else {
            kVar2 = kVar;
        }
        rVar.b0(1377114033);
        if ((((i10 & 14) ^ 6) > 4 && rVar.h(str)) || (i10 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object Q = rVar.Q();
        to.e eVar = t0.m.f35080a;
        if (z10 || Q == eVar) {
            rVar.k0(str);
            Q = str;
        }
        String str3 = (String) Q;
        rVar.s(false);
        rVar.b0(1377116285);
        if ((((i10 & 112) ^ 48) > 32 && rVar.h(str2)) || (i10 & 48) == 32) {
            z11 = true;
        } else {
            z11 = false;
        }
        Object Q2 = rVar.Q();
        if (z11 || Q2 == eVar) {
            rVar.k0(str2);
            Q2 = str2;
        }
        String str4 = (String) Q2;
        rVar.s(false);
        rVar.b0(1377118671);
        boolean h10 = rVar.h(list);
        Object Q3 = rVar.Q();
        if (h10 || Q3 == eVar) {
            rVar.k0(list);
            Q3 = list;
        }
        List list2 = (List) Q3;
        rVar.s(false);
        rVar.b0(1377120521);
        if ((((i10 & 7168) ^ 3072) > 2048 && rVar.h(kVar2)) || (i10 & 3072) == 2048) {
            z12 = true;
        } else {
            z12 = false;
        }
        Object Q4 = rVar.Q();
        if (z12 || Q4 == eVar) {
            rVar.k0(kVar2);
            Q4 = kVar2;
        }
        hb.k kVar4 = (hb.k) Q4;
        rVar.s(false);
        g1.l lVar = g1.l.f16404b;
        g1.o e10 = androidx.compose.foundation.a.e(androidx.compose.foundation.layout.d.e(lVar, 1.0f), n1.t.f28173e, n1.s0.f28162a);
        rVar.b0(-483455358);
        b0.f fVar = b0.n.f2937c;
        g1.e eVar2 = g1.a.f16391m;
        l1 a10 = y.a(fVar, eVar2, rVar, 0);
        rVar.b0(-1323940314);
        int i12 = rVar.P;
        t0.r1 o10 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(e10);
        boolean z15 = rVar.f35166a instanceof t0.f;
        if (z15) {
            rVar.e0();
            if (rVar.O) {
                rVar.n(jVar);
            } else {
                rVar.n0();
            }
            c2.i iVar = c2.k.f7749e;
            t0.t.v0(rVar, a10, iVar);
            c2.i iVar2 = c2.k.f7748d;
            t0.t.v0(rVar, o10, iVar2);
            c2.i iVar3 = c2.k.f7750f;
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i12))) {
                nn.d.s(i12, rVar, i12, iVar3);
            }
            nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
            g1.o u10 = androidx.compose.foundation.layout.a.u(androidx.compose.foundation.layout.d.e(lVar, 1.0f), kp.j.R(16, rVar), kp.j.R(8, rVar));
            rVar.b0(-483455358);
            l1 a11 = y.a(fVar, eVar2, rVar, 0);
            rVar.b0(-1323940314);
            int i13 = rVar.P;
            t0.r1 o11 = rVar.o();
            b1.c j11 = androidx.compose.ui.layout.a.j(u10);
            if (z15) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t0.t.v0(rVar, a11, iVar);
                t0.t.v0(rVar, o11, iVar2);
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i13))) {
                    nn.d.s(i13, rVar, i13, iVar3);
                }
                nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                rVar.b0(-1445230901);
                if (str3 == null || str3.length() == 0) {
                    kVar3 = kVar4;
                    z13 = false;
                    z14 = true;
                } else {
                    o2.v vVar = jh.c.f21380i;
                    long S = kp.j.S(17, rVar, 6);
                    kVar3 = kVar4;
                    z13 = false;
                    z14 = true;
                    b9.b(str3, h2.l.a(androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, kp.j.R(8, rVar), 7), false, vb.a.f37848u), w0.e(R.color.black_2E2E2E, rVar), S, null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 1572864, 0, 130992);
                }
                rVar.s(z13);
                if (str4 != null && str4.length() != 0) {
                    v(str4, list2, null, 0, rVar, 64, 12);
                }
                v.e.y(rVar, z13, z14, z13, z13);
                if (kVar3 != null) {
                    int i14 = i10 >> 9;
                    h(kVar3, l3Var, function2, rVar, (i14 & 896) | (i14 & 112));
                }
                x1 t10 = da.e.t(rVar, z13, z14, z13, z13);
                if (t10 != null) {
                    t10.f35245d = new j0(str, str2, list, kVar2, l3Var, function2, i10, i11, 1);
                    return;
                }
                return;
            }
            al.d.v0();
            throw null;
        }
        al.d.v0();
        throw null;
    }

    public static final void l(List storyGroups, nb.b bVar, g1.o oVar, Function1 onStoryTap, t0.n nVar, int i10, int i11) {
        nb.b bVar2;
        g1.o oVar2;
        Intrinsics.checkNotNullParameter(storyGroups, "storyGroups");
        Intrinsics.checkNotNullParameter(onStoryTap, "onStoryTap");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-258010920);
        if ((i11 & 2) != 0) {
            bVar2 = null;
        } else {
            bVar2 = bVar;
        }
        if ((i11 & 4) != 0) {
            oVar2 = g1.l.f16404b;
        } else {
            oVar2 = oVar;
        }
        float R = kp.j.R(12, rVar);
        float f10 = 0;
        qu.i0.d(oVar2, null, new i1(R, f10, R, f10), false, null, null, null, false, new rb.f(0, (Object) bVar2, (Object) storyGroups, (Object) onStoryTap), rVar, (i10 >> 6) & 14, 250);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d0.y(storyGroups, bVar2, oVar2, onStoryTap, i10, i11);
        }
    }

    public static final void m(gb.e storyGroup, Function1 onStoryTap, t0.n nVar, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        t0.r rVar;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(storyGroup, "storyGroup");
        Intrinsics.checkNotNullParameter(onStoryTap, "onStoryTap");
        t0.r rVar2 = (t0.r) nVar;
        rVar2.c0(-1259125173);
        if ((i10 & 14) == 0) {
            if (rVar2.h(storyGroup)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar2.j(onStoryTap)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 91) == 18 && rVar2.G()) {
            rVar2.V();
            rVar = rVar2;
        } else {
            g1.l lVar = g1.l.f16404b;
            g1.o v10 = androidx.compose.foundation.layout.a.v(lVar, kp.j.R(4, rVar2), s0.g.f34069a, 2);
            rVar2.b0(-868933985);
            if ((i11 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i11 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = z11 | z10;
            Object Q = rVar2.Q();
            if (z12 || Q == t0.m.f35080a) {
                Q = new y0(24, onStoryTap, storyGroup);
                rVar2.k0(Q);
            }
            rVar2.s(false);
            g1.o a10 = h2.l.a(androidx.compose.foundation.a.k(v10, (Function0) Q, 7), false, rb.d.f33570c);
            g1.e eVar = g1.a.f16392n;
            rVar2.b0(-483455358);
            l1 a11 = y.a(b0.n.f2937c, eVar, rVar2, 48);
            rVar2.b0(-1323940314);
            int i14 = rVar2.P;
            t0.r1 o10 = rVar2.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(a10);
            boolean z13 = rVar2.f35166a instanceof t0.f;
            if (z13) {
                rVar2.e0();
                if (rVar2.O) {
                    rVar2.n(jVar);
                } else {
                    rVar2.n0();
                }
                c2.i iVar = c2.k.f7749e;
                t0.t.v0(rVar2, a11, iVar);
                c2.i iVar2 = c2.k.f7748d;
                t0.t.v0(rVar2, o10, iVar2);
                c2.i iVar3 = c2.k.f7750f;
                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i14))) {
                    nn.d.s(i14, rVar2, i14, iVar3);
                }
                nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
                g1.o m10 = androidx.compose.foundation.layout.d.m(lVar, kp.j.R(68, rVar2));
                h0.g gVar = h0.h.f17801a;
                g1.o g10 = androidx.compose.foundation.a.g(androidx.compose.foundation.a.e(m10, n1.t.f28176h, gVar), kp.j.R(1, rVar2), androidx.compose.ui.graphics.a.d(4290295992L), gVar);
                g1.g gVar2 = g1.a.f16383e;
                rVar2.b0(733328855);
                b0.v c10 = b0.s.c(gVar2, false, rVar2, 6);
                rVar2.b0(-1323940314);
                int i15 = rVar2.P;
                t0.r1 o11 = rVar2.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(g10);
                if (z13) {
                    rVar2.e0();
                    if (rVar2.O) {
                        rVar2.n(jVar);
                    } else {
                        rVar2.n0();
                    }
                    t0.t.v0(rVar2, c10, iVar);
                    t0.t.v0(rVar2, o11, iVar2);
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i15))) {
                        nn.d.s(i15, rVar2, i15, iVar3);
                    }
                    nn.d.q(0, j11, new m2(rVar2), rVar2, 2058660585);
                    androidx.compose.foundation.a.c(g.T(storyGroup.c(), w0.u(R.drawable.ic_placeholder_stock, rVar2, 6), w0.u(R.drawable.ic_placeholder_stock, rVar2, 6), rVar2, 576), null, h2.l.a(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.b.f1281a.a(androidx.compose.foundation.layout.d.m(lVar, kp.j.R(64, rVar2)), gVar2), gVar), false, rb.d.f33571d), null, null, s0.g.f34069a, null, rVar2, 48, 120);
                    v.e.y(rVar2, false, true, false, false);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, kp.j.R(8, rVar2)), rVar2);
                    b9.b(storyGroup.d(), h2.l.a(androidx.compose.foundation.layout.d.q(lVar, kp.j.R(68, rVar2)), false, rb.d.f33572e), n1.t.f28170b, kp.j.S(11, rVar2, 6), null, null, hl.f.i(hl.f.h(R.font.inter_500)), 0L, null, new u2.i(3), 0L, 2, false, 1, 0, null, null, rVar2, 1573248, 3120, 120240);
                    rVar = rVar2;
                    v.e.y(rVar, false, true, false, false);
                } else {
                    al.d.v0();
                    throw null;
                }
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new t1(storyGroup, onStoryTap, i10, 10);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:1|(1:3)(2:67|(3:69|(1:71)(1:73)|72)(1:74))|4|(1:6)(2:60|(3:62|(1:64)(1:66)|65))|7|(1:9)(2:53|(3:55|(1:57)(1:59)|58))|10|(1:12)(2:46|(7:48|(1:50)(1:52)|51|14|(11:(1:26)(1:45)|27|(1:29)(1:44)|30|(1:32)|33|(1:43)|37|38|39|40)(1:18)|19|(2:21|22)(1:24)))|13|14|(1:16)|(0)(0)|27|(0)(0)|30|(0)|33|(1:35)|43|37|38|39|40|19|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fe, code lost:
    
        r11 = n1.t.f28170b;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void n(gb.d r18, kotlin.jvm.functions.Function1 r19, kotlin.jvm.functions.Function1 r20, g1.o r21, t0.n r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.o.n(gb.d, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, g1.o, t0.n, int, int):void");
    }

    public static final void o(boolean z10, Function0 onFollowClick, t0.n nVar, int i10) {
        int i11;
        boolean z11;
        boolean z12;
        boolean z13;
        t0.r rVar;
        boolean z14;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(onFollowClick, "onFollowClick");
        t0.r rVar2 = (t0.r) nVar;
        rVar2.c0(1631623434);
        if ((i10 & 14) == 0) {
            if (rVar2.i(z10)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar2.j(onFollowClick)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 91) == 18 && rVar2.G()) {
            rVar2.V();
            rVar = rVar2;
        } else {
            rVar2.b0(-462999735);
            Object Q = rVar2.Q();
            to.e eVar = t0.m.f35080a;
            o3 o3Var = o3.f35116a;
            if (Q == eVar) {
                Q = t0.t.n0(Boolean.valueOf(z10), o3Var);
                rVar2.k0(Q);
            }
            g1 g1Var = (g1) Q;
            Object h10 = v.e.h(rVar2, false, -462997265);
            if (h10 == eVar) {
                h10 = t0.t.n0(vb.o.f37927a, o3Var);
                rVar2.k0(h10);
            }
            g1 g1Var2 = (g1) h10;
            rVar2.s(false);
            Boolean valueOf = Boolean.valueOf(z10);
            rVar2.b0(-462993683);
            int i14 = i11 & 14;
            if (i14 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object Q2 = rVar2.Q();
            if (z11 || Q2 == eVar) {
                Q2 = new vb.h(g1Var2, g1Var, null, z10);
                rVar2.k0(Q2);
            }
            rVar2.s(false);
            t0.t.e(valueOf, (Function2) Q2, rVar2);
            g1.g gVar = g1.a.f16381c;
            g1.l lVar = g1.l.f16404b;
            g1.o a10 = h2.l.a(lVar, false, vb.a.f37845r);
            rVar2.b0(733328855);
            b0.v c10 = b0.s.c(gVar, false, rVar2, 6);
            rVar2.b0(-1323940314);
            int i15 = rVar2.P;
            t0.r1 o10 = rVar2.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(a10);
            if (rVar2.f35166a instanceof t0.f) {
                rVar2.e0();
                if (rVar2.O) {
                    rVar2.n(jVar);
                } else {
                    rVar2.n0();
                }
                t0.t.v0(rVar2, c10, c2.k.f7749e);
                t0.t.v0(rVar2, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i15))) {
                    nn.d.s(i15, rVar2, i15, iVar);
                }
                nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
                int ordinal = ((vb.o) g1Var2.getValue()).ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            rVar2.b0(1429037614);
                            rVar2.s(false);
                            z13 = false;
                            z12 = true;
                            rVar = rVar2;
                        } else {
                            rVar2.b0(1428668280);
                            z14 = true;
                            bl.j.f((j9.i) V(new n9.q(R.raw.social_feed_follow_loading_to_success), rVar2, 6).getValue(), androidx.compose.ui.draw.a.h(androidx.compose.foundation.layout.d.n(lVar, kp.j.R(64, rVar2), kp.j.R(26, rVar2)), 2.5f), false, false, s0.g.f34069a, 0, false, false, false, null, false, false, null, null, false, null, rVar2, 8, 0, 262140);
                            rVar2.s(false);
                        }
                    } else {
                        z14 = true;
                        rVar2.b0(1428221818);
                        bl.j.f((j9.i) V(new n9.q(R.raw.social_feed_follow_to_loading), rVar2, 6).getValue(), androidx.compose.ui.draw.a.h(androidx.compose.foundation.layout.d.n(lVar, kp.j.R(64, rVar2), kp.j.R(26, rVar2)), 2.5f), false, false, s0.g.f34069a, 0, false, false, false, null, false, false, null, null, false, null, rVar2, 8, 0, 262140);
                        rVar2.s(false);
                    }
                    z12 = z14;
                    z13 = false;
                    rVar = rVar2;
                } else {
                    rVar2.b0(1426860422);
                    z12 = true;
                    z13 = false;
                    rVar = rVar2;
                    iu.j.d(z10, null, null, null, null, b1.d.c(-1432719008, new v.o(9, onFollowClick, g1Var2), rVar2), rVar2, 196608 | i14, 30);
                    rVar.s(false);
                }
                v.e.y(rVar, z13, z12, z13, z13);
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new i0.r0(i10, onFollowClick, z10);
        }
    }

    public static final void p(g1.o oVar, Function0 onRetryClick, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        int i12;
        int i13;
        int i14;
        g1.o oVar3;
        float f10;
        boolean z10;
        t0.r rVar;
        g1.o oVar4;
        Intrinsics.checkNotNullParameter(onRetryClick, "onRetryClick");
        t0.r rVar2 = (t0.r) nVar;
        rVar2.c0(-961785825);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            oVar2 = oVar;
        } else if ((i10 & 14) == 0) {
            oVar2 = oVar;
            if (rVar2.h(oVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i10 | i13;
        } else {
            oVar2 = oVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar2.j(onRetryClick)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i16 = i12;
        if ((i16 & 91) == 18 && rVar2.G()) {
            rVar2.V();
            oVar4 = oVar2;
            rVar = rVar2;
        } else {
            g1.l lVar = g1.l.f16404b;
            if (i15 != 0) {
                oVar3 = lVar;
            } else {
                oVar3 = oVar2;
            }
            g1.o g10 = oVar3.g(androidx.compose.foundation.layout.d.f1286c);
            long j10 = n1.t.f28173e;
            g1.o t10 = androidx.compose.foundation.layout.a.t(androidx.compose.foundation.a.e(g10, j10, n1.s0.f28162a), kp.j.R(16, rVar2));
            b0.g gVar = b0.n.f2939e;
            g1.e eVar = g1.a.f16392n;
            rVar2.b0(-483455358);
            l1 a10 = y.a(gVar, eVar, rVar2, 54);
            rVar2.b0(-1323940314);
            int i17 = rVar2.P;
            t0.r1 o10 = rVar2.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j11 = androidx.compose.ui.layout.a.j(t10);
            if (rVar2.f35166a instanceof t0.f) {
                rVar2.e0();
                if (rVar2.O) {
                    rVar2.n(jVar);
                } else {
                    rVar2.n0();
                }
                t0.t.v0(rVar2, a10, c2.k.f7749e);
                t0.t.v0(rVar2, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i17))) {
                    nn.d.s(i17, rVar2, i17, iVar);
                }
                nn.d.q(0, j11, new m2(rVar2), rVar2, 2058660585);
                al.d.z(R.drawable.ic_no_internet_connection, null, h2.l.a(androidx.compose.foundation.layout.d.m(lVar, kp.j.R(200, rVar2)), false, tb.b.f35685g), 0L, rVar2, 6, 10);
                g1.o oVar5 = oVar3;
                n3.a(hl.f.c1(R.string.label_no_internet_connection, rVar2), h2.l.a(androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, kp.j.R(16, rVar2), s0.g.f34069a, s0.g.f34069a, 13), false, tb.b.f35686h), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new j2.g0(w0.e(R.color.colorPrimarySeparator, rVar2), kp.j.S(16, rVar2, 6), null, hl.f.i(hl.f.h(R.font.inter_600)), 3, 0L, null, 16744412), rVar2, 0, 0, 65532);
                n3.a(hl.f.c1(R.string.please_switch_to_different_network, rVar2), h2.l.a(androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, kp.j.R(8, rVar2), s0.g.f34069a, s0.g.f34069a, 13), false, tb.b.f35687i), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new j2.g0(w0.e(R.color.colorPrimarySeparator, rVar2), kp.j.S(14, rVar2, 6), null, hl.f.i(hl.f.h(R.font.inter_400)), 3, 0L, null, 16744412), rVar2, 0, 0, 65532);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, kp.j.R(28, rVar2), s0.g.f34069a, s0.g.f34069a, 13), rVar2);
                rVar2.b0(-1370062782);
                Object Q = rVar2.Q();
                to.e eVar2 = t0.m.f35080a;
                if (Q == eVar2) {
                    Q = t0.t.n0(Boolean.FALSE, o3.f35116a);
                    rVar2.k0(Q);
                }
                g1 g1Var = (g1) Q;
                rVar2.s(false);
                if (((Boolean) g1Var.getValue()).booleanValue()) {
                    f10 = 1.1f;
                } else {
                    f10 = 1.0f;
                }
                g1.o h10 = androidx.compose.ui.draw.a.h(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.q(lVar, kp.j.R(160, rVar2)), kp.j.R(48, rVar2)), ((Number) w.i.b(f10, null, HttpUrl.FRAGMENT_ENCODE_SET, rVar2, 3072, 22).getValue()).floatValue());
                rVar2.b0(-1370051786);
                if ((i16 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Object Q2 = rVar2.Q();
                if (z10 || Q2 == eVar2) {
                    Q2 = new d2.y0(21, g1Var, onRetryClick);
                    rVar2.k0(Q2);
                }
                rVar2.s(false);
                g1.o a11 = h2.l.a(androidx.compose.foundation.a.d(t0.t.H(h10, d2.s.f13613k, new v.o(5, (Function1) Q2, null)), kq.e.R(vt.y.g(new n1.t(w0.e(R.color.colorAccent, rVar2)), new n1.t(w0.e(R.color.lightThemeSelectedTabTitleColor_v2, rVar2))), Float.POSITIVE_INFINITY, 8), h0.h.b(kp.j.R(10, rVar2)), 4), false, tb.b.f35688j);
                i1 i1Var = r0.z.f32821a;
                rVar = rVar2;
                dp.b.e(onRetryClick, a11, false, null, r0.z.a(n1.t.f28176h, j10, rVar2, 12), null, null, null, null, tb.e.f35698a, rVar2, ((i16 >> 3) & 14) | 805306368, 492);
                v.e.y(rVar, false, true, false, false);
                oVar4 = oVar5;
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new tb.y(i10, i11, 0, oVar4, onRetryClick);
        }
    }

    public static final void q(Function0 onRetryClick, t0.n nVar, int i10) {
        int i11;
        int i12;
        t0.r rVar;
        int i13;
        Intrinsics.checkNotNullParameter(onRetryClick, "onRetryClick");
        t0.r rVar2 = (t0.r) nVar;
        rVar2.c0(1325529830);
        if ((i10 & 14) == 0) {
            if (rVar2.j(onRetryClick)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && rVar2.G()) {
            rVar2.V();
            rVar = rVar2;
            i12 = 0;
        } else {
            g1.l lVar = g1.l.f16404b;
            g1.o u10 = androidx.compose.foundation.layout.a.u(androidx.compose.foundation.a.e(androidx.compose.foundation.layout.d.e(lVar, 1.0f), n1.t.f28173e, n1.s0.f28162a), kp.j.R(14, rVar2), kp.j.R(4, rVar2));
            rVar2.b0(733328855);
            b0.v c10 = b0.s.c(g1.a.f16379a, false, rVar2, 0);
            rVar2.b0(-1323940314);
            int i14 = rVar2.P;
            t0.r1 o10 = rVar2.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(u10);
            boolean z10 = rVar2.f35166a instanceof t0.f;
            if (z10) {
                rVar2.e0();
                if (rVar2.O) {
                    rVar2.n(jVar);
                } else {
                    rVar2.n0();
                }
                c2.i iVar = c2.k.f7749e;
                t0.t.v0(rVar2, c10, iVar);
                c2.i iVar2 = c2.k.f7748d;
                t0.t.v0(rVar2, o10, iVar2);
                c2.i iVar3 = c2.k.f7750f;
                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i14))) {
                    nn.d.s(i14, rVar2, i14, iVar3);
                }
                nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
                g1.o e10 = androidx.compose.foundation.layout.d.e(lVar, 1.0f);
                g1.f fVar = g1.a.f16389k;
                rVar2.b0(693286680);
                l1 a10 = o1.a(b0.n.f2935a, fVar, rVar2, 48);
                rVar2.b0(-1323940314);
                int i15 = rVar2.P;
                t0.r1 o11 = rVar2.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(e10);
                if (z10) {
                    rVar2.e0();
                    if (rVar2.O) {
                        rVar2.n(jVar);
                    } else {
                        rVar2.n0();
                    }
                    t0.t.v0(rVar2, a10, iVar);
                    t0.t.v0(rVar2, o11, iVar2);
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i15))) {
                        nn.d.s(i15, rVar2, i15, iVar3);
                    }
                    nn.d.q(0, j11, new m2(rVar2), rVar2, 2058660585);
                    al.d.z(R.drawable.ic_internet_off, null, androidx.compose.foundation.layout.d.m(lVar, kp.j.R(24, rVar2)), 0L, rVar2, 6, 10);
                    n3.a(hl.f.c1(R.string.no_internet_popup_message, rVar2), androidx.compose.foundation.layout.a.x(lVar, kp.j.R(14, rVar2), s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 14), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new j2.g0(w0.e(R.color.colorPrimarySeparator, rVar2), kp.j.S(12, rVar2, 6), null, hl.f.i(hl.f.h(R.font.inter_500)), 0, 0L, null, 16777180), rVar2, 0, 0, 65532);
                    if (1.0f > 0.0d) {
                        androidx.compose.foundation.layout.a.c(new LayoutWeightElement(kotlin.ranges.d.c(1.0f, Float.MAX_VALUE), true), rVar2);
                        i12 = 0;
                        rVar = rVar2;
                        al.d.e(onRetryClick, h2.l.a(lVar, false, tb.b.f35689k), false, null, null, tb.e.f35699b, rVar2, 196608 | (i11 & 14), 28);
                        v.e.y(rVar, false, true, false, false);
                        v.e.y(rVar, false, true, false, false);
                    } else {
                        throw new IllegalArgumentException(jr.h.m("invalid weight ", 1.0f, "; must be greater than zero").toString());
                    }
                } else {
                    al.d.v0();
                    throw null;
                }
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new tb.z(i10, i12, onRetryClick);
        }
    }

    public static final void r(ut.p notes, Function0 dismissBottomSheet, t0.n nVar, int i10) {
        Intrinsics.checkNotNullParameter(notes, "notes");
        Intrinsics.checkNotNullParameter(dismissBottomSheet, "dismissBottomSheet");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-562180759);
        dp.b.I(dismissBottomSheet, androidx.compose.foundation.layout.d.c(g1.l.f16404b, 0.8f), null, s0.g.f34069a, null, n1.t.f28173e, 0L, s0.g.f34069a, 0L, null, null, null, b1.d.c(150429062, new v.o(8, dismissBottomSheet, notes), rVar), rVar, ((i10 >> 3) & 14) | 805503024, 384, 3548);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new t1(notes, dismissBottomSheet, i10, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0544  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0350 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0381  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void s(com.assetgro.stockgro.feature_market.domain.model.OptionContract r59, com.assetgro.stockgro.feature_market.domain.model.OptionOverview r60, com.assetgro.stockgro.feature_market.data.remote.PortfolioReviewResponse r61, boolean r62, boolean r63, kotlin.jvm.functions.Function1 r64, hu.c r65, t0.n r66, int r67, int r68) {
        /*
            Method dump skipped, instructions count: 1766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.o.s(com.assetgro.stockgro.feature_market.domain.model.OptionContract, com.assetgro.stockgro.feature_market.domain.model.OptionOverview, com.assetgro.stockgro.feature_market.data.remote.PortfolioReviewResponse, boolean, boolean, kotlin.jvm.functions.Function1, hu.c, t0.n, int, int):void");
    }

    public static final void t(List portfolios, FnoPortfolio initialPortfolio, Function1 selectedPortfolio, t0.n nVar, int i10) {
        Intrinsics.checkNotNullParameter(portfolios, "portfolios");
        Intrinsics.checkNotNullParameter(initialPortfolio, "initialPortfolio");
        Intrinsics.checkNotNullParameter(selectedPortfolio, "selectedPortfolio");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-36539133);
        rVar.b0(1788482984);
        Object Q = rVar.Q();
        to.e eVar = t0.m.f35080a;
        if (Q == eVar) {
            Q = t0.t.n0(Boolean.FALSE, o3.f35116a);
            rVar.k0(Q);
        }
        g1 g1Var = (g1) Q;
        rVar.s(false);
        float f10 = 6;
        g1.o a10 = h2.l.a(androidx.compose.foundation.a.e(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.a.g(g1.l.f16404b, 1, androidx.compose.ui.graphics.a.d(4288256409L), h0.h.b(f10)), 1.0f), 40), androidx.compose.ui.graphics.a.d(4294967295L), h0.h.b(f10)), false, ka.p0.f22905c);
        boolean booleanValue = ((Boolean) g1Var.getValue()).booleanValue();
        rVar.b0(1788503123);
        Object Q2 = rVar.Q();
        if (Q2 == eVar) {
            Q2 = com.google.android.gms.internal.p002firebaseauthapi.a.i(g1Var, 5, rVar);
        }
        rVar.s(false);
        pp.b.f(booleanValue, (Function1) Q2, a10, b1.d.c(-1188730195, new d0.x(initialPortfolio, g1Var, portfolios, selectedPortfolio, 4), rVar), rVar, 3120, 0);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new n0(portfolios, initialPortfolio, selectedPortfolio, i10, 6);
        }
    }

    public static final void u(Function1 function1, t0.n nVar, int i10, int i11) {
        Function1 function12;
        int i12;
        int i13;
        Function1 function13;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-2127067798);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            function12 = function1;
        } else if ((i10 & 14) == 0) {
            function12 = function1;
            if (rVar.j(function12)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            function12 = function1;
            i12 = i10;
        }
        if ((i12 & 11) == 2 && rVar.G()) {
            rVar.V();
        } else {
            if (i14 != 0) {
                function13 = b1.f22749a;
            } else {
                function13 = function12;
            }
            long d10 = androidx.compose.ui.graphics.a.d(4283048166L);
            long d11 = androidx.compose.ui.graphics.a.d(4291547647L);
            List g10 = vt.y.g(hl.f.c1(R.string.text_market, rVar), hl.f.c1(R.string.text_limit, rVar));
            rVar.b0(1254349620);
            Object Q = rVar.Q();
            if (Q == t0.m.f35080a) {
                Q = t0.t.n0(0, o3.f35116a);
                rVar.k0(Q);
            }
            g1 g1Var = (g1) Q;
            rVar.s(false);
            float f10 = 8;
            z7.b(((Number) g1Var.getValue()).intValue(), h2.l.a(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.a.g(androidx.compose.ui.draw.a.b(g1.l.f16404b, h0.h.b(f10)), 1, n1.t.f28172d, h0.h.b(f10)), 32), false, ka.p0.f22909g), n1.t.f28173e, 0L, ka.e.f22774c, null, b1.d.c(-1182398718, new d1(g10, g1Var, d11, function13, d10), rVar), rVar, 1597824, 40);
            function12 = function13;
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new e1(function12, i10, i11, 0);
        }
    }

    public static final void v(String text, List list, g1.o oVar, int i10, t0.n nVar, int i11, int i12) {
        g1.o oVar2;
        int i13;
        boolean z10;
        int i14;
        String str;
        g1.o oVar3;
        float f10;
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(text, "text");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(402273309);
        int i15 = i12 & 4;
        g1.l lVar = g1.l.f16404b;
        if (i15 != 0) {
            oVar2 = lVar;
        } else {
            oVar2 = oVar;
        }
        if ((i12 & 8) != 0) {
            i13 = 4;
        } else {
            i13 = i10;
        }
        rVar.b0(1396655834);
        if ((((i11 & 14) ^ 6) > 4 && rVar.h(text)) || (i11 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object Q = rVar.Q();
        to.e eVar = t0.m.f35080a;
        o3 o3Var = o3.f35116a;
        if (z10 || Q == eVar) {
            Q = t0.t.n0(null, o3Var);
            rVar.k0(Q);
        }
        g1 g1Var = (g1) Q;
        Object h10 = v.e.h(rVar, false, 1396658028);
        if (h10 == eVar) {
            h10 = t0.t.n0(Boolean.FALSE, o3Var);
            rVar.k0(h10);
        }
        g1 g1Var2 = (g1) h10;
        Object h11 = v.e.h(rVar, false, 1396660190);
        if (h11 == eVar) {
            h11 = t0.t.n0(null, o3Var);
            rVar.k0(h11);
        }
        g1 g1Var3 = (g1) h11;
        Object h12 = v.e.h(rVar, false, 1396662709);
        if (h12 == eVar) {
            h12 = t0.t.n0(null, o3Var);
            rVar.k0(h12);
        }
        g1 g1Var4 = (g1) h12;
        Object h13 = v.e.h(rVar, false, 1396665012);
        if (h13 == eVar) {
            h13 = t0.t.n0(null, o3Var);
            rVar.k0(h13);
        }
        g1 g1Var5 = (g1) h13;
        rVar.s(false);
        j2.e0 e0Var = (j2.e0) g1Var3.getValue();
        w2.j jVar = (w2.j) g1Var4.getValue();
        m1.c cVar = (m1.c) g1Var5.getValue();
        rVar.b0(1396673583);
        Object Q2 = rVar.Q();
        if (Q2 == eVar) {
            Q2 = new y0(28, g1Var, g1Var2);
            rVar.k0(Q2);
        }
        Function0 function0 = (Function0) Q2;
        rVar.s(false);
        t0.t.f(new Object[]{text, Boolean.valueOf(((Boolean) g1Var2.getValue()).booleanValue()), e0Var, jVar}, new vb.l(e0Var, jVar, i13, g1Var5, text, g1Var2, g1Var, null), rVar);
        rVar.b0(-483455358);
        l1 a10 = y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
        rVar.b0(-1323940314);
        int i16 = rVar.P;
        t0.r1 o10 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar2 = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
        boolean z13 = rVar.f35166a instanceof t0.f;
        if (z13) {
            rVar.e0();
            if (rVar.O) {
                rVar.n(jVar2);
            } else {
                rVar.n0();
            }
            c2.i iVar = c2.k.f7749e;
            t0.t.v0(rVar, a10, iVar);
            c2.i iVar2 = c2.k.f7748d;
            t0.t.v0(rVar, o10, iVar2);
            c2.i iVar3 = c2.k.f7750f;
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i16))) {
                nn.d.s(i16, rVar, i16, iVar3);
            }
            nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
            int i17 = (i11 >> 6) & 14;
            rVar.b0(733328855);
            int i18 = i17 >> 3;
            b0.v c10 = b0.s.c(g1.a.f16379a, false, rVar, (i18 & 112) | (i18 & 14));
            rVar.b0(-1323940314);
            int i19 = rVar.P;
            t0.r1 o11 = rVar.o();
            b1.c j11 = androidx.compose.ui.layout.a.j(oVar2);
            int i20 = ((((i17 << 3) & 112) << 9) & 7168) | 6;
            if (z13) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar2);
                } else {
                    rVar.n0();
                }
                t0.t.v0(rVar, c10, iVar);
                t0.t.v0(rVar, o11, iVar2);
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i19))) {
                    nn.d.s(i19, rVar, i19, iVar3);
                }
                j11.b(new m2(rVar), rVar, Integer.valueOf((i20 >> 3) & 112));
                rVar.b0(2058660585);
                j2.c cVar2 = new j2.c();
                String str2 = (String) g1Var.getValue();
                if (str2 != null && str2.length() != 0) {
                    cVar2.c((String) g1Var.getValue());
                } else {
                    cVar2.d(text);
                }
                j2.e i21 = cVar2.i();
                if (((Boolean) g1Var2.getValue()).booleanValue()) {
                    i14 = Integer.MAX_VALUE;
                } else {
                    i14 = i13;
                }
                j2.g0 g0Var = new j2.g0(w0.e(R.color.black_2E2E2E, rVar), kp.j.S(17, rVar, 6), null, jh.c.f21377f, 0, 0L, null, 16777180);
                g1.o a11 = h2.l.a(lVar, false, vb.a.f37849v);
                rVar.b0(-909053172);
                Object Q3 = rVar.Q();
                if (Q3 == eVar) {
                    Q3 = com.google.android.gms.internal.p002firebaseauthapi.a.i(g1Var3, 9, rVar);
                }
                rVar.s(false);
                b9.c(i21, a11, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, i14, 0, null, (Function1) Q3, g0Var, rVar, 0, 1572912, 55292);
                w2.b bVar = (w2.b) rVar.m(s1.f13620e);
                if (((Boolean) g1Var2.getValue()).booleanValue()) {
                    str = "...less";
                } else {
                    str = "...more";
                }
                j2.g0 g0Var2 = new j2.g0(androidx.compose.ui.graphics.a.d(4283048166L), kp.j.S(17, rVar, 6), null, jh.c.f21380i, 0, 0L, null, 16777180);
                if (cVar != null) {
                    long j12 = cVar.f27237a;
                    oVar3 = androidx.compose.foundation.layout.a.q(lVar, bVar.P(m1.c.d(j12)), bVar.P(m1.c.e(j12)));
                } else {
                    oVar3 = lVar;
                }
                if (cVar == null) {
                    function0 = vb.m.f37920a;
                }
                g1.o k10 = androidx.compose.foundation.a.k(oVar3, function0, 7);
                if (cVar != null) {
                    f10 = 1.0f;
                } else {
                    f10 = s0.g.f34069a;
                }
                g1.o a12 = h2.l.a(androidx.compose.ui.draw.a.a(k10, f10), false, vb.a.f37850w);
                rVar.b0(-909036181);
                Object Q4 = rVar.Q();
                if (Q4 == eVar) {
                    Q4 = com.google.android.gms.internal.p002firebaseauthapi.a.i(g1Var4, 10, rVar);
                }
                rVar.s(false);
                b9.b(str, a12, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, (Function1) Q4, g0Var2, rVar, 0, 196608, 32764);
                v.e.y(rVar, false, true, false, false);
                if (list == null || list.isEmpty() || (!((Boolean) g1Var2.getValue()).booleanValue() && cVar != null)) {
                    z11 = true;
                    z12 = false;
                } else {
                    g1.o a13 = h2.l.a(androidx.compose.foundation.layout.a.x(t0.t.H(lVar, d2.s.f13613k, new b0.n0(18)), s0.g.f34069a, kp.j.R(12, rVar), s0.g.f34069a, s0.g.f34069a, 13), false, vb.a.f37851x);
                    b0.i iVar4 = new b0.i(kp.j.R(4, rVar), true, b0.k.f2888b);
                    rVar.b0(1098475987);
                    b0.o0 c11 = b0.m0.c(iVar4, rVar);
                    rVar.b0(-1323940314);
                    int i22 = rVar.P;
                    t0.r1 o12 = rVar.o();
                    b1.c j13 = androidx.compose.ui.layout.a.j(a13);
                    if (z13) {
                        rVar.e0();
                        if (rVar.O) {
                            rVar.n(jVar2);
                        } else {
                            rVar.n0();
                        }
                        t0.t.v0(rVar, c11, iVar);
                        t0.t.v0(rVar, o12, iVar2);
                        if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i22))) {
                            nn.d.s(i22, rVar, i22, iVar3);
                        }
                        nn.d.q(0, j13, new m2(rVar), rVar, 2058660585);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            b9.c(new j2.e((String) it.next(), null, 6), h2.l.a(androidx.compose.foundation.layout.a.v(lVar, s0.g.f34069a, kp.j.R(2, rVar), 1), false, vb.a.f37852y), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, new j2.g0(androidx.compose.ui.graphics.a.d(4287064063L), kp.j.S(17, rVar, 6), null, jh.c.f21380i, 0, 0L, null, 16777180), rVar, 0, 0, 131068);
                        }
                        Unit unit = Unit.f23355a;
                        z11 = true;
                        z12 = false;
                        v.e.y(rVar, false, true, false, false);
                    } else {
                        al.d.v0();
                        throw null;
                    }
                }
                x1 t10 = da.e.t(rVar, z12, z11, z12, z12);
                if (t10 != null) {
                    t10.f35245d = new vb.n(text, list, oVar2, i13, i11, i12);
                    return;
                }
                return;
            }
            al.d.v0();
            throw null;
        }
        al.d.v0();
        throw null;
    }

    public static final void w(SocialHomeFeedV2ViewModel viewModel, t0.n nVar, int i10) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(564799912);
        Context context = (Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b);
        n1 n1Var = viewModel.f8820p;
        nb.c cVar = (nb.c) n1Var.getValue();
        rVar.b0(199347841);
        boolean h10 = rVar.h(cVar);
        Object Q = rVar.Q();
        to.e eVar = t0.m.f35080a;
        if (h10 || Q == eVar) {
            Q = ((nb.c) n1Var.getValue()).f28568b;
            rVar.k0(Q);
        }
        nb.b bVar = (nb.b) Q;
        int i11 = 0;
        rVar.s(false);
        nb.c cVar2 = (nb.c) n1Var.getValue();
        rVar.b0(199351173);
        boolean h11 = rVar.h(cVar2);
        Object Q2 = rVar.Q();
        if (h11 || Q2 == eVar) {
            Q2 = ((nb.c) n1Var.getValue()).f28567a;
            rVar.k0(Q2);
        }
        nb.b bVar2 = (nb.b) Q2;
        rVar.s(false);
        nb.c cVar3 = (nb.c) n1Var.getValue();
        rVar.b0(199354563);
        boolean h12 = rVar.h(cVar3);
        Object Q3 = rVar.Q();
        if (h12 || Q3 == eVar) {
            Q3 = Boolean.valueOf(((nb.c) n1Var.getValue()).f28569c);
            rVar.k0(Q3);
        }
        boolean booleanValue = ((Boolean) Q3).booleanValue();
        rVar.s(false);
        rVar.b0(199359245);
        Object Q4 = rVar.Q();
        int i12 = 1;
        if (Q4 == eVar) {
            Q4 = new ob.f(viewModel, i12);
            rVar.k0(Q4);
        }
        Function0 function0 = (Function0) Q4;
        Object h13 = v.e.h(rVar, false, 199362765);
        int i13 = 2;
        if (h13 == eVar) {
            h13 = new ob.f(viewModel, i13);
            rVar.k0(h13);
        }
        Function0 function02 = (Function0) h13;
        Object h14 = v.e.h(rVar, false, 199366516);
        if (h14 == eVar) {
            h14 = new ob.f(viewModel, i11);
            rVar.k0(h14);
        }
        Function0 function03 = (Function0) h14;
        Object h15 = v.e.h(rVar, false, 199370804);
        if (h15 == eVar) {
            h15 = new ob.g(viewModel, i13);
            rVar.k0(h15);
        }
        Function1 function1 = (Function1) h15;
        Object h16 = v.e.h(rVar, false, 199375356);
        if (h16 == eVar) {
            h16 = new ob.g(viewModel, i12);
            rVar.k0(h16);
        }
        Function1 function12 = (Function1) h16;
        Object h17 = v.e.h(rVar, false, 199379726);
        if (h17 == eVar) {
            h17 = new ob.g(viewModel, i11);
            rVar.k0(h17);
        }
        Function1 function13 = (Function1) h17;
        rVar.s(false);
        t0.t.e((String) t0.t.o0(viewModel.f8826v, rVar).getValue(), new ob.d(t0.t.C(viewModel.f8828x, rVar), viewModel, context, n1Var, null), rVar);
        z5.b(androidx.compose.foundation.layout.d.f1286c, null, null, null, null, null, 0, false, null, false, null, s0.g.f34069a, 0L, 0L, 0L, 0L, 0L, b1.d.c(-240682138, new ob.e(viewModel, bVar2, bVar, booleanValue, function02, function03, function1, function12, function13, function0), rVar), rVar, 6, 12582912, 131070);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new w.p0(i10, 13, viewModel);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x011f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r0.Q(), java.lang.Integer.valueOf(r2)) == false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void x(g1.o r45, kotlin.jvm.functions.Function1 r46, t0.n r47, int r48, int r49) {
        /*
            Method dump skipped, instructions count: 734
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.o.x(g1.o, kotlin.jvm.functions.Function1, t0.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02ba  */
    /* JADX WARN: Type inference failed for: r0v24, types: [f.a, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void y(java.lang.String r30, java.lang.String r31, boolean r32, t0.l3 r33, kotlin.jvm.functions.Function2 r34, t0.n r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 1059
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.o.y(java.lang.String, java.lang.String, boolean, t0.l3, kotlin.jvm.functions.Function2, t0.n, int, int):void");
    }

    public static final boolean z(g1 g1Var) {
        return ((Boolean) g1Var.getValue()).booleanValue();
    }
}
