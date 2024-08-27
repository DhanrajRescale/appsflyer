package za;

import androidx.fragment.app.d1;
import androidx.fragment.app.g0;
import androidx.lifecycle.o;
import com.assetgro.stockgro.data.model.IntroModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends z7.e {

    /* renamed from: m, reason: collision with root package name */
    public final List f42218m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d1 fragmentManager, o lifecycle, ArrayList listIntro) {
        super(fragmentManager, lifecycle);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(listIntro, "listIntro");
        this.f42218m = listIntro;
    }

    @Override // k7.z0
    public final int a() {
        return 4;
    }

    @Override // z7.e
    public final g0 r(int i10) {
        List list = this.f42218m;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        int i11 = d.f42213b;
                        return kq.e.M((IntroModel) list.get(0));
                    }
                    int i12 = d.f42213b;
                    return kq.e.M((IntroModel) list.get(3));
                }
                int i13 = d.f42213b;
                return kq.e.M((IntroModel) list.get(2));
            }
            int i14 = d.f42213b;
            return kq.e.M((IntroModel) list.get(1));
        }
        int i15 = d.f42213b;
        return kq.e.M((IntroModel) list.get(0));
    }
}
