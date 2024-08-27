package xf;

import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import ba.h9;
import com.assetgro.stockgro.prod.R;
import k7.y1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends gd.d {
    @Override // d7.v, k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        int i11 = h9.f4912x;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        h9 h9Var = (h9) m4.m.g(from, R.layout.cell_kyc_faq, parent, false, null);
        Intrinsics.checkNotNullExpressionValue(h9Var, "inflate(...)");
        return new gd.o(h9Var);
    }
}
