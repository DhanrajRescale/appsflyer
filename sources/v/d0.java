package v;

import a2.a1;
import a2.z0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class d0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37490a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f37491b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f37492c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f37493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f37494e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(int i10, long j10, long j11, Object obj, Object obj2) {
        super(1);
        this.f37490a = i10;
        this.f37493d = obj;
        this.f37491b = j10;
        this.f37492c = j11;
        this.f37494e = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f37490a;
        Object obj2 = this.f37494e;
        Object obj3 = this.f37493d;
        switch (i10) {
            case 0:
                int i11 = w2.h.f38792c;
                long j10 = this.f37491b;
                long j11 = this.f37492c;
                ((z0) obj).getClass();
                z0.j((a1) obj3, ((int) (j10 >> 32)) + ((int) (j11 >> 32)), ((int) (j10 & 4294967295L)) + ((int) (j11 & 4294967295L)), s0.g.f34069a, (Function1) obj2);
                return Unit.f23355a;
            default:
                c2.j0 j0Var = (c2.j0) ((p1.e) obj);
                j0Var.a();
                p1.h.S(j0Var, (n1.p) obj3, this.f37491b, this.f37492c, s0.g.f34069a, (p1.i) obj2, 104);
                return Unit.f23355a;
        }
    }
}
