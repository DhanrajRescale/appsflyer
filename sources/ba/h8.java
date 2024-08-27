package ba;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBinderMapperImpl;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public abstract class h8 extends m4.m {

    /* renamed from: s, reason: collision with root package name */
    public final View f4909s;

    /* renamed from: t, reason: collision with root package name */
    public final TextView f4910t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f4911u;

    public h8(View view, View view2, TextView textView, TextView textView2, Object obj) {
        super(obj, view, 0);
        this.f4909s = view2;
        this.f4910t = textView;
        this.f4911u = textView2;
    }

    public static h8 r(LayoutInflater layoutInflater, LinearLayout linearLayout) {
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        return (h8) m4.m.g(layoutInflater, R.layout.cell_confirm_withdrawal, linearLayout, false, null);
    }
}
