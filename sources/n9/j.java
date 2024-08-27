package n9;

import j9.g0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28456a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j9.i f28457b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f28458c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1.o f28459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f28460e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f28461f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f28462g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g0 f28463h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f28464i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g1.d f28465j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ a2.l f28466k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f28467l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Map f28468m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28469n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f28470o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f28471p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(j9.i iVar, Function0 function0, g1.o oVar, boolean z10, boolean z11, boolean z12, g0 g0Var, boolean z13, g1.d dVar, a2.l lVar, boolean z14, Map map, int i10, int i11, int i12, int i13) {
        super(2);
        this.f28456a = i13;
        this.f28457b = iVar;
        this.f28458c = function0;
        this.f28459d = oVar;
        this.f28460e = z10;
        this.f28461f = z11;
        this.f28462g = z12;
        this.f28463h = g0Var;
        this.f28464i = z13;
        this.f28465j = dVar;
        this.f28466k = lVar;
        this.f28467l = z14;
        this.f28468m = map;
        this.f28469n = i10;
        this.f28470o = i11;
        this.f28471p = i12;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f28456a;
        int i12 = this.f28469n;
        switch (i11) {
            case 0:
                bl.j.g(this.f28457b, this.f28458c, this.f28459d, this.f28460e, this.f28461f, this.f28462g, this.f28463h, this.f28464i, this.f28465j, this.f28466k, this.f28467l, this.f28468m, nVar, i12 | 1, this.f28470o, this.f28471p);
                return;
            default:
                bl.j.g(this.f28457b, this.f28458c, this.f28459d, this.f28460e, this.f28461f, this.f28462g, this.f28463h, this.f28464i, this.f28465j, this.f28466k, this.f28467l, this.f28468m, nVar, i12 | 1, this.f28470o, this.f28471p);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f28456a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
