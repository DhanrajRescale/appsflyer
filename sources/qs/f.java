package qs;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32166a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f32167b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f32168c;

    public /* synthetic */ f(i iVar, float f10, int i10) {
        this.f32166a = i10;
        this.f32167b = iVar;
        this.f32168c = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f32166a;
        i this$0 = this.f32167b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                for (rs.a aVar : ((us.f) this$0.f32171a).getListeners()) {
                    e youTubePlayer = ((us.f) this$0.f32171a).getInstance();
                    aVar.getClass();
                    Intrinsics.checkNotNullParameter(youTubePlayer, "youTubePlayer");
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Iterator<T> it = ((us.f) this$0.f32171a).getListeners().iterator();
                while (it.hasNext()) {
                    ((rs.a) it.next()).a(((us.f) this$0.f32171a).getInstance(), this.f32168c);
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                for (rs.a aVar2 : ((us.f) this$0.f32171a).getListeners()) {
                    e youTubePlayer2 = ((us.f) this$0.f32171a).getInstance();
                    aVar2.getClass();
                    Intrinsics.checkNotNullParameter(youTubePlayer2, "youTubePlayer");
                }
                return;
        }
    }
}
