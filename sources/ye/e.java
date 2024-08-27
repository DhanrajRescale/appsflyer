package ye;

import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import ba.f9;
import com.assetgro.stockgro.prod.R;
import gd.o;
import k7.y1;
import kotlin.jvm.internal.Intrinsics;
import m4.m;

/* loaded from: classes.dex */
public final class e extends gd.d {
    @Override // d7.v, k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        int i11 = f9.f4684v;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        f9 f9Var = (f9) m.g(from, R.layout.cell_invited_friend, parent, false, null);
        Intrinsics.checkNotNullExpressionValue(f9Var, "inflate(...)");
        return new o(f9Var);
    }
}
