package b0;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class l extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.b f2916b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(g1.e eVar, int i10) {
        super(2);
        this.f2915a = i10;
        this.f2916b = eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f2915a;
        g1.b bVar = this.f2916b;
        switch (i10) {
            case 0:
                return Integer.valueOf(((g1.e) bVar).a(0, ((Number) obj).intValue(), (w2.k) obj2));
            default:
                return new w2.h(hl.f.j(((g1.e) bVar).a(0, (int) (((w2.j) obj).f38798a >> 32), (w2.k) obj2), 0));
        }
    }
}
