package v;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import w.u1;

/* loaded from: classes.dex */
public final class h extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37515a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f37516b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f37517c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f37518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f37519e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f37520f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f37521g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f37522h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f37523i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f37524j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ut.d f37525k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, c0.m0 m0Var, List list, String str2, String str3, hb.i iVar, Function2 function2, Function0 function0, int i10, int i11) {
        super(2);
        this.f37515a = 1;
        this.f37519e = str;
        this.f37520f = m0Var;
        this.f37521g = list;
        this.f37522h = str2;
        this.f37523i = str3;
        this.f37524j = iVar;
        this.f37516b = function2;
        this.f37525k = function0;
        this.f37517c = i10;
        this.f37518d = i11;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f37515a;
        int i12 = this.f37517c;
        ut.d dVar = this.f37525k;
        Object obj = this.f37524j;
        Object obj2 = this.f37523i;
        Object obj3 = this.f37522h;
        Object obj4 = this.f37521g;
        Object obj5 = this.f37520f;
        Object obj6 = this.f37519e;
        switch (i11) {
            case 0:
                Function2 function2 = this.f37516b;
                a3.a.u(obj);
                iu.j.a((u1) obj6, (Function1) obj5, (g1.o) obj4, (h0) obj3, (i0) obj2, function2, (hu.c) dVar, nVar, t0.t.H0(i12 | 1), this.f37518d);
                return;
            default:
                yk.j.z((String) obj6, (c0.m0) obj5, (List) obj4, (String) obj3, (String) obj2, (hb.i) obj, this.f37516b, (Function0) dVar, nVar, t0.t.H0(i12 | 1), this.f37518d);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f37515a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(u1 u1Var, Function1 function1, g1.o oVar, h0 h0Var, i0 i0Var, Function2 function2, hu.c cVar, int i10, int i11) {
        super(2);
        this.f37515a = 0;
        this.f37519e = u1Var;
        this.f37520f = function1;
        this.f37521g = oVar;
        this.f37522h = h0Var;
        this.f37523i = i0Var;
        this.f37516b = function2;
        this.f37524j = null;
        this.f37525k = cVar;
        this.f37517c = i10;
        this.f37518d = i11;
    }
}
