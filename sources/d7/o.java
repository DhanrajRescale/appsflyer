package d7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.assetgro.stockgro.prod.R;
import k7.y1;
import k7.z0;

/* loaded from: classes.dex */
public final class o extends z0 {

    /* renamed from: d, reason: collision with root package name */
    public final String[] f14095d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f14096e;

    /* renamed from: f, reason: collision with root package name */
    public int f14097f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x f14098g;

    public o(x xVar, String[] strArr, float[] fArr) {
        this.f14098g = xVar;
        this.f14095d = strArr;
        this.f14096e = fArr;
    }

    @Override // k7.z0
    public final int a() {
        return this.f14095d.length;
    }

    @Override // k7.z0
    public final void h(y1 y1Var, int i10) {
        s sVar = (s) y1Var;
        String[] strArr = this.f14095d;
        if (i10 < strArr.length) {
            sVar.f14110u.setText(strArr[i10]);
        }
        int i11 = this.f14097f;
        View view = sVar.f14111v;
        View view2 = sVar.f22629a;
        int i12 = 0;
        if (i10 == i11) {
            view2.setSelected(true);
            view.setVisibility(0);
        } else {
            view2.setSelected(false);
            view.setVisibility(4);
        }
        view2.setOnClickListener(new n(i10, i12, this));
    }

    @Override // k7.z0
    public final y1 i(int i10, RecyclerView recyclerView) {
        return new s(LayoutInflater.from(this.f14098g.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, (ViewGroup) recyclerView, false));
    }
}
