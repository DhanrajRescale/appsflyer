package j2;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.internal.Intrinsics;
import n1.w0;
import ut.t;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final u2.n f20659a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20660b;

    /* renamed from: c, reason: collision with root package name */
    public final o2.d0 f20661c;

    /* renamed from: d, reason: collision with root package name */
    public final o2.z f20662d;

    /* renamed from: e, reason: collision with root package name */
    public final o2.a0 f20663e;

    /* renamed from: f, reason: collision with root package name */
    public final o2.s f20664f;

    /* renamed from: g, reason: collision with root package name */
    public final String f20665g;

    /* renamed from: h, reason: collision with root package name */
    public final long f20666h;

    /* renamed from: i, reason: collision with root package name */
    public final u2.a f20667i;

    /* renamed from: j, reason: collision with root package name */
    public final u2.o f20668j;

    /* renamed from: k, reason: collision with root package name */
    public final q2.d f20669k;

    /* renamed from: l, reason: collision with root package name */
    public final long f20670l;

    /* renamed from: m, reason: collision with root package name */
    public final u2.j f20671m;

    /* renamed from: n, reason: collision with root package name */
    public final w0 f20672n;

    /* renamed from: o, reason: collision with root package name */
    public final w f20673o;

    /* renamed from: p, reason: collision with root package name */
    public final p1.i f20674p;

    public b0(long j10, long j11, o2.d0 d0Var, o2.z zVar, o2.a0 a0Var, o2.s sVar, String str, long j12, u2.a aVar, u2.o oVar, q2.d dVar, long j13, u2.j jVar, w0 w0Var, w wVar, p1.i iVar) {
        this(j10 != 16 ? new u2.c(j10) : u2.l.f36689a, j11, d0Var, zVar, a0Var, sVar, str, j12, aVar, oVar, dVar, j13, jVar, w0Var, wVar, iVar);
    }

    public final boolean a(b0 b0Var) {
        if (this == b0Var) {
            return true;
        }
        if (w2.m.a(this.f20660b, b0Var.f20660b) && Intrinsics.a(this.f20661c, b0Var.f20661c) && Intrinsics.a(this.f20662d, b0Var.f20662d) && Intrinsics.a(this.f20663e, b0Var.f20663e) && Intrinsics.a(this.f20664f, b0Var.f20664f) && Intrinsics.a(this.f20665g, b0Var.f20665g) && w2.m.a(this.f20666h, b0Var.f20666h) && Intrinsics.a(this.f20667i, b0Var.f20667i) && Intrinsics.a(this.f20668j, b0Var.f20668j) && Intrinsics.a(this.f20669k, b0Var.f20669k) && n1.t.d(this.f20670l, b0Var.f20670l) && Intrinsics.a(this.f20673o, b0Var.f20673o)) {
            return true;
        }
        return false;
    }

    public final boolean b(b0 b0Var) {
        if (!Intrinsics.a(this.f20659a, b0Var.f20659a) || !Intrinsics.a(this.f20671m, b0Var.f20671m) || !Intrinsics.a(this.f20672n, b0Var.f20672n) || !Intrinsics.a(this.f20674p, b0Var.f20674p)) {
            return false;
        }
        return true;
    }

    public final b0 c(b0 b0Var) {
        if (b0Var == null) {
            return this;
        }
        u2.n nVar = b0Var.f20659a;
        return c0.a(this, nVar.a(), nVar.b(), nVar.c(), b0Var.f20660b, b0Var.f20661c, b0Var.f20662d, b0Var.f20663e, b0Var.f20664f, b0Var.f20665g, b0Var.f20666h, b0Var.f20667i, b0Var.f20668j, b0Var.f20669k, b0Var.f20670l, b0Var.f20671m, b0Var.f20672n, b0Var.f20673o, b0Var.f20674p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (a(b0Var) && b(b0Var)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        u2.n nVar = this.f20659a;
        long a10 = nVar.a();
        int i22 = n1.t.f28178j;
        t.Companion companion = ut.t.INSTANCE;
        int hashCode = Long.hashCode(a10) * 31;
        n1.p b10 = nVar.b();
        int i23 = 0;
        if (b10 != null) {
            i10 = b10.hashCode();
        } else {
            i10 = 0;
        }
        int hashCode2 = (Float.hashCode(nVar.c()) + ((hashCode + i10) * 31)) * 31;
        w2.n[] nVarArr = w2.m.f38803b;
        int c10 = v.e.c(this.f20660b, hashCode2, 31);
        o2.d0 d0Var = this.f20661c;
        if (d0Var != null) {
            i11 = d0Var.f29469a;
        } else {
            i11 = 0;
        }
        int i24 = (c10 + i11) * 31;
        o2.z zVar = this.f20662d;
        if (zVar != null) {
            i12 = Integer.hashCode(zVar.f29542a);
        } else {
            i12 = 0;
        }
        int i25 = (i24 + i12) * 31;
        o2.a0 a0Var = this.f20663e;
        if (a0Var != null) {
            i13 = Integer.hashCode(a0Var.f29453a);
        } else {
            i13 = 0;
        }
        int i26 = (i25 + i13) * 31;
        o2.s sVar = this.f20664f;
        if (sVar != null) {
            i14 = sVar.hashCode();
        } else {
            i14 = 0;
        }
        int i27 = (i26 + i14) * 31;
        String str = this.f20665g;
        if (str != null) {
            i15 = str.hashCode();
        } else {
            i15 = 0;
        }
        int c11 = v.e.c(this.f20666h, (i27 + i15) * 31, 31);
        u2.a aVar = this.f20667i;
        if (aVar != null) {
            i16 = Float.hashCode(aVar.f36667a);
        } else {
            i16 = 0;
        }
        int i28 = (c11 + i16) * 31;
        u2.o oVar = this.f20668j;
        if (oVar != null) {
            i17 = oVar.hashCode();
        } else {
            i17 = 0;
        }
        int i29 = (i28 + i17) * 31;
        q2.d dVar = this.f20669k;
        if (dVar != null) {
            i18 = dVar.f31579a.hashCode();
        } else {
            i18 = 0;
        }
        int c12 = v.e.c(this.f20670l, (i29 + i18) * 31, 31);
        u2.j jVar = this.f20671m;
        if (jVar != null) {
            i19 = jVar.f36687a;
        } else {
            i19 = 0;
        }
        int i30 = (c12 + i19) * 31;
        w0 w0Var = this.f20672n;
        if (w0Var != null) {
            i20 = w0Var.hashCode();
        } else {
            i20 = 0;
        }
        int i31 = (i30 + i20) * 31;
        w wVar = this.f20673o;
        if (wVar != null) {
            i21 = wVar.hashCode();
        } else {
            i21 = 0;
        }
        int i32 = (i31 + i21) * 31;
        p1.i iVar = this.f20674p;
        if (iVar != null) {
            i23 = iVar.hashCode();
        }
        return i32 + i23;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanStyle(color=");
        u2.n nVar = this.f20659a;
        sb2.append((Object) n1.t.j(nVar.a()));
        sb2.append(", brush=");
        sb2.append(nVar.b());
        sb2.append(", alpha=");
        sb2.append(nVar.c());
        sb2.append(", fontSize=");
        sb2.append((Object) w2.m.d(this.f20660b));
        sb2.append(", fontWeight=");
        sb2.append(this.f20661c);
        sb2.append(", fontStyle=");
        sb2.append(this.f20662d);
        sb2.append(", fontSynthesis=");
        sb2.append(this.f20663e);
        sb2.append(", fontFamily=");
        sb2.append(this.f20664f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(this.f20665g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) w2.m.d(this.f20666h));
        sb2.append(", baselineShift=");
        sb2.append(this.f20667i);
        sb2.append(", textGeometricTransform=");
        sb2.append(this.f20668j);
        sb2.append(", localeList=");
        sb2.append(this.f20669k);
        sb2.append(", background=");
        v.e.t(this.f20670l, sb2, ", textDecoration=");
        sb2.append(this.f20671m);
        sb2.append(", shadow=");
        sb2.append(this.f20672n);
        sb2.append(", platformStyle=");
        sb2.append(this.f20673o);
        sb2.append(", drawStyle=");
        sb2.append(this.f20674p);
        sb2.append(')');
        return sb2.toString();
    }

    public b0(u2.n nVar, long j10, o2.d0 d0Var, o2.z zVar, o2.a0 a0Var, o2.s sVar, String str, long j11, u2.a aVar, u2.o oVar, q2.d dVar, long j12, u2.j jVar, w0 w0Var, w wVar, p1.i iVar) {
        this.f20659a = nVar;
        this.f20660b = j10;
        this.f20661c = d0Var;
        this.f20662d = zVar;
        this.f20663e = a0Var;
        this.f20664f = sVar;
        this.f20665g = str;
        this.f20666h = j11;
        this.f20667i = aVar;
        this.f20668j = oVar;
        this.f20669k = dVar;
        this.f20670l = j12;
        this.f20671m = jVar;
        this.f20672n = w0Var;
        this.f20673o = wVar;
        this.f20674p = iVar;
    }

    public b0(long j10, long j11, o2.d0 d0Var, o2.z zVar, o2.a0 a0Var, o2.s sVar, String str, long j12, u2.a aVar, u2.o oVar, q2.d dVar, long j13, u2.j jVar, w0 w0Var, int i10) {
        this((i10 & 1) != 0 ? n1.t.f28177i : j10, (i10 & 2) != 0 ? w2.m.f38804c : j11, (i10 & 4) != 0 ? null : d0Var, (i10 & 8) != 0 ? null : zVar, (i10 & 16) != 0 ? null : a0Var, (i10 & 32) != 0 ? null : sVar, (i10 & 64) != 0 ? null : str, (i10 & 128) != 0 ? w2.m.f38804c : j12, (i10 & 256) != 0 ? null : aVar, (i10 & 512) != 0 ? null : oVar, (i10 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : dVar, (i10 & 2048) != 0 ? n1.t.f28177i : j13, (i10 & 4096) != 0 ? null : jVar, (i10 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : w0Var, (w) null, (p1.i) null);
    }
}
