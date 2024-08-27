package yc;

import android.os.Bundle;
import android.widget.PopupWindow;
import androidx.fragment.app.d1;
import androidx.fragment.app.g0;
import androidx.lifecycle.o;
import com.assetgro.stockgro.ui.chat.detail.group.GroupChatFragment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m extends z7.e {

    /* renamed from: m, reason: collision with root package name */
    public final Bundle f41520m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f41521n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(d1 fragmentManager, o lifecycle, Bundle bundle) {
        super(fragmentManager, lifecycle);
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.f41520m = bundle;
        this.f41521n = bundle != null ? bundle.getBoolean("IS_MAINTENANCE_ON", false) : false;
    }

    @Override // k7.z0
    public final int a() {
        return 3;
    }

    @Override // z7.e
    public final g0 r(int i10) {
        g0 dVar;
        Bundle bundle = this.f41520m;
        if (i10 != 0) {
            if (i10 != 1) {
                if (this.f41521n) {
                    int i11 = qf.c.f31944h;
                    Bundle bundle2 = new Bundle();
                    bundle2.putSerializable("DATA", qf.b.f31929d);
                    return de.d.m(bundle2);
                }
                PopupWindow popupWindow = GroupChatFragment.f9146w;
                if (bundle != null) {
                    bundle.putBoolean("IS_PREPZONE_CHAT", true);
                } else {
                    bundle = null;
                }
                Bundle bundle3 = new Bundle();
                if (bundle != null) {
                    bundle3.putAll(bundle);
                }
                dVar = new GroupChatFragment();
                dVar.setArguments(bundle3);
            } else {
                int i12 = zc.i.f42383n;
                Bundle bundle4 = new Bundle();
                if (bundle != null) {
                    bundle4.putAll(bundle);
                }
                dVar = new zc.i();
                dVar.setArguments(bundle4);
            }
        } else {
            int i13 = bd.d.f6945m;
            Bundle bundle5 = new Bundle();
            if (bundle != null) {
                bundle5.putAll(bundle);
            }
            dVar = new bd.d();
            dVar.setArguments(bundle5);
        }
        return dVar;
    }
}
