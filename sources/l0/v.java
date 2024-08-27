package l0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class v extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23834b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23835c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i10, int i11, Object obj) {
        super(0);
        this.f23833a = i11;
        this.f23835c = obj;
        this.f23834b = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        int i10 = this.f23833a;
        int i11 = this.f23834b;
        Object obj = this.f23835c;
        switch (i10) {
            case 0:
                return Integer.valueOf(((o) obj).f23798d.f(i11));
            default:
                ((Function1) obj).invoke(Integer.valueOf(i11));
                return Unit.f23355a;
        }
    }
}
