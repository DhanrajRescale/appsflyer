package r0;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32465a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32466b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f32467c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f32468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f32469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f32470f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f32471g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f32472h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ut.d f32473i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, ut.d dVar, int i10, int i11, int i12) {
        super(2);
        this.f32465a = i12;
        this.f32468d = obj;
        this.f32469e = obj2;
        this.f32470f = obj3;
        this.f32471g = obj4;
        this.f32472h = obj5;
        this.f32473i = dVar;
        this.f32466b = i10;
        this.f32467c = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f32465a;
        int i12 = this.f32466b;
        ut.d dVar = this.f32473i;
        Object obj = this.f32472h;
        Object obj2 = this.f32471g;
        Object obj3 = this.f32470f;
        Object obj4 = this.f32469e;
        Object obj5 = this.f32468d;
        switch (i11) {
            case 0:
                al.d.a((g1.o) obj5, (n1.x0) obj4, (e0) obj3, (h0) obj2, (x.d0) obj, (hu.c) dVar, nVar, t0.t.H0(i12 | 1), this.f32467c);
                return;
            case 1:
                yk.o.k((String) obj5, (String) obj4, (List) obj3, (hb.k) obj2, (t0.l3) obj, (Function2) dVar, nVar, t0.t.H0(i12 | 1), this.f32467c);
                return;
            case 2:
                yk.j.o0((g1.o) obj5, (String) obj4, (h7.b) obj3, (h7.b) obj2, (List) obj, (Function2) dVar, nVar, t0.t.H0(i12 | 1), this.f32467c);
                return;
            default:
                hf.z.h((g1.o) obj5, (List) obj4, (String) obj3, (String) obj2, (String) obj, (Function2) dVar, nVar, t0.t.H0(i12 | 1), this.f32467c);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f32465a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 2:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
