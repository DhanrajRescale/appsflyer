package vn;

import android.util.Property;
import android.view.ViewGroup;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes2.dex */
public final class c extends Property {

    /* renamed from: a, reason: collision with root package name */
    public static final c f38185a = new Property(Float.class, "childrenAlpha");

    @Override // android.util.Property
    public final Object get(Object obj) {
        Float f10 = (Float) ((ViewGroup) obj).getTag(R.id.mtrl_internal_children_alpha_tag);
        if (f10 == null) {
            return Float.valueOf(1.0f);
        }
        return f10;
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        ViewGroup viewGroup = (ViewGroup) obj;
        float floatValue = ((Float) obj2).floatValue();
        viewGroup.setTag(R.id.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            viewGroup.getChildAt(i10).setAlpha(floatValue);
        }
    }
}
