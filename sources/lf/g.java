package lf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.data.model.homedata.ListItem;
import com.assetgro.stockgro.data.model.homedata.Widget;
import com.assetgro.stockgro.prod.R;
import java.util.List;
import k7.y1;
import k7.z0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends z0 {

    /* renamed from: d, reason: collision with root package name */
    public final List f24719d;

    /* renamed from: e, reason: collision with root package name */
    public final Widget f24720e;

    /* renamed from: f, reason: collision with root package name */
    public final Function2 f24721f;

    public g(List items, Widget widget, pd.y onDeeplinkActionClicked) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(onDeeplinkActionClicked, "onDeeplinkActionClicked");
        this.f24719d = items;
        this.f24720e = widget;
        this.f24721f = onDeeplinkActionClicked;
    }

    @Override // k7.z0
    public final int a() {
        return this.f24719d.size();
    }

    @Override // k7.z0
    public final void h(y1 y1Var, int i10) {
        c holder = (c) y1Var;
        Intrinsics.checkNotNullParameter(holder, "holder");
        List list = this.f24719d;
        ListItem listItem = (ListItem) list.get(i10 % list.size());
        ComposeView composeView = (ComposeView) holder.f22629a.findViewById(R.id.compose_view);
        f fVar = new f(listItem, this, 1);
        Object obj = b1.d.f3079a;
        composeView.setContent(new b1.c(fVar, true, 1259544083));
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
