package b0;

import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class m extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2924a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1.c f2925b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(g1.c cVar, int i10) {
        super(2);
        this.f2924a = i10;
        this.f2925b = cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f2924a;
        g1.c cVar = this.f2925b;
        switch (i10) {
            case 0:
                return Integer.valueOf(((g1.f) cVar).a(0, ((Number) obj).intValue()));
            default:
                return new w2.h(hl.f.j(0, ((g1.f) cVar).a(0, (int) (4294967295L & ((w2.j) obj).f38798a))));
        }
    }
}
