package xg;

import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.o;
import androidx.recyclerview.widget.RecyclerView;
import ba.jb;
import com.assetgro.stockgro.prod.R;
import k7.y1;
import kotlin.jvm.internal.Intrinsics;
import m4.m;

/* loaded from: classes.dex */
public final class b extends gd.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [k7.w, java.lang.Object] */
    public b(o parentLifecycle) {
        super(parentLifecycle, new Object());
        Intrinsics.checkNotNullParameter(parentLifecycle, "parentLifecycle");
    }

    @Override // d7.v, k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        int i11 = jb.C;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        jb jbVar = (jb) m.g(from, R.layout.cell_portfolio_sector_stock, parent, false, null);
        Intrinsics.checkNotNullExpressionValue(jbVar, "inflate(...)");
        return new gd.o(jbVar);
    }
}
