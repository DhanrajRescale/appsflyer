package yd;

import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import ba.tx;
import com.assetgro.stockgro.data.uimodel.StickerData;
import com.assetgro.stockgro.prod.R;
import java.util.ArrayList;
import k7.y1;
import k7.z0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vt.g0;

/* loaded from: classes.dex */
public final class t extends z0 {

    /* renamed from: d, reason: collision with root package name */
    public final Function1 f41595d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f41596e;

    public t(rd.i onItemCLick) {
        Intrinsics.checkNotNullParameter(onItemCLick, "onItemCLick");
        this.f41595d = onItemCLick;
        this.f41596e = new ArrayList();
    }

    @Override // k7.z0
    public final int a() {
        return this.f41596e.size();
    }

    @Override // k7.z0
    public final void h(y1 y1Var, int i10) {
        s holder = (s) y1Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        StickerData stickerData = (StickerData) g0.x(i10, this.f41596e);
        if (stickerData != null) {
            Intrinsics.checkNotNullParameter(stickerData, "stickerData");
            Function1 onItemCLick = this.f41595d;
            Intrinsics.checkNotNullParameter(onItemCLick, "onItemCLick");
            tx txVar = holder.f41594u;
            AppCompatImageView stickerItem = txVar.f6249s;
            Intrinsics.checkNotNullExpressionValue(stickerItem, "stickerItem");
            String url = stickerData.getUrl();
            Intrinsics.checkNotNullParameter(stickerItem, "<this>");
            Intrinsics.checkNotNullParameter(url, "url");
            com.bumptech.glide.b.f(stickerItem).m(url).z(stickerItem);
            AppCompatImageView stickerItem2 = txVar.f6249s;
            Intrinsics.checkNotNullExpressionValue(stickerItem2, "stickerItem");
            kj.f.e(stickerItem2, 800L, new ad.f(6, onItemCLick, stickerData));
        }
    }

    @Override // k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        int i11 = tx.f6248t;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        tx txVar = (tx) m4.m.g(from, R.layout.sticker_item_layout, parent, false, null);
        Intrinsics.checkNotNullExpressionValue(txVar, "inflate(...)");
        return new s(txVar);
    }
}
