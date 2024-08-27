package d0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class h extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final h f13161b = new h(0);

    /* renamed from: c, reason: collision with root package name */
    public static final h f13162c = new h(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13163a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10) {
        super(1);
        this.f13163a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f13163a) {
            case 0:
                return Unit.f23355a;
            default:
                ((Number) obj).intValue();
                return null;
        }
    }
}
