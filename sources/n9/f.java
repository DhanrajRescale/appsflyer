package n9;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28432a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f28433b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f28434c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(i iVar, int i10, int i11) {
        super(1);
        this.f28432a = i11;
        this.f28433b = iVar;
        this.f28434c = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        i iVar = this.f28433b;
        int i10 = this.f28434c;
        int i11 = this.f28432a;
        switch (i11) {
            case 0:
                long longValue = ((Number) obj).longValue();
                switch (i11) {
                    case 0:
                        return Boolean.valueOf(i.b(iVar, i10, longValue));
                    default:
                        return Boolean.valueOf(i.b(iVar, i10, longValue));
                }
            default:
                long longValue2 = ((Number) obj).longValue();
                switch (i11) {
                    case 0:
                        return Boolean.valueOf(i.b(iVar, i10, longValue2));
                    default:
                        return Boolean.valueOf(i.b(iVar, i10, longValue2));
                }
        }
    }
}
