package c0;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class h extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7501b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj, int i10) {
        super(1);
        this.f7500a = i10;
        this.f7501b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f7500a;
        Object obj2 = this.f7501b;
        switch (i10) {
            case 0:
                ((Number) obj).intValue();
                return obj2;
            default:
                ((Number) obj).intValue();
                return obj2;
        }
    }
}
