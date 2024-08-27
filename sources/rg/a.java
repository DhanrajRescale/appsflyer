package rg;

import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import ba.z6;
import com.assetgro.stockgro.prod.R;
import gd.o;
import k7.y1;
import kotlin.jvm.internal.Intrinsics;
import m4.m;

/* loaded from: classes.dex */
public final class a extends gd.d {
    @Override // d7.v, k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        int i11 = z6.F;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        z6 z6Var = (z6) m.g(from, R.layout.cell_active_prepzone_portfolio_options, parent, false, null);
        Intrinsics.checkNotNullExpressionValue(z6Var, "inflate(...)");
        return new o(z6Var);
    }
}
