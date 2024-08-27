package ed;

import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import ba.vb;
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
        int i11 = vb.f6417x;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        vb vbVar = (vb) m.g(from, R.layout.cell_prize_distribution, parent, false, null);
        Intrinsics.checkNotNullExpressionValue(vbVar, "inflate(...)");
        return new o(vbVar);
    }
}
