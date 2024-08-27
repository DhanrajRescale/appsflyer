package ib;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class a extends iu.k implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f19751b = new a(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f19752c = new a(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a f19753d = new a(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19754a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(2);
        this.f19754a = i10;
    }

    public final void a(t0.n nVar, int i10) {
        switch (this.f19754a) {
            case 0:
                if ((i10 & 11) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if ((i10 & 11) == 2) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                el.l.j(nVar, 0);
                return;
            default:
                if ((i10 & 11) == 2) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f19754a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
