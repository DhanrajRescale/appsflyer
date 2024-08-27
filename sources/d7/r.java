package d7;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b5.a1;
import com.assetgro.stockgro.prod.R;
import k7.j1;
import k7.y1;
import k7.z0;

/* loaded from: classes.dex */
public final class r extends z0 {

    /* renamed from: d, reason: collision with root package name */
    public final String[] f14106d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f14107e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable[] f14108f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x f14109g;

    public r(x xVar, String[] strArr, Drawable[] drawableArr) {
        this.f14109g = xVar;
        this.f14106d = strArr;
        this.f14107e = new String[strArr.length];
        this.f14108f = drawableArr;
    }

    @Override // k7.z0
    public final int a() {
        return this.f14106d.length;
    }

    @Override // k7.z0
    public final long b(int i10) {
        return i10;
    }

    @Override // k7.z0
    public final void h(y1 y1Var, int i10) {
        q qVar = (q) y1Var;
        boolean p10 = p(i10);
        View view = qVar.f22629a;
        if (p10) {
            view.setLayoutParams(new j1(-1, -2));
        } else {
            view.setLayoutParams(new j1(0, 0));
        }
        qVar.f14100u.setText(this.f14106d[i10]);
        String str = this.f14107e[i10];
        TextView textView = qVar.f14101v;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        Drawable drawable = this.f14108f[i10];
        ImageView imageView = qVar.f14102w;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // k7.z0
    public final y1 i(int i10, RecyclerView recyclerView) {
        x xVar = this.f14109g;
        return new q(xVar, LayoutInflater.from(xVar.getContext()).inflate(R.layout.exo_styled_settings_list_item, (ViewGroup) recyclerView, false));
    }

    public final boolean p(int i10) {
        x xVar = this.f14109g;
        a1 a1Var = xVar.f14174y0;
        if (a1Var == null) {
            return false;
        }
        if (i10 != 0) {
            if (i10 != 1) {
                return true;
            }
            if (!((b5.i) a1Var).b(30) || !((b5.i) xVar.f14174y0).b(29)) {
                return false;
            }
            return true;
        }
        return ((b5.i) a1Var).b(13);
    }
}
