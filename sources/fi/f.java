package fi;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f16125a;

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view2 = super.getView(i10, view, parent);
        Intrinsics.checkNotNullExpressionValue(view2, "getView(...)");
        TextView textView = (TextView) view2.findViewById(R.id.text1);
        if (i10 == this.f16125a) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, com.assetgro.stockgro.prod.R.drawable.ic_check_circle, 0);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
        return view2;
    }
}
