package hc;

import android.view.View;
import ba.lk;
import com.assetgro.stockgro.missions.presentation.home.MissionsHomeFragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends ao.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18274a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18275b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f18274a = i10;
        this.f18275b = obj;
    }

    @Override // ao.b
    public final void onSlide(View bottomSheet, float f10) {
        switch (this.f18274a) {
            case 0:
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                return;
            default:
                return;
        }
    }

    @Override // ao.b
    public final void onStateChanged(View bottomSheet, int i10) {
        int i11 = this.f18274a;
        Object obj = this.f18275b;
        switch (i11) {
            case 0:
                Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
                if (i10 == 4) {
                    ((lk) ((MissionsHomeFragment) obj).q()).f5361s.f4447t.f4188y.v(0);
                    return;
                }
                return;
            case 1:
                if (i10 == 5) {
                    ((ao.f) obj).cancel();
                    return;
                }
                return;
            default:
                if (i10 == 5) {
                    int i12 = ao.g.f2671a;
                    ((ao.g) obj).q();
                    return;
                }
                return;
        }
    }
}
