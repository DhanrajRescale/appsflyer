package jf;

import android.os.Bundle;
import androidx.fragment.app.d1;
import androidx.fragment.app.g0;
import androidx.fragment.app.i1;
import com.assetgro.stockgro.data.model.StockGyanCard;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends i1 {

    /* renamed from: h, reason: collision with root package name */
    public final List f21348h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d1 fm2, List data) {
        super(fm2);
        Intrinsics.checkNotNullParameter(fm2, "fm");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f21348h = data;
    }

    @Override // x7.a
    public final int c() {
        return this.f21348h.size();
    }

    @Override // androidx.fragment.app.i1
    public final g0 j(int i10) {
        int i11 = f.f21349b;
        StockGyanCard card = (StockGyanCard) this.f21348h.get(i10);
        Intrinsics.checkNotNullParameter(card, "card");
        Bundle bundle = new Bundle();
        bundle.putString("DATA", card.getDisplayPicture().getUrl());
        f fVar = new f();
        fVar.setArguments(bundle);
        return fVar;
    }
}
