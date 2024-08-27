package sj;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.prod.R;
import java.util.ArrayList;
import k7.y1;
import k7.z0;

/* loaded from: classes.dex */
public final class h extends z0 {

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f34668d;

    /* renamed from: e, reason: collision with root package name */
    public f f34669e;

    @Override // k7.z0
    public final int a() {
        ArrayList arrayList = this.f34668d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // k7.z0
    public final void h(y1 y1Var, int i10) {
        g gVar = (g) y1Var;
        gVar.f34664u.setText(((d) this.f34668d.get(i10)).f34661a);
        if (((d) this.f34668d.get(i10)).f34662b != null) {
            ((com.bumptech.glide.g) com.bumptech.glide.b.e(gVar.f22629a.getContext()).m(((d) this.f34668d.get(i10)).f34662b).b()).z(gVar.f34665v);
        }
    }

    @Override // k7.z0
    public final y1 i(int i10, RecyclerView recyclerView) {
        return new g(this, LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.layout_content_suggestion_list, (ViewGroup) recyclerView, false), this.f34669e);
    }
}
