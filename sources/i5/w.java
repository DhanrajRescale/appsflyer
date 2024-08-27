package i5;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import lp.o1;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements e5.j, e5.d, l0.t, o1.j, p2.l0, a4.g, b5.j, nl.s, Continuation, OnFailureListener, gn.g, pn.h, zo.w, hr.e, bq.e, mq.a, gn.d, SuccessContinuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19660a;

    public /* synthetic */ w(int i10) {
        this.f19660a = i10;
    }

    @Override // bq.e
    public List a(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // pn.h
    public Object apply(Object obj) {
        byte[] decode;
        boolean z10 = true;
        switch (this.f19660a) {
            case 9:
                gn.b bVar = pn.j.f31244f;
                throw new RuntimeException("Timed out while trying to open db.", (Throwable) obj);
            case 10:
                Cursor cursor = (Cursor) obj;
                gn.b bVar2 = pn.j.f31244f;
                if (cursor.moveToNext()) {
                    return Long.valueOf(cursor.getLong(0));
                }
                return 0L;
            case 11:
                gn.b bVar3 = pn.j.f31244f;
                throw new RuntimeException("Timed out while trying to acquire the lock.", (Throwable) obj);
            case 12:
                gn.b bVar4 = pn.j.f31244f;
                return (List) pn.j.l(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new w(16));
            case 13:
                gn.b bVar5 = pn.j.f31244f;
                if (((Cursor) obj).getCount() <= 0) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 14:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            case 15:
                Cursor cursor2 = (Cursor) obj;
                gn.b bVar6 = pn.j.f31244f;
                ArrayList arrayList = new ArrayList();
                int i10 = 0;
                while (cursor2.moveToNext()) {
                    byte[] blob = cursor2.getBlob(0);
                    arrayList.add(blob);
                    i10 += blob.length;
                }
                byte[] bArr = new byte[i10];
                int i11 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    byte[] bArr2 = (byte[]) arrayList.get(i12);
                    System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
                    i11 += bArr2.length;
                }
                return bArr;
            case 16:
                Cursor cursor3 = (Cursor) obj;
                gn.b bVar7 = pn.j.f31244f;
                ArrayList arrayList2 = new ArrayList();
                while (cursor3.moveToNext()) {
                    x9.c a10 = jn.i.a();
                    a10.q(cursor3.getString(1));
                    a10.r(sn.a.b(cursor3.getInt(2)));
                    String string = cursor3.getString(3);
                    if (string == null) {
                        decode = null;
                    } else {
                        decode = Base64.decode(string, 0);
                    }
                    a10.f40139c = decode;
                    arrayList2.add(a10.e());
                }
                return arrayList2;
            case 17:
                Cursor cursor4 = (Cursor) obj;
                gn.b bVar8 = pn.j.f31244f;
                if (!cursor4.moveToNext()) {
                    return null;
                }
                return Long.valueOf(cursor4.getLong(0));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 26:
            default:
                gr.t tVar = (gr.t) obj;
                tVar.getClass();
                try {
                    int h10 = tVar.h(null);
                    byte[] bArr3 = new byte[h10];
                    com.google.protobuf.j jVar = new com.google.protobuf.j(bArr3, h10);
                    tVar.i(jVar);
                    if (h10 - jVar.f11934f == 0) {
                        return bArr3;
                    }
                    throw new IllegalStateException("Did not write as much data as expected.");
                } catch (IOException e10) {
                    throw new RuntimeException("Serializing " + gr.t.class.getName() + " to a byte array threw an IOException (should never happen).", e10);
                }
            case 25:
                return DataTransportCrashlyticsReportSender.a((CrashlyticsReport) obj);
            case 27:
                sq.e eVar = (sq.e) obj;
                eVar.getClass();
                x9.c cVar = com.google.firebase.messaging.o.f11767a;
                cVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    cVar.i(eVar, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
        }
    }

    @Override // e5.d
    public void b(Object obj) {
        ((n5.l) obj).d(this.f19660a);
    }

    /* JADX WARN: Type inference failed for: r11v10, types: [b5.b0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object, b5.i0] */
    @Override // b5.j
    public b5.k c(Bundle bundle) {
        b5.a[] aVarArr;
        Uri[] uriArr;
        long[] jArr;
        b5.e0 e0Var;
        b5.n0 n0Var;
        b5.a0 a0Var;
        b5.g0 g0Var;
        boolean z10;
        lp.s0 b10;
        b5.c0 c0Var;
        lp.j1 j10;
        lp.j1 j11;
        boolean z11 = true;
        b5.f0 f0Var = null;
        b5.x xVar = null;
        byte[] bArr = null;
        int i10 = 0;
        switch (this.f19660a) {
            case 12:
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(b5.b.f3205i);
                if (parcelableArrayList == null) {
                    aVarArr = new b5.a[0];
                } else {
                    b5.a[] aVarArr2 = new b5.a[parcelableArrayList.size()];
                    for (int i11 = 0; i11 < parcelableArrayList.size(); i11++) {
                        aVarArr2[i11] = (b5.a) b5.a.f3193q.c((Bundle) parcelableArrayList.get(i11));
                    }
                    aVarArr = aVarArr2;
                }
                return new b5.b(null, aVarArr, bundle.getLong(b5.b.f3206j, 0L), bundle.getLong(b5.b.f3207k, -9223372036854775807L), bundle.getInt(b5.b.f3208l, 0));
            case 13:
                long j12 = bundle.getLong(b5.a.f3185i);
                int i12 = bundle.getInt(b5.a.f3186j);
                int i13 = bundle.getInt(b5.a.f3192p);
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(b5.a.f3187k);
                int[] intArray = bundle.getIntArray(b5.a.f3188l);
                long[] longArray = bundle.getLongArray(b5.a.f3189m);
                long j13 = bundle.getLong(b5.a.f3190n);
                boolean z12 = bundle.getBoolean(b5.a.f3191o);
                if (intArray == null) {
                    intArray = new int[0];
                }
                int[] iArr = intArray;
                if (parcelableArrayList2 == null) {
                    uriArr = new Uri[0];
                } else {
                    uriArr = (Uri[]) parcelableArrayList2.toArray(new Uri[0]);
                }
                Uri[] uriArr2 = uriArr;
                if (longArray == null) {
                    jArr = new long[0];
                } else {
                    jArr = longArray;
                }
                return new b5.a(j12, i12, i13, iArr, uriArr2, jArr, j13, z12);
            case 14:
            case 16:
            case 17:
            default:
                Uri uri = (Uri) bundle.getParcelable(b5.j0.f3358h);
                uri.getClass();
                String string = bundle.getString(b5.j0.f3359i);
                String string2 = bundle.getString(b5.j0.f3360j);
                int i14 = bundle.getInt(b5.j0.f3361k, 0);
                int i15 = bundle.getInt(b5.j0.f3362l, 0);
                String string3 = bundle.getString(b5.j0.f3363m);
                String string4 = bundle.getString(b5.j0.f3364n);
                ?? obj = new Object();
                obj.f3353d = uri;
                obj.f3350a = string;
                obj.f3354e = string2;
                obj.f3351b = i14;
                obj.f3352c = i15;
                obj.f3355f = string3;
                obj.f3356g = string4;
                return new b5.j0(obj);
            case 15:
                return new b5.n(bundle.getInt(b5.n.f3490g, -1), bundle.getByteArray(b5.n.f3493j), bundle.getInt(b5.n.f3491h, -1), bundle.getInt(b5.n.f3492i, -1));
            case 18:
                b5.v vVar = b5.v.I;
                b5.u uVar = new b5.u();
                if (bundle != null) {
                    ClassLoader classLoader = e5.a.class.getClassLoader();
                    int i16 = e5.x.f15050a;
                    bundle.setClassLoader(classLoader);
                }
                String string5 = bundle.getString(b5.v.J);
                b5.v vVar2 = b5.v.I;
                String str = vVar2.f3641a;
                if (string5 == null) {
                    string5 = str;
                }
                uVar.f3590a = string5;
                String string6 = bundle.getString(b5.v.X);
                if (string6 == null) {
                    string6 = vVar2.f3642b;
                }
                uVar.f3591b = string6;
                String string7 = bundle.getString(b5.v.Y);
                if (string7 == null) {
                    string7 = vVar2.f3643c;
                }
                uVar.f3592c = string7;
                uVar.f3593d = bundle.getInt(b5.v.Z, vVar2.f3644d);
                uVar.f3594e = bundle.getInt(b5.v.f3620e0, vVar2.f3645e);
                uVar.f3595f = bundle.getInt(b5.v.f3621f0, vVar2.f3646f);
                uVar.f3596g = bundle.getInt(b5.v.f3622g0, vVar2.f3647g);
                String string8 = bundle.getString(b5.v.f3623h0);
                if (string8 == null) {
                    string8 = vVar2.f3649i;
                }
                uVar.f3597h = string8;
                b5.q0 q0Var = (b5.q0) bundle.getParcelable(b5.v.f3624i0);
                if (q0Var == null) {
                    q0Var = vVar2.f3650j;
                }
                uVar.f3598i = q0Var;
                String string9 = bundle.getString(b5.v.f3625j0);
                if (string9 == null) {
                    string9 = vVar2.f3651k;
                }
                uVar.f3599j = string9;
                String string10 = bundle.getString(b5.v.f3626k0);
                if (string10 == null) {
                    string10 = vVar2.f3652l;
                }
                uVar.f3600k = string10;
                uVar.f3601l = bundle.getInt(b5.v.f3627l0, vVar2.f3653m);
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] byteArray = bundle.getByteArray(b5.v.f3628m0 + "_" + Integer.toString(i10, 36));
                    if (byteArray == null) {
                        uVar.f3602m = arrayList;
                        uVar.f3603n = (b5.r) bundle.getParcelable(b5.v.n0);
                        uVar.f3604o = bundle.getLong(b5.v.f3629o0, vVar2.f3656p);
                        uVar.f3605p = bundle.getInt(b5.v.f3630p0, vVar2.f3657q);
                        uVar.f3606q = bundle.getInt(b5.v.f3631q0, vVar2.f3658r);
                        uVar.f3607r = bundle.getFloat(b5.v.f3632r0, vVar2.f3659s);
                        uVar.f3608s = bundle.getInt(b5.v.f3633s0, vVar2.f3660t);
                        uVar.f3609t = bundle.getFloat(b5.v.f3634t0, vVar2.f3661u);
                        uVar.f3610u = bundle.getByteArray(b5.v.f3635u0);
                        uVar.f3611v = bundle.getInt(b5.v.f3636v0, vVar2.f3663w);
                        Bundle bundle2 = bundle.getBundle(b5.v.f3637w0);
                        if (bundle2 != null) {
                            uVar.f3612w = (b5.n) b5.n.f3494k.c(bundle2);
                        }
                        uVar.f3613x = bundle.getInt(b5.v.f3638x0, vVar2.f3665y);
                        uVar.f3614y = bundle.getInt(b5.v.f3639y0, vVar2.f3666z);
                        uVar.f3615z = bundle.getInt(b5.v.f3640z0, vVar2.A);
                        uVar.A = bundle.getInt(b5.v.A0, vVar2.B);
                        uVar.B = bundle.getInt(b5.v.B0, vVar2.C);
                        uVar.C = bundle.getInt(b5.v.C0, vVar2.D);
                        uVar.D = bundle.getInt(b5.v.E0, vVar2.E);
                        uVar.E = bundle.getInt(b5.v.F0, vVar2.F);
                        uVar.F = bundle.getInt(b5.v.D0, vVar2.G);
                        return new b5.v(uVar);
                    }
                    arrayList.add(byteArray);
                    i10++;
                }
            case 19:
                String str2 = b5.w.f3668e;
                if (bundle.getInt(b5.b1.f3224a, -1) != 0) {
                    z11 = false;
                }
                yk.j.E0(z11);
                if (bundle.getBoolean(b5.w.f3668e, false)) {
                    return new b5.w(bundle.getBoolean(b5.w.f3669f, false));
                }
                return new b5.w();
            case 20:
                String string11 = bundle.getString(b5.k0.f3382h, HttpUrl.FRAGMENT_ENCODE_SET);
                string11.getClass();
                Bundle bundle3 = bundle.getBundle(b5.k0.f3383i);
                if (bundle3 == null) {
                    e0Var = b5.e0.f3259f;
                } else {
                    e0Var = (b5.e0) b5.e0.f3265l.c(bundle3);
                }
                b5.e0 e0Var2 = e0Var;
                Bundle bundle4 = bundle.getBundle(b5.k0.f3384j);
                if (bundle4 == null) {
                    n0Var = b5.n0.I;
                } else {
                    n0Var = (b5.n0) b5.n0.H0.c(bundle4);
                }
                b5.n0 n0Var2 = n0Var;
                Bundle bundle5 = bundle.getBundle(b5.k0.f3385k);
                if (bundle5 == null) {
                    a0Var = b5.a0.f3202m;
                } else {
                    a0Var = (b5.a0) b5.z.f3690l.c(bundle5);
                }
                b5.a0 a0Var2 = a0Var;
                Bundle bundle6 = bundle.getBundle(b5.k0.f3386l);
                if (bundle6 == null) {
                    g0Var = b5.g0.f3304c;
                } else {
                    g0Var = (b5.g0) b5.g0.f3308g.c(bundle6);
                }
                b5.g0 g0Var2 = g0Var;
                Bundle bundle7 = bundle.getBundle(b5.k0.f3387m);
                if (bundle7 != null) {
                    f0Var = (b5.f0) b5.f0.f3288p.c(bundle7);
                }
                return new b5.k0(string11, a0Var2, f0Var, e0Var2, n0Var2, g0Var2);
            case 21:
                Uri uri2 = (Uri) bundle.getParcelable(b5.x.f3674c);
                uri2.getClass();
                return new b5.x(new tr.e(uri2));
            case 22:
                b5.y yVar = new b5.y();
                b5.a0 a0Var3 = b5.z.f3684f;
                long j14 = bundle.getLong(b5.z.f3685g, a0Var3.f3691a);
                if (j14 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                yk.j.E0(z10);
                yVar.f3679a = j14;
                long j15 = bundle.getLong(b5.z.f3686h, a0Var3.f3692b);
                if (j15 != Long.MIN_VALUE && j15 < 0) {
                    z11 = false;
                }
                yk.j.E0(z11);
                yVar.f3680b = j15;
                yVar.f3681c = bundle.getBoolean(b5.z.f3687i, a0Var3.f3693c);
                yVar.f3682d = bundle.getBoolean(b5.z.f3688j, a0Var3.f3694d);
                yVar.f3683e = bundle.getBoolean(b5.z.f3689k, a0Var3.f3695e);
                return new b5.z(yVar);
            case 23:
                String string12 = bundle.getString(b5.c0.f3226i);
                string12.getClass();
                UUID fromString = UUID.fromString(string12);
                Uri uri3 = (Uri) bundle.getParcelable(b5.c0.f3227j);
                Bundle bundle8 = Bundle.EMPTY;
                Bundle bundle9 = bundle.getBundle(b5.c0.f3228k);
                if (bundle9 == null) {
                    bundle9 = bundle8;
                }
                o1 o1Var = o1.f25026g;
                if (bundle9 == bundle8) {
                    b10 = o1Var;
                } else {
                    HashMap hashMap = new HashMap();
                    if (bundle9 != bundle8) {
                        for (String str3 : bundle9.keySet()) {
                            String string13 = bundle9.getString(str3);
                            if (string13 != null) {
                                hashMap.put(str3, string13);
                            }
                        }
                    }
                    b10 = lp.s0.b(hashMap);
                }
                boolean z13 = bundle.getBoolean(b5.c0.f3229l, false);
                boolean z14 = bundle.getBoolean(b5.c0.f3230m, false);
                boolean z15 = bundle.getBoolean(b5.c0.f3231n, false);
                ArrayList<Integer> arrayList2 = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(b5.c0.f3232o);
                if (integerArrayList != null) {
                    arrayList2 = integerArrayList;
                }
                lp.o0 q10 = lp.o0.q(arrayList2);
                byte[] byteArray2 = bundle.getByteArray(b5.c0.f3233p);
                ?? obj2 = new Object();
                obj2.f3216a = fromString;
                obj2.f3218c = o1Var;
                obj2.f3222g = lp.j1.f24998e;
                obj2.f3217b = uri3;
                obj2.f3218c = lp.s0.b(b10);
                obj2.f3219d = z13;
                obj2.f3221f = z15;
                obj2.f3220e = z14;
                obj2.f3222g = lp.o0.q(q10);
                if (byteArray2 != null) {
                    bArr = Arrays.copyOf(byteArray2, byteArray2.length);
                }
                obj2.f3223h = bArr;
                return new b5.c0(obj2);
            case 24:
                return new b5.e0(bundle.getLong(b5.e0.f3260g, -9223372036854775807L), bundle.getLong(b5.e0.f3261h, -9223372036854775807L), bundle.getLong(b5.e0.f3262i, -9223372036854775807L), bundle.getFloat(b5.e0.f3263j, -3.4028235E38f), bundle.getFloat(b5.e0.f3264k, -3.4028235E38f));
            case 25:
                Bundle bundle10 = bundle.getBundle(b5.f0.f3283k);
                if (bundle10 == null) {
                    c0Var = null;
                } else {
                    c0Var = (b5.c0) b5.c0.f3234q.c(bundle10);
                }
                Bundle bundle11 = bundle.getBundle(b5.f0.f3284l);
                if (bundle11 != null) {
                    xVar = (b5.x) b5.x.f3675d.c(bundle11);
                }
                b5.x xVar2 = xVar;
                ArrayList parcelableArrayList3 = bundle.getParcelableArrayList(b5.f0.f3285m);
                if (parcelableArrayList3 == null) {
                    lp.l0 l0Var = lp.o0.f25025b;
                    j10 = lp.j1.f24998e;
                } else {
                    j10 = e5.a.j(new w(26), parcelableArrayList3);
                }
                lp.j1 j1Var = j10;
                ArrayList parcelableArrayList4 = bundle.getParcelableArrayList(b5.f0.f3287o);
                if (parcelableArrayList4 == null) {
                    lp.l0 l0Var2 = lp.o0.f25025b;
                    j11 = lp.j1.f24998e;
                } else {
                    j11 = e5.a.j(b5.j0.f3365o, parcelableArrayList4);
                }
                lp.j1 j1Var2 = j11;
                Uri uri4 = (Uri) bundle.getParcelable(b5.f0.f3281i);
                uri4.getClass();
                return new b5.f0(uri4, bundle.getString(b5.f0.f3282j), c0Var, xVar2, j1Var, bundle.getString(b5.f0.f3286n), j1Var2, null);
            case 26:
                return new b5.d1(bundle.getInt(b5.d1.f3253d, 0), bundle.getInt(b5.d1.f3254e, 0), bundle.getInt(b5.d1.f3255f, 0));
            case 27:
                b5.g0 g0Var3 = b5.g0.f3304c;
                h.c cVar = new h.c(12, 0);
                cVar.f17583b = (Uri) bundle.getParcelable(b5.g0.f3305d);
                cVar.f17584c = bundle.getString(b5.g0.f3306e);
                cVar.f17585d = bundle.getBundle(b5.g0.f3307f);
                return new b5.g0(cVar);
        }
    }

    @Override // a4.g
    public boolean d() {
        return false;
    }

    @Override // mq.a
    public void e(mq.c cVar) {
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, tl.a] */
    @Override // nl.s
    public void f(boolean z10) {
        File[] listFiles;
        File[] listFiles2;
        int i10 = 0;
        switch (this.f19660a) {
            case 0:
                if (z10) {
                    xk.g0 g0Var = xk.g0.f40374e;
                    try {
                        xk.z zVar = new xk.z(null, Intrinsics.i("/cloudbridge_settings", FacebookSdk.getApplicationId()), null, xk.e0.f40353a, new al.c(i10));
                        nl.e0.f28850c.s(g0Var, "al.d", " \n\nCreating Graph Request: \n=============\n%s\n\n ", zVar);
                        zVar.d();
                        return;
                    } catch (JSONException e10) {
                        nl.e0.f28850c.s(g0Var, "al.d", " \n\nGraph Request Exception: \n=============\n%s\n\n ", ut.c.b(e10));
                        return;
                    }
                }
                return;
            case 1:
                String str = gl.b.f17450a;
                if (z10) {
                    bl.e eVar = bl.e.f7087a;
                    if (!sl.a.b(bl.e.class)) {
                        try {
                            bl.e.f7092f.set(true);
                            return;
                        } catch (Throwable th2) {
                            sl.a.a(bl.e.class, th2);
                            return;
                        }
                    }
                    return;
                }
                bl.e eVar2 = bl.e.f7087a;
                if (!sl.a.b(bl.e.class)) {
                    try {
                        bl.e.f7092f.set(false);
                        return;
                    } catch (Throwable th3) {
                        sl.a.a(bl.e.class, th3);
                        return;
                    }
                }
                return;
            case 2:
                if (z10) {
                    synchronized (rl.a.f33952b) {
                        if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                            ll.e.q();
                        }
                        if (rl.a.f33954d != null) {
                            Log.w(rl.a.f33953c, "Already enabled!");
                        } else {
                            rl.a aVar = new rl.a(Thread.getDefaultUncaughtExceptionHandler());
                            rl.a.f33954d = aVar;
                            Thread.setDefaultUncaughtExceptionHandler(aVar);
                        }
                    }
                    nl.v vVar = nl.v.f28944a;
                    if (nl.v.b(nl.t.CrashShield)) {
                        zq.f.f42805c = true;
                        if (FacebookSdk.getAutoLogAppEventsEnabled() && !nl.n0.y()) {
                            File D = bl.j.D();
                            if (D == null) {
                                listFiles = new File[0];
                            } else {
                                listFiles = D.listFiles(new nl.l0(2));
                                if (listFiles == null) {
                                    listFiles = new File[0];
                                }
                            }
                            ArrayList arrayList = new ArrayList();
                            int length = listFiles.length;
                            int i11 = 0;
                            while (i11 < length) {
                                File file = listFiles[i11];
                                i11++;
                                pl.c z02 = al.d.z0(file);
                                if (z02.a()) {
                                    JSONObject jSONObject = new JSONObject();
                                    try {
                                        jSONObject.put("crash_shield", z02.toString());
                                        String str2 = xk.z.f40475j;
                                        String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{FacebookSdk.getApplicationId()}, 1));
                                        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(format, *args)");
                                        arrayList.add(ek.e.y(null, format, jSONObject, new xk.d(z02, 3)));
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                xk.c0 requests = new xk.c0(arrayList);
                                String str3 = xk.z.f40475j;
                                Intrinsics.checkNotNullParameter(requests, "requests");
                                nl.n0.J(requests);
                                new xk.a0(requests).executeOnExecutor(FacebookSdk.getExecutor(), new Void[0]);
                            }
                        }
                        sl.a.f34673b = true;
                    }
                    nl.v vVar2 = nl.v.f28944a;
                    nl.v.b(nl.t.ThreadCheck);
                    return;
                }
                return;
            case 3:
                if (z10 && FacebookSdk.getAutoLogAppEventsEnabled() && !nl.n0.y()) {
                    File D2 = bl.j.D();
                    int i12 = 4;
                    if (D2 == null) {
                        listFiles2 = new File[0];
                    } else {
                        listFiles2 = D2.listFiles(new nl.l0(i12));
                        Intrinsics.checkNotNullExpressionValue(listFiles2, "reportDir.listFiles { dir, name ->\n      name.matches(Regex(String.format(\"^%s[0-9]+.json$\", InstrumentUtility.ERROR_REPORT_PREFIX)))\n    }");
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int length2 = listFiles2.length;
                    int i13 = 0;
                    while (i13 < length2) {
                        File file2 = listFiles2[i13];
                        i13++;
                        Intrinsics.checkNotNullParameter(file2, "file");
                        ?? obj = new Object();
                        String name = file2.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "file.name");
                        obj.f36156a = name;
                        JSONObject X = bl.j.X(name);
                        if (X != null) {
                            obj.f36158c = Long.valueOf(X.optLong(PaymentConstants.TIMESTAMP, 0L));
                            obj.f36157b = X.optString("error_message", null);
                        }
                        if (obj.f36157b != null && obj.f36158c != null) {
                            arrayList2.add(obj);
                        }
                    }
                    vt.c0.l(arrayList2, new t0.s(28));
                    JSONArray jSONArray = new JSONArray();
                    while (i10 < arrayList2.size() && i10 < 1000) {
                        jSONArray.put(arrayList2.get(i10));
                        i10++;
                    }
                    bl.j.Y("error_reports", jSONArray, new xk.d(arrayList2, i12));
                    return;
                }
                return;
            default:
                if (z10) {
                    AtomicBoolean atomicBoolean = ql.c.f32089a;
                    synchronized (ql.c.class) {
                        if (!sl.a.b(ql.c.class)) {
                            try {
                            } catch (Throwable th4) {
                                sl.a.a(ql.c.class, th4);
                            }
                            if (!ql.c.f32089a.getAndSet(true)) {
                                if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                                    ql.c.a();
                                }
                                int i14 = ql.a.f32083a;
                                if (!sl.a.b(ql.a.class)) {
                                    try {
                                        ql.a.f32084b.scheduleWithFixedDelay(ql.a.f32086d, 0L, 500, TimeUnit.MILLISECONDS);
                                    } catch (Throwable th5) {
                                        sl.a.a(ql.a.class, th5);
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    @Override // gn.g
    public void g(Exception exc) {
    }

    @Override // o1.j
    public double h(double d10) {
        double d11;
        double d12;
        double d13;
        double d14;
        switch (this.f19660a) {
            case 5:
                float[] fArr = o1.e.f29378a;
                if (d10 < 0.0d) {
                    d11 = -d10;
                } else {
                    d11 = d10;
                }
                if (d11 >= 0.0031308049535603718d) {
                    d12 = (Math.pow(d11, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d;
                } else {
                    d12 = d11 / 0.07739938080495357d;
                }
                return Math.copySign(d12, d10);
            case 6:
                float[] fArr2 = o1.e.f29378a;
                if (d10 < 0.0d) {
                    d13 = -d10;
                } else {
                    d13 = d10;
                }
                if (d13 >= 0.04045d) {
                    d14 = Math.pow((0.9478672985781991d * d13) + 0.05213270142180095d, 2.4d);
                } else {
                    d14 = 0.07739938080495357d * d13;
                }
                return Math.copySign(d14, d10);
            default:
                return d10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r7.f23801b == r6.f23801b) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l0.q i(l0.q0 r14) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.w.i(l0.q0):l0.q");
    }

    @Override // e5.j
    public void invoke(Object obj) {
        ((b5.y0) obj).w(this.f19660a);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.f19660a) {
            case 5:
                if (!task.isSuccessful()) {
                    return Tasks.forException(task.getException());
                }
                List list = (List) task.getResult();
                if (list.isEmpty()) {
                    return Tasks.forResult(null);
                }
                return Tasks.forResult((String) list.get(0));
            default:
                Object obj = com.google.firebase.messaging.h.f11753c;
                return 403;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(null);
    }
}
