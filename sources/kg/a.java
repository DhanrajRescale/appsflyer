package kg;

import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.o;
import androidx.recyclerview.widget.RecyclerView;
import ba.x8;
import com.assetgro.stockgro.prod.R;
import k7.y1;
import kotlin.jvm.internal.Intrinsics;
import m4.m;

/* loaded from: classes.dex */
public final class a extends gd.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(o parentLifecycle) {
        super(parentLifecycle, new ga.a(9));
        Intrinsics.checkNotNullParameter(parentLifecycle, "parentLifecycle");
    }

    @Override // d7.v, k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        int i11 = x8.E;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        x8 x8Var = (x8) m.g(from, R.layout.cell_frozen_portfolio_stocks, parent, false, null);
        Intrinsics.checkNotNullExpressionValue(x8Var, "inflate(...)");
        return new gd.o(x8Var);
    }
}
