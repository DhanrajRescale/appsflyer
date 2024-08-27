package lf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.data.model.homedata.ListItem;
import com.assetgro.stockgro.prod.R;
import java.util.List;
import k7.y1;
import k7.z0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y.q0;

/* loaded from: classes.dex */
public final class m extends z0 {

    /* renamed from: d, reason: collision with root package name */
    public final List f24746d;

    /* renamed from: e, reason: collision with root package name */
    public final Function2 f24747e;

    public m(List items, q0 onDeeplinkActionClicked) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(onDeeplinkActionClicked, "onDeeplinkActionClicked");
        this.f24746d = items;
        this.f24747e = onDeeplinkActionClicked;
    }

    @Override // k7.z0
    public final int a() {
        return this.f24746d.size();
    }

    @Override // k7.z0
    public final void h(y1 y1Var, int i10) {
        j holder = (j) y1Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = this.f24746d;
        ListItem listItem = (ListItem) list.get(i10 % list.size());
        ComposeView composeView = (ComposeView) holder.f22629a.findViewById(R.id.compose_view);
        l lVar = new l(this, listItem, i10, 1);
        Object obj = b1.d.f3079a;
        composeView.setContent(new b1.c(lVar, true, 1081028255));
    }

    @Override // k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_slide, (ViewGroup) parent, false);
        Intrinsics.c(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        return new y1(itemView);
    }
}
