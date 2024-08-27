package ei;

import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import ba.z8;
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
        int i11 = z8.f6820t;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        z8 z8Var = (z8) m.g(from, R.layout.cell_image_viewer_item, parent, false, null);
        Intrinsics.checkNotNullExpressionValue(z8Var, "inflate(...)");
        return new o(z8Var);
    }
}
