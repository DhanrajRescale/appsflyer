package df;

import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.o;
import androidx.recyclerview.widget.RecyclerView;
import ba.od;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.drawer.tutorials.VideoTutorialFragment;
import k7.y1;
import kotlin.jvm.internal.Intrinsics;
import m4.m;

/* loaded from: classes.dex */
public final class a extends gd.d {

    /* renamed from: h, reason: collision with root package name */
    public final VideoTutorialFragment f14322h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [k7.w, java.lang.Object] */
    public a(o parentLifecycle, VideoTutorialFragment fragment) {
        super(parentLifecycle, new Object());
        Intrinsics.checkNotNullParameter(parentLifecycle, "parentLifecycle");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.f14322h = fragment;
    }

    @Override // d7.v, k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(parent, "parent");
        VideoTutorialFragment fragment = this.f14322h;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        int i11 = od.f5653u;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        od odVar = (od) m.g(from, R.layout.cell_tutorial, parent, false, null);
        Intrinsics.checkNotNullExpressionValue(odVar, "inflate(...)");
        return new gd.o(odVar);
    }
}
