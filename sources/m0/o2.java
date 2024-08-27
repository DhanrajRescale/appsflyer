package m0;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class o2 extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26570a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f26571b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2(Object obj, int i10) {
        super(0);
        this.f26570a = i10;
        this.f26571b = obj;
    }

    public final Float a() {
        int i10 = this.f26570a;
        Object obj = this.f26571b;
        switch (i10) {
            case 0:
                return Float.valueOf(p2.a((p2) obj).c0(m2.f26477c));
            default:
                return Float.valueOf(w4.a((w4) obj).c0(v4.f26946b));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ Object mo2invoke() {
        switch (this.f26570a) {
            case 0:
                return a();
            default:
                return a();
        }
    }
}
