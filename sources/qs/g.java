package qs;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32169a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f32170b;

    public /* synthetic */ g(i iVar, int i10) {
        this.f32169a = i10;
        this.f32170b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f32169a;
        i this$0 = this.f32170b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Iterator<T> it = ((us.f) this$0.f32171a).getListeners().iterator();
                while (it.hasNext()) {
                    ((rs.a) it.next()).c(((us.f) this$0.f32171a).getInstance());
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                for (rs.a aVar : ((us.f) this$0.f32171a).getListeners()) {
                    e youTubePlayer = ((us.f) this$0.f32171a).getInstance();
                    aVar.getClass();
                    Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                us.f fVar = (us.f) this$0.f32171a;
                Function1 function1 = fVar.f37376c;
                if (function1 != null) {
                    function1.invoke(fVar.f37375b);
                    return;
                } else {
                    Intrinsics.k("youTubePlayerInitListener");
                    throw null;
                }
        }
    }
}
