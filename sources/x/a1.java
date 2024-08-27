package x;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class a1 extends iu.k implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a1 f39494b = new a1(0);

    /* renamed from: c, reason: collision with root package name */
    public static final a1 f39495c = new a1(1);

    /* renamed from: d, reason: collision with root package name */
    public static final a1 f39496d = new a1(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39497a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(int i10) {
        super(0);
        this.f39497a = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        switch (this.f39497a) {
            case 0:
                return null;
            case 1:
                return q0.f39683a;
            default:
                return new y1();
        }
    }
}
