package rg;

import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.o;
import androidx.recyclerview.widget.RecyclerView;
import ba.v8;
import com.assetgro.stockgro.prod.R;
import k7.y1;
import kotlin.jvm.internal.Intrinsics;
import m4.m;

/* loaded from: classes.dex */
public final class e extends gd.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(o parentLifecycle) {
        super(parentLifecycle, new ga.a(10));
        Intrinsics.checkNotNullParameter(parentLifecycle, "parentLifecycle");
    }

    @Override // d7.v, k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        int i11 = v8.C;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        v8 v8Var = (v8) m.g(from, R.layout.cell_frozen_portfolio_options, parent, false, null);
        Intrinsics.checkNotNullExpressionValue(v8Var, "inflate(...)");
        return new gd.o(v8Var);
    }
}
