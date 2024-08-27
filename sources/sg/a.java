package sg;

import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import ba.x6;
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
        int i11 = x6.I;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        x6 x6Var = (x6) m.g(from, R.layout.cell_active_league_portfolio_sector_stock, parent, false, null);
        Intrinsics.checkNotNullExpressionValue(x6Var, "inflate(...)");
        return new o(x6Var);
    }
}
