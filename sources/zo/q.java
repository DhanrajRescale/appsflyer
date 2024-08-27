package zo;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import d4.n1;
import d4.v0;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class q extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public ColorStateList f42673a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f42674b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f42675c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, Context context, int i10, String[] strArr) {
        super(context, i10, strArr);
        this.f42675c = rVar;
        a();
    }

    public final void a() {
        boolean z10;
        ColorStateList colorStateList;
        r rVar = this.f42675c;
        ColorStateList colorStateList2 = rVar.f42682k;
        if (colorStateList2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ColorStateList colorStateList3 = null;
        if (!z10) {
            colorStateList = null;
        } else {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        }
        this.f42674b = colorStateList;
        if (rVar.f42681j != 0 && rVar.f42682k != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{u3.a.b(rVar.f42682k.getColorForState(iArr3, 0), rVar.f42681j), u3.a.b(rVar.f42682k.getColorForState(iArr2, 0), rVar.f42681j), rVar.f42681j});
        }
        this.f42673a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i10, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            r rVar = this.f42675c;
            Drawable drawable = null;
            if (rVar.getText().toString().contentEquals(textView.getText()) && rVar.f42681j != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(rVar.f42681j);
                if (this.f42674b != null) {
                    v3.b.h(colorDrawable, this.f42673a);
                    drawable = new RippleDrawable(this.f42674b, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = n1.f13788a;
            v0.q(textView, drawable);
        }
        return view2;
    }
}
