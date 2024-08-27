package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcelable;
import androidx.lifecycle.h1;
import ca.c;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.google.android.gms.internal.icing.zzcm;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzki;
import com.google.android.gms.measurement.internal.zzge;
import com.google.android.recaptcha.internal.zzfk;
import com.google.protobuf.j;
import ea.n0;
import ea.v;
import ek.u;
import gd.b;
import gd.h;
import gd.m;
import i0.p;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kq.e;
import t0.g1;
import t0.r;
import yk.g;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static int A(int i10, int i11, int i12, int i13) {
        return zzfk.zzy(i10) + i11 + i12 + i13;
    }

    public static int B(int i10, int i11, int i12, int i13) {
        return j.u(i10) + i11 + i12 + i13;
    }

    public static /* synthetic */ String C(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE";
    }

    public static int a(int i10, int i11, int i12) {
        return zzafs.zzA(i10) + i11 + i12;
    }

    public static int b(int i10, int i11, int i12, int i13) {
        return zzafs.zzA(i10) + i11 + i12 + i13;
    }

    public static h1 c(b bVar, String str, c cVar, String str2) {
        Intrinsics.checkNotNullParameter(bVar, str);
        Intrinsics.checkNotNullParameter(cVar, str2);
        return bVar.getViewModelStore();
    }

    public static h1 d(h hVar, String str, c cVar, String str2) {
        Intrinsics.checkNotNullParameter(hVar, str);
        Intrinsics.checkNotNullParameter(cVar, str2);
        return hVar.getViewModelStore();
    }

    public static h1 e(m mVar, String str, c cVar, String str2) {
        Intrinsics.checkNotNullParameter(mVar, str);
        Intrinsics.checkNotNullParameter(cVar, str2);
        return mVar.getViewModelStore();
    }

    public static UserRepository f(da.b bVar, v vVar, e eVar, String str) {
        UserRepository m10 = bVar.m();
        g.i(m10);
        vVar.getClass();
        Intrinsics.checkNotNullParameter(eVar, str);
        return m10;
    }

    public static u g(String str, String str2, Object[] objArr, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, str2);
        Intrinsics.checkNotNullParameter(objArr, str3);
        return qv.a.b(str4);
    }

    public static h.c h(h1 h1Var, c cVar, y4.c cVar2, Class cls, String str) {
        h.c cVar3 = new h.c(h1Var, cVar, cVar2);
        Intrinsics.checkNotNullParameter(cls, str);
        return cVar3;
    }

    public static i0.m i(g1 g1Var, int i10, r rVar) {
        i0.m mVar = new i0.m(g1Var, i10);
        rVar.k0(mVar);
        return mVar;
    }

    public static p j(g1 g1Var, int i10, r rVar) {
        p pVar = new p(g1Var, i10);
        rVar.k0(pVar);
        return pVar;
    }

    public static Object k(zzbl zzblVar, int i10, List list, int i11) {
        zzh.zzh(zzblVar.name(), i10, list);
        return list.get(i11);
    }

    public static String l(String str, char c10) {
        return str + c10;
    }

    public static y4.c m(b bVar, String str, h1 h1Var, String str2) {
        Intrinsics.checkNotNullParameter(bVar, str);
        y4.c defaultViewModelCreationExtras = bVar.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(h1Var, str2);
        return defaultViewModelCreationExtras;
    }

    public static y4.c n(h hVar, String str, h1 h1Var, String str2) {
        Intrinsics.checkNotNullParameter(hVar, str);
        y4.c defaultViewModelCreationExtras = hVar.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(h1Var, str2);
        return defaultViewModelCreationExtras;
    }

    public static y4.c o(m mVar, String str, h1 h1Var, String str2) {
        Intrinsics.checkNotNullParameter(mVar, str);
        y4.c defaultViewModelCreationExtras = mVar.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(h1Var, str2);
        return defaultViewModelCreationExtras;
    }

    public static void p(int i10, Function2 function2, r rVar, boolean z10, boolean z11) {
        function2.invoke(rVar, Integer.valueOf(i10));
        rVar.s(z10);
        rVar.s(z11);
    }

    public static /* synthetic */ void q(Parcelable parcelable) {
        if (parcelable != null) {
            throw new ClassCastException();
        }
    }

    public static void r(zzge zzgeVar, String str) {
        zzgeVar.zzaA().zzd().zza(str);
    }

    public static void s(n0 n0Var, e eVar, String str, ct.a aVar, String str2) {
        n0Var.getClass();
        Intrinsics.checkNotNullParameter(eVar, str);
        Intrinsics.checkNotNullParameter(aVar, str2);
    }

    public static int t(int i10, int i11, int i12) {
        return zzcm.zzw(i10) + i11 + i12;
    }

    public static int u(int i10, int i11, int i12, int i13) {
        return zzcm.zzw(i10) + i11 + i12 + i13;
    }

    public static void v(zzge zzgeVar, String str) {
        zzgeVar.zzaA().zzk().zza(str);
    }

    public static int w(int i10, int i11, int i12) {
        return zzki.zzx(i10) + i11 + i12;
    }

    public static int x(int i10, int i11, int i12, int i13) {
        return zzki.zzx(i10) + i11 + i12 + i13;
    }

    public static void y(zzge zzgeVar, String str) {
        zzgeVar.zzaA().zzj().zza(str);
    }

    public static int z(int i10, int i11, int i12) {
        return zzfk.zzy(i10) + i11 + i12;
    }
}
