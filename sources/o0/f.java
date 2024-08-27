package o0;

import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class f extends iu.k implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public static final f f29347b = new f(0);

    /* renamed from: c, reason: collision with root package name */
    public static final f f29348c = new f(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29349a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i10) {
        super(0);
        this.f29349a = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        switch (this.f29349a) {
            case 0:
                return UUID.randomUUID();
            default:
                return "DEFAULT_TEST_TAG";
        }
    }
}
