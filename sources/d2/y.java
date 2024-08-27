package d2;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13684a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f13685b;

    public /* synthetic */ y(Function0 function0, int i10) {
        this.f13684a = i10;
        this.f13685b = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f13684a;
        Function0 action = this.f13685b;
        switch (i10) {
            case 0:
                action.mo2invoke();
                return;
            case 1:
                int i11 = y2.k.f41091w;
                action.mo2invoke();
                return;
            case 2:
                action.mo2invoke();
                return;
            case 3:
                action.mo2invoke();
                return;
            case 4:
                action.mo2invoke();
                return;
            default:
                int i12 = kj.f.f23221a;
                Intrinsics.checkNotNullParameter(action, "$action");
                action.mo2invoke();
                return;
        }
    }
}
