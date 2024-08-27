package uj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.prod.R;
import java.util.ArrayList;
import k7.y1;
import k7.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b extends z0 {

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f37223d;

    /* renamed from: e, reason: collision with root package name */
    public c f37224e;

    @Override // k7.z0
    public final int a() {
        ArrayList arrayList = this.f37223d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // k7.z0
    public final void h(y1 holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ArrayList arrayList = this.f37223d;
        if (arrayList == null) {
            return;
        }
        a3.a.u(arrayList.get(i10));
        throw null;
    }

    @Override // k7.z0
    public final y1 i(int i10, RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_content_suggestion_list, (ViewGroup) parent, false);
        Intrinsics.c(inflate);
        return new a(this, inflate, this.f37224e);
    }
}
