package lb;

import c0.m0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class c extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24411a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24412b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f24413c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f24414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f24415e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f24416f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f24417g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f24418h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f24419i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f24420j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f24421k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f24422l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f24423m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f24424n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f24425o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, m0 m0Var, boolean z10, boolean z11, boolean z12, String str2, String str3, List list, hb.c cVar, zb.e eVar, g1.o oVar, int i10, int i11, int i12) {
        super(2);
        this.f24412b = str;
        this.f24421k = m0Var;
        this.f24413c = z10;
        this.f24414d = z11;
        this.f24415e = z12;
        this.f24416f = str2;
        this.f24417g = str3;
        this.f24422l = list;
        this.f24423m = cVar;
        this.f24424n = eVar;
        this.f24425o = oVar;
        this.f24418h = i10;
        this.f24419i = i11;
        this.f24420j = i12;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f24411a;
        int i12 = this.f24419i;
        Object obj = this.f24425o;
        Object obj2 = this.f24424n;
        Object obj3 = this.f24423m;
        Object obj4 = this.f24422l;
        Object obj5 = this.f24421k;
        switch (i11) {
            case 0:
                yk.j.h(this.f24413c, this.f24412b, this.f24416f, this.f24417g, (String) obj5, this.f24414d, this.f24415e, this.f24418h, (Function0) obj4, (Function0) obj3, (Function0) obj2, (Function0) obj, nVar, t0.t.H0(i12 | 1), t0.t.H0(this.f24420j));
                return;
            default:
                kp.j.w(this.f24412b, (m0) obj5, this.f24413c, this.f24414d, this.f24415e, this.f24416f, this.f24417g, (List) obj4, (hb.c) obj3, (zb.e) obj2, (g1.o) obj, nVar, t0.t.H0(this.f24418h | 1), t0.t.H0(i12), this.f24420j);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f24411a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z10, String str, String str2, String str3, String str4, boolean z11, boolean z12, int i10, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i11, int i12) {
        super(2);
        this.f24413c = z10;
        this.f24412b = str;
        this.f24416f = str2;
        this.f24417g = str3;
        this.f24421k = str4;
        this.f24414d = z11;
        this.f24415e = z12;
        this.f24418h = i10;
        this.f24422l = function0;
        this.f24423m = function02;
        this.f24424n = function03;
        this.f24425o = function04;
        this.f24419i = i11;
        this.f24420j = i12;
    }
}
