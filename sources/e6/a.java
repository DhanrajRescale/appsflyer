package e6;

import b5.p0;
import b5.q0;
import b5.u;
import b5.v;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import q6.n;
import z5.b0;
import z5.l;
import z5.p;
import z5.q;
import z5.r;
import z5.t;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: b, reason: collision with root package name */
    public r f15065b;

    /* renamed from: c, reason: collision with root package name */
    public int f15066c;

    /* renamed from: d, reason: collision with root package name */
    public int f15067d;

    /* renamed from: e, reason: collision with root package name */
    public int f15068e;

    /* renamed from: g, reason: collision with root package name */
    public l6.a f15070g;

    /* renamed from: h, reason: collision with root package name */
    public q f15071h;

    /* renamed from: i, reason: collision with root package name */
    public c f15072i;

    /* renamed from: j, reason: collision with root package name */
    public n f15073j;

    /* renamed from: a, reason: collision with root package name */
    public final e5.p f15064a = new e5.p(6);

    /* renamed from: f, reason: collision with root package name */
    public long f15069f = -1;

    public final void a() {
        b(new p0[0]);
        r rVar = this.f15065b;
        rVar.getClass();
        rVar.c();
        this.f15065b.d(new t(-9223372036854775807L));
        this.f15066c = 6;
    }

    public final void b(p0... p0VarArr) {
        r rVar = this.f15065b;
        rVar.getClass();
        b0 f10 = rVar.f(UserMetadata.MAX_ATTRIBUTE_SIZE, 4);
        u uVar = new u();
        uVar.f3599j = "image/jpeg";
        uVar.f3598i = new q0(p0VarArr);
        f10.e(new v(uVar));
    }

    @Override // z5.p
    public final void d(r rVar) {
        this.f15065b = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0165  */
    @Override // z5.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(z5.q r23, mj.b r24) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e6.a.e(z5.q, mj.b):int");
    }

    @Override // z5.p
    public final void f(long j10, long j11) {
        if (j10 == 0) {
            this.f15066c = 0;
            this.f15073j = null;
        } else if (this.f15066c == 5) {
            n nVar = this.f15073j;
            nVar.getClass();
            nVar.f(j10, j11);
        }
    }

    @Override // z5.p
    public final boolean g(q qVar) {
        l lVar = (l) qVar;
        e5.p pVar = this.f15064a;
        pVar.C(2);
        lVar.b(pVar.f15036a, 0, 2, false);
        if (pVar.z() != 65496) {
            return false;
        }
        pVar.C(2);
        lVar.b(pVar.f15036a, 0, 2, false);
        int z10 = pVar.z();
        this.f15067d = z10;
        if (z10 == 65504) {
            pVar.C(2);
            lVar.b(pVar.f15036a, 0, 2, false);
            lVar.k(pVar.z() - 2, false);
            pVar.C(2);
            lVar.b(pVar.f15036a, 0, 2, false);
            this.f15067d = pVar.z();
        }
        if (this.f15067d != 65505) {
            return false;
        }
        lVar.k(2, false);
        pVar.C(6);
        lVar.b(pVar.f15036a, 0, 6, false);
        if (pVar.v() != 1165519206 || pVar.z() != 0) {
            return false;
        }
        return true;
    }

    @Override // z5.p
    public final void release() {
        n nVar = this.f15073j;
        if (nVar != null) {
            nVar.getClass();
        }
    }
}
