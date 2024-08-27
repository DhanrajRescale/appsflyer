package g7;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class e extends iu.k implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public static final e f16716b = new e(0);

    /* renamed from: c, reason: collision with root package name */
    public static final e f16717c = new e(1);

    /* renamed from: d, reason: collision with root package name */
    public static final e f16718d = new e(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16719a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10) {
        super(0);
        this.f16719a = i10;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        switch (this.f16719a) {
            case 0:
                return new Handler(Looper.getMainLooper());
            case 1:
                return null;
            default:
                g1 g1Var = g1.f16784g;
                return mt.p.n(vt.x.a(new s4(0, vt.i0.f38321a)), 0, 0, a1.f16645f, null);
        }
    }
}
