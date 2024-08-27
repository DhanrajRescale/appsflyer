package a2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class x extends iu.k implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public static final x f128b = new x(0);

    /* renamed from: c, reason: collision with root package name */
    public static final x f129c = new x(1);

    /* renamed from: d, reason: collision with root package name */
    public static final x f130d = new x(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i10) {
        super(1);
        this.f131a = i10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f131a) {
            case 0:
                ((androidx.compose.ui.node.a) obj).f1421v = true;
                return Unit.f23355a;
            case 1:
                return Unit.f23355a;
            default:
                return Unit.f23355a;
        }
    }
}
